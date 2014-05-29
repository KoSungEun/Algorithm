
public class KiwiJuiceEasy {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
		for(int i = 0; i < fromId.length ; i++){
			int sum = bottles[fromId[i]] + bottles[toId[i]];
			bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
			bottles[fromId[i]] = sum - bottles[toId[i]];
		}
		return bottles;
	}

}
