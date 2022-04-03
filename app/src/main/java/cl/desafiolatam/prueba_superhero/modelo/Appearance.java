package cl.desafiolatam.prueba_superhero.modelo;

import java.util.List;

public class Appearance{
	private String gender;
	private String race;
	private String eyeColor;
	private List<String> weight;
	private String hairColor;
	private List<String> height;

	public String getGender(){
		return gender;
	}

	public String getRace(){
		return race;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public List<String> getWeight(){
		return weight;
	}

	public String getHairColor(){
		return hairColor;
	}

	public List<String> getHeight(){
		return height;
	}
}