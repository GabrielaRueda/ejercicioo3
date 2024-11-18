//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3_Gabriela {
    public static void main(String[] args) {
          // Scanner a= new Scanner(System.in);
           
           
   int N=0, Suma=0;
   N=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del Cateto A:"));
   
   while (N <10){
    N= N +1;
    Suma=Suma + N;
   }
        System.out.println("La sumatoria de los numeros es: " + Suma);
    }
}
   
