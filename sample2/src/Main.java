import java.util.ArrayList;
import java.awt.Point;
import java.util.Iterator;

public class Main {
	
	public static void main(String []args)
	{
		ArrayList<Polygon> al = new ArrayList<Polygon>();
		al.add(new Triangle(new Point(0,0), new Point(5,5), new Point(3,6)));
		al.add(new Triangle(new Point(0,0), new Point(4,5), new Point(0,7)));
		al.add(new Rectangle(new Point(0,0), new Point(5,0), new Point(5,8), new Point(0,8)));
		al.add(new Rectangle(new Point(0,0), new Point(0,7), new Point(5,0), new Point(5,7)));
		
		Iterator<Polygon> it = al.iterator();
		while(it.hasNext())
		{
			Polygon point = it.next();
			if ( point.getPoints().size() == 3) 
			{
			System.out.println("Area of a triangle is: "+ point.getArea());
			}
			else if( point.getPoints().size() == 4)
			{
				System.out.println("Area of a rectangle is: " + point.getArea());
			}
			/*
			 while(it.hasNext())
			 {
			 	System.out.println("Area is: " + it.next().getArea());
			 }
			 */
		}
	}

}
