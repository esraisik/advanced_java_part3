package day25_encaptulation_inheritance;

public class C06_Runner {

    public static void main(String[] args) {

        /*

              Bir variable'ı public yapmak ile
              private yapıp getter ve setter'i birlikte olusturmak
              arasındaa işlevsel olarak farketmez

              yapılan işleme VURGU yapıldıgından
              bazı developerlar
              public yapmak yerine bu yontemi tercih ederler


         */


        C05_getterSetterBirlikteKullanma obj = new C05_getterSetterBirlikteKullanma();
        System.out.println(obj.sayiPublic); //10
        obj.sayiPublic = 20;

        System.out.println(obj.getSayiPrivate()); //100

        obj.setSayiPrivate(200);

        System.out.println(obj.getSayiPrivate()); //200


    }
}
