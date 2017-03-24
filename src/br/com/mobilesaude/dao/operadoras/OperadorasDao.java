package br.com.mobilesaude.dao.operadoras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mobilesaude.connection.ConnectionFactory;
import br.com.mobilesaude.modelo.operadora.Operadoras;

public class OperadorasDao {
	
	private Connection connection;
	
	public OperadorasDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	

	public List<Operadoras> getLista() {
		// TODO Auto-generated method stub
		try {
			 String query =   "SELECT operadoras.id as ID, prestadores.nome as NOME, count(prestadores.id) AS TOTAL, operadoras.descricao as OPERADORA, prestadores.status_georef as SITUACAO FROM prestadores "
			 				+ "LEFT JOIN operadoras "
			 				+ "ON operadoras.id=prestadores.id_operadora "
			 				+ "GROUP BY operadoras.id;";
	         List<Operadoras> operadoras = new ArrayList<Operadoras>();
	         PreparedStatement stmt = this.connection.prepareStatement(query);
	         ResultSet rs = stmt.executeQuery();
	 
	         while (rs.next()) {
	        	 Operadoras operadora = new Operadoras(); 
	        	 operadora.setId((int) rs.getLong("ID"));
	        	 operadora.setNome(rs.getString("NOME"));
	        	 operadora.setPrestadores((int) rs.getLong("TOTAL"));
	        	 operadora.setDescricao(rs.getString("OPERADORA")); 
	        	
	        	 operadora.setSituacao(rs.getString("SITUACAO"));
	        	 
	        	 operadoras.add(operadora);
	         }
	         
	         rs.close();
	         stmt.close();
	         return operadoras;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
	
	public List<Operadoras> getTotais() {
		// TODO Auto-generated method stub
		try {
			 String query =   "SELECT operadoras.id as ID, prestadores.nome as NOME, count(prestadores.id) AS TOTAL, operadoras.descricao as OPERADORA, prestadores.status_georef as SITUACAO FROM prestadores "
			 				+ "LEFT JOIN operadoras " 
			 				+ "ON operadoras.id=prestadores.id_operadora "
			 				+ "GROUP BY operadoras.id;";
			 
			 String query2 = "select id_operadora AS ID, operadoras.descricao as OPERADORA, count(*) AS TOTAL, " 
			 				+ "sum(if(status_georef=0,1,0)) as ERRO, "
			 				+ "sum( "
			 				+ "if(status_georef=1, 1, 0) "
			 				+ ") "
			 				+ "as PENDENTE, "
			 				+ "sum(if(status_georef=2,1,0)) as OK, "
			 				+ "sum(if(status_georef=3,1,0)) as IMPORTADO " 
			 				+ "from prestadores "
			 				+ "INNER JOIN operadoras "
			 				+ "ON operadoras.id = prestadores.id_operadora "
			 				+ "group by operadoras.descricao";
			 
	         List<Operadoras> operadoras = new ArrayList<Operadoras>();
	         PreparedStatement stmt = this.connection.prepareStatement(query2); 
	         ResultSet rs = stmt.executeQuery();
	 
	         while (rs.next()) {
	        	 Operadoras operadora = new Operadoras(); 
	        	 operadora.setId((int) rs.getLong("ID"));
	        	 //operadora.setNome(rs.getString("NOME"));
	        	 operadora.setPrestadores((int) rs.getLong("TOTAL"));
	        	 operadora.setDescricao(rs.getString("OPERADORA")); 
	        	
	        	 operadora.setErro(rs.getInt("ERRO"));
	        	 operadora.setPendente(rs.getInt("PENDENTE"));
	        	 operadora.setOk(rs.getInt("OK"));
	        	 operadora.setImportado(rs.getInt("IMPORTADO"));
	        	 
	        	 operadoras.add(operadora);
	         }
	         
	         rs.close();
	         stmt.close();
	         return operadoras;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
}
