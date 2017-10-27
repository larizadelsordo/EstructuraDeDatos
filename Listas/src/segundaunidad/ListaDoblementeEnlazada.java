package segundaunidad;

public class ListaDoblementeEnlazada {
	private NodoDobleEnlazado inicio;
	private NodoDobleEnlazado fin;

	
	public ListaDoblementeEnlazada()
	{
		inicio=null;
		fin=null;
		
	}
	public void insertaralinicio(Musica valor)
	{
		if(inicio==null) {
			inicio=new NodoDobleEnlazado(valor,null,null);
			fin=inicio;
		}
		else {
			NodoDobleEnlazado nuevo=new NodoDobleEnlazado(valor,inicio,null);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}

	public boolean vacio(){
		
		if(fin==null&&inicio==null) {
		
			return true;
		}else 
			return false;
	}
	
	public void insertarfinal(Musica valor) {
		if(fin==null) {
			fin=new NodoDobleEnlazado(valor,null,null);
			inicio=fin;
		}else {
			NodoDobleEnlazado nuevo=new NodoDobleEnlazado(valor,null,fin);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	
	}
	
	public Musica  eliminarinicio() {
		Musica valor=inicio.getValor();
		inicio=inicio.getSiguiente();
		if(inicio!=null) {
			inicio.setAnterior(null);
			
		}else {
			fin=null;
		}
		return valor;
		
	}
	
	public Musica  eliminarfinal() {
		Musica valor=fin.getValor();
		fin=fin.getAnterior();
		if(fin!=null) {
			inicio.setSiguiente(null);
			
		}else {
			inicio=null;
		}
		return valor;	
	}
	
	
	
	public StringBuilder mostrarfrente() {
		StringBuilder cadena = new StringBuilder();
		NodoDobleEnlazado temp=inicio;
	    cadena.append("NULL---- ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("----");
			temp=temp.getSiguiente();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}
	
	
	public StringBuilder mostrardetras() {
		StringBuilder cadena = new StringBuilder();
		NodoDobleEnlazado temp=fin;
	    cadena.append("NULL---- ");
	    while(temp!=null) {
	    	cadena.append(temp.getValor());
	    	cadena.append("----");
			temp=temp.getAnterior();
	    	
	    }
		cadena.append("NULL");
		return cadena;
	}
	
}