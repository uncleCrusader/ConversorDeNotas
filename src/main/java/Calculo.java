
public class Calculo {

        private double resultado;
        private final double nota;
        private Formula formula;

        public Calculo(double nota){
            this.nota = nota;
        }


    public void calculoArgentino() {
            formula = new Formula(nota, 6, 4.0);
            formula.crearFormula();
            resultado = formula.getResultado();
        }

        public void calculoBrasil(){
            formula = new Formula(nota, 5, 50.0);
            formula.crearFormula();
            resultado = formula.getResultado();
        }

        public void calculoPeruano() {
            formula = new Formula(nota, 11, 9.0);
            formula.crearFormula();
            resultado = formula.getResultado();
        }

        public void calculoColombiano() {
            formula = new Formula(nota,6,4.0);
            formula.crearFormula();
            resultado = formula.getResultado();
        }

        public void calculoBoliviano() {
            formula = new Formula(nota, 50, 50.0);
            formula.crearFormula();
            resultado = formula.getResultado();
        }

        public double getResultado() {
            return resultado;
        }
    }

