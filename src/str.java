
public class str {
    public static void main(String[] args) {
// String literals stored in the string pool
        String str1 = "Java";
        String str2 = "Java";
// Checking if str1 and str2 point to the same object
        System.out.println("str1 == str2: " + (str1 = str2)); // true, because bot
// Strings created with 'new' - stored in heap memory outside the string po
        String str3 = new String ( "Java");
        String str4 = new String( "Java");
// Checking if str3 and str4 point to the same object
        System.out.println("str3 == str4: " + (str3 == str4)); // false, because 'n
// Interning str3
        String str5 = str3.intern();
// Checking if str1 and str5 point to the same object
        System.out.println("str1 == str5:" + (str1 == str5));
// Demonstrating the effect of interning on memory allocation
                String str6 = new String ( "Java").intern();
// Checking if stró is the same as str1
        System.out.println("str1 == str6: " + (str1 == str6)); // true, stró is int
    }
}