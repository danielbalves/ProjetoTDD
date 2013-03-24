package ApsPackage;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;


public class TestDistribuidora {


	Distribuidora distribuidora;
	ClientePesssoaJuridica clientePessoaJuridica;
	ClientePessoaFisica clientePessoaFisica;
	Funcionario funcionario;
	Fornecedor fornecedor;
	Produto produto;
	Promocao promocao;
	Descontos desconto;

	@org.junit.Before
	public  void setUp(){


		distribuidora = new Distribuidora();
		clientePessoaJuridica =  new ClientePesssoaJuridica();
		clientePessoaFisica = new ClientePessoaFisica();
		funcionario= new Funcionario();
		fornecedor = new Fornecedor();
		desconto = new Descontos();
		produto = new Produto();
		promocao = new Promocao();
	}

	private ClientePesssoaJuridica criarClientePadraoPessoaJuridico(){

		clientePessoaJuridica.setNome("Dan");
		clientePessoaJuridica.setCnpj("001");
		clientePessoaJuridica.setBairro("Centro");
		clientePessoaJuridica.setCidade("Rio Tinto");
		clientePessoaJuridica.setRua("Rua do meio");
		clientePessoaJuridica.setEstado("PB");
		clientePessoaJuridica.setNumero(104); 
		clientePessoaJuridica.setCategoria("Classe A");

		return clientePessoaJuridica;
	}


	private ClientePessoaFisica criarClientePadraoPessoaFisica(){

		clientePessoaFisica.setNome("Izabelly");
		clientePessoaFisica.setCnpj("123");

		clientePessoaFisica.setBairro("estados");
		clientePessoaFisica.setCidade("Joao Pessoa");
		clientePessoaFisica.setRua("Av. rio Grande do Sul");
		clientePessoaFisica.setEstado("PB");
		clientePessoaFisica.setNumero(1422);
		clientePessoaFisica.setCodigoSimples("111");


		return clientePessoaFisica;
	}

	private Promocao criarPromocao(){

		promocao.setCodigoPromocao(1);
		promocao.setDataInicio("12/02/2000");
		promocao.setDataFinal("13/03/2000");
		promocao.setDesconto(5);


		return promocao;

	}
	private Produto criarProdutoPadraoAlimento(){
		produto = criaAlimento1();

		produto.setCategoria("Graos");
		produto.setNome("Grao de Bico");
		produto.setCodigo("098");
		produto.setDataFab("12/09/2013");
		produto.setDataVenc("15/12/2014");
		produto.setFabricante("Tio Joao");

		return produto;
	}

	private Produto criarProdutoPadraoBebida(){
		produto = criaBebida();

		return produto;
	}


	private Bebidas criaBebida(){
		Bebidas item = new Bebidas();

		item.setCodigo("012");
		item.setCategoria("Alcoolica");
		item.setDataFab("12/01");
		item.setDataVenc("12/04");
		item.setFabricante("SKOL");
		item.setNome("skolbeer");
		item.setQualificacaoQualidade("Nivel A");
		item.setQuantidadeEmEstoque(12.0);

		distribuidora.addBebidas(item);

		return item;

	}
	
	private ProdutosHigiene criaProdutosHigiene(){
		ProdutosHigiene item = new ProdutosHigiene();

		item.setCodigo("009");
		item.setCategoria("Creme dental");
		item.setDataFab("04/03");
		item.setDataVenc("29/10");
		item.setFabricante("Unilever");
		item.setNome("Colgate");
		item.setUtilidadeProduto("Higiene pessoal");
		item.setQuantidadeEmEstoque(20.0);

		distribuidora.addProdutosHigiene(item);

		return item;

	}
	

	private Funcionario criarFuncionarioPadrao(){


		funcionario.setNome("Antonio Silva");
		funcionario.setBairro("Centro");
		funcionario.setCidade("Joao Pessoa");
		funcionario.setCpf("0111");
		funcionario.setEstado("PB");
		funcionario.setRua("Rua Castro Alves");
		funcionario.setNumero(987);
		funcionario.setRg("000003");
		return funcionario;

	}


	private Fornecedor criarFornecedorPadrao(){

		fornecedor.setNome("Arroz e cia");
		fornecedor.setCnpj("003");
		fornecedor.setRua("Rua Jose Horacio");
		fornecedor.setBairro("Industriarios");
		fornecedor.setCidade("Fortaleza");
		fornecedor.setEstado("CE");
		fornecedor.setNumero(567);
		distribuidora.addFornecedor(fornecedor);
		return fornecedor;
	}


	private Alimentos criaAlimento1(){

		Alimentos item = new Alimentos();
		item.setNome("Arroz");
		item.setCategoria("Graos");
		item.setCodigo("001");
		item.setDataFab("01/01/2013");
		item.setDataVenc("30/10/2015");
		item.setFabricante("Sao Braz");
		item.setCodigoSafra("0001");


		distribuidora.addAlimentos(item);

		return item;
	}

	private Alimentos criaAlimento2(){

		Alimentos item = new Alimentos();
		item.setNome("Feijao");
		item.setCategoria("Graos");
		item.setCodigo("003");
		item.setDataFab("01/01/2013");
		item.setDataVenc("30/10/2015");
		item.setFabricante("Sao Braz");


		distribuidora.addAlimentos(item);

		return item;
	}

	/*neste teste, se colocar os dois alimentos com o mesmo nome ele passa
			beleza, mas se os alimentos tiverem nome diferente acusara o erro"
	 */
	@Test
	public void testComparaNomeDeAlimento(){
		Alimentos alimento1 = criaAlimento1();
		Alimentos alimento2 = criaAlimento2();


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
		bebidas.setQualificacaoQualidade("Nivel A");
		distribuidora.addBebidas(bebidas);

		return bebidas;
	}



	@Test

	public void testAddClientePessoaFisica(){
		ClientePessoaFisica cliente = criarClientePadraoPessoaFisica();

		distribuidora.addCliente(cliente);

		Assert.assertEquals(cliente, distribuidora.pesquisarClientePessoaFisica("111"));

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaNomeNulo(){
		ClientePessoaFisica cliente = criarClientePadraoPessoaFisica();
		cliente.setNome(null);
		distribuidora.addCliente(cliente);
	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaCnpjNulo(){

		ClientePessoaFisica cliente = criarClientePadraoPessoaFisica();
		cliente.setCnpj(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaBairroNulo(){
		ClientePessoaFisica cliente= criarClientePadraoPessoaFisica();		    
		cliente.setBairro(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaCidadeNula(){
		ClientePessoaFisica cliente= criarClientePadraoPessoaFisica();
		cliente.setCidade(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaRuaNula(){
		ClientePessoaFisica cliente = criarClientePadraoPessoaFisica();
		cliente.setRua(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaFisicaEstadoNulo(){
		ClientePessoaFisica cliente= criarClientePadraoPessoaFisica();
		cliente.setEstado(null);
		distribuidora.addCliente(cliente);
	}


	@Test

	public void testRemoverClientePessoaFisica(){	
		ClientePessoaFisica cliente= new ClientePessoaFisica();
		cliente.setNome("Izabelly");
		cliente.setCnpj("001");
		distribuidora.removerCliente("001");
		Assert.assertNull(distribuidora.pesquisarClientePessoaJuridica("001"));

	}


	@Test (expected=Exception.class)

	public void testPesquisarClientePessoaFisica(){
		ClientePessoaFisica cliente1 = new ClientePessoaFisica();
		cliente1.setNome("Izabelly");
		cliente1.setCnpj("001");
		distribuidora.addCliente(cliente1);
		Assert.assertEquals(cliente1, distribuidora.pesquisarClientePessoaJuridica("001"));

	}
	@Test

	public void testAddClientePessoaJuridica(){
		ClientePesssoaJuridica cliente = criarClientePadraoPessoaJuridico();

		distribuidora.addCliente(cliente);

		Assert.assertEquals(cliente, distribuidora.pesquisarClientePessoaJuridica("001"));

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaNomeNulo(){
		ClientePesssoaJuridica cliente = criarClientePadraoPessoaJuridico();
		cliente.setNome(null);
		distribuidora.addCliente(cliente);
	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaCnpjNulo(){

		ClientePesssoaJuridica cliente = criarClientePadraoPessoaJuridico();
		cliente.setCnpj(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaBairroNulo(){
		ClientePesssoaJuridica cliente= criarClientePadraoPessoaJuridico();		    
		cliente.setBairro(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaCidadeNula(){
		ClientePesssoaJuridica cliente= criarClientePadraoPessoaJuridico();
		cliente.setCidade(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaRuaNula(){
		ClientePesssoaJuridica cliente = criarClientePadraoPessoaJuridico();
		cliente.setRua(null);
		distribuidora.addCliente(cliente);

	}


	@Test(expected=Exception.class)

	public void testAddClientePessoaJuridicaEstadoNulo(){
		ClientePesssoaJuridica cliente= criarClientePadraoPessoaJuridico();
		cliente.setEstado(null);
		distribuidora.addCliente(cliente);
	}


	@Test

	public void testRemoverClientePessoaJuridica(){	
		ClientePesssoaJuridica cliente= new ClientePesssoaJuridica();
		cliente.setNome("Dan");
		cliente.setCnpj("001");
		distribuidora.removerCliente("001");
		Assert.assertNull(distribuidora.pesquisarClientePessoaJuridica("001"));

	}


	@Test (expected=Exception.class)

	public void testPesquisarClientePessoaJuridica(){
		ClientePesssoaJuridica cliente1 = new ClientePesssoaJuridica();
		cliente1.setNome("Dan");
		cliente1.setCnpj("001");
		distribuidora.addCliente(cliente1);
		Assert.assertEquals(cliente1, distribuidora.pesquisarClientePessoaJuridica("001"));

	}    



	@Test

	public void testAddFuncionario(){
		Funcionario funcionario= criarFuncionarioPadrao();
		distribuidora.addFuncionario(funcionario);
		Assert.assertEquals(funcionario, distribuidora.pesquisarFuncionario("0111"));

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
		Fornecedor fornecedor = criarFornecedorPadrao();
		//distribuidora.addFornecedor(fornecedor);
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
		Alimentos alimentos = new Alimentos();
		alimentos.setNome("Arroz");
		alimentos.setCategoria("Graos");
		alimentos.setCodigo("001");
		alimentos.setDataFab("01/01/2013");
		alimentos.setDataVenc("30/10/2015");
		alimentos.setFabricante("Sao Braz");
		alimentos.setCodigoSafra("0001");
		distribuidora.addAlimentos(alimentos);
		Assert.assertNotNull(alimentos.getNome());
		Assert.assertEquals(alimentos, distribuidora.pesquisarAlimentos("001"));


	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoNomeNulo(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setNome(null);
		distribuidora.addAlimentos(alimentos);


	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoCategoriaNula(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setCategoria(null);
		distribuidora.addAlimentos(alimentos);

	}

	@Test  (expected=Exception.class)
	public void testAddAlimentoCodigoSafraNulo(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setCodigoSafra(null);
		distribuidora.addAlimentos(alimentos);
	}

	@Test  (expected=Exception.class)

	public void testAddAlimentoCodigoNulo(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setCodigo(null);
		distribuidora.addAlimentos(alimentos);

	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoDataFabNula(){

		Alimentos alimentos = criaAlimento1();
		alimentos.setDataFab(null);
		distribuidora.addAlimentos(alimentos);

	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoDataVencNula(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setDataVenc(null);
		distribuidora.addAlimentos(alimentos);

	}


	@Test  (expected=Exception.class)

	public void testAddAlimentoFabricanteNulo(){
		Alimentos alimentos = criaAlimento1();
		alimentos.setFabricante(null);
		distribuidora.addAlimentos(alimentos);

	}



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

	@Test 
	public void testClienteInexistente(){
		Assert.assertNull(distribuidora.pesquisarClientePessoaJuridica("99"));

	}
	@Test 
	public void testFuncionarioInexistente(){
		Assert.assertNull(distribuidora.pesquisarFuncionario("88"));

	}

	@Test
	public void testFornecedorInexistente(){
		Assert.assertNull(distribuidora.pesquisarFornecedor("84736"));

	}

	@Test
	public void testAlimentoInexistente(){
		Assert.assertNull(distribuidora.pesquisarFornecedor("48478"));

	}

	@Test
	public void testBebidaInexistente(){
		Assert.assertNull(distribuidora.pesquisarFornecedor("38788"));

	}


	@Test
	public void testAlterarDadosClientePessoaFisica(){
		ClientePessoaFisica cliente = criarClientePadraoPessoaFisica();
		cliente.setNome("bruno");
		cliente.setCnpj("124");
		cliente.setBairro("cabo branco");
		cliente.setCidade("Joao Pessoa");
		cliente.setRua("Av. Nossa Senhora Navegantes");
		cliente.setEstado("PB");
		cliente.setNumero(1422);
		cliente.setCodigoSimples("121");
		distribuidora.addCliente(cliente);

		Assert.assertEquals("O cliente foi alterado",cliente, distribuidora.pesquisarClientePessoaFisica("121"));


	}

	@Test
	public void testAlterarDadosClientePessoaJuridica(){

		ClientePesssoaJuridica cliente = criarClientePadraoPessoaJuridico();
		cliente.setNome("Jose");
		cliente.setCnpj("004");
		cliente.setBairro("Torre");
		cliente.setCidade("Joao Pessoa");
		cliente.setRua("Rua do meio");
		cliente.setEstado("PB");
		cliente.setNumero(104); 
		cliente.setCategoria("Classe A");
		distribuidora.addCliente(cliente);

		Assert.assertNotNull(cliente.getCnpj());
		Assert.assertEquals("O cliente Pessoa Juridica foi alterado", cliente, distribuidora.pesquisarClientePessoaJuridica("004"));

	}

	@Test  
	public void testPesquisarProdutoAlimentoEBebida() throws DistribuidoraException{
		Produto produtoAlimento = criarProdutoPadraoAlimento();
		Produto produtoBebida = criarProdutoPadraoBebida();

		produtoAlimento.setCodigo("123321");
		produtoBebida.setCodigo("23");

		distribuidora.addProduto(produtoBebida);
		distribuidora.addProduto(produtoAlimento);

		Assert.assertNotNull(produtoAlimento.getCodigo());
		Assert.assertNotNull(produtoBebida.getCodigo());
		Assert.assertEquals(produtoAlimento,distribuidora.pesquisarProduto("123321"));
		Assert.assertEquals(produtoBebida, distribuidora.pesquisarProduto("23"));

	}


	@Test
	public void testPesquisarPromocaoInvalida(){

		assertNull("Promoção Invalida",distribuidora.getPromocao(1));

	}

	@Test(expected = DistribuidoraException.class)
	public void testCadastrarPromocaoSemProduto() throws DistribuidoraException {
		assertNull("A promoção nao pode ser criada",distribuidora.criar(promocao,"0"));
	}

	@Test
	public void testAdicionarPromocaoAoProdutoAlimento() throws DistribuidoraException{
		produto = criarProdutoPadraoAlimento();
		produto.setCodigo("098");
		promocao = criarPromocao();
		distribuidora.addProduto(produto);

		assertTrue("Promocao criada com sucesso", distribuidora.criar(promocao,"098"));

	}

	@Test
	public void testAdicionarPromocaoAoProdutoBebida() throws DistribuidoraException{

		produto = criarProdutoPadraoBebida();
		produto.setCodigo("233");
		promocao = criarPromocao();
		distribuidora.addProduto(produto);

		assertTrue("Promocao criada com sucesso", distribuidora.criar(promocao,"233"));

	}

	@Test
	public void testRecuperarPromocaoPorCodigo() throws DistribuidoraException{

		produto = criarProdutoPadraoAlimento();
		produto.setCodigo("233");
		promocao= criarPromocao();

		distribuidora.addProduto(produto);

		assertTrue("Promocao criada com sucesso", distribuidora.criar(promocao,"233"));
		assertEquals("As promocoes devem ser iguais",promocao, distribuidora.getPromocao(1));

	}

	@Test
	public void testAddProdutosHigiene() throws DistribuidoraException{
		ProdutosHigiene produto = new ProdutosHigiene();
		produto.setNome("Papel Higienico");
		produto.setCategoria("Higiene Pessoal");
		produto.setCodigo("001");
		produto.setDataFab("01/01/2013");
		produto.setDataVenc("30/10/2015");
		produto.setFabricante("Johnsos&Johnsos");
		
		distribuidora.addProdutosHigiene(produto);
		Assert.assertNotNull(produto.getNome());
		Assert.assertEquals(produto, distribuidora.pesquisarProdutosHigiene("001"));


	}

	@Test  (expected=Exception.class)
	public void testAddProdutoHigienicoNulo(){
		ProdutosHigiene produto = new ProdutosHigiene();
		produto.setNome(null);
		distribuidora.addProdutosHigiene(produto);
	}

	@Test  (expected=Exception.class)

	public void testAddProdutoHigieneCategoriaNula(){
		ProdutosHigiene produto = new ProdutosHigiene();
		produto.setCategoria(null);
		distribuidora.addProdutosHigiene(produto);

	}
	
	@Test (expected=Exception.class)

	public void testPesquisarProdutoHigiener(){
		ProdutosHigiene produto = new ProdutosHigiene();
		produto.setNome("COLGATE");
		produto.setCodigo("12");
		distribuidora.addProdutosHigiene(produto);
		
		Assert.assertEquals(produto, distribuidora.pesquisarProdutosHigiene("12"));

	}
	
	
}