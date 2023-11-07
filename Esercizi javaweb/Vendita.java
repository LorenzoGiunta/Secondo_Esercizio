
public class Vendita extends Cliente{

    
    
    //metodo a cui passo un oggetto cliente e un int che rappresenta l'id di un gioco che viene acquistato da un cliente
    public void registraVendita(Cliente c, int idGiocoAquistato){
        c.idGiochiAquistati.add(idGiocoAquistato);
    }
}
