import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = (s,i)-> {
			if(s.length()>i)
				return true;
			else
				return false;
		};
		
				
				
		if(conv.test("robot",3))
			System.out.println("���ڿ� ���� 3 �ʰ�");
		else
			System.out.println("���ڿ� ���� 3 ����");
		
		if(conv.test("bbb",5))
			System.out.println("���ڿ� ���� 5 �ʰ�");
		else
			System.out.println("���ڿ� ���� 5 ����");
	}
}
