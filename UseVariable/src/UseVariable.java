
public class UseVariable {

	public static void main(String[] args) {
	binarycode(46);
	}
	
	public static void binarycode(int n) {
		if(n>0) {
		binarycode(n/2);
		System.out.print(n%2);}
	}
}
