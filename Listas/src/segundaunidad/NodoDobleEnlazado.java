package segundaunidad;

public class NodoDobleEnlazado {
	private Musica valor;
	private NodoDobleEnlazado siguiente;
	private NodoDobleEnlazado anterior;
	
	public NodoDobleEnlazado(Musica val, NodoDobleEnlazado sigui,NodoDobleEnlazado ant) {
		siguiente=sigui;
		anterior=ant;
		valor=val;
	}
	
	
	public Musica getValor() {
		return valor;
	}
	public void setValor(Musica valor) {
		this.valor = valor;
	}
	public NodoDobleEnlazado getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDobleEnlazado siguiente) {
		this.siguiente = siguiente;
	}
	public NodoDobleEnlazado getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDobleEnlazado anterior) {
		this.anterior = anterior;
	}
	

}