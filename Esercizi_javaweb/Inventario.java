import java.util.ArrayList;
import java.util.List;

public class Inventario {

    
    public List<Giocattolo> giocattolo = new ArrayList<>();

    //funzione che mi aggiorna l'inventario
    public void aggiornaInventario(Giocattolo g){
        giocattolo.add(g);
        System.out.println("Il giocattolo "+g.getNome()+" e stato aggiunto all'inventario.");
    }


    //funzione che mi fa vedere tutti i giocattoli che sono stati registrati nell'inventario
    public void mostraGiocattoliDisponibili(){
        System.out.println("I giocattoli disponibili sono: ");
        for(int i=0; i<giocattolo.size(); i++){
            if(giocattolo.get(i).getQuantita()>0){
                System.out.println(giocattolo.get(i).getNome()+ " al prezzo di : "+giocattolo.get(i).getPrezzo()+ " quantita disponibile: "+giocattolo.get(i).getQuantita());
            }
        }
    }
}