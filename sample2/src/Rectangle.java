import java.util.ArrayList;
import java.awt.Point;


public class Rectangle implements Polygon {
	
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	public Rectangle(Point p1, Point p2, Point p3, Point p4)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	public ArrayList<Point> getPoints()
	{
		ArrayList<Point> coordinates = new ArrayList<Point>();
		coordinates.add(p1);
		coordinates.add(p2);
		coordinates.add(p3);
		coordinates.add(p4);
		return coordinates;
		
	}
	
	public double getArea()

	{
		double rectArea = 0.0;
		double w1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
		double w2 = Math.sqrt(Math.pow(p4.getX() - p3.getX(),2) + Math.pow(p4.getY() - p3.getY(),2));
		double h1 = Math.sqrt(Math.pow(p3.getX() - p2.getX(),2) + Math.pow(p3.getY() - p2.getY(),2));
		double h2 = Math.sqrt(Math.pow(p1.getX() - p4.getX(),2) + Math.pow(p1.getY() - p4.getY(),2));
		
		if ( w1 != w2 && h1 != h2)
		{
			System.out.println("A Rectangle cannot be formed, sorry!!!");
		}
		else
		{
			rectArea = (w1 * h1);
		}
		return rectArea;
	}
}
