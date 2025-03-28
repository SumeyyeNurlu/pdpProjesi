// DosyaOkuma.java
import java.io.*;//Giriş/Çıkış akışlarını ve dosya işlemlerini gerçekleştirme
import java.util.ArrayList;// Liste oluşturma ve yönetme işlemleri için
import java.util.List;// Liste oluşturma ve yönetme işlemleri için
import java.text.SimpleDateFormat;
import java.util.Date;// Tarih ve saat işlemleri için

public class DosyaOkuma {
    // Kişileri oku
    public static List<Kisi> kisileriOku(String dosyaAdi){
        List<Kisi> kisiler = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parcalar = line.split("#"); // Veriyi # ile ayır

                if (parcalar.length == 4) { // Format doğru mu kontrol etmek için
                    String isim = parcalar[0];
                    int yas = Integer.parseInt(parcalar[1]);
                    int kalanOmur = Integer.parseInt(parcalar[2]);
                    String uzayAraciAdi = parcalar[3];

                    Kisi kisi = new Kisi(isim, yas, kalanOmur, uzayAraciAdi);
                    kisiler.add(kisi);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hata: " + dosyaAdi + " bulunamadı!");
        } catch (IOException e) {
            System.out.println("Hata: " + dosyaAdi + " okunurken bir sorun oluştu!");
        } catch (NumberFormatException e) {
            System.out.println("Hata: Sayısal değer dönüştürülürken hata oluştu!");
        }

        return kisiler;
    }


    // Uzay araçlarını oku
    public static List<UzayAraci> araclariOku(String dosyaAdi) {
        List<UzayAraci> araclar = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parcalar = line.split("#");

                if (parcalar.length == 5) {
                    String araciAdi = parcalar[0];
                    String cikisGezegeni = parcalar[1];
                    String varisGezegeni = parcalar[2];
                    Date cikisTarihi = dateFormat.parse(parcalar[3]);
                    int mesafe = Integer.parseInt(parcalar[4]);

                    UzayAraci uzayAraci = new UzayAraci(araciAdi, cikisGezegeni, varisGezegeni, cikisTarihi, mesafe);
                    araclar.add(uzayAraci);
                } else {
                    System.out.println("Hata: Satırdaki veri formatı hatalı!");
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hata: " + dosyaAdi + " bulunamadı!");
        } catch (IOException e) {
            System.out.println("Hata: " + dosyaAdi + " okunurken bir sorun oluştu!");
        } catch (Exception e) {
            System.out.println("Hata: Veri işlenirken bir sorun oluştu!");
        }

        return araclar;
    }

     // Gezegenleri oku
    public static List<Gezegen> gezegenleriOku(String dosyaAdi) {
        List<Gezegen> gezegenler = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parcalar = line.split("#");

                if (parcalar.length == 3) {
                    String gezegenAdi = parcalar[0];
                    int gununSaatSayisi = Integer.parseInt(parcalar[1]);
                    Date gezegenTarihi = dateFormat.parse(parcalar[2]);

                    Gezegen gezegen = new Gezegen(gezegenAdi, gununSaatSayisi, gezegenTarihi);
                    gezegenler.add(gezegen);
                } else {
                    System.out.println("Hata: Satırdaki veri formatı hatalı!");
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hata: " + dosyaAdi + " bulunamadı!");
        } catch (IOException e) {
            System.out.println("Hata: " + dosyaAdi + " okunurken bir sorun oluştu!");
        } catch (Exception e) {
            System.out.println("Hata: Veri işlenirken bir sorun oluştu!");
        }

        return gezegenler;
    }


    public static void main(String[] args) {

        List<Kisi> kisiler = kisileriOku("Kisiler.txt");
        // Okunan kişileri ekrana yazdır
        for (Kisi k : kisiler) {
            System.out.println(k);
        }


        List<UzayAraci> araclar = araclariOku("Araclar.txt");
        // Okunan araçları ekrana yazdır
        for (UzayAraci u : araclar) {
            System.out.println(u);
        }

        List<Gezegen> gezegenler = gezegenleriOku("Gezegenler.txt");
        // Okunan gezegenleri ekrana yazdır
        for (Gezegen g : gezegenler) {
            System.out.println(g);
        }
}
}