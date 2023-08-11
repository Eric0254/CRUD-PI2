/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.testepi.CadProdutos;
import com.mycompany.testepi.MODEL.Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ProdutosDAO {
    static String url = "jdbc:mysql://localhost:3307/loja_informatica";
    static String login = "root";
    static String senha = "";
    
    /**
     * Salva um objeto Produtos no banco de dados.
     * 
     * @param obj o objeto Produtos a ser salvo.
     * @return true se o objeto for salvo no banco dados, false se não for salvo.
     */
    public static boolean Cadastrar(Produtos obj){
        boolean Retorno = false;     // Valor padrão caso não haja chave gerada
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement ComandoSQL = conexao.prepareStatement("INSERT INTO produtos(tipo, nome, preco, quantidade) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            ComandoSQL.setString(1, obj.getTipo());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setDouble(3, obj.getPreco());
            ComandoSQL.setInt(4, obj.getQuantidade());
            
            int NumeroLinha = ComandoSQL.executeUpdate();
            
            if (NumeroLinha > 0) {
                ResultSet generatedKeys = ComandoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                int idGerado = generatedKeys.getInt(1);
                // Faça o que precisar com o ID gerado, por exemplo, atribuí-lo ao objeto 'obj':
                obj.setID(idGerado);
            }
            Retorno = true; 
        }
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
    } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
       return Retorno; 
}
    
    /** Busca produtos no banco de dados com base no ID informado.
     * 
     * @param Busca o Produto a ser procurado.
     * @return uma lista de objetos Produtos contendo os produtos encontras.
     */
    public List<Produtos> BuscarProduto(String Busca){
        List<Produtos> listaProduto = new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;
            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos where id = ?");
            ComandoSQL.setString(1, Busca);
            rs = ComandoSQL.executeQuery();
            
            while (rs.next()) {
                Produtos produto = new Produtos();
                
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setID(rs.getInt("id"));
                produto.setTipo(rs.getString("tipo"));
                produto.setQuantidade(rs.getInt("quantidade"));
                listaProduto.add(produto);  
            }          
    } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaProduto;
}
    /** Busca produtos no banco de dados com base no Tipo informado.
     * 
     * @param Busca o Produto a ser procurado.
     * @return uma lista de objetos Produtos contendo os produtos encontras.
     */
    public List<Produtos> BuscarProdutoTipo(String Busca){
        List<Produtos> listaProduto = new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;
            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos where tipo =?");
            ComandoSQL.setString(1, Busca);
            rs = ComandoSQL.executeQuery();
            
            
            while (rs.next()) {
                Produtos produto = new Produtos();
                
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setID(rs.getInt("id"));
                produto.setTipo(rs.getString("tipo"));
                produto.setQuantidade(rs.getInt("quantidade"));
                listaProduto.add(produto);  
            }    
    } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaProduto;
}
    /**
     * Exclui um produto no banco de dados com base no ID informado.
     * @param ID o ID do produto a ser excluído.
     * @return true se o produto for excluído do banco de dados, false caso não seja.
     */
    public static boolean Excluir (int ID){
        boolean Retorno = false;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("DELETE FROM produtos where id = ?");
            
            ComandoSQL.setInt(1, ID);
            
            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            
    } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } return Retorno;
}
    /**
     * Altera um objeto Produtos no banco de dados.
     * @param obj o objeto Produtos a ser alterado.
     * @return true se o produto for alterado no banco de dados, false caso não seja alterado.
     */
    public static boolean Alterar(Produtos obj){
        boolean Retorno = false;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("UPDATE produtos SET tipo = ?, nome = ?, preco = ?, quantidade = ? WHERE id = ?", Statement.RETURN_GENERATED_KEYS);

            ComandoSQL.setString(1, obj.getTipo());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setDouble(3, obj.getPreco());
            ComandoSQL.setInt(4, obj.getQuantidade());
            ComandoSQL.setInt(5, obj.getID());
            
            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
            
    }catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } return Retorno;
}
    /**
     * Verifica a quantidade em estoque do produto informado com base no ID.
     * @param id ID do produto informado.
     * @param quantidade Quantidade do produto informado.
     * @return true caso a quantidade em estoque seja igual ou maior a quantidade desejada, false caso contrário.
     */
    public boolean verificarEstoqueSuficiente(int id, int quantidade) {
        try (Connection conexao = DriverManager.getConnection(url, login, senha)) {
            String query = "SELECT quantidade FROM Produtos WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setInt(1, id);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    int estoqueDisponivel = rs.getInt("quantidade");
                    return estoqueDisponivel >= quantidade;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * Atualiza a quantidade em estoque do produto informado com base no ID.
     * @param id ID do produto informado.
     * @param quantidade Quantidade do produto informado.
     */
    public void atualizarEstoque(int id, int quantidade) {
        try (Connection conexao = DriverManager.getConnection(url, login, senha)) {
            String query = "UPDATE Produtos SET quantidade = quantidade - ? WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setInt(1, quantidade);
                stmt.setInt(2, id);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}