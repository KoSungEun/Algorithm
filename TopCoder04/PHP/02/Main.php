<?php
    class InterestingDigits {
    	public function digits($base)
		{
			$ans = array();
			
			for($i = 2 ; $i< $base; $i++){
				if(($base-1) % $i == 0){
					$ans[] = $i;
				}
			}
			
			return $ans;
		}
    }
	
	$base = 10;
	$id = new InterestingDigits;
	$result = $id->digits($base);
	
	foreach ($result as $value) {
		echo $value ," ";
	}
	
?>