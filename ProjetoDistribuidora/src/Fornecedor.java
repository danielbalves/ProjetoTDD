
public class Fornecedor {

	private String nome;
	private Endereco end;
	private String cnpj;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	
	public Fornecedor(String nome){
		this.nome=new  String();
		this.end= new Endereco();
		this.cnpj = new String();
		this.rua = new String();
		this.estado = new String();
		this.cidade = new String();
		this.bairro = new String();
		
	}
	
	
	public Fornecedor(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBarrio() {
		return bairro;
	}
	
	public void setBarrio(String barrio) {
		this.bairro = barrio;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}