
public class Main {

	public static void main(String[] args) {
		int n = 2;
		int east = 25;
		int west = 25;
		int south = 25;
		int north = 25;
		CrazyBot cb = new CrazyBot();
		System.out.print(cb.getProbability(n, east, west, south, north));
	}

}
