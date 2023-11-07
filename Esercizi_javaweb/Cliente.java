import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static private int contatore=1;
    private int id;
    private String nome;
    private String indirizzoEmail;
    public List<Giocattolo> giochi = new ArrayList<>();

    public Cliente(String n, String email){
        this.id=contatore;
        this.nome=n;
        this.indirizzoEmail= email;
        contatore++;
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
}
