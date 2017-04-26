import java.util.ArrayList;
import java.awt.Point;

public class Triangle implements Polygon{
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(Point p1, Point p2, Point p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public ArrayList<Point> getPoints()
	{
		ArrayList<Point> coordinates = new ArrayList<Point>();
		coordinates.add(p1);
		coordinates.add(p2);
		coordinates.add(p3);
		return coordinates;
	}
	
	public double getArea()
	{
		double triArea = 0.0;
		double a = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(),2));
		double b = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(),2));
		double c = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getX() - p3.getY(),2));
		
		double s = (a+b+c)/2;
		
		triArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return triArea;
	}

}
