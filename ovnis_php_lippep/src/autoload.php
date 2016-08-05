<?php

function autoloadDeClasses($nomeDaClasse) {
	require $nomeDaClasse.".php";
}

spl_autoload_register("autoloadDeClasses");