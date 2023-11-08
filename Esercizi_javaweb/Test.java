import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("\n");
        int contatore, indice=0, scelta=0, prezzoGiocattoloNuovo, etaConsigliataNuova, quantitaDisponibileNuovo, G;
        String nomeU, nomeGioco, continuare="no", nomeGiocoNuovo;
        boolean ok=false;
        

        List<Cliente> clienti= new ArrayList<>();
        clienti.add(new Cliente("Lorenzo", "lorigiu", true));
        clienti.add(new Cliente("Gioele", "gio2005", false));

        List<Giocattolo> giochi= new ArrayList<>();
        giochi.add(new Giocattolo("Macchinina", 30, 5, 4));
        giochi.add(new Giocattolo("Mappamondo", 10, 10,2));
        G=1; //questa variabile mi conta gli indici dei giochi sto inserendo nella lista di tipo giocattolo

        
        Inventario inventario= new Inventario();
        System.out.println("\n");
        inventario.aggiornaInventario(giochi.get(0));
        inventario.aggiornaInventario(giochi.get(1));


        List<Vendita> v= new ArrayList<>();

            contatore=0;
            do{
                if(contatore!=0)
                    System.out.println("...Non abbiamo un nome in archivio che corrisponde al tuo...");
            
            
                System.out.println("Inserisci il tuo nome: ");
                nomeU=in.next();

               for(int i=0; i< clienti.size(); i++){
                
                    if(clienti.get(i).getNome().equals(nomeU)){
                        ok=true;
                        indice=i;
                    }
                }
            contatore ++;
            
            }while(!ok && contatore<3);


            if(ok && !(clienti.get(indice).getAdmin())){
                do{    
                    clienti.get(indice).mostraMenuNormale();
                    System.out.println("Quale azione vuoi compiere? ");
                    scelta=in.nextInt();
                    switch (scelta) {
                        case 1:
                            inventario.mostraGiocattoliDisponibili();
                            break;
                    
                        case 2:
                            System.out.println("Inserisci il nome del giocattolo che vuoi comprare: ");
                            nomeGioco=in.next();
                            if(inventario.controlloGioco(nomeGioco)){
                                for(int k=0; k<giochi.size(); k++){
                                    if(giochi.get(k).getNome().equals(nomeGioco)){
                                        Giocattolo giocoT=giochi.get(k);
                                        v.add(new Vendita(clienti.get(indice), giocoT ));
                                    }
                                }
                            }else
                                System.out.println("Non esiste questo gioco all'interno del nostro inventario");

                        break;

                        default: 
                            break;
                    }

                    System.out.println("Vuoi continuare? (si/no)");
                    continuare= in.next();
                }while(continuare.equalsIgnoreCase("si"));
            }   else if(ok && (clienti.get(indice).getAdmin())){
                do{    
                    System.out.println("----HAI UN UTENTE ADMIN----");
                    clienti.get(indice).mostraMenuAdmin();
                    System.out.println("Quale azione vuoi compiere? ");
                    scelta=in.nextInt();
                    switch (scelta) {
                        case 1:
                            inventario.mostraGiocattoliDisponibili();
                            break;
                    
                        case 2:
                            System.out.println("Inserisci il nome del giocattolo che vuoi comprare: ");
                            nomeGioco=in.next();
                            if(inventario.controlloGioco(nomeGioco)){
                                for(int k=0; k<giochi.size(); k++){
                                    if(giochi.get(k).getNome().equals(nomeGioco)){
                                        Giocattolo giocoT=giochi.get(k);
                                        v.add(new Vendita(clienti.get(indice), giocoT ));
                                    }
                                }
                            }else
                                System.out.println("Non esiste questo gioco all'interno del nostro inventario");

                        break;

                        case 3: 
                            System.out.println("Inserisci il nome del giocattolo nuovo: ");
                            nomeGiocoNuovo=in.next();
                            System.out.println("Inserisci il prezzo del giocattolo nuovo: ");
                            prezzoGiocattoloNuovo=in.nextInt();
                            System.out.println("Inserisci l'eta consigliata del giocattolo nuovo: ");
                            etaConsigliataNuova=in.nextInt();
                            System.out.println("Inserisci la quantita disponibile del giocattolo nuovo: ");
                            quantitaDisponibileNuovo=in.nextInt();
                            giochi.add(new Giocattolo(nomeGiocoNuovo, prezzoGiocattoloNuovo, etaConsigliataNuova, quantitaDisponibileNuovo));
                            inventario.aggiornaInventario(giochi.get(G+1));
                            break;
                        case 4: 
                            break;
                    }
                    System.out.println("Vuoi continuare? (si/no)");
                    continuare= in.next();
                }while(continuare.equalsIgnoreCase("si"));
            }
    }
    
}
