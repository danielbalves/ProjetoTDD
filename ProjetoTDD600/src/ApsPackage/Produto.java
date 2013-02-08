package ApsPackage;


import java.util.LinkedList;


public class Produto {
	

	private LinkedList<Alimento> listaAlimentos;
	private LinkedList<Bebidas> listaBebidas;
	
	public Produto(){
		listaAlimentos = new LinkedList<Alimento>();
	}
	public void addAlimentos(Alimento a){
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
