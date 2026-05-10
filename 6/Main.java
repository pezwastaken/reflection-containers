import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String s = "Cat";
		Class<?> c = Class.forName(s);

		Object cat = foo(c);

		Method method = c.getDeclaredMethod("sound2");
		method.invoke(cat);
	}

	public static Object foo(Class<?> c) throws Exception {
		return c.newInstance();

	}
}

