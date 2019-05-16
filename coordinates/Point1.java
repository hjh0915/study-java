
import java.lang.Math;

public class Point1 {
	double xpoint, ypoint;
	
	public String quadrant(){
		if (xpoint>0&&ypoint>0)
			return("第一象限");
		else if (xpoint<0&&ypoint>0)
			return ("第二象限");
		else if (xpoint<0&&ypoint<0)
			return ("第三象限");
		else if (xpoint>0&&ypoint<0)
			return ("第四象限");
		else
			return ("不存在于坐标系中");
	}
	
	public double distance() {
		double dis=0;
		dis += xpoint * xpoint;
		dis += ypoint * ypoint;
		return Math.sqrt(dis);
	}
	
	public double distance1(Point1 x) {
		double dis=0;
		dis += Math.abs(xpoint-x.xpoint) * Math.abs(xpoint-x.xpoint);
		dis += Math.abs(ypoint-x.ypoint) * Math.abs(ypoint-x.ypoint);
		return Math.sqrt(dis);
	}

}