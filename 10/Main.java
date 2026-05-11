import java.lang.reflect.Method;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName(args[0]);

		Object o = c.newInstance();

		Method method = c.getDeclaredMethod("sound", Integer.class);
		method.invoke(o, 10);
	}
}

class Cat {
	public void sound(String x) {
		System.out.println("miao");
	}
}

class Dog {
	public void sound(Integer x) {
		System.out.println("bau");
	}
}



