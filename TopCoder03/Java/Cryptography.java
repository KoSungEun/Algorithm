import java.util.Arrays;

public class Cryptography {
	public long encrypt(int[] numbers) {
		long ret = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		for (int number : numbers) {
			ret *= number;
		}
		return ret;
	}

}
