public class CalculoIMC implements Calculo {
    public float calculo(float peso, float altura) {
        return (peso / (altura * altura)) ;
    }

    @Override
    public float calcular(float peso, float altura) {
        return 0;
    }
}
