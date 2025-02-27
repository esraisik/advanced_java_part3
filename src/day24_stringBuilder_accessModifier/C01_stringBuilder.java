package day24_stringBuilder_accessModifier;

public class C01_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        //16 karakterleri kapasiteye sahip BOŞ bir String Builder oluşturduk


        System.out.println("sb1 =" + sb1); // hiçlik
        System.out.println("sb1 in uzunluğu =" + sb1.length()); // 0
        System.out.println("sb1 in kapasitesi =" + sb1.capacity()); // 16
        System.out.println("----------------------------------------");


        StringBuilder sb2 = new StringBuilder(7);
        // 7 karakter kapasiteye sahip bir String builder olusturdu


        System.out.println("sb2=" + sb2);// hiçlik
        System.out.println("sb2'nin uzunluğu=" + sb2.length());//0
        System.out.println("sb2'nin kapasitesi=" + sb2.capacity());// 7

        // buarada 7 karakterli bir girişe kadar sorun olmaz
        // fakat 7'den 1 tane bile fazla gerekirse
        // kapasite direkt (eskiKapasite*2) +2 l-kadar yapılır

        System.out.println("=======================================");

        sb2.append("Hamza");

        System.out.println("sb2=" + sb2); // Hamza
        System.out.println("sb2'nin uzunluğu=" + sb2.length()); //5
        System.out.println("sb2'nin kapasitesi=" + sb2.capacity()); //7


        System.out.println("=======================================");


        StringBuilder sb3 = new StringBuilder(" DOĞRU");


        System.out.println("sb3=" + sb3); //  DOĞRU
        System.out.println("sb3'nin uzunluğu=" + sb3.length()); //6
        System.out.println("sb3'nin kapasitesi=" + sb3.capacity()); //22

        // Java bu şekilde oluşturulan SB'lerde 16+length kadarlık bie SB olusturur.


        System.out.println("=======================================");


        StringBuilder sb4 = new StringBuilder("Java");

        System.out.println("sb4=" + sb4); //  Java
        System.out.println("sb4'nin uzunluğu=" + sb4.length()); //4
        System.out.println("sb4'nin kapasitesi=" + sb4.capacity()); //20

        sb4.append(" ögrenen pişman olmaz");

        System.out.println("sb4=" + sb4); //  Java ögrenen pişman olmaz
        System.out.println("sb4'nin uzunluğu=" + sb4.length()); //25
        System.out.println("sb4'nin kapasitesi=" + sb4.capacity()); //42

        long tcNO = 12356448254L;
        System.out.println("tcNO =" + (tcNO + 1));

        StringBuilder tcNOsb = new StringBuilder(11);
        tcNOsb.append("25698756984");
        System.out.println("tcNo=" + tcNOsb);


        StringBuilder sb5 = new StringBuilder();
        sb5.append("Java");
        String str = "Güzeldir, İyidir";

        sb5.append(str, 10, 16);
        System.out.println(sb5);


    }
}