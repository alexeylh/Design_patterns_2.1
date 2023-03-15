public class IntsCalculator implements Ints {
    private Calculator calc;

    public IntsCalculator() {
        calc = new Calculator();
    }

    private int calculate(Calculator.Operation operation, int arg0, int arg1) {
        double resultD = calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation)
                .result();
        return (int) resultD;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return this.calculate(Calculator.Operation.SUM, arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return this.calculate(Calculator.Operation.MULT, arg0, arg1);
    }

    @Override
    public int pow(int a, int b) {
        return this.calculate(Calculator.Operation.POW, a, b);
    }
}
