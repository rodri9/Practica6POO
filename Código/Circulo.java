package practicapoo5;
/**
 * Es la clase círculo que utilizamos en la práctica 5.
 * @author Rodrigo Beristain, Alan Adrian Rivera
 */
public class Circulo 
{
    static double PI = Math.PI; //Todas las variables constantes van con mayusuculas.
    private double radio;
    private String color;
    
    
    /**
     * Es el constructor vacío.
     */
    public Circulo() 
    {
        //Una forma de crear constructores en NetBeans es dar click derecho -> Insert Code -> Constructor
    }
    
    /**
     * Es el constructor que recibe un único parámetro.
     * @param radio Es el radio del círculo, es de tipo double.
     */
    public Circulo(double radio) 
    {
        //Para que el constructor pueda recibir algo, solo hay que hacer el procedimiento anterior y selecionar la casilla 
        //de lo que queremos recibir.
        this.radio = radio;
    }
    
    /**
     * Devuelve el atributo radio.
     * @return radio Es el radio del círculo, es de tipo double.
     */
    public double getRadio() 
    {
        return radio;
    }
    
    /**
     * Permite modificar el atributo radio.
     * @param radio Es el radio del círculo, es de tipo double.
     */
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    /**
     * Método que calcula el perímetro del círculo.
     * @return Valor de la operación para calcular el perímetro de un círculo.
     */
    public double perimetro()
    {
        return 2 * PI * radio;
    }
    
    /**
     * Método que calcula el área del círculo.
     * @return Valor de la operación para calcular el área de un circulo.
     */
    public double area()
    {
        return PI * (radio*radio);
    }
}