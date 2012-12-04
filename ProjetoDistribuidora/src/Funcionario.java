
public class Funcionario {
	
	private String nome;
	private Endereco end;
	private String cpf;
	private String rg;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Funcionario(String nome){
		this.nome=new  String();
		this.end= new Endereco();
		this.cpf = new String();
		this.rg = new String ();
		this.rua = new String();
		this.estado = new String();
		this.cidade = new String();
		this.bairro = new String();
		
	}
	
	
	public Funcionario(){
		
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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	
	


