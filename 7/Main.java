import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			String s = args[1];
			Class<?> c = Class.forName(s);

			Cat cat = (Cat) c.newInstance();

			Method method = c.getDeclaredMethod("sound");
			method.invoke(cat);
		}
		catch (Exception e) {
			System.out.println("no sound");
		}
	}
}
