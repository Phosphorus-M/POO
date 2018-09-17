public class Serie implements Entregable {
	private String title;
	private Integer seasons;
	private Boolean gived;
	private String genere;
	private String author;
	public void prestar() {
		this.gived = Boolean.TRUE;
	}
	public void devolver() {
		this.gived = Boolean.FALSE;
	}
	public Boolean isEntregado() {
		return this.gived;
	}
	public String toString() {
		return "( Titulo: " + this.getTitle() + "\nTemporadas: " + this.getSeasons() + "\nEntregado: " + this.conseguirEntregable() + "\nGenero: " + this.getGenere() + "\nDirector: " + this.getAuthor() + ")"; 
	}
	public String conseguirEntregable(){
		if(this.isEntregado()) return "Entregado.";
		return "No entregado.";
	}
	
	public Serie () {
		this.setTitle("");
		this.setSeasons(0);
		this.setGenere("");
		this.gived = Boolean.FALSE;
		this.setAuthor("");
	}
	public Serie (String title, String author) {
		this.setTitle(title);
		this.setSeasons(0);
		this.gived = Boolean.FALSE;
		this.setGenere("");
		this.setAuthor(author);
	}
	public Serie (String title, Integer seasons, String genere, String author) {
		this.setTitle(title);
		this.setSeasons(seasons);
		this.gived = Boolean.FALSE;
		this.setGenere(genere);
		this.setAuthor(author);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSeasons() {
		return seasons;
	}
	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer compareTo(Object a) {
		Serie other = (Serie) a;
		if(other.seasons != null) return this.getSeasons() - other.getSeasons();
		return this.seasons;
	}
}
