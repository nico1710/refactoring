import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Main_test_resultado {
    private double resultadoEsperado;
    private double resultadoObtenido;

    // CALCULAR RESULTADO
    @Before
    public void init() {
        resultadoEsperado = 0;
        resultadoObtenido = 0;
        System.out.println("Before");
    }

    @Test
    public void calcular_resultado_suma() {
        resultadoEsperado = 7;
        resultadoObtenido = Main.calcularResultado(3, 4, 1);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 1);
    }

    @Test
    public void calcular_resultado_resta() {
        resultadoEsperado = 5;
        resultadoObtenido = Main.calcularResultado(6, 1, 2);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 1);
    }

    @Test
    public void calcular_resultado_multiplicacion() {
        resultadoEsperado = 8;
        resultadoObtenido = Main.calcularResultado(2, 4, 3);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 1);
    }

    @Test
    public void calcular_resultado_division() {
        resultadoEsperado = 3;
        resultadoObtenido = Main.calcularResultado(9, 3, 4);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 1);
    }

    @Test
    public void calcular_resultado_division_decimal() {
        resultadoEsperado = 3.3;
        resultadoObtenido = Main.calcularResultado(10, 3, 4);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido, 1);
    }

    @Test
    public void calcular_resultado_division_cero() {
        resultadoEsperado = 0;
        resultadoObtenido = (int) Main.calcularResultado(4, 7, 4);
        System.out.println(resultadoObtenido);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido ,1);
    }
}
