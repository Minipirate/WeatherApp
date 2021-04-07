/**
 * 
 */
package fr.diginamic.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ness'ti
 *
 */
public class WeatherData {

	/**
	 * Coordonate -> longitude, latitude
	 */
	@JsonProperty("coord")
	private Coord coord;

	/**
	 * Weather -> Main description
	 */
	@JsonProperty("weather")
	private Weather weather;

	/**
	 * Main data -> temp, feels like, temp_min, temp_max, pressure, humidity
	 */
	@JsonProperty("main")
	private MainWeather mainWeather;

	/*
	 * Wind data -> spped, deg
	 */
	@JsonProperty("wind")
	private Wind wind;

	/*
	 * Clouds ->
	 */
	@JsonProperty("clouds")
	private Clouds clouds;

	/*
	 * Sys -> country, sunrise, sunset,
	 */
	@JsonProperty("sys")
	private Sys sys;

	/*
	 * TimeZone -> name, cod
	 */
	@JsonProperty("timezone")
	private timeZone timeZone;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public MainWeather getMainWeather() {
		return mainWeather;
	}

	public void setMainWeather(MainWeather mainWeather) {
		this.mainWeather = mainWeather;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public timeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(timeZone timeZone) {
		this.timeZone = timeZone;
	}
}
