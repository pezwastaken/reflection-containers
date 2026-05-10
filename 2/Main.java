import java.lang.reflect.Method;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws Exception {
		String className = "Cat ";
		className = className.trim();

		Class<?> c = Class.forName(className);
		Object o = c.newInstance();

		Method method = c.getDeclaredMethod("sound");

		method.invoke(o);
	}
}
