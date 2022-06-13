
public class JuegoOnline{
    //atributos de la clase
    public String   Nombre1;
    public String Plataforma;
    public int Almacenamiento;
    
    //Constructores 
    public JuegoOnline(){
    }
    public JuegoOnline(String Nombre1, String Plataforma, int Almacenamiento){
        this.Nombre1 = Nombre1;
        this.Plataforma = Plataforma;
        this.Almacenamiento= Almacenamiento;
    }
    //métodos 
    public void Apertura(){
        System.out.println("Hola, bienvenido");
    }
    public void Cerrar(){
        System.out.println("Vuelva pronto");
    }
    
public static void main (String[] args){
    System.out.println("Okay");
}
}