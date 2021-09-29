package guiaplikacijazaelektronskovodjenjekafica;

public class Pica {
    private String ime, vrstaPica;
    private int id, cena;

    public Pica() {
    }

    public Pica(String ime) {
        this.ime = ime;
    }
    public Pica(int id, String ime, int cena){
        this.id=id;
        this.ime=ime;
        this.cena=cena;
    }
    public Pica(int id, String ime, int cena, String vrstaPica) {
        this.ime = ime;
        this.vrstaPica = vrstaPica;
        this.id = id;
        this.cena = cena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getVrstaPica() {
        return vrstaPica;
    }

    public void setVrstaPica(String vrstaPica) {
        this.vrstaPica = vrstaPica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Pica{" + "ime=" + ime + ", vrstaPica=" + vrstaPica + ", id=" + id + ", cena=" + cena + '}';
    }
    
}
