package br.com.mobilesaude.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;

import br.com.mobilesaude.dao.operadoras.OperadorasDao;
import br.com.mobilesaude.modelo.operadora.Operadoras;


@SuppressWarnings({ "unused" }) 
@Path("/ws/servico")
public class Service {
	
	OperadorasDao odao;
	
	@GET
	@Path("/operadoras") 
	@Produces( MediaType.APPLICATION_XML ) 
	public List<Operadoras> operadoras( ){
		odao = new OperadorasDao();
		List<Operadoras> lista = odao.getTotais(); 
		return lista;   
	}
	
	@GET
	@Path("/operadora") 
	@Produces( MediaType.APPLICATION_XML ) 
	public Operadoras operadoras2( ){
		odao = new OperadorasDao();
		List<Operadoras> lista = odao.getLista(); 
		return lista.get(0);   
	}
	 
	@GET
	@Path("/op") 
	@Produces( MediaType.APPLICATION_JSON) 
	public String hello( ){
		//odao = new OperadorasDao();
		return "HELLO";   
	}
	 
	
}
