
/*
═ ║ ╔ ╗ ╚ ╝ ╠ ╣ ╦ ╩ ╬
Collection Framework: 

                                             <Collection> 
                                               ║ 
              ╔════════════════════════════════╬══════════════════════════════════╗ 
            <List>                           <Set>                              <Queue> 
              ║                                ║                                  ║ 
 ╔════════════╬═════════════╗         ╔════════╩════════╗                ╔════════╩════════╗ 
 ║            ║             ║         ║                 ║                ║                 ║ 
ArrayList    LinkedList    Vector    HashSet          <SortedSet>       PriorityQueue    <Deque> 
                            ║         ║                 ║                                  ║ 
                            ║         ║                 ║                           ╔══════╩══════╗ 
                           Stack     LinkedHashSet    <NavigableSet>               ArrayDeque    LinkedList 
                                                        ║ 
                                                        ║ 
                                                       TreeSet 
// <Interfaces> Classes
 */

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        // List
        Collection<Integer> arrlist = new ArrayList<>();
        // Insert elements
        arrlist.add(8);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(1);
        System.out.println("Array after insertion of elements : " + arrlist);
        System.out.println("Size of the array : " + arrlist.size()); // Prints size of array
        System.out.println("Removal of the element 3 : " + arrlist.remove(3)); // Removes the mensioned element and
                                                                               // returns true if it is removed.
        System.out.println("List after remove(3) : " + arrlist);
        System.out.println("Is the List containing the element 5 : " + arrlist.contains(5)); // Returns true if the
                                                                                             // element is present.
        System.out.println(arrlist.isEmpty()); // Returns true if List is Empty.
        System.out.println("Before clear() : " + arrlist);
        arrlist.clear(); // Void removes all the elements of array.
        System.out.println("After clear() : " + arrlist);
        arrlist.add(8);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(1);
        System.out.println("Array after insertion of elements : " + arrlist);
        arrlist.addAll(arrlist); // adds all the elements of the arguement list.
        System.out.println("Array after addAll(arrlist) : " + arrlist);
        System.out.println(arrlist.retainAll(arrlist)); // Removes all the elements other than the elements present in
                                                        // the arguement list.
        System.out.println("Array after retainAll(arrlist) : " + arrlist);
        arrlist.removeAll(arrlist); // Removes all the elements from the array that are present in the arguement
                                    // array.
        System.out.println("Array after removeAll(arrlist) : " + arrlist);
        System.out.println("ContainsAll() : " + arrlist.containsAll(arrlist)); // returns true if all the elements of
                                                                               // arguement array are
        // present if the array

        for (var a : arrlist) {
            System.out.println(a);
        }
        // Set // No index values, No duplicates, No sequence.
        System.out.println("\n\n\nSET\n\n\n");
        // HashSet
        Set<Integer> numHashSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            numHashSet.add(random.nextInt(100));
        System.out.println(numHashSet);
        Set<Integer> numTreeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++)
            numTreeSet.add(random.nextInt(100));
        System.out.println(numTreeSet);
        Iterator<Integer> treeSetIterator = numTreeSet.iterator();
        while (treeSetIterator.hasNext())
            System.out.println(treeSetIterator.next());

    }
}
