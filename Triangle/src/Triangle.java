
public class Triangle {

	public static void main(String[] args) {
	TriangleSize A = new TriangleSize(10,10);
	A.SizeCheck();
	A.ChangeHeight(20);
	A.SizeCheck();
	A.ChangeSlide(50);
	A.SizeCheck();
	}	
}
class TriangleSize{
	int height;
	int slide;
	
	public TriangleSize(int height, int slide) {
		this.height=height;
		this.slide=slide;
	}
	public  void ChangeHeight(int num) {
		height=num;
		
	}
	public void ChangeSlide(int num) {
		slide=num;
		
	}
	public void SizeCheck() {
		int size= (slide * height)/2;
		System.out.println("ªÔ∞¢«¸¿« ≥–¿Ã :"+size);
		System.out.println("πÿ∫Ø¿« ±Ê¿Ã :"+slide);
		System.out.println("≥Ù¿Ã :"+height+"\n");
		
	}
}
