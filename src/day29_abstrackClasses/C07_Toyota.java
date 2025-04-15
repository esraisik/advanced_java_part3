package day29_abstrackClasses;

public abstract class C07_Toyota extends C06_Araba {

    // Class 'C07_Toyota' must either be declared abstract
    // or implement abstract method 'motor()' in 'C06_Araba'

    /*

        Bir class olusturdugumuzda
        abstract olup olmamasına
        o class'tan obje olusturulup-olusturulmayacagına göre karar veririz

        Toyoya markasına sahip ama modeli olmayan
        bir obje OLMAYACAGI için
        bu class'in abstract olması daha dogru olacaaktır

        Abstract bir parent'in abstract olan childi
        parent class'taki abstract method'ları
        implement etmek ZORUNDA DEGİLDİR.

         AMMMA isterse klasik inheritance kurallari cercevesinde
        parent class'daki abstract method'lari override edebilir

     */


    //public abstract void motor();
    //parent class'taki abstract methodu tekrar yazmaya gerek yok
    // ya yeni kurallar koyar
    // veya var olan kuralları concrete yapıp kendısıne uyarlar

    public void motor(){
        System.out.println("Toyota araclar toyota VVTI motoru kullanır");
    }
    public void guvenlik (){
        System.out.println("Toyota araclar NCAP'e uyar");
    }
    public abstract void sesSistemi();

    public abstract void direksiyor();

    public void sunroof(){
        System.out.println("Toyota araclarda ozel toyota sunroof kullanilir");
    }
}
