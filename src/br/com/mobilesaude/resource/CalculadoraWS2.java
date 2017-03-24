package br.com.mobilesaude.resource;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.mobilesaude.modelo.operadora.Operadoras;

@WebService
@Stateless
public class CalculadoraWS2 {

 public double fazerOp(@WebParam(name = "num1") double a,
   @WebParam(name = "num2") double b, @WebParam(name = "op") String op) {
  // Por que você não clona o projeto e cria mais funções para brincar?
  switch (op) {
  case "+":
   return a + b;
  case "-":
   return a - b;
  case "*":
   return a * b; 
  case "/":
   return a / b;
  default:
   throw new IllegalArgumentException("Operação '" + op
     + "' não reconhecida. Informa '+', '-', '*' ou '/'.");
  }
 }
 
 public double fazerOp2(@WebParam(name = "num1") double a,
		   @WebParam(name = "num2") double b, @WebParam(name = "op") String op) {
		  // Por que você não clona o projeto e cria mais funções para brincar?
		  switch (op) {
		  case "+":
		   return a + b;
		  case "-":
		   return a - b;
		  case "*":
		   return a * b; 
		  case "/":
		   return a / b;
		  default:
		   throw new IllegalArgumentException("Operação '" + op
		     + "' não reconhecida. Informa '+', '-', '*' ou '/'.");
		  }
		 }

 	public Operadoras operadora( @WebParam(name = "op") String op ) {
	 
	 	Operadoras oper = new Operadoras();
	 	oper.setNome(op);
	 	
		return oper;
		 }
 
}
