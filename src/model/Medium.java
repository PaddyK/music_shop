package model;

/**
 * Represents an auio track or a video file
 * @author patrick
 *
 */
public class Medium {
	private int id;
	/* @todo : check if type actually of type Type or not */
	private Type type;
	private String title;
	// @todo : check if album actually of type Album or not
	private Album album;
	private String interpret;
	// in minutes
	private double duration;
	// in byte
	private int size;
	private String filePath;
	private int listened;
	private int bought;
	
	public Medium() {}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getInterpret() {
		return interpret;
	}

	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getListened() {
		return listened;
	}

	public void setListened(int listened) {
		this.listened = listened;
	}

	public int getBought() {
		return bought;
	}

	public void setBought(int bought) {
		this.bought = bought;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
