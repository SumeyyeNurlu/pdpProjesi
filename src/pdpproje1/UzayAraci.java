import java.util.Date;

public class UzayAraci {
    private String araciAdi;
    private String cikisGezegeni;
    private String varisGezegeni;
    private Date cikisTarihi;  // Çıkış tarihi
    private int mesafe;  // Mesafe (saat olarak)

    // Yapıcı metod (Constructor)
    public UzayAraci(String araciAdi, String cikisGezegeni, String varisGezegeni, Date cikisTarihi, int mesafe) {
        this.araciAdi = araciAdi;
        this.cikisGezegeni = cikisGezegeni;
        this.varisGezegeni = varisGezegeni;
        this.cikisTarihi = cikisTarihi;
        this.mesafe = mesafe;
    }

    // Getter metodları
    public String getAraciAdi() {
        return araciAdi;
    }

    public String getCikisGezegeni() {
        return cikisGezegeni;
    }

    public String getVarisGezegeni() {
        return varisGezegeni;
    }

    public Date getCikisTarihi() {
        return cikisTarihi;
    }

    public int getMesafe() {
        return mesafe;
    }

    // toString metodu (Ekrana yazdırmak için)
    @Override
    public String toString() {
        return "Uzay Araci: " + araciAdi + ", Cikis Gezegeni: " + cikisGezegeni +
               ", Varis Gezegeni: " + varisGezegeni + ", Cikis Tarihi: " + cikisTarihi +
               ", Mesafe: " + mesafe + " saat";
    }
}
