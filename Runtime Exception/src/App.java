
public class App {

	public static void main(String[] args) {
		String text= "Hello";
		System.out.println(text.length());

		int k =0;
		try{
		int i = 6/0;
		}catch (ArithmeticException e){
			System.out.println ("An ArithmeticException is catch");
		}
		System.out.println("Passed");
		
		String[] texts = {"one", "two", "three"};
		System.out.print(texts[3]);
		}

}
