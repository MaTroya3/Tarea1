
public class Puntaje{
    //atributos de la clase
    public String NombresJugadores;
    public int Participantes;
    public int Marcador;
    
    //Constructores 
    public Puntaje(){
    }
    public Puntaje(String NombresJugadores, int Participantes, int Marcador){
        this.NombresJugadores = NombresJugadores;
        this.Participantes = Participantes;
        this.Marcador= Marcador;
    }
    //métodos 
    public void Mostrarpuntajealto(){
        System.out.println("El puntaje alto es ...");
    }
    public void Mostrarpuntajebajo(){
        System.out.println("El puntaje bajo es ...");
    }
    
public static void main (String[] args){
    System.out.println("Okay");
}
}