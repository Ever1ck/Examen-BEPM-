package pe.edu.upeu.bepm;
import pe.edu.upeu.bepm.examen.ResolucionExamen;
import pe.edu.upeu.bepm.utils.LeerTeclado;
/**
 * Hola mundo!
 *
 */
public class App 
{
    public static void main( String[] args ){
        LeerTeclado Lteclado = new LeerTeclado();
        ResolucionExamen problemas = new ResolucionExamen();
        String eleccion = "SI";
        int numDeAlg;
        String MenuMSG ="1.- El problema del Gerente\n"+
                            "2.- Tabla de multiplicar\n"+
                            "3.- Fibonaci\n"+
                            "4.- Potencia con recursividad";
    do{
        System.out.println(MenuMSG);
        numDeAlg = Lteclado.leer(0, "Ingrese el Algoritmo que desea probar: ");
        switch(numDeAlg){
            /**caso 1 */
            case 1: 
            problemas.gerenteCostos();        
            break;
            /**caso 2 */
            case 2: 
            problemas.tablaDeMP();
            break;
            /**caso 3 */
            case 3:
            int numero =Lteclado.leer(0, "Ingresa un numero para la suma");
            problemas.Divisores(numero);
            break;
            /**caso 4 */
            case 4:
            int base = Lteclado.leer(0,"Ingrese la base: ");
            int exp = Lteclado.leer(0,"Ingrese el exponente: ");
            System.out.println("El resultado es: " + problemas.Recursiva(base, exp));

            break;
            /**caso default */
            default: System.out.println("Num de Algoritmo no existe!!"); break;
        }
        eleccion = Lteclado.leer("", "Desea probar mas algoritmos? SI/NO");
    }while(eleccion.equals("SI") || eleccion.equals("si"));
    }
}
