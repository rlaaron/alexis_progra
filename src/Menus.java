import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);

    public void banner(){
        System.out.println("***********************************************************");
        System.out.println("**** BIENVENIDO AL PROGRAMA CONOCIENDO EL ESPACIO !!! *****");
        System.out.println("***********************************************************");
    }
    
    public int menuPrincipal() {
       try{
        int opcion;
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();
        return opcion;
       }catch(Exception e){
           System.out.println("seleccione una opcion valida");
           return 0;
       }
    }
}
