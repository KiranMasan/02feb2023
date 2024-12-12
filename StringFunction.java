public class StringFunction 
{
    public static void main(String[] args) 
    {
        String str = "Amity University Mumbai";
        System.out.println("Length of the string: " + str.length());
        System.out.println("String in upper case: " + str.toUpperCase());
        System.out.println("String in lower case: " + str.toLowerCase());
        String str2 = "    University   ";
        System.out.println("String after trimming: '" + str2.trim() + "'");
        System.out.println("Character at index 0: " + str.charAt(0));
    }
}
