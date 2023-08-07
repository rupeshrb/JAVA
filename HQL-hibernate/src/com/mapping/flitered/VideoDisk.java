package com.mapping.flitered;

public class VideoDisk extends Disk {
private String format;
private String director;

	@Override
public String toString() {
	return "VideoDisk [format=" + format + ", director=" + director + "]";
}

	public String getFormat() {
	return format;
}

public void setFormat(String format) {
	this.format = format;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

	public VideoDisk() {
		// TODO Auto-generated constructor stub
	}

}
