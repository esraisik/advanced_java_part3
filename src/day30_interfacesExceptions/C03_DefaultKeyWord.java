package day30_interfacesExceptions;

public class C03_DefaultKeyWord {

    // bu class'ta gorunmeyen "default constructor" var

    int sayi;
    // sayi'ya bir deger ataması yapmadık
    //Java sayiya "default deger " olarak 0  ataması yapar

    public int a=24;
    int b = 45;
    // a'nın access modifier'i public
    // b'nin access modifier'i yazılmamıs yani "default access modifier"a sahiptir.
    // default int c=56;
    // access modifier olan "default" yazılmaz

    //public protected int d =67;
    // Illegal combination of modifiers: 'public' and 'protected'
    //bir class uyesine iki access modifier yazamayız

    public static void main(String[] args) {

    }

}
