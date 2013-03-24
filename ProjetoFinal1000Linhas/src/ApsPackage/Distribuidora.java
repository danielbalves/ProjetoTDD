package ApsPackage;





import java.util.ArrayList;




public class Distribuidora {
	
	private ArrayList<ClientePessoaFisica> clientes1;
	private ArrayList<ClientePesssoaJuridica> clientes;
	private ArrayList<Fornecedor> fornecedores;
	private ArrayList<Alimentos> alimentos;
	private ArrayList<Bebidas> bebidas;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Produto> produtos;
	private ArrayList<Promocao> promocoes;
	private ArrayList<ProdutosHigiene> produtosHigiene;
	
	
	public Distribuidora(){
		this.clientes = new ArrayList <ClientePesssoaJuridica>();
		this.clientes1 = new ArrayList <ClientePessoaFisica>();
		this.fornecedores = new ArrayList <Fornecedor>();
		this.alimentos = new ArrayList <Alimentos>();
		this.bebidas = new ArrayList<Bebidas>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.produtos= new ArrayList<Produto>();
		this.promocoes=new ArrayList<Promocao>();
		this.produtosHigiene=new ArrayList<ProdutosHigiene>();
		
	}


	public void addCliente(ClientePesssoaJuridica cliente){
		if(cliente.getNome() == null){
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (cliente.getCnpj() == null) {
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (cliente.getRua()==null){
			throw new RuntimeException("O nome da rua � obrigat�rio");
			
		}
		if (cliente.getCidade()==null){
			throw new RuntimeException("O nome da cidade � obrigat�rio");
			
		}
		if(cliente.getEstado()== null){
			throw new RuntimeException("O nome do estado � obrigat�rio");
		}
		if(cliente.getBairro()== null){
			throw new RuntimeException("O nome do bairro � obrigat�rio");
		}
		
		
		
		for (ClientePesssoaJuridica c : clientes) {
			if (c.getCnpj().equals(cliente.getCnpj())) {
				throw new RuntimeException("CNPJ duplicado");
			}
		}
		
		clientes.add(cliente);
	}
	
	public void addCliente(ClientePessoaFisica cliente){
		if(cliente.getNome() == null){
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (cliente.getCnpj() == null) {
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (cliente.getRua()==null){
			throw new RuntimeException("O nome da rua � obrigat�rio");
			
		}
		if (cliente.getCidade()==null){
			throw new RuntimeException("O nome da cidade � obrigat�rio");
			
		}
		if(cliente.getEstado()== null){
			throw new RuntimeException("O nome do estado � obrigat�rio");
		}
		if(cliente.getBairro()== null){
			throw new RuntimeException("O nome do bairro � obrigat�rio");
		}
		
		
		
		for (ClientePessoaFisica c : clientes1) {
			if (c.getCnpj().equals(cliente.getCnpj())) {
				throw new RuntimeException("CNPJ duplicado");
			}
		}
		
		clientes1.add(cliente);
	}
	
	public void removerCliente(String nome) {
		for (ClientePesssoaJuridica cli: clientes) {  
		    if (cli.getNome().equals(nome)) {
		    	clientes.remove(cli);
		    	return;
		    }
		}  
		
		clientes.remove(nome);
		
	}

	public ClientePesssoaJuridica pesquisarClientePessoaJuridica( String cnpj) throws ExcecaoNaoExiste{
		for (ClientePesssoaJuridica pesquisa:clientes ){
			if(pesquisa.getCnpj().equals(cnpj))
                return pesquisa;
		}
		return null;
	}

	public ClientePessoaFisica pesquisarClientePessoaFisica( String codigoSimples) throws ExcecaoNaoExiste{
		for (ClientePessoaFisica pesquisa:clientes1 ){
			if(pesquisa.getCodigoSimples().equals(codigoSimples))
                return pesquisa;
		}
		return null;
	} 
	
	public Produto pesquisarProduto(String codigo) throws ExcecaoNaoExiste{
		
		for (Produto pesquisa:produtos){
			if (pesquisa.getCodigo().equals(codigo))
				return pesquisa;
		}
		return null;
	}
	
	
	//-----------------------------------------------------------------
	
	//Exigi que o cpf e rg do funcion�rio sejam obrigat�rios
	public void addFuncionario(Funcionario funcionario) {
		if(funcionario.getNome() == null){
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (funcionario.getCpf() == null) {
			throw new RuntimeException("O preenchimento do CPF � obrigat�rio");
		}
		if (funcionario.getRg()==null){
			throw new RuntimeException("O preenchimento do RG � obrigat�rio");
			
		}
		if (funcionario.getRua()==null){
			throw new RuntimeException("O nome da rua � obrigat�rio");
			
		}
		if (funcionario.getCidade()==null){
			throw new RuntimeException("O nome da da cidade � obrigat�rio");
			
		}
		if(funcionario.getEstado()== null){
		throw new RuntimeException("O nome do estado � obrigat�rio");
		}
		if(funcionario.getBairro()== null){
		throw new RuntimeException("O nome do bairro � obrigat�rio");
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
			throw new RuntimeException("O preenchimento do CNPJ � obrigat�rio");
		}
		if (fornecedor.getNome()==null){
			throw new RuntimeException("O preenchimento do Nome � obrigat�rio");
			
		}
		if (fornecedor.getRua()==null){
			throw new RuntimeException("O nome da rua � obrigat�rio");
			
		}
		if (fornecedor.getCidade()==null){
			throw new RuntimeException("O nome da cidade � obrigat�rio");
			
		}
		if(fornecedor.getBairro()== null){
			throw new RuntimeException("O nome do fornecedor � obrigat�rio");
			}
		if(fornecedor.getEstado()== null){
			throw new RuntimeException("O nome do estado � obrigat�rio");
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
	
	public void addAlimentos(Alimentos alimento) {
		if (alimento.getCodigo() == null) {
			throw new RuntimeException("O preenchimento do C�digo � obrigat�rio");
		}
		if (alimento.getNome() == null) {
			throw new RuntimeException("O preenchimento do Nome � obrigat�rio");
		}
		if (alimento.getCategoria()== null){
			throw new RuntimeException("O preenchimento da Categoria � obrigat�rio");
		}
		if (alimento.getDataFab()== null){
			throw new RuntimeException("O preenchimento da Data de Fabrica��o � obrigat�rio");
		}
		if (alimento.getDataVenc()== null){
			throw new RuntimeException("O preenchimento da Data de Vencimento � obrigat�rio");
		}
		if (alimento.getFabricante()== null){
			throw new RuntimeException("O preenchimento do Fabricante � obrigat�rio");
		}
		
		for (Alimentos ali : alimentos) {
			if (ali.getCodigo().equals(alimento.getCodigo())) {
				throw new RuntimeException("C�digo duplicado");
			}
		}
		alimentos.add(alimento);
	}
	public void removerAlimentos(String codigo) {
	     for(Alimentos ali : alimentos){
	    	 if(ali.getCodigo().equals(codigo)){
	    		 alimentos.remove(ali);
	    		 return;
	    	 }
	     } alimentos.remove(codigo);
	}
	public Alimentos pesquisarAlimentos( String codigo) throws ExcecaoNaoExiste{
		for (Alimentos pesquisa: alimentos ){
			if(pesquisa.getCodigo().equals(codigo))
                return pesquisa;
		}
		return null;
	
	}
	
		
		//---------------------------------------------------------------------------
		
		public void addBebidas(Bebidas bebida) {
			if (bebida.getCodigo() == null) {
				throw new RuntimeException("O preenchimento do C�digo � obrigat�rio");
			}
			if (bebida.getNome() == null) {
				throw new RuntimeException("O preenchimento do Nome � obrigat�rio");
			}
			if (bebida.getCategoria()== null){
				throw new RuntimeException("O preenchimento da Categoria � obrigat�rio");
			}
			if (bebida.getDataFab()== null){
				throw new RuntimeException("O preenchimento da Data de Fabrica��o � obrigat�rio");
			}
			if (bebida.getDataVenc()== null){
				throw new RuntimeException("O preenchimento da Data de Vencimento � obrigat�rio");
			}
			if (bebida.getFabricante()== null){
				throw new RuntimeException("O preenchimento do Fabricante � obrigat�rio");
			}
			
			for (Bebidas beb : bebidas) {
				if (beb.getCodigo().equals(bebida.getCodigo())) {
					throw new RuntimeException("C�digo duplicado");
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
		
		
		public Produto getProduto(String codigoNomeProduto) {
	        for (Produto pro : produtos) {
	            if (pro.getCodigo().equalsIgnoreCase(codigoNomeProduto)) {
	                return pro;
	            }
	        }
	        return null;
	    }

	    private boolean existeProduto(String codigoNomeProduto) {
	        return (getProduto(codigoNomeProduto) != null);
	    }
		
	    public boolean addProduto(Produto pro) throws ExcecaoNaoExiste {
	    	
	    	if(pro.getNome() == null || pro.getCodigo() == null){
	    		throw new ExcecaoNaoExiste("Dados n�o cadastrados");
	    	}
	        if (!existeProduto(pro.getCodigo()) && !existeProduto(pro.getNome())) {
	            return produtos.add(pro);
	        }
	        return false;
	    }

	    public boolean remover(Produto pro) {
	        if (existeProduto(pro.getCodigo()) && existeProduto(pro.getNome())) {
	            return produtos.remove(pro);
	        }
	        return false;
	    }

	  
	    public void zerarEstoque(){
	        for (Produto pro : produtos) {
	            pro.setQuantidadeVendido(0.0);
	        }
	    }
	    
	   
	    public Promocao getPromocao(int codigoPromocao) {
	        for (Promocao promocao : promocoes) {
	            if (promocao.getCodigoPromocao() == codigoPromocao) {
	                return promocao;
	            }
	        }
	        return null;
	    }
	    
	    
	    public boolean criar(Promocao promocao, String codigoProduto) throws DistribuidoraException {
	    	
	    	if (getProduto(codigoProduto)== null){
	    		throw new DistribuidoraException("Produto  n�o exite");
	    	}
	    	if (promocao.getCodigoPromocao() == 0){
	    		throw new DistribuidoraException(" Promocao n�o exite");
	    	}
	    	
	        
	    	promocao.setCodigoPromocao(1);
	    	
	    	
	    	
	         
	       
	        return promocoes.add(promocao);
	       }


		public void addProdutosHigiene(ProdutosHigiene produtoH) {
			if (produtoH.getCodigo() == null) {
				throw new RuntimeException("O preenchimento do C�digo � obrigat�rio");
			}
			if (produtoH.getNome() == null) {
				throw new RuntimeException("O preenchimento do Nome � obrigat�rio");
			}
			if (produtoH.getCategoria()== null){
				throw new RuntimeException("O preenchimento da Categoria � obrigat�rio");
			}
			if (produtoH.getDataFab()== null){
				throw new RuntimeException("O preenchimento da Data de Fabrica��o � obrigat�rio");
			}
			if (produtoH.getDataVenc()== null){
				throw new RuntimeException("O preenchimento da Data de Vencimento � obrigat�rio");
			}
			if (produtoH.getFabricante()== null){
				throw new RuntimeException("O preenchimento do Fabricante � obrigat�rio");
			}
			
			for (ProdutosHigiene prodH : produtosHigiene) {
				if (prodH.getCodigo().equals(produtoH.getCodigo())) {
					throw new RuntimeException("C�digo duplicado");
				}
			}
			produtosHigiene.add(produtoH);
		}
		public void removerProdutosHigiene(String codigo) {
		     for(ProdutosHigiene prodH : produtosHigiene){
		    	 if(prodH.getCodigo().equals(codigo)){
		    		 produtosHigiene.remove(prodH);
		    		 return;
		    	 }
		     } produtosHigiene.remove(codigo);
		}
		public ProdutosHigiene pesquisarProdutosHigiene( String codigo) throws ExcecaoNaoExiste{
			for(ProdutosHigiene pesquisa : produtosHigiene){
				if(pesquisa.getCodigo().equals(codigo))
	                return pesquisa;
			}
			return null;
		
		}
	    
}

	
		

