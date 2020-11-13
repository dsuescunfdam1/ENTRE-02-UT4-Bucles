import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        int respuesta = 1;
        while(respuesta == 1){
            System.out.println("Teclee numero1:");
            int numero1 =  teclado.nextInt();
            System.out.println("Teclee numero2:");
            int numero2 =  teclado.nextInt();

            if((numero1 >=8 && numero1 <= 0) || (numero2 >=8 && numero2 <= 0) ){
                System.out.println("Quiere hacer otra suma en Octal?");
                System.out.println("1:Si");
                System.out.println("2:No");
                respuesta =  teclado.nextInt();

            }
            if((numero1 <=8 && numero1 >= 0) || (numero2 <=8 && numero2 >= 0) ){
                System.out.println(numero1);
                System.out.println(numero2);
                System.out.println("------------");
                System.out.println(calculadora.sumarEnOctal(numero1, numero2));
                System.out.println("Quiere hacer otra suma en Octal?");
                System.out.println("1:Si");
                System.out.println("2:No");
                respuesta =  teclado.nextInt();

            }
        }
        dibujarFiguras();
        
        

    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora dibujará un figura");
        int altura = 72;
        altura =  teclado.nextInt();
            while(altura >= 10 && altura < 0){
                System.out.println("Error, Altura de la figura? (1-10)");
                altura =  teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
        
    }

}
