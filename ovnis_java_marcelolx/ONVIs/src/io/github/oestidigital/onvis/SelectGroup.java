package io.github.oestidigital.onvis;

public class SelectGroup {

	public static void main(String[] args) {
		String[] comet = {"HALLEY", "ENCKE", "WOLF", "KUSHIDA"};
		String[] group = {"AMARELO", "VERMELHO", "PRETO", "AZUL"};
		float rltComet, rltGroup;
		
		for(int i=0; i<4; i++){
			Object[] comGroup = CharToNumber.calcCharToNumber(comet[i], group[i]);
			rltComet = (int)comGroup[0] % 45;
			rltGroup = (int)comGroup[1] % 45;
			if(rltComet != rltGroup)
				System.out.println("O grupo "+group[i]+" não será levado!");
		}
	
	}

}

