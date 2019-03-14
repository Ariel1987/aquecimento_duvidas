package aquecimento18;

public class aquecimento18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      String saida = "Resposta:\n";
	      for (int i = 0; i < a.length; i++) {
	    	  if (i % 2 == 0) {
	    	  b[i] = a[i];
	    	  }
	      }
	      for (int i = 0; i < a.length; i++) {
	         saida = saida + b[i] + " ";
	      } 
	      saida = saida + "\nFim.";
	      System.out.println(saida);
	      //System.exit (0);

	}	
}



/*int min = a[indice];
	      for (i = 0; i < a.length; i++) {
	         if (a[i] < min) {
	        	min = a[i];
	         	indice = i;
	         	b [0] = indice;
	         }
	      }
18) b deve receber a lista dos números que estão nos índices (posições) pares de a.
Resposta: 32 89 12 10 38 13 65 35 16 54
*/
