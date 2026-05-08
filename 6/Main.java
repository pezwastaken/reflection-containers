import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			String s = "Cat";
			Class<?> c = Class.forName(s);

			Object cat = foo(c);

			Method method = c.getDeclaredMethod("sound");
			method.invoke(cat);
		}
		catch (Exception e) {
			System.out.println("no sound");
		}
	}

	public static Object foo(Class<?> c) throws Exception {
		return c.newInstance();

	}
}

