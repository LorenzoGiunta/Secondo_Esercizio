public class Vendita{
    //metodo a cui passo un oggetto cliente e un int che rappresenta l'id di un gioco che viene acquistato da un cliente    
    
    private String scontrino="";




    public Vendita(Cliente c, Giocattolo g){
        if(g.getQuantita()>0){
            c.giochi.add(g);
            System.out.println("Sto registrando la vendita del giocattolo "+g.getNome()+ " al cliente "+c.getNome());
            g.modificaQuantitaDopoVendita();     
            this.scontrino="Il cliente "+c.getNome()+" ha comprato il gioco "+g.getNome()+ " al prezzo di "+g.getPrezzo();
        }else{
            System.out.println("Purtroppo abbiamo terminato questo giocattolo.");
        }
    }

    public String getScontrino() {
        return scontrino;
    }

}
