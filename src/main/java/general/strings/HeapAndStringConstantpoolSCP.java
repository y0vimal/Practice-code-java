package general.strings;

public class HeapAndStringConstantpoolSCP {

    public static void main(String[] args){

        String s1 = new String("Hello World"); // s1 is created in Heap & "Hello World" object is created in SCP
        String s2 = new String("Hello World"); // s2 is created in Heap & "Hello World" is already exist in scp

        System.out.println(s1);
        System.out.println(" s1 == s2  =? " + (s1 == s2)); // false

        String s3 = "Hello World";  // s3 points to already existing object in scp, no new Objet is created

        System.out.println(" s1 == s3  ? " + (s1 == s3)); // false

        String s4 = "Hello World";  // s4 points to already existing object in scp, no new Objet is created

        System.out.println(" s3 == s4  ? " + (s3 == s4)); // true

        String s5 = "Hello" + " World"; // s5 points to already existing object in scp, no new Objet is created not even for "Hello" and "World" as compiler
                                        // executes it at compile time and checks of "Hello World" which already exists in SCP

        System.out.println(" s3 == s5  ? " + (s3 == s5)); // true

        String s6 = "Hello ";  // "Hello" is created in SCP

        String s7 = s6 + "World";  // every variable is interpreted at run time and at run time always new obejct is created in Heap. So S7 will be created in heap.

        System.out.println(" s3 == s7  ? " + (s3 == s7)); // false

        final String s8 = "Hello "; // "hello" already exist

        String s9 = s8 + "World"; // s8 is constant so copiler will perfrom the concatinate operation at compile time and check for "Hello World" which
                                  // already exist so no new object is cretaed.

        System.out.println(" s3 == s9  ? " + (s3 == s9)); // true







    }
}
