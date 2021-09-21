/**
 * 
 */
package circle;

/**
 * @author Yuxiang Liu
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	
	public Circle() {
		void draw(String s) {
			System.out.println("Drawing a Circle");	
		}	
		public void draw(int color) {
			System.out.println("Drawing a Circle in color");
	
		}
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
		
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	String moveTo(int newX, int newY) {
	 return "centerX ="+ newX+ "centerY ="+newY+ "radius ="+ radius;	 
	 
	}
	

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	
	public String toString() {
		return super.toString();
	}
	public boolean SameV() {
		boolean check;
	   if (this.obj.centerX == obj.centerX)&&(this.obj.centerY == obj.centerY)&&(this.obj.radius == obj.radius)){
	      check = true;
	   } else {
	      check = false;
	   }
	 return check;
	}
	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	
	public boolean equals(Object obj) {
		Circle circle1 = new Circle();
		return super.equals(obj);
		
	}
	public Circle clone() throws CloneNotSupportedException {
	      return (Circle)super.clone();

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

}
