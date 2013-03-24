package ApsPackage;

public class ProdutosHigiene extends Produto {
	
	String utilidadeProduto;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((utilidadeProduto == null) ? 0 : utilidadeProduto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutosHigiene other = (ProdutosHigiene) obj;
		if (utilidadeProduto == null) {
			if (other.utilidadeProduto != null)
				return false;
		} else if (!utilidadeProduto.equals(other.utilidadeProduto))
			return false;
		return true;
	}

	public String getUtilidadeProduto() {
		return utilidadeProduto;
	}

	public void setUtilidadeProduto(String utilidadeProduto) {
		this.utilidadeProduto = utilidadeProduto;
	}
	
	

}
