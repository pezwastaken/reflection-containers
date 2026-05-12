
public class Main {
	public static void main(String[] args) throws Exception {

		String[] parts = {"C", "a", "t"};
		String result = "";

		for (String p : parts) {
		    result += p;
		}

		Class<?> c = Class.forName(result);
		c.getMethod("sound").invoke(c.newInstance());
	}
}

class Cat {
	public void sound() {
		System.out.println("miao");
	}
}

