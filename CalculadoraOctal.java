
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
         int resto1 = 1;
        int resto2 = 1;
        int total = 0;
        int contador = 10;
        int numeroCopia = n1;
         int contador2 = 1;
         int contador3 = 1;
        while(numeroCopia != 0){
          numeroCopia /= 10;
          contador2++;
        }
          while(contador2 >= contador3 ){
            if((resto1 + resto2) >= 8){
                resto1 = (n1 % 10) + 1;
                n1 = n1 / 10;
            }
            else if((resto1 + resto2) < 8){
            resto1 = n1 % 10;
            n1 = n1 / 10;
           }
            resto2 = n2 % 10;
            n2 = n2 / 10;
            if((resto1 + resto2) >= 8){
               total = total + (resto1 + resto2 - 8) * contador;
               contador *= 10;
            }
            else if((resto1 + resto2) < 8){
                total = total + (resto1 + resto2) * contador;
                contador *= 10;
            }
            contador3++;
        }
        total = total / 10;
        return total;
        
        
        
     

    }
    
    
}
