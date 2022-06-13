
public class Jugador{
    //atributos de la clase
    public String Nombre;
    public String Apellido;
    public int Edad;
    
    //Constructores 
    public Jugador(){
    }
    public Jugador(String Nombre, String Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad= Edad;
    }
    //métodos 
    public void Mostrarsigana(){
        System.out.println("You win");
    }
    public void Mostrarsipierde(){
        System.out.println("You lost");
    }
    public void Mostrarsiempata(){
        System.out.println("Tú empataste");
        
    }
    
public static void main (String[] args){
    System.out.println("Okay");
}
}