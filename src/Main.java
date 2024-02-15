import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int Dato1, Dato2, opcion = 0;
        double Resultado = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Por favor ingrese dos valores a calcular");
        System.out.print("Dato No.1: ");

        Dato1 = input.nextInt();
        System.out.print("Dato No.2: ");
        Dato2 = input.nextInt();

        while (opcion < 1 || opcion >4){
            System.out.println("Seleccione una de las operaciones a realizar");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.print("¿Que operacion elige?");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    Resultado = Dato1+Dato2;
                    break;
                case 2 :
                    Resultado = Dato1-Dato2;
                    break;
                case 3:
                    Resultado = Dato1*Dato2;
                case 4:
                    Resultado = Dato1/Dato2;
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");
            }

        }

        System.out.println("El resultado final es de: " + Resultado);

    }
}