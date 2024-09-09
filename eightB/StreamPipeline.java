package b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeline {
    public static void main(String[] args) {
        List<Integer> temperatures = Arrays.asList(30, 45, 60, 75, 90, 105, 120);

        List<Integer> processedTemperatures = temperatures.stream()
                .filter(temp -> temp % 2 == 0)  
                .map(temp -> temp * 2)          
                .collect(Collectors.toList());  

        
        System.out.println("Processed temperatures: " + processedTemperatures);
    }
}
