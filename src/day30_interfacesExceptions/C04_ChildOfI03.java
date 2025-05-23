package day30_interfacesExceptions;

public class C04_ChildOfI03 implements I03_InterfacedeBodysiOlanMethodOlusturma{


    @Override
    public void method1() {

    }

    public static void main(String[] args) {


        /*
            I03'de
            method1==> abstract method
            method2==> default keyword kullanmıs body'si olan methood
            method3==> static keyword kullanmıs body'si olan methood

            method2 ve method3'u implement etmek zorunda değiliz

            default ve static keyword kullnamak arasındaki fark erişim yontemidir.

             static olarak isaretlenen method'a static yontemle ulasiriz
            ama default olarak isaretlenen method icin obje olusturmaliyiz


         */

        I03_InterfacedeBodysiOlanMethodOlusturma.method3();

       // I03_InterfacedeBodysiOlanMethodOlusturma.method2();
       //  Non-static method 'method2()' cannot be referenced from a static context

        C04_ChildOfI03 obj1= new C04_ChildOfI03();
        I03_InterfacedeBodysiOlanMethodOlusturma obj2= new C04_ChildOfI03();

        obj1.method2();
        obj2.method2();
    }
}
