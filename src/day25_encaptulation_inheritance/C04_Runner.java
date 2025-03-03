package day25_encaptulation_inheritance;

public class C04_Runner {

    public static void main(String[] args) {

        C03_EncapsuleRapor obj = new C03_EncapsuleRapor();
        //  satıs tutari variable'ının degerini yazdırın
        //System.out.println(obj.satisTutari);

        obj.setSatisTutari(100);
        // System.out.println(obj.setSatisTutari(100));
        // setSatisTutari() void oldugundan yazdırılamaz

        obj.setSatisTutari(200);
        obj.setSatisTutari(200);
        obj.setSatisTutari(500);

        //toplam satıs tutarına deger atayın
        // obj.toplamSatisTutari=5000; private oldugundan
        //deger ataması yapılamıyor

        //obj.getToplamSatisTutari()=500;
        // method bize int bir deger donduruyor,
        // variable olmayan bir seye atama yapılamaz

        System.out.println(obj.getToplamSatisTutari()); //1000


    }
}
