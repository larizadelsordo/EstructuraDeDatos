package segundaunidad;

public class Musica {
	private String idcancion;
	private String nombre;
	private String album;
	private String artista;
	public String getnombrecancion() {
		return nombre;
	}
	public void setNombrecancion(String nombrecancion) {
		this.nombre = nombrecancion;
	}
	private String genero;
	public String getId_cancion() {
		return idcancion;
	}
	public void setId_cancion(String i) {
		this.idcancion = i;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DATOS: "+"  ID "+this.idcancion+"  Nombre de la cancion:  "+this.nombre+" ARTISTA:  "+this.artista+"  ALBUM:  "+this.album+"  GENERO:  "+this.genero;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Musica temp=(Musica) o;
		return this.idcancion.compareTo(temp.getId_cancion());
	}

}