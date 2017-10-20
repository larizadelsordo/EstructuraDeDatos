package segundaunidad;

public class Canciones {
	
	private NodoDobleEnlazado valor;
	private Canciones siguiente;
	private Canciones anterior;
	public NodoDobleEnlazado getValor() {
		return valor;
	}
	public void setValor(NodoDobleEnlazado valor) {
		this.valor = valor;
	}
	public Canciones getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Canciones siguiente) {
		this.siguiente = siguiente;
	}
	public Canciones getAnterior() {
		return anterior;
	}
	public void setAnterior(Canciones anterior) {
		this.anterior = anterior;
	}
	

}
