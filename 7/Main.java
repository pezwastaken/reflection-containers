import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String s = args[1];
		Class<?> c = Class.forName(s);

		Object cat = c.newInstance();

		Method method = c.getDeclaredMethod("sound");
		method.invoke(cat);
	}
}
