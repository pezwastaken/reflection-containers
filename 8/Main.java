import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static Map<Integer, String> x = new HashMap<>();

	static {
		x.put(1, "Dog");
		x.put(2, "Cat");
	}

	public static void main(String[] args) throws Exception {
		String s = x.get(2);

		Class<?> c = Class.forName(s);

		Object cat = c.newInstance();

		Method method = c.getDeclaredMethod("sound");
		method.invoke(cat);
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
