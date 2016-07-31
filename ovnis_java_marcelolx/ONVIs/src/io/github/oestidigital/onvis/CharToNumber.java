package io.github.oestidigital.onvis;

import java.util.HashMap;
import java.util.Map;

public class CharToNumber {

	public static Object[] calcCharToNumber(String comet, String group) {
		Object[] comGro = new Object[2];
		int comet1 = 1, grp = 1;
		char crt;
		for (int i = 0; i < comet.length(); i++) {
			crt = comet.charAt(i);
			comet1 *= convertCharToNumber(crt);
		}
		for (int i = 0; i < group.length(); i++) {
			crt = group.charAt(i);
			grp *= convertCharToNumber(crt);
		}
		comGro[0] = comet1;
		comGro[1] = grp;
		return comGro;
	}

	public static Integer convertCharToNumber(char caracter) {
		Map<Character, Integer> mapa = new HashMap<Character, Integer>();

		mapa.put('A', 1);
		mapa.put('B', 2);
		mapa.put('C', 3);
		mapa.put('D', 4);
		mapa.put('E', 5);
		mapa.put('F', 6);
		mapa.put('G', 7);
		mapa.put('H', 8);
		mapa.put('I', 9);
		mapa.put('J', 10);
		mapa.put('K', 11);
		mapa.put('L', 12);
		mapa.put('M', 13);
		mapa.put('N', 14);
		mapa.put('O', 15);
		mapa.put('P', 16);
		mapa.put('Q', 17);
		mapa.put('R', 18);
		mapa.put('S', 19);
		mapa.put('T', 20);
		mapa.put('U', 21);
		mapa.put('V', 22);
		mapa.put('W', 23);
		mapa.put('X', 24);
		mapa.put('Y', 25);
		mapa.put('Z', 26);

		return mapa.get(caracter);
	}
}
