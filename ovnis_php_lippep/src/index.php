<?php

include 'autoload.php';

$groups = [
	new Group('Amarelo', 'Halley'),
	new Group('Vermelho', 'Encke'),
	new Group('Preto', 'Wolf'),
	new Group('Azul', 'Kushida')
];

$spaceship = new Spaceship();
foreach($groups as $group) {
	if($spaceship->take($group)) {
		echo 'O grupo ' . $group . ' sera levado!';
	} else {
		echo 'O grupo ' . $group . ' nao sera levado!';
	}

	echo "\n";
}