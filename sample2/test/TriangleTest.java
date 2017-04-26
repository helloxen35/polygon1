import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import java.util.ArrayList;
import java.awt.Point;


public class TriangleTest {

	@Test
	public void getPointstest() {
		Triangle tri = new Triangle(new Point(0,0), new Point(4,5), new Point(0,7));
		
		ArrayList<Point> getp = new ArrayList<Point>();
		//getp.add(tri.getPoints().get(0));
		getp.add(tri.getPoints().get(1));
		
		Point expected = new Point(4,5);
		Point actual = getp.get(0);
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void getAreaTest(){
		Triangle tri = new Triangle(new Point(0,0), new Point(4,5), new Point(0,7));
		
		double expected = 14;
		double actual = tri.getArea();
		
		assertThat(actual, is(expected));
	}

}
