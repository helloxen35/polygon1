import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
//import org.junit.Ignore;

import java.util.ArrayList;
import java.awt.Point;


public class RectangleTest {

	@Test
	public void getPointstest() {
		Rectangle rect = new Rectangle(new Point(0,0), new Point(5,0), new Point(5,8), new Point(0,8));
		
		ArrayList<Point> getp = new ArrayList<Point>();
		getp.add(rect.getPoints().get(0));
		getp.add(rect.getPoints().get(1));
		getp.add(rect.getPoints().get(2));
		
		Point expected = new Point(5,8);
		Point actual = getp.get(2);
		
		assertThat(actual, is(expected));

	}
	
	@Test
	public void getAreaTest(){
		Rectangle rect = new Rectangle(new Point(0,0), new Point(5,0), new Point(5,8), new Point(0,8));
		
		double expected = 40;
		double actual = rect.getArea();
		
		assertThat(actual, is(expected));
		
	}

}
