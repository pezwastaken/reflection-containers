import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] x = new String[] {"Cat", "Dog" };

		String tmp = x[0];
		x[0] = x[1];
		x[1] = tmp;

		Class<?> c = Class.forName(x[0]);

		Object o = c.newInstance();

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

class Rat {
	public void sound() {
		System.out.println("squeak");
	}
}


