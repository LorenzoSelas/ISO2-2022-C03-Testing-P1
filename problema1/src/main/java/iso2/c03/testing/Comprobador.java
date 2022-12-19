package iso2.c03.testing;

public class Comprobador{
        public static boolean comprobarBisisesto(Fecha fecha){
        if ((fecha.getAno() % 4 == 0) && ((fecha.getAno() % 100 != 0) || (fecha.getAno() % 400 == 0)))
            return true;
        else
            return false;
    }
}
