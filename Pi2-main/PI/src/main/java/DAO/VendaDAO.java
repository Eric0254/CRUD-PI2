/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author wendenderson
 */
import static DAO.ClienteDAO.Login;
import static DAO.ClienteDAO.Senha;
import com.mycompany.testepi.MODEL.Cliente;
import com.mycompany.testepi.MODEL.Produtos;
import com.mycompany.testepi.MODEL.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VendaDAO {

    static String URL = "jdbc:mysql://localhost:3307/loja_informatica";
    static String login = "root";
    static String senha = "";

    /**
     * Salva uma venda no banco de dados.
     *
     * @param obj a venda a ser salva
     * @return true se a venda foi salva com sucesso, false caso contrário
     */
    public static boolean Salvar(Venda obj) {
        boolean retorno = false;
        Integer generatedID = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);

            for (Venda item : obj.getListaItens()) {

                PreparedStatement ComandoSQL;
                ComandoSQL = conexao.prepareStatement("INSERT INTO vendas (quantidade,"
                        + "cod_produto, nome_produto, valor_unitario, valor_total, cpf, nome, tipo_pag,"
                        + " parcelamento, valor_final, data_venda) VALUES (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                ComandoSQL.setInt(1, item.getQuantidade());
                ComandoSQL.setInt(2, item.getCodProduto());
                ComandoSQL.setString(3, item.getNomeProduto());
                ComandoSQL.setDouble(4, item.getValorUnitario());
                ComandoSQL.setDouble(5, item.getValorTotal());
                ComandoSQL.setString(6, obj.getCpf());
                ComandoSQL.setString(7, obj.getNome());
                ComandoSQL.setString(8, obj.getTipo_pag());
                ComandoSQL.setString(9, obj.getParcelamento());
                ComandoSQL.setDouble(10, obj.getFinal());
                ComandoSQL.setDate(11, new java.sql.Date(obj.getDataVenda().getTime()));

                int linhasAfetadas = ComandoSQL.executeUpdate();
                if (linhasAfetadas > 0) {
                    ResultSet rs = ComandoSQL.getGeneratedKeys();
                    if (rs.next()) {
                        int generateID = rs.getInt(1);
                    }
                }

            }

            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }

    /**
     * Pesquisa um produto pelo seu código.
     *
     * @param id o código do produto a ser pesquisado
     * @return o objeto Produto correspondente ao código pesquisado, ou null se
     * não encontrado
     */
    public Produtos PesquisarProdutoCod(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE id = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            Produtos p = new Produtos();
            comandoSQL.setInt(1, id);
            ResultSet rs = comandoSQL.executeQuery();

            rs.first();
            p.setID(Integer.parseInt(rs.getString("id")));
            p.setNome(rs.getString("nome"));
            p.setPreco(Double.parseDouble(rs.getString("preco")));

            return p;
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return null;
    }

    /**
     * Pesquisa um cliente pelo CPF.
     *
     * @param cpf o CPF do cliente a ser pesquisado
     * @return o objeto Cliente correspondente ao CPF pesquisado, ou null se não
     * encontrado
     */
    public Cliente PesquisarCliente(String cpf) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement ComandoSQL = Conexao.prepareStatement(("SELECT * FROM clientes WHERE cpf = ?"),
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Cliente c = new Cliente();
            ComandoSQL.setString(1, cpf);
            ResultSet rs = ComandoSQL.executeQuery();

            rs.first();
            c.setCPF(rs.getString("cpf"));
            c.setNome(rs.getString("nome_cliente"));

            return c;

        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return null;
    }

}
