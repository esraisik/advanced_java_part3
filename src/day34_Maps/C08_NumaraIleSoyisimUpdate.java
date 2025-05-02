package day34_Maps;

public class C08_NumaraIleSoyisimUpdate extends MapDepo {

    public static void main(String[] args) {

        // ogrenci map'inde numarası ve yeni soyismi verilen ogrencinin
        // eski soyismin yerine yeni soyismi kaydedin

        int ogrenciNo=102;
        String yeniSoyisim= "Kaya";

        // once ogrencinin eski value'sunu alalım

        String eskiValue =ogrenciMap.get(102); // "Veli-Cem-10-K-TM"

        // Value birleşik bilgilerden olusuyor,
        // soyisme ulasmak ve update etmek için eski value'yu split etmemiz gerekir

        String [] eskiValueArr = eskiValue.split("-");
        // [Veli, Cem, 10, K, TM]

        //artık yeni soyismi array'e atayabiliriz

        eskiValueArr[1]= yeniSoyisim;
        // [Veli, Kaya, 10, K, TM]

        String yeniValue= String.join("-",eskiValueArr); //"Veli-Kaya-10-K-TM"

        ogrenciMap.put(ogrenciNo,yeniValue);

        System.out.println(ogrenciMap);









    }
}
