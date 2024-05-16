import java.util.Scanner;


public class App {


   public static String [][] empleado=new String[5][3];
public static Scanner leer= new Scanner(System.in);
public static int opcion;


public static void main(String[] args) throws Exception {
       
pedirtodo();
        
    }


public static void pedirtodo(){

for(int i=0;i<empleado.length;i++){

System.out.println("BIENVENIDO!  Inrese el nombre del empleado numero " +(i+1));
empleado[i][0]=leer.nextLine();

}
System.out.println("------------------------------------------------------------");
pedircargo();
System.out.println("------------------------------------------------------------");
pedirsalario();
System.out.println("-------------------------------------------------------------");
consultarinfo();

    }

public static void pedircargo () {

System.out.println("Muy bien! ahora ingrese el cargo que tendran los empleados");

for (int i=0;i<empleado.length;i++){

System.out.println("Ingrese el cargo (Operador) o (administrador) de el empleado " +(empleado[i][0]));
empleado[i][1]=leer.nextLine();

}




}

public static void pedirsalario(){

for (int i=0;i<empleado.length;i++){

System.out.println("Muy bien! ahora ingrese el salario de el empleado  "+(empleado[i][0]));
empleado[i][2]=leer.nextLine();

}




}

public static void consultarinfo(){
    
    System.out.println("Hola de nuevo! Elija al empleado sobre el cual desea consultar o agregar informacion");
    boolean salir=false;
do{

System.out.println("1. " +(empleado[0][0]));
System.out.println("2. " +(empleado[1][0]));
System.out.println("3. " +(empleado[2][0]));
System.out.println("4. " +(empleado[3][0]));
System.out.println("5. " +(empleado[4][0]));
System.out.println("6. Salir");
System.out.println("Elija una opcion :)");
opcion=leer.nextInt();





switch (opcion) {
    case 1:
    System.out.println("El salario de " +(empleado[0][0])+" Es igual a "+ (empleado[0][2])+" Siendo el un " +(empleado[0][1]));


    
    if (empleado[0][1].equalsIgnoreCase("operador")) {

        int salario=Integer.parseInt(empleado[0][2]);
        if (salario<1000) {
            System.out.println(" Es operador asi que recibe un aumento de el 10%, su salario seria :"+(aumento(salario)));

        }else{
         System.out.println("No recibe aumento ");   
        }
        
    
}
        break;



        case 2:

        System.out.println("El salario de " +(empleado[1][0])+" Es igual a "+ (empleado[1][2])+" Siendo el un " +(empleado[1][1]));
      
        if (empleado[1][1].equalsIgnoreCase("operador")) {

            int salario=Integer.parseInt(empleado[1][2]);
            
            if (salario<1000) {
                System.out.println(" Es operador asi que recibe un aumento de el 10%, su salario seria :"+(aumento(salario)));
    
            }else{
             System.out.println("No recibe aumento ");   
            }
    
    }

        break;



        case 3:
        System.out.println("El salario de " +(empleado[2][0])+" Es igual a "+ (empleado[2][2])+" Siendo el un " +(empleado[2][1]));
        
        if (empleado[2][1].equalsIgnoreCase("operador")) {

            int salario=Integer.parseInt(empleado[2][2]);

            if (salario<1000) {
                System.out.println(" Es operador asi que recibe un aumento de el 10%, su salario seria :"+(aumento(salario)));
    
            }else{
             System.out.println("No recibe aumento ");   
            }     
       
    }




        break;



        case 4:
        System.out.println("El salario de " +(empleado[3][0])+" Es igual a "+ (empleado[3][2])+" Siendo el un " +(empleado[3][1]));

        if (empleado[3][1].equalsIgnoreCase("operador")) {

            int salario=Integer.parseInt(empleado[3][2]);
            if (salario<1000) {
                System.out.println(" Es operador asi que recibe un aumento de el 10%, su salario seria :"+(aumento(salario)));
    
            }else{
             System.out.println("No recibe aumento ");   
            }     
       
    }


        break;



        case 5:

        System.out.println("El salario de " +(empleado[4][0])+" Es igual a "+ (empleado[4][2])+" Siendo el un " +(empleado[4][1]));
     
        if (empleado[4][1].equalsIgnoreCase("operador")) {

            int salario=Integer.parseInt(empleado[4][2]);
            if (salario<1000) {
                System.out.println(" Es operador asi que recibe un aumento de el 10%, su salario seria :"+(aumento(salario)));
    
            }else{
             System.out.println("No recibe aumento ");   
            }       
     
    }

        
        break;

         

        case 6:

        System.out.println(" Hata luego mi querido usuario!");
       salir=true;

        break;


    default:
    System.out.println("Ups, parece que ingresaste un valor invalido, revisa bien las opciones");
        break;
}

}while(!salir);


}

public static double aumento(int salario){
double salariofinal= (salario*0.10)+salario;

return salariofinal;
}


}
