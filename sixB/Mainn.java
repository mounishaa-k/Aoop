package LmsSixb;

public class Mainn {
    public static void main(String[] args) {
        
        Integer[] intArray = {2, 5, 1, 9, 4};
        ArrayOperations<Integer> intOperations = new ArrayOperations<>();
        System.out.println("Integer Array - Max: " + intOperations.findMax(intArray));
        System.out.println("Integer Array - Min: " + intOperations.findMin(intArray));

       
        Float[] floatArray = {3.4f, 1.2f, 6.7f, 2.9f};
        ArrayOperations<Float> floatOperations = new ArrayOperations<>();
        System.out.println("Float Array - Max: " + floatOperations.findMax(floatArray));
        System.out.println("Float Array - Min: " + floatOperations.findMin(floatArray));

        
        String[] strArray = {"apple", "orange", "banana", "pear"};
        ArrayOperations<String> strOperations = new ArrayOperations<>();
        System.out.println("String Array - Max: " + strOperations.findMax(strArray));
        System.out.println("String Array - Min: " + strOperations.findMin(strArray));

       
        Character[] charArray = {'c', 'a', 'z', 'k'};
        ArrayOperations<Character> charOperations = new ArrayOperations<>();
        System.out.println("Character Array - Max: " + charOperations.findMax(charArray));
        System.out.println("Character Array - Min: " + charOperations.findMin(charArray));
    }
}
