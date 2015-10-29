

import java.util.Scanner; 


public class clase1
{
	
	private static Scanner sc;
	
	public static void main (String [] args) {
		sc = new Scanner (System.in);
		double hrs, t=0;
		System.out.println("introduzca su tarifa");
		hrs= sc.nextDouble();
		for (int i=1;i<=5;++i) ; 
		if(hrs>40) {
			hrs = hrs-(t*0.50);
		}
			System.out.println("su salario netp es:"+hrs);
		}
	}