/**
 * 
 */
package fr.diginamic.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ness'ti
 *
 */
public class Coord {

	@JsonProperty("lon")
	private double Longi;

	@JsonProperty("lat")
	private double Latti;

	public Coord(double longi, double latti) {
		super();
		Longi = longi;
		Latti = latti;
	}

	public Coord() {
		super();
	}

	public double getLongi() {
		return Longi;
	}

	public void setLongi(double longi) {
		Longi = longi;
	}

	public double getLatti() {
		return Latti;
	}

	public void setLatti(double latti) {
		Latti = latti;
	}

	@Override
	public String toString() {
		return "Coord [Longi=" + Longi + ", Latti=" + Latti + "]";
	}
}
