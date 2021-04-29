import java.util.*;

public class Main {


    public static void main(String[] args){
        double nota;
        int opcion;
        String nombre;
        int cantidadNotas;

        Formula formula = new Formula();
        Scanner teclado = new Scanner(System.in);


        System.out.println("Hola, Bienvenido al convertidor de notas 1.0");
        System.out.println("Por favor, ingrese su nombre y cuantas notas quieres transformar");
        nombre = teclado.nextLine();
        cantidadNotas = teclado.nextInt();

        Usuario persona = new Usuario(nombre,cantidadNotas);




        while(cantidadNotas != 0) {

            System.out.println("Selecione pais");
            System.out.println("1.- Argentina");
            System.out.println("2.- Peru");
            System.out.println("3.- Bolivia");
            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nota ");
                    nota = teclado.nextDouble();
                    formula.formulaArgentina(nota);
                    System.out.println(formula.formulaArgentina(nota));
                    cantidadNotas = cantidadNotas - 1;
                    break;

                case 2:
                    System.out.println("Ingrese nota ");
                    nota = teclado.nextDouble();
                    formula.formulaPeruana(nota);
                    System.out.println(formula.formulaPeruana(nota));
                    cantidadNotas = cantidadNotas - 1;
                    break;

                case 3:
                    System.out.println("Ingrese nota ");
                    nota = teclado.nextDouble();
                    formula.formulaBoliviana(nota);
                    System.out.println(formula.formulaBoliviana(nota));
                    cantidadNotas = cantidadNotas - 1;
                    break;
            }
        }

    }

}
