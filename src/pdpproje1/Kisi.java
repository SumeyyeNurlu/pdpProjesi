
public class Kisi {
    /// Değişkenler
    private String isim;
    private int yas;
    private int kalanOmur;
    private String uzayAraci;

    /// Constructor
    public Kisi(String isim,int yas,int kalanOmur,String uzayAraci) {
        //this olmasaydı, metot içindeki isim parametresi ile sınıfın isim değişkeni arasında çakışma olurdu
        this.isim = isim;
        this.yas = yas;
        this.kalanOmur = kalanOmur;
        this.uzayAraci = uzayAraci;
    }


    /// Getter metodları dosyadan okuma için
    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public int getKalanOmur() {
        return kalanOmur;
    }

    public String getUzayAraci() {
        return uzayAraci;
    }



    // ekrana yazdırma metodu toString

    //override ne işe yarar: çok biçimlilik) kullanarak alt sınıfların üst sınıftaki metodları kendi ihtiyaçlarına göre değiştirmesine olanak tanır
    @Override
    public String toString() {
        return "Isim: " + isim + "   Yas: " + yas + "    Kalan Omur: " + kalanOmur + "   Uzay Araci: " + uzayAraci; 
}
}