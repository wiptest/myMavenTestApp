public class HelloWorldAdv {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Please enter Something: ");
		String input=System.console().readLine();
		System.out.println("Hi " + input);
	}
}