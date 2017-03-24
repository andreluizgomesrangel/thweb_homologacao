package br.com.mobilesaude.resource;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.mobilesaude.modelo.operadora.Operadoras;


@WebService
@Stateless
public class OperadorasWS {

 	public Operadoras operadora( @WebParam(name = "op") String op ) {
 		 
	 	Operadoras oper = new Operadoras();
	 	oper.setNome(op);
	 	
		return oper;
 	}
	
}
