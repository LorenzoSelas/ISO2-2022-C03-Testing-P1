package iso2.c03.testing;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FechaTest {
    @Test
    public void comprobarTestCasePairWise1_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise1_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise1_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise1_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise1_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise1_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise1_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise1_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise1_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 6, 2));
    }
    @Test
    public void comprobarTestCasePairWise2_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise2_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise2_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise2_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise2_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise2_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise2_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise2_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise2_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 6, 2));
    }
    /*
    @Test
    public void comprobarTestCasePairWise3_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha("d", -15, -15));
    }
    @Test
    public void comprobarTestCasePairWise3_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise3_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, "m", -1));
    }
    @Test
    public void comprobarTestCasePairWise3_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise3_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise3_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise3_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise3_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise3_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-15, 6, 2));
    }
    */
    @Test
    public void comprobarTestCasePairWise4_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise4_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise4_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise4_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise4_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise4_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise4_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise4_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise4_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1000000000, 6, 2));
    }
    @Test
    public void comprobarTestCasePairWise5_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise5_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise5_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise5_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise5_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise5_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise5_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise5_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise5_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(-1000000000, 6, 2));
    }
    @Test
    public void comprobarTestCasePairWise6_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise6_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise6_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise6_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise6_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise6_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise6_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise6_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise6_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(0, 6, 2));
    }
    @Test
    public void comprobarTestCasePairWise7_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise7_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise7_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise7_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise7_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise7_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise7_7(){
        try {
            new Fecha(1, 2, 4);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise7_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise7_9(){
        try {
            new Fecha(1, 6, 2);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise8_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise8_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise8_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise8_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise8_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise8_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise8_7(){
        try {
            new Fecha(28, 2, 4);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise8_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(28, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise8_9(){
        try {
            new Fecha(28, 6, 2);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise9_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise9_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise9_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise9_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise9_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise9_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise9_7(){
        try {
            new Fecha(29, 2, 4);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise9_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(29, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise9_9(){
        try {
            new Fecha(29, 6, 2);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise10_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise10_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise10_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise10_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise10_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise10_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise10_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise10_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(30, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise10_9(){
        try {
            new Fecha(30, 6, 2);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void comprobarTestCasePairWise11_1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, -15, -15));
    }
    /*
    @Test
    public void comprobarTestCasePairWise11_2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 15, "y"));
    }
    @Test
    public void comprobarTestCasePairWise11_3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, "m", -1));
    }*/
    @Test
    public void comprobarTestCasePairWise11_4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, -1000000000, 1000000000));
    }
    @Test
    public void comprobarTestCasePairWise11_5(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 1000000000, 2));
    }
    @Test
    public void comprobarTestCasePairWise11_6(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 0, -15));
    }
    @Test
    public void comprobarTestCasePairWise11_7(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 2, 4));
    }
    @Test
    public void comprobarTestCasePairWise11_8(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 3, -1));
    }
    @Test
    public void comprobarTestCasePairWise11_9(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(31, 6, 2));
    }
    @Test
    public void comprobarTestCaseCoverage1(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, -15, -15));
    }
    @Test
    public void comprobarTestCaseCoverage2(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(1, 0, 2));
    }
    @Test
    public void comprobarTestCaseCoverage3(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 3, 2));
    }
    @Test
    public void comprobarTestCaseCoverage4(){
        assertThrows(ExcepcionFecha.class, () -> new Fecha(32, 2, 2));
    }
    @Test
    public void comprobarTestCaseCoverage5(){
        try{
            Fecha fecha = new Fecha(3, 2, 2);
            fecha.getMes();
            fecha.getDia();
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage6(){
        try{
            new Fecha(3, 1, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage7(){
        try{
            new Fecha(3, 5, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage8(){
        try{
            new Fecha(3, 7, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage9(){
        try{
            new Fecha(3, 8, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage10(){
        try{
            new Fecha(3, 10, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage11(){
        try{
            new Fecha(3, 12, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage12(){
        try{
            new Fecha(3, 4, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage13(){
        try{
            new Fecha(3, 9, 2);
        }catch (Exception e){
            fail();
        }
    }
    @Test
    public void comprobarTestCaseCoverage14(){
        try{
            new Fecha(3, 11, 2);
        }catch (Exception e){
            fail();
        }
    }
}