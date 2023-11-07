public class Giocattolo{
    static private int contatore=1;
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;
    private int quantita;

    public Giocattolo(String n, double pr, int etaC, int q){
        this.id=contatore;
        this.nome=n;
        this.prezzo=pr;
        this.etaConsigliata=etaC;
        this.quantita=q;
        contatore++;
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

    public int getQuantita() {
        return quantita;
    }

    public void modificaQuantitaDopoVendita(){
        this.quantita-=1;
    }
}