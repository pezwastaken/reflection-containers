import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("Cat");
			Method method = c.getDeclaredMethod("sound");
			method.invoke(null);
		}
		catch (Exception e) {
			System.out.println("no sound");
		}
	}
}

