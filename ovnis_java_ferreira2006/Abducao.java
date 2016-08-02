
import java.util.ArrayList;
import java.util.HashMap;

public class Abducao {

    public static void main(String[] args) {
       
    	// Lista de cometas
        String[] cometas = {"HALLEY", "ENCKE", "WOLF", "KUSHIDA"};
        // Lista de Grupos
        String[] grupos = {"AMARELO", "VERMELHO", "PRETO", "AZUL"};
              
        // Cria alfabeto pelos códigos da tabela ascii
        ArrayList<String> alfabeto = new ArrayList<String>();       
        for (int x = 65; x < 91; x++) {
            alfabeto.add(String.valueOf((char) x));
            } 
        
        // Cria mapa com alfabeto e valores
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < alfabeto.size(); i++) {	
        	// A = 1, B = 2 ... Z = 26
			map.put(alfabeto.get(i), i+1);
		}
       
        // 4 Iterações
        for (int i = 0; i < 4; i++) {
        	
        	// Letras do cometa
        	char[] charsCometa = cometas[i].toCharArray();
        	// Letras do grupo
        	char[] charsGrupo = grupos[i].toCharArray();
        	
        	// Armazena multiplicação das letras do nome do cometa
        	float resultadoCometa = 1;
        	// Armazena multiplicação das letras do nome do grupo
        	float resultadoGrupo = 1;
        	
        	// Iterações dos cometas
        	for (int j = 0; j < charsCometa.length; j++) {               
                	resultadoCometa *= map.get(""+charsCometa[j]).intValue();                   	              
                	System.out.println(charsCometa[j] +" = "+ map.get(""+charsCometa[j]).intValue());                	
    			}
        	System.out.println(cometas[i] + "= " + resultadoCometa + " % 45 = " + resultadoCometa % 45);
        	
        	
        	// Iterações dos grupos
        	for (int j = 0; j < charsGrupo.length; j++) {               
                	resultadoGrupo *= map.get(""+charsGrupo[j]).intValue();
                	System.out.println(charsGrupo[j] +" = "+ map.get(""+charsGrupo[j]).intValue());                	
    			}
        	System.out.println(grupos[i] + " = " + resultadoGrupo + " % 45 = " + resultadoGrupo % 45);
        	
        	if (resultadoCometa % 45 == resultadoGrupo % 45) {
        		System.out.println("--------------------------------------------");
        		System.out.println("Cometa " +cometas[i] + " e grupo " + grupos[i] + " serão Abduzidos");
        		}else {
        			System.out.println("--------------------------------------------");
        			System.out.println("Cometa " +cometas[i] + " e grupo " + grupos[i] + " NÃO SERÃO ANDUZIDOS");
        			System.out.println("######### FICA PRA PRÓXIMA #########");
				}
        	System.out.println("--------------------------------------------");
		}
    }
}