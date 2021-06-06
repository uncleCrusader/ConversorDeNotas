public class CalculoDeExtranjeroAChile {

    private double resultado;
    private final double nota;
    private Formula formula;

    public CalculoDeExtranjeroAChile(double nota){
        this.nota = nota;
    }

    public void calculoArgChile(){
        formula = new Formula(nota, 4, 6);
        formula.crearFormulaCl();
        resultado = formula.getResultado();
    }

    public void calculoBrChile(){
        formula = new Formula(nota, 50, 5);
        formula.crearFormula();
        resultado = formula.getResultado();
    }

    public void calculoPerChile() {
        formula = new Formula(nota, 9, 11);
        formula.crearFormula();
        resultado = formula.getResultado();
    }

    public void calculoColChile() {
        formula = new Formula(nota,4,6);
        formula.crearFormula();
        resultado = formula.getResultado();
    }

    public void calculoBolChile() {
        formula = new Formula(nota, 50, 50);
        formula.crearFormula();
        resultado = formula.getResultado();
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
