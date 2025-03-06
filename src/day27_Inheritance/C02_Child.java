package day27_Inheritance;

      /*
          Java bir variable'ın degerini bulmak için
          - once içinde bulunduğu scope'a bakar
          -scope^ta yoksa class level'a bakar.
          -class level'da da yoksa parent class(lar)'a bakar
          ve ilk bulduğu degeri (en güncel) kullanır

          this. ve super. kullanıldı ise
          Java aramaya baslama noktasını degistirir.
          this. denilmisse aramaya class level'dan
          super. denilmisse aramaya parent class'tan baslar
          ve ilk bulduğunu kullanır.


         Java aramaya basladiktan sonra hep yukari dogru cikar
         bulursa kullanir bulamazsa CTE verir (geriye donuk arama yapmaz)



       */


public class C02_Child extends C01_Parent {

    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public static void main(String[] args) {
        C02_Child obj = new C02_Child();
        obj.method1();

    }

    public void method1() {
        String str = "Child class method";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(s);// Anil
        System.out.println(this.s); //Anil
        System.out.println(super.s); //Anil

        System.out.println(k); //Ahmet
        System.out.println(this.k); //Ahmet
        //System.out.println(super.k); // CTE

        System.out.println(z); // Oguzhan
        //System.out.println(this.z); //CTE
        //System.out.println(super.z); //CTE

        System.out.println(t); //Cansu
        System.out.println(this.t);// Hamza
        //System.out.println(super.t); // CTE

        System.out.println(str); // Child class method
        System.out.println(this.str); //Child class
        System.out.println(super.str); // Java candir


    }


}
