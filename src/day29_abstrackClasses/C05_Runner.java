package day29_abstrackClasses;

import day23_dateTime_varargs.C05_Varargs;
import day27_Inheritance.C04_Kuslar;
import day27_Inheritance.C07_Kuslar;

public class C05_Runner {

    public static void main(String[] args) {

        C07_Kuslar kus1= new C07_Kuslar();
        kus1.cogalma(); // yumurtayla cogalır

        C05_Varargs obj =new C05_Varargs();

        C01_KuralciOlmayanParent kop1= new C01_KuralciOlmayanParent();
        kop1.method1();
        System.out.println(kop1.s);

        /*
            Abstract class'lar class oldukları için
            Constructor'a sahiptir

            AANNCCAAKKK abstract class'lar abstract method'lar barındırdğı için
            Java abstract class'lardan obje olusturulmasına izin vermez

            Cunku bu obje olusturulursa
            obje ile asagıdaki gibi abstract methotlar cagrılabilir
            AMMMAAAA abstract method'ların body'si olmadığından calısamazlar

         */
        // C03_KuralciParent kp1 = new C03_KuralciParent();
        // 'C03_KuralciParent' is abstract; cannot be instantiated
        // C03 Abstract bir class'dir ve bu class'dan obje olusturulamaz
        // kp1.method1();


        C03_KuralciParent kp1 = new C04_ChildOfKuralciParent();
        kp1.method1(); // C04 method1
        kp1.method2(); // C04 method2
        kp1.method5(); // C04 method2

        kp1.method3(); // Parent method3
        kp1.method4(); // Parent method4

    }
    // public abstract void abstractMethod();
    // Abstract method in non-abstract class
    // concrete bir class'da abstract method olmaz
}
