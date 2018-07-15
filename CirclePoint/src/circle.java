class Point {
	int xPos, yPos;
	public Point(int x,int y) {
		xPos=x;
		yPos=y;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}	
}

class Circle{
	int rad;
	Point center;
	
	public Circle(int x, int y,int z) {
		center=new Point(x,y);
		rad=z;
	}
	public void showCircleInfo() {
		center.showPointInfo();
		System.out.println("¹ÝÁö¸§ "+rad);
	}
}

class usecircle{
	public static void main(String[] args) {
		Circle c=new Circle(2,2,4);
		c.showCircleInfo();
	}
}