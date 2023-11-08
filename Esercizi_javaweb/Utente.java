public class Utente {
    private String nome;
    private boolean admin=false;


    public Utente(String n,boolean a){
        this.nome=n;
        this.admin=a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean getAdmin(){
        return admin;
    }
    

    public void mostraMenu(){
        System.out.println("------------------------------------------");
        System.out.println("-1-         Visualizza Giocattoli");
        System.out.println("-2-         Compra Giocattoli");
        System.out.println("------------------------------------------");
    }

}
