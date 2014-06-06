<?php
class CrazyBot {
	private $grid;
	private $vx = array(1, -1, 0, 0);
	private $vy = array(0, 0, 1, -1);
	private $prob;

	public function getProbability($n, $east, $west, $south, $north) {

		$this -> prob[0] = $east / 100.0;
		$this -> prob[1] = $west / 100.0;
		$this -> prob[2] = $south / 100.0;
		$this -> prob[3] = $north / 100.0;
		return $this -> dfs(50, 50, $n);

	}

	private function dfs($x, $y, $n) {
		if ($this -> grid[$x][$y]) return 0;
		if ($n == 0) return 1;
		$this -> grid[$x][$y] = true;
		$ret = 0;
		for ($i = 0; $i < 4; $i++) {
			$ret += $this -> dfs($x - $this -> vx[$i], $y - $this -> vy[$i], $n - 1) * $this -> prob[$i];
		}
		$this -> grid[$x][$y] = false;
		return $ret;
	}

}

$n = 2;
$east = 25;
$west = 25;
$south = 25;
$north = 25;
$cb = new CrazyBot;
echo $cb -> getProbability($n, $east, $west, $south, $north);
?>