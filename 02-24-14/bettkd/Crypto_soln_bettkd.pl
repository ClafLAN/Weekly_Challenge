#! /usr/bin/perl
# Author: Dominic Bett
# ClafLan Weekly Challenge: Cryptography - The Caesar Cipher

use strict;
use warnings;

print "Please enter string to encrypt: ";
my $string = <>;

print "Please enter the encryption key: ";
my $key = <>;

$string = caesarSays($string, $key);
print "ENCRYPTED: $string";

$string = caesarSays($string, -$key);
print "DECRYPTED: $string";
exit;

#################################################
# Subroutine to cipher and decipher words
#################################################
sub caesarSays {

	my ($string, $key) = @_;

	my @characters = split('', $string);

	foreach my $c (@characters) {

		$c = ord($c);

		if ($c >= 65 and $c <= 90) {

			$c = (($c - 64 + $key) % 26) + 64;

		} elsif ($c >= 97 && $c <= 122) {

			$c = (($c - 96 + $key) % 26) + 96;
		}

		$c = chr($c);
	}

	return join ('', @characters);
}

1;
