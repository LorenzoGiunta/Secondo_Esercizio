import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static private int contatore=1;
    private int id;
    private String nome;
    private String indirizzoEmail;
    private boolean admin=false;
    public List<Giocattolo> giochi = new ArrayList<>();

    public Cliente(String n, String email, boolean a){
        this.id=contatore;
        this.nome=n;
        this.indirizzoEmail= email;
        contatore++;
        this.admin= a;
    }
    
    public int getId() {
        return id;
    }

    public String getIndirizzoEmail() {
        return indirizzoEmail;
    }

    public String getNome() {
        return nome;
    }

    
    public boolean getAdmin(){
        return this.admin;
    }


    public void mostraMenuNormale(){
        System.out.println("------------------------------------------");
        System.out.println("-1-         Visualizza Giocattoli");
        System.out.println("-2-         Compra Giocattoli");
        System.out.println("-3-         Esci");
        System.out.println("------------------------------------------");
    }

    public void mostraMenuAdmin(){
        System.out.println("------------------------------------------");
        System.out.println("-1-         Visualizza Giocattoli");
        System.out.println("-2-         Compra Giocattoli");
        System.out.println("-3-         Aggiungi Giocattolo");
        System.out.println("-4-         Esci");
        System.out.println("------------------------------------------");
    }
}
