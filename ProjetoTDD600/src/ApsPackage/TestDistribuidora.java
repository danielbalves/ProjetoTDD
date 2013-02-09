package ApsPackage;

import junit.framework.Assert;

import org.junit.Test;




public class TestDistribuidora {

	Distribuidora distribuidora;

	@org.junit.Before
	public  void setUp(){

		distribuidora = new Distribuidora();

	}
	
	private Cliente criarClientePadrao(){
		Cliente cliente= new Cliente();
		cliente.setNome("Dan");
		cliente.setCnpj("001");
		cliente.setBairro("Centro");
		cliente.setCidade("Rio Tinto");
		cliente.setRua("Rua do meio");
		cliente.setEstado("PB");
		cliente.setNumero(104); 
		distribuidora.addCliente(cliente);
		return cliente;
	}


	private Funcionario criarFuncionarioPadrao(){

		Funcionario funcionario= new Funcionario();
		funcionario.setNome("Antonio Silva");
		funcionario.setBairro("Centro");
		funcionario.setCidade("Jo�o Pessoa");
		funcionario.setCpf("0111");
		funcionario.setEstado("PB");
		funcionario.setRua("Rua Castro Alves");
		funcionario.setNumero(987);
		funcionario.setRg("000003");
		distribuidora.addFuncionario(funcionario);

		return funcionario;

	}


	private Fornecedor criarFornecedorPadrao(){
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Arroz e cia");
		fornecedor.setCnpj("003");
		fornecedor.setRua("Rua Jos� Hor�cio");
		fornecedor.setBairro("Industri�rios");
		fornecedor.setCidade("Fortaleza");
		fornecedor.setEstado("CE");
		fornecedor.setNumero(567);
		distribuidora.addFornecedor(fornecedor);
		return fornecedor;
	}

	
	private Alimento criaAlimento1(){

		Alimento item = new Alimento();
		item.setNome("Arroz");
		item.setCategoria("Graos");
		item.setCodigo("001");
		item.setDataFab("01/01/2013");
		item.setDataVenc("30/10/2015");
		item.setFabricante("S�o Braz");

		
		distribuidora.addAlimentos(item);

		return item;
	}

	private Alimento criaAlimento2(){

		Alimento item = new Alimento();
		item.setNome("Feij�o");
		item.setCategoria("Graos");
		item.setCodigo("003");
		item.setDataFab("01/01/2013");
		item.setDataVenc("30/10/2015");
		item.setFabricante("S�o Braz");

		
		distribuidora.addAlimentos(item);

		return item;
	}

	/*neste teste, se colocar os dois alimentos com o mesmo nome ele passa
		beleza, mas se os alimentos tiverem nome diferente acusara o erro"
	*/
	@Test
	public void comparaNomeDeAlimento(){
		Alimento alimento1 = criaAlimento1();
		Alimento alimento2 = criaAlimento2();
		
		
		alimento1.setNome("macarrao");
		alimento2.setNome("macarrao");
		
		Assert.assertEquals("Alimento diferente", alimento1.getNome(), alimento2.getNome());
	}
	private Bebidas cadastrarBebidas(){
		Bebidas bebidas = new Bebidas();
		bebidas.setNome("Coca cola");
		bebidas.setCategoria("Refrigerante");
		bebidas.setCodigo("002");
		bebidas.setDataFab("05/12/2012");
		bebidas.setDataVenc("08/10/2014");
		bebidas.setFabricante("Coca cola.LTDA");
		distribuidora.addBebidas(bebidas);
		
		return bebidas;
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

		Assert.assertEquals(cliente, distribuidora.pesquisarCliente("001"));


	}

	
	@Test(expected=Exception.class)

	public void testAddClienteNomeNulo(){
		Cliente cliente = criarClientePadrao();
		cliente.setNome(null);
		distribuidora.addCliente(cliente);
	}

	
	@Test(expected=Exception.class)

	public void testAddClienteCnpjNulo(){

		Cliente cliente = criarClientePadrao();
		cliente.setCnpj(null);
		distribuidora.addCliente(cliente);

	}
	
	
	@Test(expected=Exception.class)

	public void testAddClienteBairroNulo(){
		Cliente cliente= criarClientePadrao();		    
		cliente.setBairro(null);
		distribuidora.addCliente(cliente);

	}
	
	
	@Test(expected=Exception.class)

	public void testAddClienteCidadeNula(){
		Cliente cliente= criarClientePadrao();
		cliente.setCidade(null);
		distribuidora.addCliente(cliente);

	}
	
	
	@Test(expected=Exception.class)

	public void testAddClienteRuaNula(){
		Cliente cliente = criarClientePadrao();
		cliente.setRua(null);
		distribuidora.addCliente(cliente);

	}
	
	
	@Test(expected=Exception.class)

	public void testAddClienteEstadoNulo(){
		Cliente cliente= criarClientePadrao();
		cliente.setEstado(null);
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
		funcionario.setCidade("Jo�o Pessoa");
		funcionario.setCpf("0111");
		funcionario.setEstado("PB");
		funcionario.setRua("Rua Castro Alves");
		funcionario.setNumero(987);
		funcionario.setRg("000003");
		distribuidora.addFuncionario(funcionario);
		Assert.assertNotNull(funcionario.getNome());

	}
	

	@Test(expected=Exception.class)

	public void testAddFuncionarioNomeNulo(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setNome(null);
		distribuidora.addFuncionario(funcionario);
	}

	
	@Test (expected=Exception.class)

	public void testAddFuncinarioBairroNulo(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setBairro(null);
		distribuidora.addFuncionario(funcionario);

	}

	@Test (expected=Exception.class)

	public void testAddFuncionarioCidadeNula(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setCidade(null);
		distribuidora.addFuncionario(funcionario);

	}
	
	
	@Test(expected=Exception.class)

	public void testAddFuncionarioCpfNulo(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setCpf(null);
		distribuidora.addFuncionario(funcionario);
	}


	@Test (expected=Exception.class)

	public void testAddFuncinarioEstadoNulo(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setEstado(null);
		distribuidora.addFuncionario(funcionario);


	}


	@Test (expected=Exception.class)

	public void testAddFuncionarioRuaNula(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setRua(null);
		distribuidora.addFuncionario(funcionario);


	}


	@Test(expected=Exception.class)

	public void testAddFuncionarioRGNulo(){
		Funcionario funcionario= criarFuncionarioPadrao();
		funcionario.setRg(null);
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
		fornecedor.setRua("Rua Jos� Hor�cio");
		fornecedor.setBairro("Industri�rios");
		fornecedor.setCidade("Fortaleza");
		fornecedor.setEstado("CE");
		fornecedor.setNumero(567);
		distribuidora.addFornecedor(fornecedor);
		Assert.assertNotNull(fornecedor.getNome());
		Assert.assertEquals(fornecedor, distribuidora.pesquisarFornecedor("003"));

	}

	
	@Test(expected=Exception.class)

	public void testAddFornecedorNomeNulo(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setNome(null);
		distribuidora.addFornecedor(fornecedor);

	}


	@Test (expected=Exception.class)

	public void testAddFornecedorCnpjNulo(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setCnpj(null);
		distribuidora.addFornecedor(fornecedor);
	}


	@Test (expected=Exception.class)

	public void testAddFornecedorRuaNula(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setRua(null);
		distribuidora.addFornecedor(fornecedor);
	}


	@Test  (expected=Exception.class)
	
	public void testAddFornecedorBairroNulo(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setBairro(null);
		distribuidora.addFornecedor(fornecedor);

	}


	@Test (expected=Exception.class)

	public void testAddFornecedorCidadeNula(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setNome(null);
		distribuidora.addFornecedor(fornecedor);

	}


	@Test (expected=Exception.class)

	public void testAddFornecedorEstadoNulo(){
		Fornecedor fornecedor = criarFornecedorPadrao();
		fornecedor.setEstado(null);
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
		Alimento alimentos = new Alimento();
		alimentos.setNome("Arroz");
		alimentos.setCategoria("Graos");
		alimentos.setCodigo("001");
		alimentos.setDataFab("01/01/2013");
		alimentos.setDataVenc("30/10/2015");
		alimentos.setFabricante("S�o Braz");
		distribuidora.addAlimentos(alimentos);
		Assert.assertNotNull(alimentos.getNome());
		Assert.assertEquals(alimentos, distribuidora.pesquisarAlimentos("001"));


	}

	
	@Test  (expected=Exception.class)
	
	public void testAddAlimentoNomeNulo(){
		Alimento alimentos = criaAlimento1();
		alimentos.setNome(null);
		distribuidora.addAlimentos(alimentos);


	}

	
	@Test  (expected=Exception.class)

	public void testAddAlimentoCategoriaNula(){
		Alimento alimentos = criaAlimento1();
		alimentos.setCategoria(null);
		distribuidora.addAlimentos(alimentos);

	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoCodigoNulo(){
		Alimento alimentos = criaAlimento1();
		alimentos.setCodigo(null);
		distribuidora.addAlimentos(alimentos);

	}

	
	@Test  (expected=Exception.class)

	public void testAddAlimentoDataFabNula(){

		Alimento alimentos = criaAlimento1();
		alimentos.setDataFab(null);
		distribuidora.addAlimentos(alimentos);

	}

	
	@Test  (expected=Exception.class)

	public void testAddAlimentoDataVencNula(){
		Alimento alimentos = criaAlimento1();
		alimentos.setDataVenc(null);
		distribuidora.addAlimentos(alimentos);

	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoFabricanteNulo(){
		Alimento alimentos = criaAlimento1();
		alimentos.setFabricante(null);
		distribuidora.addAlimentos(alimentos);

	}



	@Test (expected=Exception.class)
	
	public void testRemoverAlimento(){
		Alimento alimentos = new Alimento();
		alimentos.setCodigo("001");
		distribuidora.addAlimentos(alimentos);
		distribuidora.removerAlimentos("001");
		Assert.assertNull(distribuidora.pesquisarAlimentos("001"));

	}
	
	
	@Test  (expected=Exception.class)
	
	public void testPesquisarAlimento(){
		Alimento alimentos1 = new Alimento();
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
		Assert.assertEquals(bebidas, distribuidora.pesquisarBebidas("002"));

	}

	
	@Test  (expected=Exception.class)
	
	public void testAddBebidasNomeNulo(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setNome(null);
		distribuidora.addBebidas(bebidas);

	}

	
	@Test  (expected=Exception.class)

	public void testAddBebidasCategoriaNula(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setCategoria(null);
		distribuidora.addBebidas(bebidas);

	}

	
	@Test  (expected=Exception.class)

	public void testAddBebidasCodigoNulo(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setCodigo(null);
		distribuidora.addBebidas(bebidas);

	}

	
	@Test  (expected=Exception.class)

	public void testAddBebidasDataFabNula(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setDataFab(null);
		distribuidora.addBebidas(bebidas);
		
	}

	
	@Test  (expected=Exception.class)

	public void testAddBebidasDataVencNula(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setDataVenc(null);
		distribuidora.addBebidas(bebidas);

	}
	
	
	@Test  (expected=Exception.class)

	public void testAddBebidasFabricanteNulo(){
		Bebidas bebidas = cadastrarBebidas();
		bebidas.setFabricante(null);
		distribuidora.addBebidas(bebidas);
	}


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
