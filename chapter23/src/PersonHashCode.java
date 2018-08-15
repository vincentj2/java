import java.util.HashSet;
import java.util.Objects;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name= name;
		this.age= age;
	}
	public String toString() {
		return name+ "("+ age +"��)";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);//<-JAVA�� �����Ǿ� �ִ� hash �޼ҵ�
		//import java.util.Objects �� hashCode �޼ҵ带 ����ϸ� ���� ������ �ʿ���� ���ڵ鸸�� ���� ������ �����ϴ�
	}
	@Override
	public boolean equals(Object obj) {
	      Person p = (Person)obj;
	        
	        if(p.name.equals(name) && (p.age == age))
	            return true;
	        else
	            return false;
	}
}
public class PersonHashCode {

	public static void main(String[] args) {
		HashSet<Person> set= new HashSet<>();
		set.add(new Person("jeong",25));
		set.add(new Person("jeong",24));
		set.add(new Person("sang",24));
		set.add(new Person("sang",25));
		set.add(new Person("jeong",25));
		set.add(new Person("jeongi",25));
		System.out.println("�ν��Ͻ� �� : "+ set.size());
		System.out.println(set);
	}

}
