package DAO;

import conexao.conexao;
import entidades.simulacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOSimulacoes {

    private conexao conexao;
    private String sql;

    public DAOSimulacoes() throws ClassNotFoundException, IllegalAccessException, InstantiationException,SQLException {
        conexao = new conexao();
    }

    //Esse metodo vai cadastrar um endereco e vai retornar o cod_endereco
    public void inserirSimulacao(simulacao simulacao) throws SQLException {
        PreparedStatement sqlStatement = conexao.getConnection().prepareStatement("INSERT INTO simulacao (idsimulacao, pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio)" + 
                                                                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        sqlStatement.setInt(1, simulacao.getPessoas());
        sqlStatement.setInt(2, simulacao.getPratos());
        sqlStatement.setInt(3, simulacao.getSalada());
        sqlStatement.setInt(4, simulacao.getCarboidratos());
        sqlStatement.setInt(5, simulacao.getProteinas());
        sqlStatement.setInt(6, simulacao.getSuco());
        sqlStatement.setInt(7, simulacao.getPessoas());
        sqlStatement.setInt(8, simulacao.getTempoTotal());
        sqlStatement.setDouble(9, simulacao.getTempoMedio());
       
        sqlStatement.execute();       
    }
    
    
    public void inserirSimulacaoEspecifica(simulacao b) throws SQLException {
        String sql = "INSERT INTO simulacao (idsimulacao, pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio , tempominimo , tempomaximo) VALUES ('"
                + b.getPessoas() + "',"
                + b.getPratos() + ",'"
                + b.getSalada() + "',"
                + b.getCarboidratos() + "',"
                + b.getProteinas() + "',"
                + b.getSuco() + "',"
                + b.getTempoTotal() + "',"
                + b.getTempoMedio() + "',"
                + b.getTempoMinimo() + "',"
                + b.getTempoMaximo() + "';";

        Statement stm = conexao.getConnection().createStatement();
        stm.execute(sql);
        
     
    }
    
    
    
    public simulacao consultaSimulacao(int id) throws SQLException {
        simulacao simulacao = new simulacao();

        String sql = "SELECT * FROM simulacao WHERE idsimulacao = " + id + ";";
        Statement stm = conexao.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        simulacao.setId(rs.getInt("idsimulacao"));
        simulacao.setPessoas(rs.getInt("pessoas"));
        simulacao.setPratos(rs.getInt("pratos"));
        simulacao.setSalada(rs.getInt("salada"));
        simulacao.setCarboidratos(rs.getInt("carboidratos"));
        simulacao.setProteinas(rs.getInt("proteinas"));
        simulacao.setSuco(rs.getInt("suco"));
        simulacao.setTempoTotal(rs.getInt("tempototal"));
        simulacao.setTempoMedio(rs.getInt("tempomedio"));
        return simulacao;
    }

    public simulacao consultaTodasSimulação() throws SQLException {
        simulacao simulacao = new simulacao();
        List<simulacao> lista = new ArrayList();
        String bd = "SELECT * FROM simulacao;";
        Statement stm = conexao.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(bd);
        while (rs.next()) {

            simulacao.setId(rs.getInt("idsimulacao"));
            simulacao.setPessoas(rs.getInt("pessoas"));
            simulacao.setPratos(rs.getInt("pratos"));
            simulacao.setSalada(rs.getInt("salada"));
            simulacao.setCarboidratos(rs.getInt("carboidratos"));
            simulacao.setProteinas(rs.getInt("proteinas"));
            simulacao.setSuco(rs.getInt("suco"));
            simulacao.setTempoTotal(rs.getInt("tempototal"));
            simulacao.setTempoMedio(rs.getInt("tempomedio"));
            return simulacao;
        }
        return null;
    }
}
