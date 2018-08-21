interface Calculate<T>{
	T cal(T a, T b);
}

public class CalculatorDemo {
	public static <T> void calAndShow(Calculate<T> op, T n1 ,T n2) {
		T r =op.cal(n1, n2);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		//interface�� ���� Ȱ���� ���ٽ� ����
		Calculate<Integer> ci = (a,b) -> a + b;
		System.out.println(ci.cal(3,4));
		Calculate<Double> dc = (a,b)->a+b;
		System.out.println(dc.cal(2.5,7.1));
		Calculate<Integer> cd = (a,b)->a-b;
		System.out.println(cd.cal(4,2));
		Calculate<Double> cc = (a,b)->a-b;
		System.out.println(cc.cal(4.9,3.2));
		/**���� �۾����� CalculatorDemo �޼ҵ忡 ���ԵǾ��ִ�
		Calculator<T> op=(a,b)->a+b �̱� ������ ������ ���� �̿��Ѵ�
		<T>�� n1,n2�� �ۼ��Ҷ� �����ȴ�
		
		**/
		calAndShow((a,b)->a+b,3,4);
		calAndShow((a,b)->a+b,2.5,7.1);
		calAndShow((a,b)->a-b,4,2);
		calAndShow((a,b)->a-b,4.9,3.2);
	
	}

}
