package br.univel;

public class Teste {
	
	public static void main(String[] args) {
		
		
		
		Caixa<Integer> c = new CaixaImpl<Integer>();
		
		c.guarda(1);
		c.guarda(2);
		c.guarda(3);
		c.guarda(4);
		c.guarda(5);
		
		Integer ultimoInteiro = c.retornaUltimo();
	
		Caixa<String> c2 = new CaixaImpl<String>();
		c2.guarda("um");
		c2.guarda("dois");
		c2.guarda("tres");
		
		String ultimaString = c2.retornaUltimo();
		
		c.listarTodos();
		c2.listarTodos();
	
	}

}
