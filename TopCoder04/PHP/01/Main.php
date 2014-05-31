<?php
    class InterestingDigits {
    	public function digits($base)
		{
			$v = array();
			
			for($n = 2; $n < $base ; $n++){
				$ok = true;
				for($f1 = 0; $f1 < $base ; $f1++){
					for($f2 = 0; $f2< $base; $f2++){
						for($f3 = 0; $f3 <$base; $f3++){
							if(($f1 + $f2*$base + $f3*$base*$base) % $n == 0 && ($f1+$f2+$f3) % $n != 0){
								$ok = false;
								break 3;
							}
						}
					}
				}
				if($ok){
					$v[] = $n;	
				}

			}
			return $v;
		}
    }
	
	$base = 10;
	$id = new InterestingDigits;
	$result = $id->digits($base);
	
	foreach ($result as $value) {
		echo $value ," ";
	}
	
?>