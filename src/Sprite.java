
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

public abstract class Sprite {
	// Used to decide what direction an object is moving
	// Look up enums to find a more elegant solution!
	public static final int DIR_NONE = 0;
	public static final int DIR_LEFT = 1;
	public static final int DIR_RIGHT = 2;
	public static final int DIR_UP = 3;
	public static final int DIR_DOWN = 4;
	String [] tag;
	
	private Image image = null;
	private float x;
	private float y;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Sprite(String image_src, float x, float y) {
		try {
			image = new Image(image_src);
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
		this.x = x;
		this.y = y;
		snapToGrid();
		this.type = image_src;
	}
	
	//Getters
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
			
	// Setters
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	
	public void render(Graphics g) {
		image.drawCentered(x, y);
	}
	
	// Forces this sprite to align to the grid
	public void snapToGrid() {
		x /= App.TILE_SIZE;
		y /= App.TILE_SIZE;
		x = Math.round(x);
		y = Math.round(y);
		x *= App.TILE_SIZE;
		y *= App.TILE_SIZE;
	}
	
	 public void moveToDest(int dir) {
		
	}

	
	public void addTag(String tag) {	
	}
	public void removeTag(String tag) {	
	}
	public boolean compareTag(String compare) {	
		return true;
	}

	public void update(Input input, int delta, World world) throws ClassNotFoundException {
		
		
	}
	
	public Sprite clone() {
		Sprite copy = null;
		return copy;
	}
}

