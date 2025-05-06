package day35_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C07_DahaKarmasikNestedMap {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }
         */

        Map<String, Object> rezervasyonMap =new HashMap<>();

        //once içerdeki innermap'i olusturalım
        Map<String,String> bookingdatesValueMap = new HashMap<>();

        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        //ana rezervasyon map'ine tum degerleri ekleyelim
        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);
        rezervasyonMap.put("bookingdates",bookingdatesValueMap);
        rezervasyonMap.put( "additionalneeds","wi-fi");

        System.out.println(rezervasyonMap);
        /*
                {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                 bookingdates= {
                                 checkin=2024-07-21,
                                 checkout=2024-08-10
                                 },
                  totalprice=500,
                  depositpaid=false,
                  lastname=Bulut}

         */


        // rezevasyonda fiyat 300'den buyuk mu?

        int fiyat =(Integer) rezervasyonMap.get("totalprice");

        System.out.println(fiyat > 300); // true

        // rezevasyon fiyatı 400'den buyukse % 10 indirim yapın

        if(fiyat > 400) {
            fiyat=fiyat*90/100;
            rezervasyonMap.put("totalprice",fiyat*90/100);
        }
        System.out.println(rezervasyonMap);

        // Kullanıcının ismi A ile baslıyorsa
        // fiyatta % 10 ekstra indirim yapın

        if (   (  (String)rezervasyonMap.get("firstname")).startsWith("A")           ) {
            fiyat=fiyat*90/100;
            rezervasyonMap.put("totalprice",fiyat*90/100);
        }


        // additionalneeds "breakfast" değilse 20 $ daha indirim yapın

        rezervasyonMap.get("additionalneeds");

        if ( rezervasyonMap.get("additionalneeds").equals("breakfast")) {
             fiyat=fiyat-20;
             rezervasyonMap.put("totalprice",fiyat=fiyat-20);


        }
        System.out.println(rezervasyonMap);

        // checin tarihini yazdırın

        System.out.println(rezervasyonMap.get("checkin")); // null

        // rezervasyon map!inin içinde direkt checkin yok
        // checkin "bookingdates" key'ine ait olan value olan map'in içinde

        System.out.println(((Map<String, String>) rezervasyonMap.get("bookingdates")).get("checkin"));
        //2014-07-21

        System.out.println(((Map<String, String>) rezervasyonMap.get("bookingdates")).get("checkout"));

    }
}
