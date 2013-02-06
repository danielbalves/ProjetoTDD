package ApsPackage;

import junit.framework.Assert;

import org.junit.Test;




public class TestDistribuidora {

	Distribuidora distribuidora;
	
	  @org.junit.Before
	   public  void setUp(){

	       distribuidora = new Distribuidora();

	    }


		@Test
		
		public void testAddCliente(){
			Cliente cliente= new Cliente();
		    cliente.setNome("Dan");
			cliente.setCnpj("001");
			cliente.setBairro("Centro");
			cliente.setCidade("Rio Tinto");
			cliente.setRua("Rua do meio");
			cliente.setEstado("PB");
			cliente.setNumero(104); 
			distribuidora.addCliente(cliente);
			Assert.assertNotNull(cliente.getNome());
			Assert.assertEquals(cliente, distribuidora.pesquisarCliente("Dan"));

		}


		//Se o Cnpj não for preenchido , irá lançar a exceção, pois não é permitido que isso aconteça;
		@Test(expected=Exception.class)
		
		public void testAddClienteNomeNulo(){
			Cliente cliente = new Cliente();
			cliente.setCnpj("001");
			cliente.setBairro("Centro");
			cliente.setCidade("Rio Tinto");
			cliente.setRua("Rua do meio");
			cliente.setEstado("PB");
			cliente.setNumero(104); 
			distribuidora.addCliente(cliente);
		}

		//Se o Cnpj não for preenchido , irá lançar a exceção, pois não é permitido que isso aconteça;
		@Test(expected=Exception.class)
		
		public void testAddClienteCnpjNulo(){
			Cliente cliente = new Cliente();
			cliente.setNome("Dan");
			cliente.setBairro("Centro");
			cliente.setCidade("Rio Tinto");
			cliente.setRua("Rua do meio");
			cliente.setEstado("PB");
			cliente.setNumero(104); 
			distribuidora.addCliente(cliente);
			
		}
		@Test(expected=Exception.class)
		
		public void testAddClienteBairroNulo(){
			Cliente cliente= new Cliente();
		    cliente.setNome("Dan");
			cliente.setCnpj("001");
			cliente.setCidade("Rio Tinto");
			cliente.setRua("Rua do meio");
			cliente.setEstado("PB");
			cliente.setNumero(104); 
			distribuidora.addCliente(cliente);
			
		}
		@Test(expected=Exception.class)
		
		public void testAddClienteCidadeNula(){
		Cliente cliente= new Cliente();
	    cliente.setNome("Dan");
		cliente.setCnpj("001");
		cliente.setBairro("Centro");
		cliente.setRua("Rua do meio");
		cliente.setEstado("PB");
		cliente.setNumero(104); 
		distribuidora.addCliente(cliente);
			
		}
		//Se o nome da rua não for preechido, irá lançar a exceção, pois não é permitido que isso aconteça;
		@Test(expected=Exception.class)
		
		public void testAddClienteRuaNula(){
			Cliente cliente = new Cliente();
			cliente.setNome("Dan");
			cliente.setCnpj("001");
			cliente.setBairro("Centro");
			cliente.setCidade("Rio Tinto");
			cliente.setEstado("PB");
			cliente.setNumero(104); 
			distribuidora.addCliente(cliente);
			
		}
		@Test(expected=Exception.class)
		
		public void testAddClienteEstadoNulo(){
		Cliente cliente= new Cliente();
	    cliente.setNome("Dan");
		cliente.setCnpj("001");
		cliente.setBairro("Centro");
		cliente.setCidade("Rio Tinto");
		cliente.setRua("Rua do meio");
	
		cliente.setNumero(104); 
		distribuidora.addCliente(cliente);
		}
	
		
		@Test
		
		public void testRemoverCliente(){	
			Cliente cliente= new Cliente();
		    cliente.setNome("Dan");
			cliente.setCnpj("001");
			distribuidora.removerCliente("001");
			Assert.assertNull(distribuidora.pesquisarCliente("001"));

		}

		@Test (expected=Exception.class)

		public void testPesquisarCliente(){
			Cliente cliente1 = new Cliente();
			cliente1.setNome("Dan");
			cliente1.setCnpj("001");
			distribuidora.addCliente(cliente1);
			Assert.assertEquals(cliente1, distribuidora.pesquisarCliente("001"));


		}    
		@Test
		
		public void testAddFuncinario(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setBairro("Centro");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setCpf("0111");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
			Assert.assertNotNull(funcionario.getNome());
			
			}
		//Se quando o funcionário for adicionado o Nome não for preenchido, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		
		@Test(expected=Exception.class)
		
		public void testAddFuncionarioNomeNulo(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setBairro("Centro");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setCpf("0111");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
		}
		
		@Test (expected=Exception.class)
		public void testAddFuncinarioBairroNulo(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setCpf("0111");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
		    
		    
		}
		
		@Test (expected=Exception.class)
		
		public void testAddFuncionarioCidadeNula(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setBairro("Centro");
		    funcionario.setCpf("0111");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
			
		}
		//Se quando o funcionário for adicionado o CPF não for preenchido, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		
		@Test(expected=Exception.class)
		
		public void testAddFuncionarioCpfNulo(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setBairro("Centro");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
		}
		
		
	@Test (expected=Exception.class)
		
		public void testAddFuncinarioEstadoNulo(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setBairro("Centro");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setCpf("0111");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    funcionario.setRg("000003");
		    distribuidora.addFuncionario(funcionario);
			
			
			}
	//Se quando o funcionário for adicionado a rua não for preenchida, irá lançar a exceção, pois não 
	//é permitido que isso aconteça;
	

	@Test (expected=Exception.class)
	
	public void testAddFuncionarioRuaNula(){
	Funcionario funcionario= new Funcionario();
    funcionario.setNome("Antonio Silva");
    funcionario.setBairro("Centro");
    funcionario.setCidade("João Pessoa");
    funcionario.setCpf("0111");
    funcionario.setEstado("PB");
    funcionario.setNumero(987);
    funcionario.setRg("000003");
    distribuidora.addFuncionario(funcionario);
	
	
		}
		
		//Se quando o funcionário for adicionado o RG não for preenchido, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		@Test(expected=Exception.class)
		
		public void testAddFuncionarioRGNulo(){
			Funcionario funcionario= new Funcionario();
		    funcionario.setNome("Antonio Silva");
		    funcionario.setBairro("Centro");
		    funcionario.setCidade("João Pessoa");
		    funcionario.setCpf("0111");
		    funcionario.setEstado("PB");
		    funcionario.setRua("Rua Castro Alves");
		    funcionario.setNumero(987);
		    distribuidora.addFuncionario(funcionario);
			
		}
	
	
		@Test (expected=Exception.class)

		public void testRemoverFuncionario(){	
			Funcionario funcionario = new Funcionario();
		    funcionario.setNome("Joao");
		    funcionario.setCpf("0111");
			distribuidora.addFuncionario(funcionario);
			distribuidora.removerFuncionario("0111");
			Assert.assertNull(distribuidora.pesquisarFuncionario("Joao"));


		}

		@Test  (expected=Exception.class)

		public void testPesquisarFuncionario(){
			Funcionario funcionario1 = new Funcionario();
			funcionario1.setNome("Joao");
			funcionario1.setCpf("100");
			distribuidora.addFuncionario(funcionario1);
			Assert.assertNotNull(funcionario1.getCpf());
			Assert.assertEquals(funcionario1, distribuidora.pesquisarFuncionario("100"));


		}

		@Test
		public void testAddFornecedor(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setBairro("Industriários");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		    Assert.assertNotNull(fornecedor.getNome());
			Assert.assertEquals(fornecedor, distribuidora.pesquisarFornecedor(fornecedor.getNome()));

	    }
		//Se quando o funcionário for adicionado o Nome não for preenchido, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		@Test(expected=Exception.class)

		public void testAddFornecedorNomeNulo(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setCnpj("003");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setBairro("Industriários");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		   
		}
		//Se quando o funcionário for adicionado o Cnpj não for preenchido, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		@Test (expected=Exception.class)

		public void testAddFornecedorCnpjNulo(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setBairro("Industriários");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		}
		//Se quando o funcionário for adicionado a Rua não for preenchida, irá lançar a exceção, pois não 
		//é permitido que isso aconteça;
		@Test (expected=Exception.class)

		public void testAddFornecedorRuaNula(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			fornecedor.setBairro("Industriários");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		}
		
		@Test  (expected=Exception.class)
		
		public void testAddFornecedorBairroNulo(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		    
}
		
		@Test (expected=Exception.class)
		
		public void testAddFornecedorCidadeNula(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setBairro("Industriários");
			fornecedor.setEstado("CE");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
		    
		}
		
		@Test (expected=Exception.class)
			
			public void testAddFornecedorEstadoNulo(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			fornecedor.setRua("Rua José Horácio");
			fornecedor.setBairro("Industriários");
			fornecedor.setCidade("Fortaleza");
			fornecedor.setNumero(567);
		    distribuidora.addFornecedor(fornecedor);
				
				}

		@Test (expected=Exception.class)

		public void testRemoverFornecedor(){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
			distribuidora.addFornecedor(fornecedor);
		    distribuidora.removerFornecedor("003");
		    Assert.assertNull(distribuidora.pesquisarFornecedor("003"));


		}

		@Test (expected=Exception.class)

		public void testPesquisarFornecedor(){
			Fornecedor fornecedor1 = new Fornecedor();
			fornecedor1.setNome("Arroz e cia");
			fornecedor1.setCnpj("001");
			distribuidora.addFornecedor(fornecedor1);
			Assert.assertNotNull(fornecedor1.getCnpj());
			Assert.assertEquals(fornecedor1, distribuidora.pesquisarFornecedor("001"));

		}

	    @Test
	    public void testAddAlimento(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCategoria("Graos");
			alimentos.setCodigo("001");
			alimentos.setDataFab("01/01/2013");
			alimentos.setDataVenc("30/10/2015");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);
		    Assert.assertNotNull(alimentos.getNome());
			Assert.assertEquals(alimentos, distribuidora.pesquisarAlimentos(alimentos.getNome()));


	    }
	    
	    @Test  (expected=Exception.class)
	    public void testAddAlimentoNomeNulo(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setCategoria("Graos");
			alimentos.setCodigo("001");
			alimentos.setDataFab("01/01/2013");
			alimentos.setDataVenc("30/10/2015");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);
		   

	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddAlimentoCategoriaNula(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCodigo("001");
			alimentos.setDataFab("01/01/2013");
			alimentos.setDataVenc("30/10/2015");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);

	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddAlimentoCodigoNulo(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCategoria("Graos");
			alimentos.setDataFab("01/01/2013");
			alimentos.setDataVenc("30/10/2015");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);
	    	
	    	
	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddAlimentoDataFabNula(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCategoria("Graos");
			alimentos.setCodigo("001");
			alimentos.setDataVenc("30/10/2015");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);
		    
	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddAlimentoDataVencNula(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCategoria("Graos");
			alimentos.setCodigo("001");
			alimentos.setDataFab("01/01/2013");
			alimentos.setFabricante("São Braz");
		    distribuidora.addAlimentos(alimentos);
		    
	    }
	    @Test  (expected=Exception.class)
	    
	    public void testAddAlimentoFabricanteNulo(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setNome("Arroz");
			alimentos.setCategoria("Graos");
			alimentos.setCodigo("001");
			alimentos.setDataFab("01/01/2013");
			alimentos.setDataVenc("30/10/2015");
		    distribuidora.addAlimentos(alimentos);
		    
	    }
	    
	    //Alimentos removerá através do código, pois podem existir produtos com o mesmo nome
	    @Test (expected=Exception.class)
	    public void testRemoverAlimento(){
	    	Alimentos alimentos = new Alimentos();
			alimentos.setCodigo("001");
		    distribuidora.addAlimentos(alimentos);
		    distribuidora.removerAlimentos("001");
		    Assert.assertNull(distribuidora.pesquisarAlimentos("001"));


	    }
	    @Test  (expected=Exception.class)
	    public void testPesquisarAlimento(){
	    	Alimentos alimentos1 = new Alimentos();
			alimentos1.setNome("Arroz");
			alimentos1.setCategoria("Graos"); 
			alimentos1.setCodigo("001");
			distribuidora.addAlimentos(alimentos1);
			Assert.assertNotNull(alimentos1.getCodigo());
			Assert.assertEquals(alimentos1, distribuidora.pesquisarAlimentos("001"));

	    }

	    @Test 
	    
	    public void testAddBebidas(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCategoria("Refrigerante");
			bebidas.setCodigo("002");
			bebidas.setDataFab("05/12/2012");
			bebidas.setDataVenc("08/10/2014");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);
		    Assert.assertNotNull(bebidas.getNome());
			Assert.assertEquals(bebidas, distribuidora.pesquisarBebidas(bebidas.getNome()));

	    }
	    
	    @Test  (expected=Exception.class)
	    public void testAddBebidasNomeNulo(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setCategoria("Refrigerante");
			bebidas.setCodigo("002");
			bebidas.setDataFab("05/12/2012");
			bebidas.setDataVenc("08/10/2014");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);

	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddBebidasCategoriaNula(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCodigo("002");
			bebidas.setDataFab("05/12/2012");
			bebidas.setDataVenc("08/10/2014");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);

	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddBebidasCodigoNulo(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCategoria("Refrigerante");
			bebidas.setDataFab("05/12/2012");
			bebidas.setDataVenc("08/10/2014");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);
	    	
	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddBebidasDataFabNula(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCategoria("Refrigerante");
			bebidas.setCodigo("002");
			bebidas.setDataVenc("08/10/2014");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);
		    
	    }
	    
	    @Test  (expected=Exception.class)
	    
	    public void testAddBebidasDataVencNula(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCategoria("Refrigerante");
			bebidas.setCodigo("002");
			bebidas.setDataFab("05/12/2012");
			bebidas.setFabricante("Coca cola.LTDA");
		    distribuidora.addBebidas(bebidas);
		    
	    }
	    @Test  (expected=Exception.class)
	    
	    public void testAddBebidasFabricanteNulo(){
	    	Bebidas bebidas = new Bebidas();
			bebidas.setNome("Coca cola");
			bebidas.setCategoria("Refrigerante");
			bebidas.setCodigo("002");
			bebidas.setDataFab("05/12/2012");
			bebidas.setDataVenc("08/10/2014");
		    distribuidora.addBebidas(bebidas);
		    
	    }
	    //Bebidas removerá através do código, pois podem existir produtos com o mesmo nome
	    @Test (expected=Exception.class)
	    
	    public void testRemoverBebidas(){ 
	    	Bebidas bebidas = new Bebidas();
			bebidas.setCodigo("002");
		    distribuidora.addBebidas(bebidas);
		    distribuidora.removerBebidas("002");
		    Assert.assertNull(distribuidora.pesquisarBebidas("002"));


	    }

	    @Test (expected=Exception.class)
	    public void testPesquisarBebidas(){
			Bebidas bebidas = new Bebidas();
			bebidas.setCodigo("9898");
			distribuidora.addBebidas(bebidas);
			Assert.assertNotNull(bebidas.getCodigo());
			Assert.assertEquals(bebidas, distribuidora.pesquisarBebidas("9898"));


		}

}