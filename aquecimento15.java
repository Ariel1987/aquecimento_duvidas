package aquecimento15;

public class aquecimento15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      int i;
	      
	      String saida = "Resposta:\n";

	      for (i = 0; i < a.length; i++) {
	    	  int temp = a[i];
	    	  b[i] = a[a.length-i-1];
	    	  a[a.length-i-1] = temp;
	    	  temp = b[i];
	      } 
	      
	      for (i = 0; i < a.length; i++) {
	         saida = saida + b[i] + " ";
	      } 
	      saida = saida + "\nFim.";
	      System.out.println(saida);
	      //System.exit (0);
		}
	}
	



/*15) O vetor b deve se tornar uma cópia revertida do vetor a (a ordem dos elementos deve ser trocada).
Resposta: 19 54 89 16 64 35 81 65 11 13 15 38 96 10 35 12 66 89 45 32
*/