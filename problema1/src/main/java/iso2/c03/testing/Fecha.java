package iso2.c03.testing;

public class Fecha{
    private int dia, mes, ano;
    public Fecha(int dia, int mes, int ano) throws ExcepcionFecha, Exception{
        try {
            if(comprobarAno(ano))
                this.ano=ano;
            if(comprobarMes(mes))
                this.mes=mes;
            if(comprobarDia(ano,mes,dia))
                this.dia=dia;
        } catch (ExcepcionFecha e) {
            throw e;
        }catch (Exception e){
            throw new Exception("Unknown exception.");
        }
    }

    private boolean comprobarAno(int ano) throws ExcepcionFecha{
        if(ano >= 0)
            return true;
        else
            throw new ExcepcionFecha("El año no puede ser un numero negativo.");
    }
    private boolean comprobarMes(int mes) throws ExcepcionFecha{
        if (mes == 0) 
		throw new ExcepcionFecha("El mes no puede ser 0.");
	else if (mes < 0) 
        	throw new ExcepcionFecha("El mes no puede ser negativo.");
        else if(mes > 12)
        	throw new ExcepcionFecha("El mes no puede ser mayor que 12.");
	return true;
    }
    private boolean comprobarDia(int ano,int mes, int dia) throws ExcepcionFecha{
        if (dia == 0)
            throw new ExcepcionFecha("El día no puede ser 0.");
        else if (dia < 0)
            throw new ExcepcionFecha("El día no puede ser negativo.");
        if (mes == 1 || mes == 3|| mes == 5|| mes == 7|| mes == 8 || mes == 10|| mes == 12)
            if (dia <= 31)
                return true;
            else 
                throw new ExcepcionFecha("Siendo el mes " + mes + ", el dia no puede ser mayor de 31 dias.");
        else if (mes == 4 || mes == 6|| mes == 9|| mes ==11)
            if (dia <= 30)
                return true;
            else
                throw new ExcepcionFecha("Siendo el mes " + mes + ", el dia no puede ser mayor de 31 dias.");
        else if ((mes == 2) && Comprobador.comprobarBisisesto(this))
            if (dia <= 29)
                return true;
            else 
                throw new ExcepcionFecha("Siendo el mes " + mes + ", el dia no puede ser mayor de 29 dias.");
        else 
            if (dia <= 28)
                return true;
            else
                throw new ExcepcionFecha("Siendo el mes " + mes + ", el dia no puede ser mayor de 28 dias.");
    }

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
}

