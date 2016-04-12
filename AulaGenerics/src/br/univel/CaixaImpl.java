package br.univel;

public class CaixaImpl<xablau> implements Caixa <xablau> {
	
	 
	private Object [] v = new Object[10];
	private int idx = 0;

	@Override
	public void guarda(xablau i) {
		v[idx++] = i;	
	}

	@Override
	public void listarTodos() {
		for (int i = 0; i < idx; i++){
			System.out.println(v[i]);
		}
	}
	
	@SuppressWarnings("unchecked")
	public xablau retornaUltimo(){
		return (xablau) v[--idx];
	}

}
