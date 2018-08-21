import java.util.function.BiConsumer;

class Box<T> {
    T ob;       

    public void set(T o) { 
        ob = o; 
    }

    public T get() { 
        return ob; 
    }
}
public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Box<Integer>,Integer> box1 = (b1,i)-> b1.set(i);
		BiConsumer<Box<Double>, Double> box2 = (b2, i) -> b2.set(i);
		    
	        Box<Integer> bi = new Box<>();
	        Box<Double> bd = new Box<>();

	        box1.accept(bi, 10);
	        box2.accept(bd, 5.59);

	        System.out.println(bi.get());
	        System.out.println(bd.get());
	

	}

}
