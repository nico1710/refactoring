import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Main_test {
    private int random_obtenido;

    @Before
    public void init() {
        random_obtenido = 0;
    }

    @Test
    public void generar_random_options() {
        random_obtenido = Main.generarRandom(1, 4);
        System.out.println(random_obtenido);
        Assert.assertTrue(random_obtenido >= 1 || random_obtenido <= 4);
    }

    @Test
    public void generar_random_numeros() {
        random_obtenido = Main.generarRandom(0, 10);
        System.out.println(random_obtenido);
        Assert.assertTrue(random_obtenido >= 0 || random_obtenido <= 10);
    }

}
