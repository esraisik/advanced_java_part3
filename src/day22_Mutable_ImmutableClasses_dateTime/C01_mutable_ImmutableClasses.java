package day22_Mutable_ImmutableClasses_dateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_mutable_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java candir"; // String class immutable

        str.toUpperCase();
        str.substring(5);

        System.out.println(str); // Java candir

        // immutable Class'larda  method'larla yapılan degisiklikler KALICI OLMAZ

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu", "Asuman", "Hamza"));

        System.out.println(isimler); // Cansu, Asuman, Hamza

        isimler.set(0, isimler.get(0).toUpperCase());
        isimler.add("İpek");
        isimler.remove(1);

        System.out.println(isimler); // [CANSU, Hamza, Ipek]

        // mutable Class'larla yapılan degisiklikler KALICI OLUR

    }
}
