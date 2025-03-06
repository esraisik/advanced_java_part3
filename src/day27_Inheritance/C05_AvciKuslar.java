package day27_Inheritance;

public class C05_AvciKuslar extends C04_Kuslar {

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        /*
            String Jav'nın olusturduğu bie class'tır
            ve AYNI ZAMANDA o class'tan olusturulan objeler için
            DATA TURU'dür.

            aynı sey Java'daki tum class'lar için gecerlidir.

            C05_AvciKuslar bizim için "olusturdugumuz bir class"tır.
            ama aynı zamanda avci objesi için bir data turudur.

             C04_Kuslar bizim için "olusturdugumuz bir class"tır.
            ama aynı zamanda avciKus objesi için bir data turudur.

             C03_Hayvanlar bizim için "olusturdugumuz bir class"tır.
            ama aynı zamanda avciKusHayvani objesi için bir data turudur.
         */


        /*
               Bir objenin hangi class'tan olusturuldugunu
               Constructor belirler

               AMMAA istersek data turu olarak
               parent class secilebilir

               EGER özellikler variable olarak olusturulmussa
               DATA TURU belirleyicidir

         */


        //Hayvanlar class'ından bier obje olusturun

        C03_Hayvanlar hayvan1 = new C03_Hayvanlar();
        System.out.println(hayvan1.omur); // H yasar ve olurler
        System.out.println(hayvan1.solunum); // H nefes alirlar
        System.out.println(hayvan1.cogalma); // H cogalirlar
        //System.out.println(hayvan1.kanat); // Hayvanlar class'ında yok CTE
        System.out.println(hayvan1.hareket); // H hareket ederler
        System.out.println(hayvan1.beslenme); // H beslenir
        //System.out.println(hayvan1.gaga); // Hayvanlar class'ında yok CTE
        //System.out.println(hayvan1.pence); // Hayvanlar Class'ında yok CTEani


        // Kuslar class'ından bie obje olusturun

        C03_Hayvanlar kusHayvani = new C04_Kuslar();
        System.out.println(kusHayvani.omur); // H yasar ve olurler
        System.out.println(kusHayvani.solunum); // H nefes alirlar
        System.out.println(kusHayvani.cogalma); // H cogalirlar
        //System.out.println(kusHayvani.kanat); // Hayvanlar class'ında yok CTE
        System.out.println(kusHayvani.hareket); // H hareket ederler
        System.out.println(kusHayvani.beslenme); // H beslenir
        //System.out.println(kusHayvani.gaga); // Hayvanlar class'ında yok CTE
        //System.out.println(kusHayvani.pence); // Hayvanlar Class'ında yok CTE


        C04_Kuslar kus = new C04_Kuslar();
        System.out.println(kus.omur); // H yasar ve olurler
        System.out.println(kus.solunum); //  K akcigerle nefes alirlar
        System.out.println(kus.cogalma); // K yumurtayla cogalirlar
        System.out.println(kus.kanat); // K kanatlıdırlar
        System.out.println(kus.hareket); // H hareket ederler
        System.out.println(kus.beslenme); // H beslenir
        System.out.println(kus.gaga); // K gagalari vardir
        //System.out.println(kus.pence); // Kuslar ve Hayvanlar Class


        C03_Hayvanlar hayvanKartal = new C05_AvciKuslar();

        System.out.println(hayvanKartal.omur); // H yasar ve olurler
        System.out.println(hayvanKartal.solunum); // H nefes alirlar
        System.out.println(hayvanKartal.cogalma); // H cogalirlar
        //System.out.println(hayvanKartal.kanat); // Hayvanlar class'ında yok CTE
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenir
        //System.out.println(hayvanKartal.gaga); // Hayvanlar class'ında yok CTE
        //System.out.println(hayvanKartal.pence); // Hayvanlar Class'ında yok CTE


        C04_Kuslar kusKartal = new C05_AvciKuslar();

        System.out.println(kusKartal.omur); // H yasar ve olurler
        System.out.println(kusKartal.solunum); //  K akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusKartal.kanat); // K kanatlıdırlar
        System.out.println(kusKartal.hareket); // H hareket ederler
        System.out.println(kusKartal.beslenme); // H beslenir
        System.out.println(kusKartal.gaga); // K gagalari vardir
        //System.out.println(kusKartal.pence); // Kuslar ve Hayvanlar Class'ında yok CTE


        C05_AvciKuslar avciKartal = new C05_AvciKuslar();

        System.out.println(avciKartal.omur); // H yasar ve olur
        System.out.println(avciKartal.solunum); //  K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKartal.kanat); // K kanatlıdırlar
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.gaga); // A sivri gagali
        System.out.println(avciKartal.pence); // A pencelidir


    }

}
