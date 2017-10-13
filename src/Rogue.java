import org.newdawn.slick.Input;

public class Rogue extends Movable {
	public Rogue(float x, float y) {
		super("res/rogue.png", x, y);
	}
	
	int dir = Sprite.DIR_LEFT;
	public void update(Input input, int delta, World world) {
		if(world.isPlayerMoved()) {
			
			Sprite testSprite;
			
			if(dir == Sprite.DIR_LEFT) {
				
				testSprite = world.getSpriteOfType(getX()-App.TILE_SIZE, getY());
				
				//check if moving position is pushable
				if(testSprite != null && Pushable.class.isAssignableFrom(testSprite.getClass())) {
					((Pushable) testSprite).push(dir, world);
				
				}
				
				if(moveToDest(dir, world)) {
				} else {
					dir = Sprite.DIR_RIGHT;
				}
			}
			
			if(dir == Sprite.DIR_RIGHT) {
				
				testSprite = world.getSpriteOfType(getX() + App.TILE_SIZE, getY());
				
				//check if moving position is pushable
				if(testSprite != null && Pushable.class.isAssignableFrom(testSprite.getClass())) {
					((Pushable) testSprite).push(dir, world);
				
				}
				
				if(moveToDest(dir, world)) {
					
				} else {
					dir = Sprite.DIR_LEFT;
				}
			}
		}	
	}
}