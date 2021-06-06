import java.util.Scanner;

public class Menu {

    public Menu() {
        double nota;
        int opcion2;
        String nombre;
        int paisOrigen;
        int cantidadNotas;
        int contador;

        Formula formula = new Formula();
        Scanner teclado = new Scanner(System.in);


        System.out.println("Hola, Bienvenido al convertidor de notas 1.1");
        System.out.println("Por favor, ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese cantidad de notas");
        cantidadNotas = teclado.nextInt();
        Usuario persona = new Usuario(nombre, cantidadNotas);

        while (cantidadNotas != 0) {

            int opcion;
            contador = cantidadNotas;

            System.out.println("Ingrese el pais de donde provienen sus calificaciones");
            System.out.println("1.- Argentina");
            System.out.println("2.- Peru");
            System.out.println("3.- Bolivia");
            System.out.println("4.- Chile");
            System.out.println("5.- Colombia");
            System.out.println("6.- Brasil");
            opcion2 = teclado.nextInt();

            switch (opcion2) {

                case 1:
                    System.out.println("Has seleccionado Argentina");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");

                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Colombia");
                        System.out.println("2.- Peru");
                        System.out.println("3.- Bolivia");
                        System.out.println("4.- Brasil");
                        System.out.println("5.- Chile");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile = new CalculoDeExtranjeroAChile(nota);
                                chile.calculoArgChile();
                                Calculo calculo = new Calculo(chile.getResultado());
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile2 = new CalculoDeExtranjeroAChile(nota);
                                chile2.calculoArgChile();
                                Calculo calculo2 = new Calculo(chile2.getResultado());
                                calculo2.calculoPeruano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile3 = new CalculoDeExtranjeroAChile(nota);
                                chile3.calculoArgChile();
                                Calculo calculo3 = new Calculo(chile3.getResultado());
                                calculo3.calculoBoliviano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile4 = new CalculoDeExtranjeroAChile(nota);
                                chile4.calculoArgChile();
                                Calculo calculo4 = new Calculo(chile4.getResultado());
                                calculo4.calculoBrasil();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextInt();
                                CalculoDeExtranjeroAChile chile5 = new CalculoDeExtranjeroAChile(nota);
                                chile5.calculoArgChile();
                                System.out.println(chile5.getResultado());
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado Peru");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");
                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Argentina");
                        System.out.println("2.- Colombia");
                        System.out.println("3.- Bolivia");
                        System.out.println("4.- Brasil");
                        System.out.println("5.- Chile");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile = new CalculoDeExtranjeroAChile(nota);
                                chile.calculoPerChile();
                                Calculo calculo = new Calculo(chile.getResultado());
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile2 = new CalculoDeExtranjeroAChile(nota);
                                chile2.calculoPerChile();
                                Calculo calculo2 = new Calculo(chile2.getResultado());
                                calculo2.calculoColombiano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile3 = new CalculoDeExtranjeroAChile(nota);
                                chile3.calculoPerChile();
                                Calculo calculo3 = new Calculo(chile3.getResultado());
                                calculo3.calculoBoliviano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile4 = new CalculoDeExtranjeroAChile(nota);
                                chile4.calculoPerChile();
                                Calculo calculo4 = new Calculo(chile4.getResultado());
                                calculo4.calculoBrasil();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextInt();
                                CalculoDeExtranjeroAChile chile5 = new CalculoDeExtranjeroAChile(nota);
                                chile5.calculoPerChile();
                                System.out.println(chile5.getResultado());
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado Bolivia");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");
                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Argentina");
                        System.out.println("2.- Peru");
                        System.out.println("3.- Colombia");
                        System.out.println("4.- Brasil");
                        System.out.println("5.- Chile");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile = new CalculoDeExtranjeroAChile(nota);
                                chile.calculoBolChile();
                                Calculo calculo = new Calculo(chile.getResultado());
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile2 = new CalculoDeExtranjeroAChile(nota);
                                chile2.calculoBolChile();
                                Calculo calculo2 = new Calculo(chile2.getResultado());
                                calculo2.calculoPeruano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile3 = new CalculoDeExtranjeroAChile(nota);
                                chile3.calculoBolChile();
                                Calculo calculo3 = new Calculo(chile3.getResultado());
                                calculo3.calculoColombiano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile4 = new CalculoDeExtranjeroAChile(nota);
                                chile4.calculoBolChile();
                                Calculo calculo4 = new Calculo(chile4.getResultado());
                                calculo4.calculoBrasil();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextInt();
                                CalculoDeExtranjeroAChile chile5 = new CalculoDeExtranjeroAChile(nota);
                                chile5.calculoBolChile();
                                System.out.println(chile5.getResultado());
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado Chile");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");
                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Argentina");
                        System.out.println("2.- Peru");
                        System.out.println("3.- Colombia");
                        System.out.println("4.- Brasil");
                        System.out.println("5.- Bolivia");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                Calculo calculo = new Calculo(nota);
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                Calculo calculo2 = new Calculo(nota);
                                calculo2.calculoPeruano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                Calculo calculo3 = new Calculo(nota);
                                calculo3.calculoColombiano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                Calculo calculo4 = new Calculo(nota);
                                calculo4.calculoBrasil();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                Calculo calculo5 = new Calculo(nota);
                                calculo5.calculoBoliviano();
                                System.out.println(calculo5.getResultado());
                                break;

                        }
                    }
                    break;

                case 5:
                    System.out.println("Has seleccionado Colombia");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");
                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Argentina");
                        System.out.println("2.- Peru");
                        System.out.println("3.- Bolivia");
                        System.out.println("4.- Brasil");
                        System.out.println("5.- Chile");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile = new CalculoDeExtranjeroAChile(nota);
                                chile.calculoColChile();
                                Calculo calculo = new Calculo(chile.getResultado());
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile2 = new CalculoDeExtranjeroAChile(nota);
                                chile2.calculoColChile();
                                Calculo calculo2 = new Calculo(chile2.getResultado());
                                calculo2.calculoPeruano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile3 = new CalculoDeExtranjeroAChile(nota);
                                chile3.calculoColChile();
                                Calculo calculo3 = new Calculo(chile3.getResultado());
                                calculo3.calculoBoliviano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile4 = new CalculoDeExtranjeroAChile(nota);
                                chile4.calculoColChile();
                                Calculo calculo4 = new Calculo(chile4.getResultado());
                                calculo4.calculoBrasil();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextInt();
                                CalculoDeExtranjeroAChile chile5 = new CalculoDeExtranjeroAChile(nota);
                                chile5.calculoColChile();
                                System.out.println(chile5.getResultado());
                                break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Has seleccionado Brasil");
                    System.out.println("Ingrese pais al cual quiere convertir sus calificaciones");
                    while (contador != 0) {

                        System.out.println("Selecione pais");
                        System.out.println("1.- Argentina");
                        System.out.println("2.- Colombia");
                        System.out.println("3.- Bolivia");
                        System.out.println("4.- Peru");
                        System.out.println("5.- Chile");

                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile = new CalculoDeExtranjeroAChile(nota);
                                chile.calculoPerChile();
                                Calculo calculo = new Calculo(chile.getResultado());
                                calculo.calculoArgentino();
                                System.out.println(calculo.getResultado());
                                break;

                            case 2:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile2 = new CalculoDeExtranjeroAChile(nota);
                                chile2.calculoBrChile();
                                Calculo calculo2 = new Calculo(chile2.getResultado());
                                calculo2.calculoColombiano();
                                System.out.println(calculo2.getResultado());
                                break;

                            case 3:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile3 = new CalculoDeExtranjeroAChile(nota);
                                chile3.calculoBrChile();
                                Calculo calculo3 = new Calculo(chile3.getResultado());
                                calculo3.calculoBoliviano();
                                System.out.println(calculo3.getResultado());
                                break;

                            case 4:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextDouble();
                                CalculoDeExtranjeroAChile chile4 = new CalculoDeExtranjeroAChile(nota);
                                chile4.calculoBrChile();
                                Calculo calculo4 = new Calculo(chile4.getResultado());
                                calculo4.calculoPeruano();
                                System.out.println(calculo4.getResultado());
                                break;

                            case 5:
                                System.out.println("Ingrese nota ");
                                nota = teclado.nextInt();
                                CalculoDeExtranjeroAChile chile5 = new CalculoDeExtranjeroAChile(nota);
                                chile5.calculoBrChile();
                                System.out.println(chile5.getResultado());
                                break;
                        }
                    }
                    break;
            }
        }
    }
}


