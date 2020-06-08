
public class Fx {
private int diaFx;
	
	public void AsignarValor(int dia) {
		diaFx=dia;
	}
	
	public double[] Calcular() {
		
		double soda=1, papas=1.80, mcPollo=4.95, mcWrap=5.10, wrapDoble=5.00, house=6.00, queso=4.50, otros=7.00;
		// dinero [0] = PRECIO ORIGINAL
		// dinero [1] = PRECIO CON DESCUENTO
		// dinero [2] = ITBMS
		// dinero [3] = TOTAL A PAGAR
		
		double[] dinero = new double[4];
		
		if (diaFx>=1 && diaFx<=7) {
       	 
       	 
           switch (diaFx){
           
               case 1:
                   
                   dinero[0]=(soda+papas+mcPollo); 
                   dinero[1]= (dinero[0])-(dinero[0]*0.5);
                   dinero[2]= dinero[1]*.07;
                   dinero[3]= dinero[2]+dinero[1];
                   break;
                   
               case 2:
                  
                   dinero[0]=(soda+papas+mcWrap); 
                   dinero[1]= (dinero[0])-(dinero[0]*0.5);
                   dinero[2]= dinero[1]*.07;
                   dinero[3]= dinero[2]+dinero[1];
                   break;
                   
               case 3:
                   
            	   dinero[0]=(soda+papas+wrapDoble); 
            	   dinero[1]= (dinero[0])-(dinero[0]*0.5);
                   dinero[2]= dinero[1]*.07;
                   dinero[3]= dinero[2]+dinero[1];
                   break;
                   
               case 4:
                   
            	   dinero[0]=(soda+papas+house); 
            	   dinero[1]= (dinero[0])-(dinero[0]*0.5);
                   dinero[2]= dinero[1]*.07;
                   dinero[3]= dinero[2]+dinero[1];
                   break;
                   
               case 5:
                   
            	   dinero[0]=(soda+papas+queso); 
            	   dinero[1]= (dinero[0])-(dinero[0]*0.5);
                   dinero[2]= dinero[1]*.07;
                   dinero[3]= dinero[2]+dinero[1];
                   break;
                   
               case 6:
                   
            	   dinero[0]=(soda+papas+otros);
            	   dinero[1]= 0;
                   dinero[2]= dinero[0]*.07;
                   dinero[3]= dinero[0]+dinero[2];
                   break;
                   
               case 7:
                   
            	   dinero[0]=(soda+papas+otros);
            	   dinero[1]= 0;
                   dinero[2]= dinero[0]*.07;
                   dinero[3]= dinero[0]+dinero[2];
                  
                   break; 
           }
       }
		       
		
				return(dinero);
       
       

}
}
	
