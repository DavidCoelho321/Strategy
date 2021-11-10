import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void deveCalculaImc() {
        Paciente paciente = new Paciente();
        paciente.CalculoIMC(180.0f, 96.0f);
        assertEquals(29.6f, paciente.getImc());
    }

}