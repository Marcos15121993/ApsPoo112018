package DAO;

import conexao.conexao;
import entidades.simulacao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOSimulações {

    private conexao conexao;
    private String sql;

    public DAOSimulações() throws ClassNotFoundException, IllegalAccessException, InstantiationException,SQLException {
        conexao = new conexao();
    }

    //Esse metodo vai cadastrar um endereco e vai retornar o cod_endereco
    public void inserirSimulação(simulacao simulação) throws SQLException {
        String sql = "INSERT INTO Simulação ( pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio) VALUES ('"
                + simulação.getPessoas() + "',"
                + simulação.getPratos() + ",'"
                + simulação.getSalada() + "',"
                + simulação.getCarboidratos() + "',"
                + simulação.getProteinas() + "',"
                + simulação.getSuco() + "',"
                + simulação.getTempoTotal() + "',"
                + simulação.getTempoMedio() + "';";

        Statement stm = conexao.getConnection().createStatement();
        stm.execute(sql);
        
     
    }
    
    
    public void inserirSimulaçãoEspecifica(int pessoas, int pratos, int salada,
            int carboidratos, int proteinas, int suco , int tempoTotal ,double tempoMedio) throws SQLException {
        String sql = "INSERT INTO Simulação (idsimulacao, pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio) VALUES ('"
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
    
    
    
    public simulacao consultaSimulação(int id) throws SQLException {
        simulacao simulação = new simulacao();

        String sql = "SELECT * FROM simulação WHERE idsimulacao = " + id + ";";
        Statement stm = conexao.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        simulação.setId(rs.getInt("idsimulacao"));
        simulação.setPessoas(rs.getInt("pessoas"));
        simulação.setPratos(rs.getInt("pratos"));
        simulação.setSalada(rs.getInt("salada"));
        simulação.setCarboidratos(rs.getInt("carboidratos"));
        simulação.setProteinas(rs.getInt("proteinas"));
        simulação.setSuco(rs.getInt("suco"));
        simulação.setTempoTotal(rs.getInt("tempototal"));
        simulação.setTempoMedio(rs.getInt("tempomedio"));
        return simulação;
    }

    public simulacao consultaTodasSimulação() throws SQLException {
        simulacao simulação = new simulacao();
        List<simulacao> lista = new ArrayList();
        String bd = "SELECT * FROM simulação;";
        Statement stm = conexao.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(bd);
        while (rs.next()) {

            simulação.setId(rs.getInt("idsimulacao"));
            simulação.setPessoas(rs.getInt("pessoas"));
            simulação.setPratos(rs.getInt("pratos"));
            simulação.setSalada(rs.getInt("salada"));
            simulação.setCarboidratos(rs.getInt("carboidratos"));
            simulação.setProteinas(rs.getInt("proteinas"));
            simulação.setSuco(rs.getInt("suco"));
            simulação.setTempoTotal(rs.getInt("tempototal"));
            simulação.setTempoMedio(rs.getInt("tempomedio"));
            return simulação;
        }
        return null;
    }
}
