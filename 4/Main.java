import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String s = "Cat";
		foo(s);
	}

	public static void foo(String x) throws Exception {
		Class<?> c = Class.forName(x);
		Method method = c.getDeclaredMethod(baz());
		method.invoke(null);
	}

	public static String baz() {
		return "sound";
	}

}

