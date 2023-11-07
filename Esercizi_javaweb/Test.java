
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("\n");
        
        //creo un oggetto di tipo cliente
        Cliente c1 = new Cliente("Lorenzo", "lorigiu2004@gmail.com");
        //creo un paio di oggetti di tipi giocattoli
        Giocattolo g1= new Giocattolo("Macchinina", 30, 5, 4);
        Giocattolo g2= new Giocattolo("Mappamondo", 10, 10,2);

        //creo l'oggetto inventario
        Inventario inventario= new Inventario();
        System.out.println("\n");
        inventario.aggiornaInventario(g1);
        inventario.aggiornaInventario(g2);

        System.out.println("\n");
        inventario.mostraGiocattoliDisponibili();
        
        
        
        System.out.println("\n");
        //registro la vendita di Cars per il primo cliente
        Vendita v= new Vendita();
        v.registraVendita(c1, g1);


        System.out.println("\n");
        inventario.mostraGiocattoliDisponibili();
        
    }
}
