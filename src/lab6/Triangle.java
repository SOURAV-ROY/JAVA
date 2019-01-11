package lab6;

public class Triangle {
	
	private int side1, side2, side3;
	
	public int getSide1(int side1) {	
		return side1 = this.side1;
	}
		
	public int getSide2(int side2) { 
		return side2 = this.side2;
	}
	
	public int getSide3(int side3) {
		return side3 = this.side3;
	}
	
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	
	public void  setSide2(int side2) {
		this.side2 = side2;
	}
	
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	public int getPerimeter() {
		return this.side1 + this.side2 + this.side3; 
	}
	
	public double getArea() {
		double s = getPerimeter() / 2;
		
		return Math.sqrt(s * (s - this.side1) * (s - this.side2)* (s - this.side3));
	}
	
	public boolean isRightTriangles() {
		
		if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2))
			return true;
		else if (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2))
			return true;
		else if (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2))
			return true;
		else
			return false;
	}
}
