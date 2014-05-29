<?php
    class InterestingParty{
    	public function bestInvitation($first, $second){
 
    		for($i=0;$i<count($first);$i++){
    			$dic[$first[$i]] = 0;
				$dic[$second[$i]] = 0;
    		}
			for($i=0;$i<count($first);$i++){
				$dic[$first[$i]] = $dic[$first[$i]] + 1;
				$dic[$second[$i]] = $dic[$second[$i]] + 1; 
			}
			$ans = 0;
			foreach ($dic as $value) {
				$ans = max($ans,$value);
			}
			return $ans;
    	} 
    }
	$first = array("fishing", "gardening", "swimming", "fishing");
	$second = array("hunting", "fishing", "fishing", "biting");
	$ip = new InterestingParty;
	echo $ip->bestInvitation($first, $second);
?>