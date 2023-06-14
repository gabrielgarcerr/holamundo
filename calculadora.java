# holamundo
no se como se utiliza esto
package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int op,n=0;
        float numero=0;
        double n1,n2,R=0;     
            System.out.print("ingrese numero: ");
            n1=entrada.nextDouble();
            System.out.print("ingrese numero:");
            n2=entrada.nextDouble();         
                System.out.println("1)Suma");
                System.out.println("2)Resta");
                System.out.println("3)Multiplicasion");
                System.out.println("4)Division");
                System.out.print("Seleccione: ");
                op=entrada.nextInt();
                switch(op){
                    case 1: 
                        R=n1+n2;
                    break;
                    case 2:    
                        R=n1-n2;
                    break;
                    case 3:          
                        R=n1*n2;
                    break;
                    case 4:           
                        R=n1/n2;
                    break;
                    default:
                        System.out.println("NO EXISTE OPERACION");
                }
                System.out.println("Resultado: "+R);
    }         
}
