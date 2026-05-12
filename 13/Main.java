
public class Main {
	public static void main(String[] args) throws Exception {
		String method = "";

		if (args[0].equals("Cat")) {
			method = foo();
		}
		else {
			method = boo();
		}

		Class<?> c = Class.forName("Cat");
		c.getMethod(method).invoke(c.newInstance());
	}

	private static String foo() {
		return "sound";
	}

	private static String boo() {
		return "sound2";
	}

}

class Cat {
	public void sound() {
		System.out.println("miao");
	}

	public void sound2() {
		System.out.println("miao2");
	}
}




