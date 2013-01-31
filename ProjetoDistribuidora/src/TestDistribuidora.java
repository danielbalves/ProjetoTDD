import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;


public class TestDistribuidora {

 

	  @Before
	   public  void setUp(){

	     new Fornecedor();
	     new Funcionario();
	     new Produto();


	    }

		@Test
		public void testAddCliente(){
			Cliente cliente= new Cliente();
		    Distribuidora distribuidora = new Distribuidora();
			cliente.setNome("Dan");
			cliente.setCnpj("001");
			distribuidora.addCliente(cliente);
			Assert.assertNotNull(cliente.getNome());
			Assert.assertEquals("Dan", distribuidora.pesquisarCliente("001"));

		}

		@Test
		public void testRemoverCliente(){	
			Cliente cliente= new Cliente();
		    Distribuidora distribuidora = new Distribuidora();
			cliente.setNome("Dan");
			cliente.setCnpj("001");
			distribuidora.addCliente(cliente);
			distribuidora.removerCliente("001");
			Assert.assertNotNull(cliente.getNome());

		}

		@Test 
		public void testPesquisarCliente(){
			Cliente cliente1 = new Cliente();
			Distribuidora distribuidora= new Distribuidora();
			cliente1.setNome("Dan");
			cliente1.setCnpj("001");
			distribuidora.addCliente(cliente1);
			Assert.assertNotNull(cliente1.getCnpj());
			Assert.assertEquals("Dan", distribuidora.pesquisarCliente("001"));


		}    
		@Test
		public void testAddFuncinario(){
			Funcionario funcionario= new Funcionario();
		    Distribuidora distribuidora = new Distribuidora();
			funcionario.setNome("Antonio");
			distribuidora.addFuncionario(funcionario);
			Assert.assertNotNull(funcionario.getNome());
			Assert.assertEquals(null, distribuidora.pesquisarFuncionario(funcionario.getNome()));
		}

		@Test
		public void testRemoverFuncionario(){	
			Funcionario funcionario = new Funcionario();
		    Distribuidora distribuidora = new Distribuidora();
			funcionario.setNome("Joao");
			distribuidora.addFuncionario(funcionario);
			distribuidora.removerFuncionario("Joao");
			Assert.assertNotNull(funcionario.getNome());

		}

		@Test
		public void testPesquisarFuncionario(){
			Funcionario funcionario1 = new Funcionario();
			Distribuidora distribuidora= new Distribuidora();
			funcionario1.setNome("Joao");
			funcionario1.setCpf("100");
			distribuidora.addFuncionario(funcionario1);
			Assert.assertNotNull(funcionario1.getCpf());
			Assert.assertEquals("Joao", distribuidora.pesquisarFuncionario("100"));


		}

		@Test
		public void testAddFornecedor(){
			Fornecedor fornecedor = new Fornecedor();
		    Distribuidora distribuidora = new Distribuidora();
			fornecedor.setNome("Arroz e cia");
			fornecedor.setCnpj("003");
		    distribuidora.addFornecedor(fornecedor);
		    Assert.assertNotNull(fornecedor.getNome());
			Assert.assertEquals(null, distribuidora.pesquisarFornecedor(fornecedor.getNome()));

	    }

		@Test
		public void testRemoverFornecedor(){
			Fornecedor fornecedor = new Fornecedor();
		    Distribuidora distribuidora = new Distribuidora();
			fornecedor.setNome("Arroz e cia");
		    distribuidora.addFornecedor(fornecedor);
		    distribuidora.removerFornecedor("Arroz e cia");
			Assert.assertNotNull(fornecedor.getNome());

		}

		@Test
		public void testPesquisarFornecedor(){
			Fornecedor fornecedor1 = new Fornecedor();
			Distribuidora distribuidora= new Distribuidora();
			fornecedor1.setNome("Arroz e cia");
			fornecedor1.setCnpj("001");
			distribuidora.addFornecedor(fornecedor1);
			Assert.assertNotNull(fornecedor1.getCnpj());
			Assert.assertEquals("Arroz e cia", distribuidora.pesquisarFornecedor("001"));

		}

	    @Test
	    public void testAddAlimento(){
	    	Alimentos alimentos = new Alimentos();
		    Distribuidora distribuidora = new Distribuidora();
			alimentos.setNome("Arroz");
		    distribuidora.addAlimentos(alimentos);
		    Assert.assertNotNull(alimentos.getNome());
			Assert.assertEquals(null, distribuidora.pesquisarAlimentos(alimentos.getNome()));


	    }

	    @Test
	    public void testRemoverAlimento(){
	    	Alimentos alimentos = new Alimentos();
		    Distribuidora distribuidora = new Distribuidora();
			alimentos.setNome("Arroz");
		    distribuidora.addAlimentos(alimentos);
		    distribuidora.removerAlimentos("Arroz");
			Assert.assertNotNull(alimentos.getNome());

	    }
	    @Test
	    public void testPesquisarAlimento(){
	    	Alimentos alimentos1 = new Alimentos();
			Distribuidora distribuidora= new Distribuidora();
			alimentos1.setNome("Arroz");
			alimentos1.setCategoria("Graos"); 
			alimentos1.setCodigo("1212");
			distribuidora.addAlimentos(alimentos1);
			Assert.assertNotNull(alimentos1.getCodigo());
			Assert.assertEquals("Arroz", distribuidora.pesquisarAlimentos("1212"));

	    }

	    @Test
	    public void testAddBebidas(){
	    	Bebidas bebidas = new Bebidas();
		    Distribuidora distribuidora = new Distribuidora();
			bebidas.setNome("Coca cola");
		    distribuidora.addBebidas(bebidas);
		    Assert.assertNotNull(bebidas.getNome());
			Assert.assertEquals("Coca cola", distribuidora.pesquisarBebidas(bebidas.getNome()));

	    }

	    @Test
	    public void testRemoverBebidas(){ 
	    	Bebidas bebidas = new Bebidas();
		    Distribuidora distribuidora = new Distribuidora();
			bebidas.setNome("Coca cola");
		    distribuidora.addBebidas(bebidas);
		    distribuidora.removerBebidas("Coca cola");
			Assert.assertNotNull(bebidas.getNome());

	    }

	    @Test
	    public void testPesquisarBebidas(){
			Bebidas bebidas1 = new Bebidas();
			Distribuidora distribuidora= new Distribuidora();
			bebidas1.setNome("Coca cola");
			bebidas1.setCodigo("9898");
			distribuidora.addBebidas(bebidas1);
			Assert.assertNotNull(bebidas1.getCodigo());
			Assert.assertEquals("Coca cola", distribuidora.pesquisarBebidas("100"));


		}

