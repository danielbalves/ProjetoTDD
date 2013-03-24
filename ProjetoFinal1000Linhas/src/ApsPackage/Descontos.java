package ApsPackage;

import java.util.Calendar;


public class Descontos {

	    
	    private String codigoDesconto;
	
	  
	    private double valorDoDesconto;
	    
	

	    public Descontos() {
	    
	    	
	    }



		public String getCodigoDesconto() {
			return codigoDesconto;
		}



		public void setCodigoDesconto(String codigoDesconto) {
			this.codigoDesconto = codigoDesconto;
		}



		public double getValorDoDesconto() {
			return valorDoDesconto;
		}



		public void setValorDoDesconto(double valorDoDesconto) {
			this.valorDoDesconto = valorDoDesconto;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime
					* result
					+ ((codigoDesconto == null) ? 0 : codigoDesconto.hashCode());
			long temp;
			temp = Double.doubleToLongBits(valorDoDesconto);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Descontos other = (Descontos) obj;
			if (codigoDesconto == null) {
				if (other.codigoDesconto != null)
					return false;
			} else if (!codigoDesconto.equals(other.codigoDesconto))
				return false;
			if (Double.doubleToLongBits(valorDoDesconto) != Double
					.doubleToLongBits(other.valorDoDesconto))
				return false;
			return true;
		}



	
}
