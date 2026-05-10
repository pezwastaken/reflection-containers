import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String s = "Ca";
		Class<?> c = Class.forName(s + "t");
		Method method = c.getDeclaredMethod("sound");
		method.invoke(null);
	}
}

