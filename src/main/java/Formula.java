//import java.util.concurrent.ForkJoinPool;

public class Formula {

    private double nota;
    private int num1;
    private int num2;
    private double denominador;
    private double convercionChilena;
    private double resultado;

    public Formula(){}

    public Formula(double nota, int num1, double denominador){
        this.nota = nota;
        this.num1 = num1;
        this.num2 = num2;
        this.denominador = denominador;
    }

    public Formula(double nota, int num1, int num2){
        this.nota = nota;
        this.num1 = num1;
        this.num2 = num2;
    }

    //obtener la nota que se ingresa por consola
    public double getNota() {
        return nota;
    }
    //se crea la formula
    public void crearFormula(){
        resultado = ((nota - num1) * (3 / denominador)) + 4;
    }
    //este crea la formula para convertirlo a notacion chilena
    public void crearFormulaCl(){
        resultado = (((num1*(nota - 4))/3) + num2);
    }

    public double getResultado() {
        return resultado;
    }


}
