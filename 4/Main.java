import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		String s = "Cat";
		foo(s);
	}

	public static void foo(String x) {
		try {
			Class<?> c = Class.forName(x);
			Method method = c.getDeclaredMethod(baz());
			method.invoke(null);
		}
		catch (Exception e) {
			System.out.println("no sound");
		}
	}

	public static String baz() {
		return "sound";
	}

}

