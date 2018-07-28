import java.util.Scanner;
import java.util.Random;

public class RandomNumberMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A= sc.nextInt();
		int Z= sc.nextInt();
		int max,min;
		if(A>Z) {
			max=A;
			min=Z;
		}
		else {
			max=Z;
			min=A;
		}
		
		Random rand=new Random();
		int i=0;
		for(i=0; i<10;i++) {
			int ran=min+ rand.nextInt(max-min+1);
			System.out.println(ran);		
		}
	}
}
