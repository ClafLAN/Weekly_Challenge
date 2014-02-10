package clafLAN.Spring2014;

import java.util.Arrays;

/**Original Question: Given 2 pre-sorted lists, write a function that merges 
 * both lists and keeps this new list sorted.
 * E.g. Given [1,3,5,7,9] and [2,4,6,8,10], your function should return 
 * [1,2,3,4,5,6,7,8,9,10].
 * 
 * @author scipio
 */
public class MergeList {
 
    public static <T extends Comparable> T[] merge(T[] a, T[] b) {
        // Return Array and Index Tracking Variables initialized here.
        Comparable[] returnArray = new Comparable[a.length + b.length];
        int aIndex = 0, bIndex = 0, returnIndex = 0;
        
        // Main part of Merge Algorithm - based on MergeSort.
        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                returnArray[returnIndex++] = a[aIndex];
                aIndex++;
            } else {
                returnArray[returnIndex++] = b[bIndex];
                bIndex++;
            }
        }
        
        // Determine which array is not completely empty and copy its contents
        // to the returnArray.
        while (aIndex < a.length)
            returnArray[returnIndex++] = a[aIndex++];
        while (bIndex < b.length)
            returnArray[returnIndex++] = b[bIndex++];
        
        // Return the returnArray after casting it back to its original Type.
        return (T[]) returnArray;
    }
    
    public static void main(String[] args) {
        Integer[] aInteger = {1,3,5,7,9};
        Integer[] bInteger = {2,4,6,8,10};
        
        Character[] aCharacter = {'a','c','e','g','i'};
        Character[] bCharacter = {'b','d','f','h','j'};
        
        String[] aString = {"How","is","this","even","possible?"};
        String[] bString = {"It's","the","power","of","generics!"};
        
        System.out.println("~~~Testing merge algorithm.\n");
        
        System.out.println("---Integer Arrays:");
        System.out.println("   aInteger: " + Arrays.toString(aInteger));
        System.out.println("   bInteger: " + Arrays.toString(bInteger));
        System.out.print("   Merged: ");
        System.out.println(Arrays.toString(merge(aInteger, bInteger)));
        
        System.out.println("---Character Arrays:");
        System.out.println("   aCharacter: " + Arrays.toString(aCharacter));
        System.out.println("   bCharacter: " + Arrays.toString(bCharacter));
        System.out.print("   Merged: ");
        System.out.println(Arrays.toString(merge(aCharacter, bCharacter)));
        
        System.out.println("---String Arrays:");
        System.out.println("   aString: " + Arrays.toString(aString));
        System.out.println("   bString: " + Arrays.toString(bString));
        System.out.print("   Merged: ");
        System.out.println(Arrays.toString(merge(aString, bString)));
    }
}
