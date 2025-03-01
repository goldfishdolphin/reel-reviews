package com.portfolio.reel_reviews;
import jakarta.validation.constraints.Size;



public class Film {
	public Film(int id, String title, int year, String director, String star, String review) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.director = director;
		this.star = star;
		this.review = review;
	}

	private int id;
	private String title;
	private int year;
	private String director;
	private String star;
	@Size(min=10, message= "Enter at least 10 characters")
	private String review;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", year=" + year + ", director=" + director + ", star=" + star
				+ ", review=" + review + "]";
	}

}
