package day25_encaptulation_inheritance;

public class C02_Runner {

    public static void main(String[] args) {
      /*

           Access Modifier kullanarak
           bir variable'a ulaşabiliyorsak
           o variable'i hem kullanabilir
           hem de o variable'a deger atayabiliriz

       */

        // static variabla'lara ulasmak için
        // obje olusturmaya gerek olmaz,
        // static variabl'ların diğer adı class variable'dır
        //class ismi ile birlikte kullanılabilirler

        // System.out.println(C01.strPriS)
        // private ne yaparsaniz yapin class dısından kullanılamz


        System.out.println(C01.strDefS);
        System.out.println(C01.strProS);
        System.out.println(C01.strPubS);

        C01.strDefS = "Yeni class def";
        C01.strProS = "Yeni class protected";
        C01.strPubS = "Yeni class public";


        // static olmayan variable'lara ulasabilmek için
        // C01 class'ından obje olusturmalıyız
        C01 obj = new C01();

        //System.out.println(obj.strPri);
        System.out.println(obj.strDef);
        System.out.println(obj.strPro);
        System.out.println(obj.strPub);


        obj.strDefS = "Yeni class def";
        obj.strProS = "Yeni class protected";
        obj.strPubS = "Yeni class public";


    }
}
