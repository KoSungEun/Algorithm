<?php
	class ThePalindrome {
		public function find ($s){
			for($i = strlen($s);; $i++){
				$fleg = true;
				for($j = 0 ; $j < strlen($s); $j++){
					if(($i - $j - 1) < strlen($s) && $s{$j} != $s{$i - $j -1}){
						$fleg = false;
						break;
					}
				}
				if($fleg){
					return $i;
				}
				
			}
		}
	}
	
	$s = "qwerty";
	$tp = new ThePalindrome;
	echo $tp->find($s);

?>