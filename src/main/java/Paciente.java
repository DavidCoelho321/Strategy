public class Paciente {
    private float imc;

    public float getImc() {
        return imc;
    }

    public void CalculodoIMC(float peso, float altura) {
        Calculadora calculadora = new Calculadora(peso, altura);
        this.imc = calculadora.calculo(new CalculoIMC());
    }
}
