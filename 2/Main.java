import java.lang.reflect.Method;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		try {
			String className = "Cat  ";
			className.trim();

			Class c = Class.forName(className);
			Object o = c.newInstance();

			Method method = c.getDeclaredMethod("sound");

			method.invoke(o);

		}
		catch (Exception e) {
			System.out.println("no miao");
		}
	}
}
