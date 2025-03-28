import java.util.Date;

public class Gezegen {
    private String gezegenAdi;
    private int gununSaatSayisi;
    private Date gezegenTarihi;

    // Yapıcı metod (Constructor)
    public Gezegen(String gezegenAdi, int gununSaatSayisi, Date gezegenTarihi) {
        this.gezegenAdi = gezegenAdi;
        this.gununSaatSayisi = gununSaatSayisi;
        this.gezegenTarihi = gezegenTarihi;
    }

    // Getter metodları
    public String getGezegenAdi() {
        return gezegenAdi;
    }

    public int getGununSaatSayisi() {
        return gununSaatSayisi;
    }

    public Date getGezegenTarihi() {
        return gezegenTarihi;
    }

    // toString metodu (Ekrana yazdırmak için)
    @Override
    public String toString() {
        return "Gezegen: " + gezegenAdi + ", Gunun Saat Sayisi: " + gununSaatSayisi + ", Tarih: " + gezegenTarihi;
    }
}
