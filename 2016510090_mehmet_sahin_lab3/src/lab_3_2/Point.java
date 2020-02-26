package lab_3_2;

public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public double mesafe(int x1,int y1 ,int x2, int y2)
	{
		double mesafe=Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		return mesafe;
	}
}
