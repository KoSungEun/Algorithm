
public class Main {

	public static void main(String[] args) {
		int base = 10;
		InerestingDigits id = new InerestingDigits();
		for(int result : id.digits(base)){
			System.out.println(result);
		}

	}

}
