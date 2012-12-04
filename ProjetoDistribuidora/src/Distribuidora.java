
import java.util.LinkedList;


public class Distribuidora {
	
	private LinkedList<Cliente> cliente;
	private LinkedList<Fornecedor> fornecedor;
	private LinkedList<Alimentos> alimentos;
	private LinkedList<Bebidas> bebidas;
	private LinkedList<Funcionario> funcionario;
	
	
	public Distribuidora(){
		this.cliente = new LinkedList <Cliente>();
		this.fornecedor = new LinkedList <Fornecedor>();
		this.alimentos = new LinkedList <Alimentos>();
		this.bebidas = new LinkedList <Bebidas>();
		this.funcionario = new LinkedList<Funcionario>();
	
	}

	public void addCliente(Cliente nome) {
	     cliente.add(nome);
	}
	public void removerCliente(String nome) {
	     cliente.remove(nome);
	}

	public Cliente pesquisarCliente( String cnpj) throws ExcecaoNaoExiste{
		for (Cliente pesquisa:cliente ){
			if(pesquisa.getCnpj().equals(cnpj))
                return pesquisa;
		}
		return null;
	}

       
	
	
	//-----------------------------------------------------------------
	
	public void addFuncionario(Funcionario nome) {
	     funcionario.add(nome);
	}
	public void removerFuncionario(String nome) {
	    funcionario.remove(nome);
	}

	public String pesquisarFuncionario(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//--------------------------------------------------------------------
	
	public void addFornecedor(Fornecedor nome) {
	     fornecedor.add(nome);
	}
	public void removerFornecedor(String nome) {
	     fornecedor.remove(nome);
	}

	public String pesquisarFornecedor(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
    //---------------------------------------------------------------------------
	
	public void addAlimentos(Alimentos nome) {
		alimentos.add(nome);
		
	}
	public void removerAlimentos(String nome) {
	     alimentos.remove(nome);
	}
	
	public String pesquisarAlimentos(String nome){
	return null;
	}
		
		//---------------------------------------------------------------------------
		
		public void addBebidas(Bebidas nome) {
			bebidas.add(nome);
			
		}
		public void removerBebidas(String nome) {
		     bebidas.remove(nome);
		}
		
		public String pesquisarBebidas(String nome) {
			return null;

			
}
}
