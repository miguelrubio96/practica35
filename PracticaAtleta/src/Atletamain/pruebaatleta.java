package Atletamain;

import Atleta.Atleta;

public class pruebaatleta{

	public static void main(String[] args) {
		Atleta Juan = new Atleta("74a", "diex", 10);
	int m =12;
	int l = 320;
	int c= 27;

	int resultado;
	resultado=suma(m,l,c);
	System.out.println(resultado);
	
	
	}
   public static int suma(int x,int y,int z) {
	   
	   int res= 0;
	   
	   res= x*y*z;
	   return res;
   }
   
	

	}

