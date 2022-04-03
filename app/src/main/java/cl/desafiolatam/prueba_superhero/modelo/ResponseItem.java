package cl.desafiolatam.prueba_superhero.modelo;

public class ResponseItem{
	private Images images;
	private Appearance appearance;
	private Work work;
	private String name;
	private Powerstats powerstats;
	private int id;
	private Biography biography;
	private String slug;
	private Connections connections;

	public Images getImages(){
		return images;
	}

	public Appearance getAppearance(){
		return appearance;
	}

	public Work getWork(){
		return work;
	}

	public String getName(){
		return name;
	}

	public Powerstats getPowerstats(){
		return powerstats;
	}

	public int getId(){
		return id;
	}

	public Biography getBiography(){
		return biography;
	}

	public String getSlug(){
		return slug;
	}

	public Connections getConnections(){
		return connections;
	}
}
