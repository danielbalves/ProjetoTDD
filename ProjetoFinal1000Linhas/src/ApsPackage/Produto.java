package ApsPackage;





public class Produto {
	
	
	private String nome;
	private String categoria;
	private String fabricante;
	private String dataFab;
	private String dataVenc;
	private String codigo;
	private double quantidadeEmEstoque;
	private double quantidadeVendido;
	private int descontos;
	
	
	public int getDescontos() {
		return descontos;
	}
	public void setDescontos(int descontos) {
		this.descontos = descontos;
	}
	
	
	
	public double getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(double quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public double getQuantidadeVendido() {
		return quantidadeVendido;
	}
	public void setQuantidadeVendido(double quantidadeVendido) {
		this.quantidadeVendido = quantidadeVendido;
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
	public void setDataVenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataFab == null) ? 0 : dataFab.hashCode());
		result = prime * result
				+ ((dataVenc == null) ? 0 : dataVenc.hashCode());
		result = prime * result + descontos;
		result = prime * result
				+ ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantidadeEmEstoque);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantidadeVendido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataFab == null) {
			if (other.dataFab != null)
				return false;
		} else if (!dataFab.equals(other.dataFab))
			return false;
		if (dataVenc == null) {
			if (other.dataVenc != null)
				return false;
		} else if (!dataVenc.equals(other.dataVenc))
			return false;
		if (descontos != other.descontos)
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(quantidadeEmEstoque) != Double
				.doubleToLongBits(other.quantidadeEmEstoque))
			return false;
		if (Double.doubleToLongBits(quantidadeVendido) != Double
				.doubleToLongBits(other.quantidadeVendido))
			return false;
		return true;
	}
	public int getCodigoNomeProduto() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
/*
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
*/
}
