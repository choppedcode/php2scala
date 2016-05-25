<?php

require_once __DIR__ . '/php-lib/Converter.php';

$file = $argv[1];
$code = trim(file_get_contents($file));

$converter = new Converter();
echo $converter->convert( $code );
echo chr(10);
