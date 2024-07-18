import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        // In a HashMap, keys are Set elements and Values are List elements.
        // No two elements can have same key but can have same values.
        studentMap.put("Krishna", 12100438);
        studentMap.put("Anthony", 12100437);
        studentMap.put("Diwakar", 12101155);
        studentMap.put("Rebecca", 12101156);
        studentMap.put("Rebecca", 12101157); // This overrides the element ("Rebecca", 12101156)
        for (String std : studentMap.keySet()) {
            System.out.println(std + " : " + studentMap.get(std));
        }
    }
}
