public class Giocattolo{
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(int id, String n, double pr, int etaC){
        this.id=id;
        this.nome=n;
        this.prezzo=pr;
        this.etaConsigliata=etaC;
    }
    
    
    
    
    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}