<?php
class Cryptography {
	public function encrypt($numbers) {
		$let = 1;
		sort($numbers);
		$numbers[0]++;
		foreach ($numbers as $num) {
			$let *= $num;
		}
		return $let;
	}

}

$numbers = array(1000, 999, 998, 997, 996, 995);
$c = new Cryptography;
printf("%.0f", $c -> encrypt($numbers));
?>