<?php
    class KiwiJuiceEasy {
    	public function thePouring($capacities, $bottles, $fromId, $toId)
		{
			for($i=0, $size = count($fromId);$i < $size; $i++){
				$sum = $bottles[$fromId[$i]] + $bottles[$toId[$i]];
				$bottles[$toId[$i]] = min($sum, $capacities[$toId[$i]]);
				$bottles[$fromId[$i]] = $sum - $bottles[$toId[$i]];
			}
			return $bottles;
		}
    }
	$capacities = array(30,20,10);
	$bottles = array(10,5,5);
	$fromId = array(0,1,2);
	$toId = array(1,2,0);
	$pouring = new KiwiJuiceEasy;
	$result = $pouring->thePouring($capacities, $bottles, $fromId, $toId);
	foreach ($result as $value) {
		echo "$value <br/>";
		
	}
?>