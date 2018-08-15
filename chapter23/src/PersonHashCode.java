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
		return name+ "("+ age +"세)";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);//<-JAVA에 지정되어 있는 hash 메소드
		//import java.util.Objects 속 hashCode 메소드를 사용하면 직접 구현할 필요없인 인자들만을 통해 구현이 가능하다
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
		System.out.println("인스턴스 수 : "+ set.size());
		System.out.println(set);
	}

}
