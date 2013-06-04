package model;

import java.util.List;

public class Album {
	private int id;
	private String title;
	private String interpret;
	private String cover;
	//@todo: check list medium
	private List<Medium> medias;
	
	public Album() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInterpret() {
		return interpret;
	}

	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<Medium> getMedias() {
		return medias;
	}

	public void setMedias(List<Medium> medias) {
		this.medias = medias;
	}

	public void setId(int id) {
		this.id = id;
	}
}
