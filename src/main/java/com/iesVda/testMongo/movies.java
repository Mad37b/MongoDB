package com.iesVda.testMongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

public class movies {

	/** Atributos de la clase Film **/

	private String[] id;
	private String plot;
	private List<String> genres;
	private int runtime;
	
	private String poster;
	private String title;
	@BsonProperty(value="fulplot")
	private String fullplot;
	private String[] Languajes;
	@BsonProperty(value="released")
	private String releasedDate;
	private List<String> directors;
	private List<String> winners;
	private List<String> Countries;
	private List<String> cast;
	private String rated;
	private Imdb imdbReference;
	private String lastupdated;
	private Awards theAwards;
	private int year;
	private char[] countries;
	private String type;
	private int num_mflix_coments;
	private int run_time;

	/** Objetos de la clase Film **/

	/** ------------------------------ **/

	/** ------- Metodos de la clase ------- **/

	public movies() {

	}

	public String[] getId() {
		return id;
	}

	public void setId(String[] id) {
		this.id = id;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullplot() {
		return fullplot;
	}

	public void setFullplot(String fullplot) {
		this.fullplot = fullplot;
	}

	public String[] getLanguajes() {
		return Languajes;
	}

	public void setLanguajes(String[] languajes) {
		Languajes = languajes;
	}

	public String getReleased() {
		return releasedDate;
	}

	public void setReleased(String released) {
		this.releasedDate = released;
	}

	public List<String> getDirectors() {
		return (List<String>) directors;
	}

	public void setDirectors(List<String> auxList) {
		this.directors = auxList;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public char[] getCountries() {
		return countries;
	}

	public void setCountries(char[] countries) {
		this.countries = countries;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum_mflix_coments() {
		return num_mflix_coments;
	}

	public void setNum_mflix_coments(int num_mflix_coments) {
		this.num_mflix_coments = num_mflix_coments;
	}

	public void setDirectors(List<String> directors, List<String> auxList) {
		// TODO Auto-generated method stub
		this.directors = directors;
		//this.auxList= auxList;
	}

	public void setImdbReference(Imdb imdbData) {
		// TODO Auto-generated method stub

	}

	public void setDirectors(String string, List<String> directors) {
		// TODO Auto-generated method stub
		this.directors = directors;
	}
	
	
	
	/////////
	
	
	public void save  ( movies newFilm ) {
		
		// metodo para  calcular el recorrido get(i)
	
		int i ; 
		for (i=0 ; i< 10 ;i++) {
			 
			int numeroAleatorio = (int) (Math.random()*10) + 1;
			System.out.println("numero Aleatorio : "+ numeroAleatorio);
		}
		
		List <String> generos = new ArrayList<>();
		
		generos=newFilm.getGenres();
		
		Document filmDatadoc = new Document("_id:", new Object() );
		
		filmDatadoc.append("plot",newFilm.getPlot());
		filmDatadoc.append("genres", ListOf1(genres.get(i)));
		
		
		// append
		
	}

	private Object ListOf1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
