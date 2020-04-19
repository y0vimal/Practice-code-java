package main.strings;

public class StringPractice {
    public static void main(String[] args){
        /*
        * immutable string class
        * */
        String str = new String("Hello");
        str.concat("World!");
        System.out.println(str);

        /*
        * Mutable StringBuffer class
        * */

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");
        System.out.println(sb);

        /*
        * " == " versus " equals() method "
        * */

        /*
        * for String class
        * */

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println("s1 == s2 = ? " + (s1 == s2));
        System.out.println("s1.equals(s2) = ? " + s1.equals(s2));

        /*
        * for StringBuffer class
        * */

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("sb1 == sb2 = ? " + (sb1 == sb2));
        System.out.println("sb1.equals(sb2) = ? " + sb1.equals(sb2));

        /*
        * For StringBuilder class
        * */

        StringBuilder sbuild1 = new StringBuilder("Hello");
        StringBuilder sbuild2 = new StringBuilder("Hello");

        System.out.println("sbuild1 == sbuild2 = ? " + (sbuild1 == sbuild2));
        System.out.println("sbuild1.equals(sbuild2) = ? " + sbuild1.equals(sbuild2));

    }
}
