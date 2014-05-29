
public class Main {

	public static void main(String[] args) {
		int[] capacities = {14, 35, 86, 58, 25,62};
		int[] bottles = {6, 34, 27, 38, 9, 60};
		int[] fromId = {1,2,4,5,3,3,1,0};
		int[] toId = {0,1,2,4,2,5,3,1};
	
	
		KiwiJuiceEasy kiwi = new KiwiJuiceEasy();
		int[] result = kiwi.thePouring(capacities, bottles, fromId, toId);
		for(int i=0; i < result.length; i++){
			System.out.print(result[i] +" ");
		}
	}

}
