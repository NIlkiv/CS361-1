/**
 * 
 */


/**
 * @author cscharff
 *
 */
public class ColoredCircle extends Circle {

	public int color;
	
	/**
	 * 
	 */
	public ColoredCircle() {
	}

	void moveTo(int newX, int newY) {
	}
	
	// overridden method from Circle
	void draw() {
		System.out.println("Drawing a ColoredCircle...");
	}
}
