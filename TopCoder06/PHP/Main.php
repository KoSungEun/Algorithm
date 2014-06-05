<?php

class FriendsScore {
	public function highestScore($friends) {
		$ans = 0;
		$n = strlen($friends[0]);
		for ($i = 0; $i < $n; $i++) {
			$cnt = 0;
			for ($j = 0; $j < $n; $j++) {

				if ($i == $j) {
					continue;
				}
				if ($friends[$i]{$j} == 'Y') {
					$cnt++;
				} else {
					for ($k = 0; $k < $n; $k++) {
						if ($friends[$j]{$k} == 'Y' && $friends[$k]{$i} == 'Y') {
							$cnt++;
							break;
						}
					}
				}
			}
			$ans = max($ans, $cnt);
		}
		return $ans;
	}

}

$friends = array("NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN");
$fs = new FriendsScore;
echo $fs -> highestScore($friends);
?>