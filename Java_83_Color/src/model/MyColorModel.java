package model;

import java.awt.Color;

public class MyColorModel {
	private Color backgroundColor;
	private Color foregroundColor;
	private boolean opaque;
	public MyColorModel() {
		this.backgroundColor = Color.BLACK;
		this.foregroundColor = Color.WHITE;
		this.opaque = true;
	}
	public Color getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public Color getForegroundColor() {
		return foregroundColor;
	}
	public void setForegroundColor(Color foregroundColor) {
		this.foregroundColor = foregroundColor;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}

	
	
	
	
}
