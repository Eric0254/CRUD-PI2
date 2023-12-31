/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mycompany.testepi.MODEL.Cliente;

/**
 *
 * @author Eric
 */
public class ClienteDAO {

    static String URL = "jdbc:mysql://localhost:3307/loja_informatica";
    static String Login = "root";
    static String Senha = "";//Mude quando voce fizer o pull

    /**
     * Salva um objeto Cliente no banco de dados.
     *
     * @param obj o objeto Cliente a ser salvo
     * @return true se o objeto foi salvo com sucesso, false caso contrário
     */
    public static boolean Salvar(Cliente obj) {
        boolean Retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("INSERT INTO clientes (cpf,nome_cliente,data_nasc,genero,estado_civil,lougradouro,bairro,cep,email,celular) VALUES (?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            ComandoSQL.setString(1, obj.getCPF());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
            ComandoSQL.setString(4, obj.getGenero());
            ComandoSQL.setString(5, obj.getEstadoCivil());
            ComandoSQL.setString(6, obj.getEndereco());
            ComandoSQL.setString(7, obj.getBairro());
            ComandoSQL.setString(8, obj.getCEP());
            ComandoSQL.setString(9, obj.getEmail());
            ComandoSQL.setString(10, obj.getCelular());

            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return Retorno;
    }

    /**
     * Altera um objeto Cliente no banco de dados.
     *
     * @param obj o objeto Cliente a ser alterado
     * @return true se o objeto foi alterado com sucesso, false caso contrário
     */
    public static boolean Alterar(Cliente obj) {
        boolean Retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("UPDATE clientes SET cpf = ?,nome_cliente = ? ,data_nasc = ? ,genero = ?,estado_civil = ?,lougradouro = ?,bairro = ?,cep = ? ,email = ?,celular = ? WHERE cpf = ?", Statement.RETURN_GENERATED_KEYS);

            ComandoSQL.setString(1, obj.getCPF());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
            ComandoSQL.setString(4, obj.getGenero());
            ComandoSQL.setString(5, obj.getEstadoCivil());
            ComandoSQL.setString(6, obj.getEndereco());
            ComandoSQL.setString(7, obj.getBairro());
            ComandoSQL.setString(8, obj.getCEP());
            ComandoSQL.setString(9, obj.getEmail());
            ComandoSQL.setString(10, obj.getCelular());
            ComandoSQL.setString(11, obj.getCPF());

            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return Retorno;
    }

    /**
     * Lista todos os clientes do banco de dados.
     *
     * @return uma lista de objetos Cliente contendo os dados dos clientes
     * encontrados
     */
    public List<Cliente> ListarCliente() {
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM clientes");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Cliente Cliente = new Cliente();

                Cliente.setCPF(rs.getString("cpf"));
                Cliente.setNome(rs.getString("nome_cliente"));
                Cliente.setCelular(rs.getString("celular"));
                Cliente.setEmail(rs.getString("email"));
                Cliente.setDataNascimento(rs.getDate("data_nasc"));
                Cliente.setGenero(rs.getString("genero"));
                Cliente.setEstadoCivil(rs.getString("estado_civil"));
                Cliente.setEndereco(rs.getString("lougradouro"));
                Cliente.setBairro(rs.getString("bairro"));
                Cliente.setCEP(rs.getString("cep"));

                listaCliente.add(Cliente);
            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaCliente;
    }

    /**
     * Busca clientes no banco de dados com base no CPF informado.
     *
     * @param Busca o CPF a ser buscado
     * @return uma lista de objetos Cliente contendo os clientes encontrados
     */
    public List<Cliente> BuscarClientecpf(String Busca) {
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM clientes WHERE cpf LIKE ?");
            ComandoSQL.setString(1, "%" + Busca + "%");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Cliente Cliente = new Cliente();

                Cliente.setCPF(rs.getString("cpf"));
                Cliente.setNome(rs.getString("nome_cliente"));
                Cliente.setCelular(rs.getString("celular"));
                Cliente.setEmail(rs.getString("email"));
                Cliente.setDataNascimento(rs.getDate("data_nasc"));
                Cliente.setGenero(rs.getString("genero"));
                Cliente.setEstadoCivil(rs.getString("estado_civil"));
                Cliente.setEndereco(rs.getString("lougradouro"));
                Cliente.setBairro(rs.getString("bairro"));
                Cliente.setCEP(rs.getString("cep"));

                listaCliente.add(Cliente);
            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaCliente;
    }

    /**
     * Busca clientes no banco de dados com base no nome informado.
     *
     * @param Busca o nome a ser buscado
     * @return uma lista de objetos Cliente contendo os clientes encontrados
     */
    public List<Cliente> BuscarClienteNome(String Busca) {
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM clientes WHERE nome_cliente LIKE ?");
            ComandoSQL.setString(1, "%" + Busca + "%");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Cliente Cliente = new Cliente();

                Cliente.setCPF(rs.getString("cpf"));
                Cliente.setNome(rs.getString("nome_cliente"));
                Cliente.setCelular(rs.getString("celular"));
                Cliente.setEmail(rs.getString("email"));
                Cliente.setDataNascimento(rs.getDate("data_nasc"));
                Cliente.setGenero(rs.getString("genero"));
                Cliente.setEstadoCivil(rs.getString("estado_civil"));
                Cliente.setEndereco(rs.getString("lougradouro"));
                Cliente.setBairro(rs.getString("bairro"));
                Cliente.setCEP(rs.getString("cep"));

                listaCliente.add(Cliente);
            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaCliente;
    }

    /**
     * Exclui um cliente do banco de dados com base no CPF informado.
     *
     * @param CPF o CPF do cliente a ser excluído
     * @return true se o cliente foi excluído com sucesso, false caso contrário
     */
    public static boolean Excluir(String CPF) {
        boolean Retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("DELETE FROM clientes WHERE cpf = ?");

            ComandoSQL.setString(1, CPF);

            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return Retorno;
    }

}
