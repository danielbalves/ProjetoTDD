package ApsPackage;

public class ClientePessoaFisica extends Pessoa{

	String codigoSimples;
	String rg;
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((codigoSimples == null) ? 0 : codigoSimples.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		ClientePessoaFisica other = (ClientePessoaFisica) obj;
		if (codigoSimples == null) {
			if (other.codigoSimples != null)
				return false;
		} else if (!codigoSimples.equals(other.codigoSimples))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}

	public String getCodigoSimples() {
		return codigoSimples;
	}

	public void setCodigoSimples(String codigoSimples) {
		this.codigoSimples = codigoSimples;
	}
	
}
