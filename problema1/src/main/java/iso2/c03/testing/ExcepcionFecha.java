package iso2.c03.testing;

public class ExcepcionFecha extends Exception{
     
    private String Error;
     
    public ExcepcionFecha(String Error){
        this.Error=Error;
    }
     
    @Override
    public String getMessage(){
        return Error;
    }
     
}