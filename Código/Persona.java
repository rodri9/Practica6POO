package practicapoo5;
/**
 * Ésta es la clase Persona que se utilizó en la Práctica 5.
 * @author Rodrigo Beristain, Alan Adrian Rivera
 */
public class Persona 
{
    //Los atributos debían ir con minúsculas, se nos fue la onda.
    private String nombre;
    private String apellidos;
    private Fecha fNacimiento;
    
    public Persona() {
    }
     /**
      * Es el constructor que recibe 3 parámetros.
      * @param nombre Es el nombre de nuestra persona, es de tipo String.
      * @param apellidos Es el apellido de nuestra persona, es de tipo String.
      * @param fNacimiento Es la fecha de nacimiento de nuestra persona, es de tipo Fecha.
      */
    public Persona(String nombre, String apellidos, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Es el constructor que sólo recibe dos parámetros
     * @param nombre Es el nombre de nuestra persona, es de tipo String.
     * @param apellidos Es el apellido de nuestra persona, es de tipo String.
     */
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = new Fecha(3, 5, 2000);
    }
    
    /**
     * Devuelve el atributo nombre
     * @return nombre Es el nombre de nuestra persona, es de tipo String.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Permite modificar el atributo nombre.
     * @param nombre Es el nombre de nuestra persona, es de tipo String.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el atributo apellidos
     * @return Es el apellido de nuestra persona, es de tipo String.
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     * Permite modificar el atributo apellidos
     * @param apellidos Es el apellido de nuestra persona, es de tipo String.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * Devuelve el atributo fNacimiento.
     * @return fNacimiento Es la fecha de nacimiento de nuestra persona, es de tipo Fecha.
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    
    /**
     * Permite modificar el atributo fNacimiento.
     * @param fNacimiento Es la fecha de nacimiento de nuestra persona, es de tipo Fecha.
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Apellidos=" + apellidos + ", fNacimiento=" + fNacimiento + '}';
    }
}
