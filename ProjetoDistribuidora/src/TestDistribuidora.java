import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;




public class TestDistribuidora {
	  
	  
	   private Funcionario funcionario;
	   private Produto produto;
	   private Fornecedor fornecedor1;
	   private Bebidas bebida;
	   private Distribuidora distribuidora;
	
	  
	   
	  @Before
	   public  void setUp(){
		   
		  this.fornecedor1 = new Fornecedor();
	      this.funcionario = new Funcionario();
	      this.produto = new Produto();
	   
	       
	    }
	   
		@Test
		public void testAddCliente(){
			Cliente cliente= new Cliente();
		    Distribuidora distribuidora = new Distribuidora();
			cliente.setNome("Dan");
			cliente.setCnpj("001");
			cliente.setNome("Iza");
			cliente.setCnpj("002");
			distribuidora.addCliente(cliente);
			Assert.assertNotNull(cliente.getNome());
		}
		
		@Test
		public void testRemoverCliente(){	
			Cliente cliente= new Cliente();
		    Distribuidora distribuidora = new Distribuidora();
			cliente.setNome("Dan");
			cliente.setCnpj("001");
			cliente.setNome("Iza");
			cliente.setCnpj("002");
			distribuidora.addCliente(cliente);
			distribuidora.removerCliente("Dan");
			distribuidora.removerCliente("001");
			Assert.assertNotNull(cliente.getNome());
			
		}
		   
		@Test 
		public void testPesquisarCliente(){
			Cliente cliente1 = new Cliente();
			Distribuidora distribuidora= new Distribuidora();
			cliente1.setNome("Dan");
			cliente1.setCnpj("001");
			cliente1.setNome("Iza");
			cliente1.setCnpj("002");
			distribuidora.addCliente(cliente1);
			Assert.assertNotNull(cliente1.getCnpj());
			Assert.assertEquals(null, distribuidora.pesquisarCliente("001"));
			
		
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
			funcionario1.setNome("Antonio");
			funcionario1.setCpf("200");
			distribuidora.addFuncionario(funcionario1);
			Assert.assertNotNull(funcionario1.getCpf());
			Assert.assertEquals(null, distribuidora.pesquisarFuncionario("100"));
			
			
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
			fornecedor1.setNome("Feijao e cia");
			fornecedor1.setCnpj("002");
			distribuidora.addFornecedor(fornecedor1);
			Assert.assertNotNull(fornecedor1.getCnpj());
			Assert.assertEquals(null, distribuidora.pesquisarFornecedor("001"));
			
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
			Assert.assertEquals(null, distribuidora.pesquisarAlimentos("1212"));
			
	    }
	    
	    @Test
	    public void testAddBebidas(){
	    	Bebidas bebidas = new Bebidas();
		    Distribuidora distribuidora = new Distribuidora();
			bebidas.setNome("Coca cola");
		    distribuidora.addBebidas(bebidas);
		    Assert.assertNotNull(bebidas.getNome());
			Assert.assertEquals(null, distribuidora.pesquisarBebidas(bebidas.getNome()));
			
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
			Assert.assertEquals(null, distribuidora.pesquisarBebidas("100"));
			
			
		}
		
}
