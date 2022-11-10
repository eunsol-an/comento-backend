package com.devfun.vo;

public class MovieVO {
	private int movie_id;
	private String movie_name;
	private String director;
	private String types;
	private String movie_col;
	
	public MovieVO() {}

	public MovieVO(int movie_id, String movie_name, String director, String types, String movie_col) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.director = director;
		this.types = types;
		this.movie_col = movie_col;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getMovie_col() {
		return movie_col;
	}

	public void setMovie_col(String movie_col) {
		this.movie_col = movie_col;
	}

	
	
}
