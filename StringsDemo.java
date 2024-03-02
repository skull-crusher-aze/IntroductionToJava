public class Main {
    public static void main(String[] args) {
        String sms = "Bu gun hava cox qesendi";
        System.out.println(sms.length()); // Length of String
        System.out.println(sms.charAt(4)); //5th element of String
        System.out.println(sms.concat(". URAAAA!!")); // Concatenation
        System.out.println(sms.startsWith("B")); // Is it start with "B"? (True)
        System.out.println(sms.endsWith(".")); // Is it start with "."? (False)
        char[] xarakterler = new char[5];
        sms.getChars(0,5,xarakterler,0);
        System.out.println(xarakterler); // Getting characters 0 to 5
        System.out.println(sms);
        System.out.println(sms.indexOf('e')); // Finds index of e in string
        System.out.println(sms.lastIndexOf('e')); // Finds Last index of e in string
        //============================================================
        System.out.println(sms.replace(" ","-")); //replaces all characters with a new character
        System.out.println(sms.substring(2,5)); // cutting string to substring
        for(String i : sms.split(" ")){ // splitting a string to substrings by a character
            System.out.println(i);
        }
        System.out.println(sms.toLowerCase()); // all char to lower
        System.out.println(sms.toUpperCase()); // all char to upper
        System.out.println(sms.trim()); //deleting spaces in start and end
    }
}
