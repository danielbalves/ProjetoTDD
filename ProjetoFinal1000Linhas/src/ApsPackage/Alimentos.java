package ApsPackage;

public class Alimentos extends Produto{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((codigoSafra == null) ? 0 : codigoSafra.hashCode());
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
		Alimentos other = (Alimentos) obj;
		if (codigoSafra == null) {
			if (other.codigoSafra != null)
				return false;
		} else if (!codigoSafra.equals(other.codigoSafra))
			return false;
		return true;
	}

	String codigoSafra;

	public String getCodigoSafra() {
		return codigoSafra;
	}

	public void setCodigoSafra(String codigoSafra) {
		this.codigoSafra = codigoSafra;
	}
	

	
	
}
