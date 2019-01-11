package lab5;

public class PointDistance {
		double x;
		double y;

	public PointDistance(double xAxis1, double yAxis1) {
		this.x=xAxis1;
		this.y=yAxis1;
	}
	public double getDistance(double x2, double y2) {
		
//		return Math.sqrt(Math.pow(x2-this.x, 2)+(Math.pow(y2-this.y, 2)));
		
		return Math.sqrt((x2-this.x)*(x2-this.x)+(y2-this.y)*(y2-this.y));
		
//		return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
		
	}

}
