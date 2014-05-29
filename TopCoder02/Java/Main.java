public class Main {

	public static void main(String[] args) {
		String[] first = {"fishing", "gardening", "swimming", "fishing"};
		String[] second = {"hunting", "fishing", "fishing", "biting"};

		InterestingParty ip = new InterestingParty();

		System.out.println(ip.bersInvitation(first, second));
	}

}
