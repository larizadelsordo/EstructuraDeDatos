package segundaunidad;

public class ListaDoblementeEnlazada {
	private Musica cabeza;
	private Musica cola;
	public ListaDoblementeEnlazada() {
		cabeza=null;
		cola=null;	
	}
	
	public Musica getCabeza() {
		return cabeza;
	}

	public void setCabeza(Musica cabeza) {
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
		Musica nuevo=new Musica();
		nuevo.setValor(valor);
		nuevo.setSig(null);
		nuevo.setAnt(null);
		this.cabeza=nuevo;
	}
	public void insertarnodoadelante(NodoDobleEnlazado valor)
	{
		if(vacio()) {
			insertar(valor);
		}
		else {
			Musica nuevo=new Musica();
			nuevo.setValor(valor);
			nuevo.setSig(this.cabeza);
			this.cabeza.setAnt(nuevo);
			nuevo.setAnt(null);
			this.cabeza=nuevo;
			
		}
	}

}
