import java.io.IOException;

public class MainClass {
	public static void main(String args[]) throws IOException {
		System.out.println("*****************");
		System.out.println("ATM Machine");
		System.out.println("*****************");
		
		Person person = new Person();
		person.checkForClient();
		
	}

}
