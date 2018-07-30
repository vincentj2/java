class DBox<L ,R>{
	private L left;
	private R right;
	public void set(L o, R r) {
		left=o;
		right= r;
		}
	public String toString() { return left + " & " + right;}
}

//2번
public class GenericBoc {

	public static void main(String[] args) {
		DBox<String, Integer> box1= new DBox<>();
		box1.set("apple", 25);
		DBox<String, Integer> box2=new DBox<>();
		box2.set("orange", 33);
		DBox<DBox<String,Integer>, DBox<String,Integer>> dbox = new DBox<>();
		dbox.set(box1,box2);
		System.out.println(dbox);
	}
}
//1번
/**
class DDBox<U,D>{
	private U up;
	private D down;
	public void set(U o, D r) {
		up=o;
		down=r;
	}
	public String toString() { return up + "\n" + down;}
}

public class GenericBo {

	public static void main(String[] args) {
		DBox<String, Integer> box1= new DBox<>();
		box1.set("apple", 25);
		DBox<String, Integer> box2=new DBox<>();
		box2.set("orange", 33);
		DDBox<DBox<String,Integer>, DBox<String,Integer>> ddbox = new DDBox<>();
		ddbox.set(box1,box2);
		System.out.println(ddbox);
	}
}
**/
