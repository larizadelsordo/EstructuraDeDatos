package segundaunidad;

public class ListaDoblementeEnlazada {
	private Canciones cabeza;
	public ListaDoblementeEnlazada() {
		this.cabeza=null;
		
	}
	
	public Canciones getCabeza() {
		return cabeza;
	}

	public void setCabeza(Canciones cabeza) {
		this.cabeza = cabeza;
	}

	public boolean vacio() {
		boolean respuesta=true;
		if(this.cabeza!=null) {
			respuesta=false;
		}
		return respuesta;
	}
	public void insertar(NodoDobleEnlazado valor) {
		Canciones nuevo=new Canciones();
		nuevo.setValor(valor);
		nuevo.setSiguiente(null);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;
	}
	public void insertarnodoadelante(NodoDobleEnlazado valor)
	{
		if(vacio()) {
			insertar(valor);
		}
		else {
			Canciones nuevo=new Canciones();
			nuevo.setValor(valor);
			nuevo.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			nuevo.setAnterior(null);
			this.cabeza=nuevo;
			
		}
	}

}
