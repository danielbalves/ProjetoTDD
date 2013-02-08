package ApsPackage;


import java.util.ArrayList;




public class Distribuidora {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Fornecedor> fornecedores;
	private ArrayList<Alimento> alimentos;
	private ArrayList<Bebidas> bebidas;
	private ArrayList<Funcionario> funcionarios;
	
	
	public Distribuidora(){
		this.clientes = new ArrayList <Cliente>();
		this.fornecedores = new ArrayList <Fornecedor>();
		this.alimentos = new ArrayList <Alimento>();
		this.bebidas = new ArrayList<Bebidas>();
		this.funcionarios = new ArrayList<Funcionario>();
	
	}


	public void addCliente(Cliente cliente){
		if(cliente.getNome() == null){
			throw new RuntimeException("O preenchimento do CNPJ é obrigatório");
		}
		if (cliente.getCnpj() == null) {
			throw new RuntimeException("O preenchimento do CNPJ é obrigatório");
		}
		if (cliente.getRua()==null){
			throw new RuntimeException("O nome da rua é obrigatório");
			
		}
		if (cliente.getCidade()==null){
			throw new RuntimeException("O nome da cidade é obrigatório");
			
		}
		if(cliente.getEstado()== null){
			throw new RuntimeException("O nome do estado é obrigatório");
		}
		if(cliente.getBairro()== null){
			throw new RuntimeException("O nome do bairro é obrigatório");
		}
		
		
		
		for (Cliente c : clientes) {
			if (c.getCnpj().equals(cliente.getCnpj())) {
				throw new RuntimeException("CNPJ duplicado");
			}
		}
		
		clientes.add(cliente);
	}
	
	public void removerCliente(String nome) {
		for (Cliente cli: clientes) {  
		    if (cli.getNome().equals(nome)) {
		    	clientes.remove(cli);
		    	return;
		    }
		}  
		
		clientes.remove(nome);
		
	}

	public Cliente pesquisarCliente( String cnpj) throws ExcecaoNaoExiste{
		for (Cliente cliente:clientes ){
			if(cliente.getCnpj().equals(cnpj))
                return cliente;
		}
		return null;
	}

	
       
	
	
	//-----------------------------------------------------------------
	
	//Exigi que o cpf e rg do funcionário sejam obrigatórios
	public void addFuncionario(Funcionario funcionario) {
		if(funcionario.getNome() == null){
			throw new RuntimeException("O preenchimento do CNPJ é obrigatório");
		}
		if (funcionario.getCpf() == null) {
			throw new RuntimeException("O preenchimento do CPF é obrigatório");
		}
		if (funcionario.getRg()==null){
			throw new RuntimeException("O preenchimento do RG é obrigatório");
			
		}
		if (funcionario.getRua()==null){
			throw new RuntimeException("O nome da rua é obrigatório");
			
		}
		if (funcionario.getCidade()==null){
			throw new RuntimeException("O nome da da cidade é obrigatório");
			
		}
		if(funcionario.getEstado()== null){
		throw new RuntimeException("O nome do estado é obrigatório");
		}
		if(funcionario.getBairro()== null){
		throw new RuntimeException("O nome do bairro é obrigatório");
		}
		
		
		for (Funcionario f : funcionarios) {
			if (f.getCpf().equals(funcionario.getCpf())) {
				throw new RuntimeException("CPF duplicado");
			}
		}
		
		funcionarios.add(funcionario);
	}
	
	
	public void removerFuncionario(String nome) {
		for (Funcionario func: funcionarios) {  
		    if (func.getNome().equals(nome)) {
		    	funcionarios.remove(func);
		    	return;
		    }
		}  
		
		funcionarios.remove(nome);
	}

	public Funcionario pesquisarFuncionario( String cpf) throws ExcecaoNaoExiste{
		for (Funcionario pesquisa: funcionarios ){
			if(pesquisa.getCpf().equals(cpf))
                return pesquisa;
		}
		return null;
	
	}
	
	
	//--------------------------------------------------------------------
	
	public void addFornecedor(Fornecedor fornecedor) {
		if (fornecedor.getCnpj() == null) {
			throw new RuntimeException("O preenchimento do CNPJ é obrigatório");
		}
		if (fornecedor.getNome()==null){
			throw new RuntimeException("O preenchimento do Nome é obrigatório");
			
		}
		if (fornecedor.getRua()==null){
			throw new RuntimeException("O nome da rua é obrigatório");
			
		}
		if (fornecedor.getCidade()==null){
			throw new RuntimeException("O nome da cidade é obrigatório");
			
		}
		if(fornecedor.getBairro()== null){
			throw new RuntimeException("O nome do fornecedor é obrigatório");
			}
		if(fornecedor.getEstado()== null){
			throw new RuntimeException("O nome do estado é obrigatório");
			}
		
		for (Fornecedor forn : fornecedores) {
			if (forn.getCnpj().equals(forn.getCnpj())) {
				throw new RuntimeException("CNPJ duplicado");	
	}
		}
	     fornecedores.add(fornecedor);
	}
	
	public void removerFornecedor(String cnpj) {
		for (Fornecedor forn : fornecedores) {  
		    if (forn.getCnpj().equals(cnpj)) {
		    	fornecedores.remove(forn);
		    	return;
		    }
		}  
		
		fornecedores.remove(cnpj);
	}

	
		public Fornecedor pesquisarFornecedor( String cnpj) throws ExcecaoNaoExiste{
			for (Fornecedor pesquisa: fornecedores ){
				if(pesquisa.getCnpj().equals(cnpj))
	                return pesquisa;
			}
			return null;
		
		}
		
	
    //---------------------------------------------------------------------------
	
	public void addAlimentos(Alimento alimento) {
		if (alimento.getCodigo() == null) {
			throw new RuntimeException("O preenchimento do Código é obrigatório");
		}
		if (alimento.getNome() == null) {
			throw new RuntimeException("O preenchimento do Nome é obrigatório");
		}
		if (alimento.getCategoria()== null){
			throw new RuntimeException("O preenchimento da Categoria é obrigatório");
		}
		if (alimento.getDataFab()== null){
			throw new RuntimeException("O preenchimento da Data de Fabricação é obrigatório");
		}
		if (alimento.getDataVenc()== null){
			throw new RuntimeException("O preenchimento da Data de Vencimento é obrigatório");
		}
		if (alimento.getFabricante()== null){
			throw new RuntimeException("O preenchimento do Fabricante é obrigatório");
		}
		
		for (Alimento ali : alimentos) {
			if (ali.getCodigo().equals(alimento.getCodigo())) {
				throw new RuntimeException("Código duplicado");
			}
		}
		alimentos.add(alimento);
	}
	public void removerAlimentos(String codigo) {
	     for(Alimento ali : alimentos){
	    	 if(ali.getCodigo().equals(codigo)){
	    		 alimentos.remove(ali);
	    		 return;
	    	 }
	     } alimentos.remove(codigo);
	}
	public Alimento pesquisarAlimentos( String codigo) throws ExcecaoNaoExiste{
		for (Alimento pesquisa: alimentos ){
			if(pesquisa.getCodigo().equals(codigo))
                return pesquisa;
		}
		return null;
	
	}
	
		
		//---------------------------------------------------------------------------
		
		public void addBebidas(Bebidas bebida) {
			if (bebida.getCodigo() == null) {
				throw new RuntimeException("O preenchimento do Código é obrigatório");
			}
			if (bebida.getNome() == null) {
				throw new RuntimeException("O preenchimento do Nome é obrigatório");
			}
			if (bebida.getCategoria()== null){
				throw new RuntimeException("O preenchimento da Categoria é obrigatório");
			}
			if (bebida.getDataFab()== null){
				throw new RuntimeException("O preenchimento da Data de Fabricação é obrigatório");
			}
			if (bebida.getDataVenc()== null){
				throw new RuntimeException("O preenchimento da Data de Vencimento é obrigatório");
			}
			if (bebida.getFabricante()== null){
				throw new RuntimeException("O preenchimento do Fabricante é obrigatório");
			}
			
			for (Bebidas beb : bebidas) {
				if (beb.getCodigo().equals(bebida.getCodigo())) {
					throw new RuntimeException("Código duplicado");
				}
			}
			bebidas.add(bebida);
		}
		public void removerBebidas(String codigo) {
		     for(Bebidas bebi : bebidas){
		    	 if(bebi.getCodigo().equals(codigo)){
		    		 bebidas
		    		 .remove(bebi);
		    		 
		    		 return;
		    	 }
		     } bebidas.remove(codigo);
		}
		public Bebidas pesquisarBebidas( String codigo) throws ExcecaoNaoExiste{
			for (Bebidas pesquisa: bebidas ){
				if(pesquisa.getCodigo().equals(codigo))
	                return pesquisa;
			}
			return null;
		
		}
			
}

