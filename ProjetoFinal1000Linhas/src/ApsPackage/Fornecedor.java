package ApsPackage;


public class Fornecedor extends Pessoa {

	String CodigoIdentificacao;

	public String getCodigoIdentificacao() {
		return CodigoIdentificacao;
	}

	public void setCodigoIdentificacao(String codigoIdentificacao) {
		CodigoIdentificacao = codigoIdentificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((CodigoIdentificacao == null) ? 0 : CodigoIdentificacao
						.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (CodigoIdentificacao == null) {
			if (other.CodigoIdentificacao != null)
				return false;
		} else if (!CodigoIdentificacao.equals(other.CodigoIdentificacao))
			return false;
		return true;
	}
	
	
	

}
