<?php

class Group {

	private $name;
	private $comet;

    function __construct($name, $comet) {
    	$this->name = $name;
    	$this->comet = $comet;
    }

    public function getName() {
    	return $this->name;
    }

    public function getComet() {
    	return $this->comet;
    }

    public function __toString() {
    	return $this->name;
    }

}