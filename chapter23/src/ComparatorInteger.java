import java.util.TreeSet;
import java.util.Comparator;

class IntegerComparator implements Comparator<Integer>{
	public int compare(Integer num1, Integer num2) {
		return num2.intValue()-num1.intValue();//내림차순으로 정렬
	}	
}
public class ComparatorInteger {
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}
}
