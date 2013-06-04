package model;

/**
 * 
 * Represents the format of a multimedia element, for example .mp4 or .mp3
 * @author patrick
 *
 */
public class Type {
	private int id;
	private String name;
	private String extension;
	private String icon;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public int getId() {
		return id;
	}
	
	public Type() {}
}
