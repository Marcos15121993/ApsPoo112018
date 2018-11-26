package DAO;

import conexao.conexao;
import entidades.simulacao;
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
        String sql = "INSERT INTO Simulacao (idsimulacao pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio) VALUES ('"
                + simulacao.getPessoas() + "',"
                + simulacao.getPratos() + ",'"
                + simulacao.getSalada() + "',"
                + simulacao.getCarboidratos() + "',"
                + simulacao.getProteinas() + "',"
                + simulacao.getSuco() + "',"
                + simulacao.getTempoTotal() + "',"
                + simulacao.getTempoMedio() + "';";

        Statement stm = conexao.getConnection().createStatement();
        stm.execute(sql);
        
     
    }
    
    
    public void inserirSimulacaoEspecifica(int pessoas, int pratos, int salada,
            int carboidratos, int proteinas, int suco , int tempoTotal ,double tempoMedio) throws SQLException {
        String sql = "INSERT INTO Simulacao (idsimulacao, pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio) VALUES ('"
                + pessoas + "',"
                + pratos + ",'"
                + salada + "',"
                + carboidratos + "',"
                + proteinas + "',"
                + suco + "',"
                + tempoTotal + "',"
                + tempoMedio + "',";

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
