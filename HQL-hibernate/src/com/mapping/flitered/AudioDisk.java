package com.mapping.flitered;

public class AudioDisk  extends Disk{
	private int numSongs;
	private String singerName;
	@Override
	public String toString() {
		return "AudioDisk [numSongs=" + numSongs + ", singerName=" + singerName + "]";
	}
	public int getNumSongs() {
		return numSongs;
	}
	public void setNumSongs(int numSongs) {
		this.numSongs = numSongs;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public AudioDisk() {
		// TODO Auto-generated constructor stub
	}

}
