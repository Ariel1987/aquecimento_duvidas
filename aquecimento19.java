package aquecimento19;

public class aquecimento19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
	      int b [] = new int [a.length];
	      int i;
	      String saida = "Resposta:\n";
	      for (i = 0; i < a.length; i++) {
	    	  if (a[i] % 2 == 0) {
	    	  b[i] = a[i];
	    	  }
	      }
	      for (i = 0; i < a.length; i++) {
	         saida = saida + b[i] + " ";
	      } 
	      saida = saida + "\nFim.";
	      System.out.println(saida);
	      //System.exit (0);
	 }
}

/*19) b deve receber a lista dos números pares de a.
Resposta: 32 66 12 10 96 38 64 16 54
*/