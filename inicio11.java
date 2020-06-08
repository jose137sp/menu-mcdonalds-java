
import java.text.DecimalFormat;
import java.util.Scanner;
public class inicio11 {
    public static void main(String[] args) {
    	
    	 int dia;
    	 double[] retorno = new double[4];
  	  
  		// imprimir titulos del reporte
  				System.out.println("------PROGRAMA MENU MCDONALDS------");
  				System.out.println("-----------------------------------");
  				System.out.println("Universidad Tecnologica de Panama"); 
  				System.out.println("Jose Saavedra | 8-958-1993 | 1SF121");
  				System.out.println("Fernando Estribi | 8-969-1399 | 1SF121");
  				System.out.println("Sebastian Arrivillaga | E-8-159257 | 1SF121");
  				System.out.println(" ");
  				
       
  				System.out.print("Inserte un dia de la semana utilizando un numero del 1 al 7:  ");
  				System.out.println(" ");

		        Scanner lee=new Scanner(System.in);
		        dia=lee.nextInt();
       
		        
		        Fx obj_CalculoM = new Fx();
				obj_CalculoM.AsignarValor(dia);
				retorno= obj_CalculoM.Calcular();
				
				// retorno [0] = PRECIO ORIGINAL
				// retorno [1] = PRECIO CON DESCUENTO
				// retorno [2] = ITBMS
				// retorno [3] = TOTAL A PAGAR
				System.out.println(" ");
				DecimalFormat redondear = new DecimalFormat("####.##");
				if (dia>=1 && dia<=7) {
			       	 
			       	 
			           switch (dia){
			           
			               case 1:
			            	   System.out.println("Lunes... Combo: McPollo");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("Precio con descuento: "+ redondear.format(retorno[1]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			                   break;
			                   
			               case 2:
			            	   System.out.println("Martes... Combo: McWrap");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("Precio con descuento: "+ redondear.format(retorno[1]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			                   
			                   break;
			                   
			               case 3:
			            	   System.out.println("Miercoles... Combo: McWrap Doble");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("Precio con descuento: "+ redondear.format(retorno[1]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			            	  
			                   break;
			                   
			               case 4:
			            	   System.out.println("Jueves... Combo: Club House");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("Precio con descuento: "+ redondear.format(retorno[1]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			            	  
			                   break;
			                   
			               case 5:
			            	   System.out.println("Viernes... Combo: Queso Hamburguesa");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("Precio con descuento: "+ redondear.format(retorno[1]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			            	  
			                   break;
			                   
			               case 6:
			            	   System.out.println("Sabado... Combo: Mc Combo Regular");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			            	   
			                   break;
			                   
			               case 7:
			            	   System.out.println("Domingo... Combo: Mc Combo Regular");
			            	   System.out.println(" ");
			            	   System.out.println("Precio Regular: "+ redondear.format(retorno[0]));
			            	   System.out.println("ITBMS: "+ redondear.format(retorno[2]));
			            	   System.out.println("Precio a pagar: "+ redondear.format(retorno[3]));
			            	   
			                  
			                   break; 
			           }
			       }
					        else{
					        		System.out.println("Escoja un dia valido o visitenos en otra ocasion...");
					        }
    
        
        
        lee.close();
    }
    

}

