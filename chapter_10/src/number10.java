import java.util.Scanner;
public class number10 {
	static int result;
	
	static void add(int num){
		result+=num;
	}
	static void showResult() {
		System.out.println("sum = "+result);
	}

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			number10.add(i);
		number10.showResult();
		String str="940414-1018019";
		String str2=str.substring(0,6) +" "+str.substring(7,14);
		System.out.println(str2);
		
		StringBuilder str3=new StringBuilder("940414-1018019");
		str3.replace(6,7," ");
		System.out.println(str3.toString());
	
		Scanner sb =new Scanner(System.in);
		String a =sb.nextLine();
		int b =sb.nextInt();
		int c =sb.nextInt();
		
		System.out.println("a"+"+"+"b"+"+"+"c = "+(a+b+c));
		
		
	}
}
