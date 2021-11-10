public class Calculadora {
    private float peso;
    private float altura;

    public Calculadora(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calculo(Calculo Calculo) {
        return Calculo.calcular(peso, altura);
    }

}
