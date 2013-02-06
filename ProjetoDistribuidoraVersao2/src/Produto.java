package ApsPackage;


import java.util.LinkedList;


public class Produto {
	

	private LinkedList<Alimentos> listaAlimentos;
	private LinkedList<Bebidas> listaBebidas;
	
	public Produto(){
		listaAlimentos = new LinkedList<Alimentos>();
	}
	public void addAlimentos(Alimentos a){
		listaAlimentos.add(a);
	}
	public void remover(){
		listaAlimentos.remove();
	}
	public void addBebidas(Bebidas b){
		listaBebidas.add(b);
	}
	public void removerBebidas(){
		listaBebidas.remove();
	}
}
