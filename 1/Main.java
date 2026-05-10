import java.lang.reflect.Method;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws Exception {
		String className = "";

		Random r = new Random();
		int r1 = r.nextInt(10);

		if (r1 == 0) {
			className += "Ca";
		}
		else {
			className += "Ra";
		}

		className += "t";

		Class c = Class.forName(className);
		Object o = c.newInstance();

		Method method = c.getDeclaredMethod("sound");

		method.invoke(o);
	}
}
