import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String indirizzoEmail;
    public List<Integer> idGiochiAquistati = new ArrayList<>();

    public Cliente(int id, String n, String email){
        this.id=id;
        this.nome=n;
        this.indirizzoEmail= email;
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
