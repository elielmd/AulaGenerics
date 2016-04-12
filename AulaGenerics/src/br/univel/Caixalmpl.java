package br.univel;

public class Caixalmpl implements Caixa {
	
	 
	private Integer [] v = new Integer[10];
	private int idx = 0;

	@Override
	public void guarda(Integer i) {
		v[idx++] = i;	
	}

	@Override
	public void listarTodos() {
		for (int i = 0; i < idx; i++){
			System.out.println(v[i]);
		}
	}

}
