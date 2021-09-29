
package guiaplikacijazaelektronskovodjenjekafica;

public class Korisnik {
     private String ime, prezime, password, email;
     private int id;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String password, String email) {
        this.ime = ime;
        this.prezime=prezime;
        this.password = password;
        this.email = email;
    }

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "ime=" + ime + ", prezime=" + prezime + ", password=" + password + ", email=" + email + ", id=" + id + '}';
    }

    
 
}