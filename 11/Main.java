import java.lang.reflect.Method;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName(args[0]);

		Cat o = (Cat) c.newInstance();

		Method method = c.getDeclaredMethod("sound");
		method.invoke(o);
	}
}

class Cat {
	public void sound() {
		System.out.println("miao");
	}
}

class Dog {
	public void sound() {
		System.out.println("bau");
	}
}



