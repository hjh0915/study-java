
public class Point2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1;
		double dis, dis1;
		
		
		Point1 p = new Point1();
		p.xpoint = 1.0;
		p.ypoint = 1.0;
		x1 = p.quadrant();
		System.out.println("("+p.xpoint+","+p.ypoint+")");
		System.out.println("该点位于"+x1);
		
		Point1 d = new Point1();
		d.xpoint = 1.0;
		d.ypoint = 1.0;
		dis = d.distance();
		System.out.println("该点与原点的距离为"+dis);
		
		Point1 p1 = new Point1();
		Point1 p2 = new Point1();
		p1.xpoint = 1.0;
		p1.ypoint = 1.0;
		p2.xpoint = 0.0;
		p2.ypoint = 0.0;
		dis1 = p1.distance1(p2);
		System.out.println("该点与其他一点的距离为"+dis1);
	}

}