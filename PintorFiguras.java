
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int espacios = altura - 1;
        int ast = 1;
        for (int i =0; i < altura; i++) {
           for (int j=0; j<espacios; j++) {
                System.out.print(' ');
            }
            
            for (int j=0; j<ast;j++){
                System.out.print("*");
           }
            System.out.println();
            espacios--;
            ast += 2;

        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         

    }
}
