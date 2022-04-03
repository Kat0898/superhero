package cl.desafiolatam.prueba_superhero.modelo;

import java.util.List;

public class Biography{
	private String firstAppearance;
	private String placeOfBirth;
	private List<String> aliases;
	private String fullName;
	private String publisher;
	private String alterEgos;
	private String alignment;

	public String getFirstAppearance(){
		return firstAppearance;
	}

	public String getPlaceOfBirth(){
		return placeOfBirth;
	}

	public List<String> getAliases(){
		return aliases;
	}

	public String getFullName(){
		return fullName;
	}

	public String getPublisher(){
		return publisher;
	}

	public String getAlterEgos(){
		return alterEgos;
	}

	public String getAlignment(){
		return alignment;
	}
}