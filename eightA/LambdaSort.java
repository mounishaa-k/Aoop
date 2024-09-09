package a;

import java.util.ArrayList;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Hyderabad");
        cityList.add("Pune");
        cityList.add("Banglore");
        cityList.add("Delhi");

        
        cityList.sort((c1, c2) -> c2.compareTo(c1));

        
        System.out.println("Sorted city list in descending order:");
        cityList.forEach(System.out::println);
    }
}
