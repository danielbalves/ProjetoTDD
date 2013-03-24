package ApsPackage;




public class Bebidas extends Produto {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((qualificacaoQualidade == null) ? 0 : qualificacaoQualidade
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
		Bebidas other = (Bebidas) obj;
		if (qualificacaoQualidade == null) {
			if (other.qualificacaoQualidade != null)
				return false;
		} else if (!qualificacaoQualidade.equals(other.qualificacaoQualidade))
			return false;
		return true;
	}

	String qualificacaoQualidade;

	public String getQualificacaoQualidade() {
		return qualificacaoQualidade;
	}

	public void setQualificacaoQualidade(String qualificacaoQualidade) {
		this.qualificacaoQualidade = qualificacaoQualidade;
	}
	
	
	
	
}

