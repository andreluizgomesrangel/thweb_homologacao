package br.com.mobilesaude.main;

import java.util.List;

import br.com.mobilesaude.dao.operadoras.OperadorasDao;
import br.com.mobilesaude.modelo.operadora.Operadoras;

public class Main {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		OperadorasDao odao = new OperadorasDao();
		
		List<Operadoras> lista = odao.getLista();
		for (int i = 0; i < lista.size() ; i++) {
			
			System.out.println( lista.get(i).getId()+" "+lista.get(i).getDescricao()+" "+lista.get(i).getPrestadores());
			
		}
	}

}
