<?php

class Spaceship {

	public function take(Group $group) {
		$groupNameNumber = $this->getWordNumber($group->getName());
		$cometNameNumber = $this->getWordNumber($group->getComet());

		if($groupNameNumber % 45 == cometNameNumber % 45) {
			return true;
		}

		return false;
	}

	private function getWordNumber($word) {
		$number = 1;

		for ($letterIndex = 0; $letterIndex < strlen($word); $letterIndex++) {
			$letter = substr($word, $letterIndex, 1);
			$number *= $this->getLetterCode($letter);
		}

		return $number;
	}

	private function getLetterCode($letter) {
		$codes = [
			'A' =>  1, 'B'=>   2, 'C' => 3, 'D' =>  4, 'E' =>  5, 'F' =>  6, 'G' =>  7, 'H' =>  8, 'I' => 9, 
			'J' => 10, 'K' => 11, 'L'=> 12, 'M' => 13, 'N' => 14, 'O' => 15, 'P' => 16, 'Q' => 17, 'R' =>18, 
			'S' => 19, 'T' => 20, 'U'=> 21, 'V' => 22, 'W' => 23, 'X' => 24, 'Y' => 25, 'Z' => 26
		];

		return $codes[strtoupper($letter)];
	}

}