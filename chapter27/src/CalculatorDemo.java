interface Calculate<T>{
	T cal(T a, T b);
}

public class CalculatorDemo {
	public static <T> void calAndShow(Calculate<T> op, T n1 ,T n2) {
		T r =op.cal(n1, n2);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		//interface를 직접 활용한 람다식 구현
		Calculate<Integer> ci = (a,b) -> a + b;
		System.out.println(ci.cal(3,4));
		Calculate<Double> dc = (a,b)->a+b;
		System.out.println(dc.cal(2.5,7.1));
		Calculate<Integer> cd = (a,b)->a-b;
		System.out.println(cd.cal(4,2));
		Calculate<Double> cc = (a,b)->a-b;
		System.out.println(cc.cal(4.9,3.2));
		/**위의 작업들이 CalculatorDemo 메소드에 포함되어있다
		Calculator<T> op=(a,b)->a+b 이기 때문에 오른쪽 항을 이용한다
		<T>는 n1,n2를 작성할때 결정된다
		
		**/
		calAndShow((a,b)->a+b,3,4);
		calAndShow((a,b)->a+b,2.5,7.1);
		calAndShow((a,b)->a-b,4,2);
		calAndShow((a,b)->a-b,4.9,3.2);
	
	}

}
