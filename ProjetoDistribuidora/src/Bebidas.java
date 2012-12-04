
import java.util.ArrayList;

//import java.util.ArrayList;
//import java.util.List;


public class Bebidas {

	private String nome;
	private String categoria;
	private String fabricante;
	private String dataFab;
	private String dataVenc;
	private String codigo;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setDataVenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}
	public Bebidas(String nome, String categoria, String fabricante, String dataFab, String dataVenc){
		this.nome =nome;
		this.categoria = categoria;
		this.fabricante = fabricante;
		this.dataFab = dataFab;
		this.dataVenc = dataVenc;
		
	}
	public Bebidas(){
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDataFab() {
		return dataFab;
	}
	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}
	public String getDataVenc() {
		return dataVenc;
	}
	public void setDataFenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}
	
	public String toString(){
	return "Nome: "+ getNome()+"\nCodigo: "+getCodigo()+ "\nCategoria: "+ getCategoria()+"\nFabricante: "+ getFabricante()+
		"\nData de Fabricação: "+ getDataFab()+
		"\nData de Vencimento: "+ getDataVenc();
	
}
}

