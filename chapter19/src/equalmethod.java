class Point{
	private int xpos;
	private int ypos;
	public Point(int x, int y) {
		xpos=x;
		ypos=y;
	}
	@Override
	public boolean equals(Object obj) {
		if(xpos ==((Point)obj).xpos&&ypos ==((Point)obj).ypos)
			return true;
		else
			return false;
	}
}
class Rectangle{
	private Point upperleft;
	private Point lowerright;
	public	Rectangle(int x1, int y1, int x2, int y2) {
		upperleft= new Point(x1,y1);
		lowerright= new Point(x2,y2);
	}
	public boolean equals(Object obj) {
			Rectangle r =(Rectangle)obj;
			if(upperleft.equals(r.upperleft)&&lowerright.equals(r.lowerright))
				return true;
			else
				return false;
			
	}
}

public class equalmethod {

	public static void main(String[] args) {
		Point po1= new Point(1,2);
		Point po2= new Point(2,3);
		Point po3= new Point(1,2);
		
		if(po1.equals(po2))
			System.out.println("같은 위치에 존재한다.");
		else
			System.out.println("다른 위치에 존재한다");
		
		if(po1.equals(po3))
			System.out.println("같은 위치에 존재한다.");
		else
			System.out.println("다른 위치에 존재한다");
		
		 Rectangle r1 = new Rectangle(1, 2, 7, 9);
		 Rectangle r2 = new Rectangle(1, 2, 8, 9);
		 
	        if(r1.equals(r2))
	            System.out.println("같다.");
	        else
	            System.out.println("다르다.");

		
			

	}

}
