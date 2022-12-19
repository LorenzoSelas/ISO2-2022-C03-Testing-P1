package iso2.c03.testing;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class ComprobadorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void comprobarBisisestoTestCase1(){
        try {
            Fecha fecha = new Fecha(1, 1, 1);
            assertFalse(Comprobador.comprobarBisisesto(fecha));
        } catch (Exception e){
            fail("No se esperaba una excepción");
        }
    }

    @Test
    public void comprobarBisisestoTestCase2(){
        try {
            Fecha fecha = new Fecha(1, 1, 4);
            assertTrue(Comprobador.comprobarBisisesto(fecha));
        } catch (Exception e){
            fail("No se esperaba una excepción");
        }
    }

    @Test
    public void comprobarBisisestoTestCase3(){
        try {
            Fecha fecha = new Fecha(1, 1, 100);
            assertFalse(Comprobador.comprobarBisisesto(fecha));
        } catch (Exception e){
            fail("No se esperaba una excepción");
        }
    }

    @Test
    public void comprobarBisisestoTestCase4(){
        try {
            Fecha fecha = new Fecha(1, 1, 400);
            assertTrue(Comprobador.comprobarBisisesto(fecha));
        } catch (Exception e){
            fail("No se esperaba una excepción");
        }
    }

    public static void main(String[] args) { 
        Result result = JUnitCore.runClasses(ComprobadorTest.class);
        for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
