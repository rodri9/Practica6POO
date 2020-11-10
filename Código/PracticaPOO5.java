package practicapoo5;
/**
 *
 * @author Rodrigo Beristain, Alan Adrian Rivera
 */
public class PracticaPOO5
{
    public static void main(String[] args) 
    {
        System.out.println("------ Circulo ------");
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area c1 = "+c1.area());
        
        System.out.println("Perimetro c2 = "+c2.perimetro());
        System.out.println("Area c2 = "+c2.area());
        
        System.out.println("\nUtilizando setRadio");
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area c1 = "+c1.area());
        
        System.out.println("\n------ Persona y Fecha ------");
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(17, 7, 2001);
        
        amigo.setNombre("Rogelio");
        amigo.setApellidos("Reyes Diaz");
        amigo.setfNacimiento(fNacimiento);
        
        System.out.println("Info de mi amigo: "+amigo.toString());
        System.out.println("Info de mi amigo: "+amigo);
        
        Persona amigo2 = new Persona("David", "Anguiano", new Fecha(5, 1, 2001));
        System.out.println("Info de mi amigo 2: "+amigo2);
        
        Persona amigo3 = new Persona("Diego", "Pedraza Peralta");
        System.out.println("Info de mi amigo 3: "+amigo3);
        
        /*
        Escoger como ejercicio una de las clases anteriores y ponerle los getters y setters, los toString, etc.
        */
    }
}