package segundaunidad;

public class Musica {
	
	private NodoDobleEnlazado valor;
	private Musica sig;
	private Musica ant;
	public NodoDobleEnlazado getValor() {
		return valor;
	}
	public void setValor(NodoDobleEnlazado valor) {
		this.valor = valor;
	}
	public Musica getSig() {
		return sig;
	}
	public void setSig(Musica sig) {
		this.sig = sig;
	}
	public Musica getAnt() {
		return sig;
	}
	public void setAnt(Musica ant) {
		this.sig = ant;
	}
	

}
