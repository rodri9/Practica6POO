package practicapoo5;
/**
 * Clase Fecha utilizada en la práctica 5.
 * @author Rodrigo Beristain, Alan Adrian Rivera
 */
public class Fecha 
{
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }
    
    /**
     * Es el constructor.
     * @param dia Es el día de nacimiento, es de tipo Int.
     * @param mes Es el mes de nacimiento, es de tipo Int.
     * @param anio Es el año de nacimiento, es de tipo Int.
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * Devuelve el atributo día.
     * @return dia Es el día de nacimiento, es de tipo Int.
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * Permite modificar el atributo dia.
     * @param dia Es el día de nacimiento, es de tipo Int.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * Devuelve el atributo mes.
     * @return mes Es el mes de nacimiento, es de tipo Int.
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * Permite modificar el atributo mes.
     * @param mes Es el mes de nacimiento, es de tipo Int.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * Devuelve el atributo anio.
     * @return anio Es el año de nacimiento, es de tipo Int.
     */
    public int getAnio() {
        return anio;
    }
    
    /**
     * Permite modificar el atributo anio.
     * @param anio Es el año de nacimiento, es de tipo Int.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
