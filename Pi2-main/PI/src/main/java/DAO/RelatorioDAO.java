/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.testepi.MODEL.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Barbosa
 */
public class RelatorioDAO {

    public static String url = "jdbc:mysql://localhost:3307/loja_informatica";
    public static String login = "root";
    public static String senha = "";

    /**
     * Lista os relatórios de vendas no período especificado.
     *
     * @param dataInicial a data inicial do período
     * @param dataFinal a data final do período
     * @return uma lista de objetos Relatorio contendo os dados dos relatórios
     * de vendas
     */
    public static ArrayList<Relatorio> listar(Date dataInicial, Date dataFinal) {
        ArrayList<Relatorio> listaRetorno = new ArrayList<Relatorio>();

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);

            // Modifique a consulta SQL para incluir a tabela 'vendas' e 'clientes' e as colunas correspondentes
            String consultaSQL = "SELECT vendas.data_venda as Data, clientes.nome_cliente as Cliente, vendas.valor_final as Valor"
                    + " FROM vendas INNER JOIN clientes ON vendas.cpf = clientes.cpf"
                    + " WHERE vendas.data_venda >= ? AND vendas.data_venda <= ?"
                    + " GROUP BY Data, Cliente, Valor;";

            PreparedStatement comandoSQL = conexao.prepareStatement(consultaSQL);
            comandoSQL.setDate(1, (java.sql.Date) dataInicial);
            comandoSQL.setDate(2, (java.sql.Date) dataFinal);

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Relatorio novoObjeto = new Relatorio();
                    novoObjeto.setData(rs.getDate("Data"));
                    novoObjeto.setCliente(rs.getString("Cliente"));
                    novoObjeto.setValor(rs.getDouble("Valor"));

                    listaRetorno.add(novoObjeto);
                }
            }
        } catch (ClassNotFoundException ex) {
            listaRetorno = null;
        } catch (SQLException ex) {
            listaRetorno = null;
        } finally {
            // Certifique-se de fechar a conexão no bloco finally
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return listaRetorno;

    }

    public static ArrayList<Relatorio> listarANA(Date dataInicial, Date dataFinal) {
        ArrayList<Relatorio> Retorno = new ArrayList<Relatorio>();

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);

            String consultaSQL = "CALL consultar_venda(?,?)";

            PreparedStatement comandoSQL = conexao.prepareStatement(consultaSQL);
            comandoSQL.setDate(1, (java.sql.Date) dataInicial);
            comandoSQL.setDate(2, (java.sql.Date) dataFinal);

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Relatorio Objeto = new Relatorio();
                    Objeto.setData(rs.getDate("Data"));
                    Objeto.setCliente(rs.getString("Cliente"));
                    Objeto.setProdutos(rs.getString("Produto"));
                    Objeto.setQuantidade(rs.getInt("Quantidade"));
                    Objeto.setValor(rs.getDouble("Valor"));

                    Retorno.add(Objeto);
                }
            }
        } catch (ClassNotFoundException ex) {
            Retorno = null;
        } catch (SQLException ex) {
            Retorno = null;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return Retorno;

    }

}
