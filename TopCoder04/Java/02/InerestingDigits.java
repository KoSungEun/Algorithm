import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

public class InerestingDigits {
	public int[] digits(int base) {
		Builder b = IntStream.builder();
		for(int i = 2; i<base; i++){
			if((base-1) % i == 0){
				b.add(i);
			
			}
		}
		return b.build().toArray();
	}
}
