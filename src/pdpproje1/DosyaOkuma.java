
import java.io.*;//Giriş/Çıkış akışlarını ve dosya işlemlerini gerçekleştirme
import java.util.ArrayList;// Liste oluşturma ve yönetme işlemleri için
import java.util.List;// Liste oluşturma ve yönetme işlemleri için


public class DosyaOkuma {

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
    public static void main(String[] args) {
        List<Kisi> kisiler = kisileriOku("Kisiler.txt");

        // Okunan kişileri ekrana yazdır
        for (Kisi k : kisiler) {
            System.out.println(k);
        }
    }

}
