package ApsPackage;



public class Promocao {
	
	    private int codigoPromocao;
	    
	    private String dataInicio;
	   
	    public void setDataInicio(String dataInicio) {
			this.dataInicio = dataInicio;
		}

		public void setDataFinal(String dataFinal) {
			this.dataFinal = dataFinal;
		}

		private String dataFinal;
	  
	    private int desconto;
	    
	    private int maximodeVendas;

	    public Promocao(){
	    	
	    }
	    
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + codigoPromocao;
			result = prime * result
					+ ((dataFinal == null) ? 0 : dataFinal.hashCode());
			result = prime * result
					+ ((dataInicio == null) ? 0 : dataInicio.hashCode());
			result = prime * result + desconto;
			result = prime * result + maximodeVendas;
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
			Promocao other = (Promocao) obj;
			if (codigoPromocao != other.codigoPromocao)
				return false;
			if (dataFinal == null) {
				if (other.dataFinal != null)
					return false;
			} else if (!dataFinal.equals(other.dataFinal))
				return false;
			if (dataInicio == null) {
				if (other.dataInicio != null)
					return false;
			} else if (!dataInicio.equals(other.dataInicio))
				return false;
			if (desconto != other.desconto)
				return false;
			if (maximodeVendas != other.maximodeVendas)
				return false;
			return true;
		}

		public int getCodigoPromocao() {
			return codigoPromocao;
		}

		public void setCodigoPromocao(int codigoPromocao) {
			this.codigoPromocao = codigoPromocao;
		}

	
		public int getDesconto() {
			return desconto;
		}

		public void setDesconto(int desconto) {
			this.desconto = desconto;
		}

		public int getMaximodeVendas() {
			return maximodeVendas;
		}

		public void setMaximodeVendas(int maximodeVendas) {
			this.maximodeVendas = maximodeVendas;
		}

	    
}
