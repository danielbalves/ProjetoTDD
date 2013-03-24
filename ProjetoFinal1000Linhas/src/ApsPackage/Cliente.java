package ApsPackage;


public class Cliente extends Pessoa {

String Categoria;

public String getCategoria() {
	return Categoria;
}

public void setCategoria(String categoria) {
	Categoria = categoria;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
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
	Cliente other = (Cliente) obj;
	if (Categoria == null) {
		if (other.Categoria != null)
			return false;
	} else if (!Categoria.equals(other.Categoria))
		return false;
	return true;
}


	


}
