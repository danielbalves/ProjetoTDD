
public class Miniteste {

	private static final String FELIZ = null;
	private double desconto;
	private double resultado = 0.0;
	private String meuHumor;
	private Venda venda;
	private Produto produto;
	private TabelaPreco tp;

	public double calculaPrecoVenda() {
		
		final boolean comparaVenda= ((Venda) venda.getCliente()).getUF().equals("PB") ;
		final boolean humor = (meuHumor == FELIZ);

		desconto = venda.getDesconto();
		//Calcula o preço dos itens
		for(Item item : venda.getItens()) {
			produto = (Produto) item.getProduto();
			tp = produto.getTabelaPrecoVigente();
		
			if (comparaVenda && humor){
				resultado += tp.getPrecoEstadual() * ( 1 - desconto);
			}else{
				resultado += tp.getPrecoExterno();
			}
		
		}
		
		addFrete(resultado);
		addSeguro(resultado);
		return resultado;
	}


	//Adiciona frete
	public void addFrete(double resultado){
		Transportador t = venda.getTransportador();
		resultado += t.getFrete();
	}

	//Adiciona seguro
	public void addSeguro(double resultado){
		resultado += venda.getTaxaSeguro() * resultado;
	}
}
