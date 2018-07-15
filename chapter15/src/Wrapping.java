class Box{
	public void Wrap() {
		System.out.println("simple wraping");
	}
}

class PaperBox extends Box{
	public void Wrap() {
		System.out.println("paper wraping");
	}
}

class GoldpaperBox extends PaperBox{
	public void Wrap() {
		System.out.println("gold wraping");
	}
}

public class Wrapping {

	public static void main(String[] args) {
		Box box1 =new Box();
		PaperBox box2 =new PaperBox();
		GoldpaperBox box3 =new GoldpaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}		
	public static void wrapBox(Box box) {
		box.Wrap();
	}
}