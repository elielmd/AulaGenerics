package br.univel;

public class Teste {
	
	public static void main(String[] args) {
		
		Caixa c = new Caixalmpl();
		
		c.guarda(1);
		c.guarda(2);
		c.guarda(3);
		c.guarda(4);
		c.guarda(5);
		
		c.listarTodos();
	
	}

}
