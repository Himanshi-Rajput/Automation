package Conceptofjava;

public class StringMethods {

    public static void main(String[] args) {

        String str1 = "Hi Himanshi here";

        //Length of the String
        System.out.println("The Length of the String is: "+str1.length());

        //Character at Specific index
        System.out.println("Character at Specific Index: "+ str1.charAt(3));

        //Concatenation
        String str2= " How are you guys?";
        System.out.println("I am concatenating 2 strings: "+ str1.concat(str2));

        //Substring
        System.out.println("Substring from index 7 to end "+ str1.substring(3));
        System.out.println("Substring from index 2 to 6 "+ str1.substring(3, 6));

        //Index of Specific character or substring
        System.out.println("Index of char i in string "+ str1.indexOf('i'));
        System.out.println("Index of char i from string starting index 3: "+ str1.indexOf('i' , 3));
        System.out.println("Index of string Himanshi: "+str1.indexOf("Himanshi"));

        //Converting into Lower and Upper case
        System.out.println("Converting string into lower case: "+str1.toLowerCase());
        System.out.println("Converting string into upper case: "+str1.toUpperCase());

        //Trimming leading and trailing whitespaces
        String str3 = "  Removing before and After whitespaces ";
        System.out.println("Removing white spaces from string-"+str1.trim()+"-Ending.");

        //Checked string starts with specific prefix and suffix
        System.out.println("Is string starts with Hi? "+str1.startsWith("Hi"));
        System.out.println("Is string ends with Himanshi? "+str1.endsWith("Himanshi"));

        //Replacing a character or substring
        System.out.println("Replacing i with y: "+str1.replace('i', 'o'));
        System.out.println("Replacing Hi with Hello: "+str1.replace("Hi","Hello"));

        //Splitting the string into array of substring
        String[] strarr = str1.split(" ");
        int i=1;
        for (String e : strarr)
        {
            System.out.println("Substring array value "+i+ " : "+e);
            i++;
        }

        //Checking another string content is same
        String str4 = "Hi Himanshi here";
        System.out.println("Both the string 1 & 4 do they have same content? "+str1.equals(str4));

        //Checking for strings equality and ignoring case. In Java, equalsIgnoreCase() method of the String class compares two strings irrespective of the case (lower or upper) of the string.
        System.out.println("Are str and str4 equal ignoring case? "+str1.equalsIgnoreCase(str4));

        //Checking string contains specific substring or not
        System.out.println("is string1 contains Himanshi word or not? "+ str1.contains("Himanshi"));

        //Checking if string matches regular expression(regex):
        System.out.println("is string 1 matches this regular expression \"(?i)Hi\\\\s+Himanshi\\\\s+here\":- "+str1.matches("(?i)Hi\\s+Himanshi\\s+here"));
        System.out.println("is string 1 matches this regular expression? "+str1.matches(".*"));

        //Getting bytes of the string in specialised character set:- The getBytes() method in Java is used to convert a string into a sequence of bytes, utilizing the default character encoding of the platform.
        byte[] bytes = str1.getBytes();
        for (byte  b : bytes)
        {
            System.out.print(b + " ");
        }

        //Checking String is empty or not
        System.out.println("is String Empty: "+str1.isEmpty());

        //Reversing the string
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.reverse();
        System.out.println("Reversing the string: "+stringBuilder);

        //compareTo() and compareToIgnoreCase() methods can give different results if strings are different.

        //Comparing 2 strings:-The Java compareTo() method compares the given string with the current string lexicographically. It returns a positive number, a negative number, or 0. It compares strings based on the Unicode value of each character in the strings.
        String str5 = "ello Himanshi here";
        System.out.println("Comparing 2 different strings: "+str1.compareTo(str2));
        System.out.println("Comparing 2 same strings: "+ str1.compareTo(str4));
        System.out.println("Comparing 2 almost same string: "+str1.compareTo(str5));

        //Comparing 2 string using compareToIgnoreCase() method:- The compareToIgnoreCase() method in Java is used to compare two strings lexicographically, while ignoring case differences.
        System.out.println("Comparing 2 different strings: "+str1.compareToIgnoreCase(str2));
        System.out.println("Comparing 2 same strings: "+ str1.compareToIgnoreCase(str4));
        System.out.println("Comparing 2 almost same string: "+str1.compareToIgnoreCase(str5));

        //Comparing 2 method using intern method
        String str6 = new String("Hi Himanshi here");
        String str7 = str1.intern();
        String str8 = str6.intern();

        System.out.println("Intern First Case: "+ (str1 == str6.intern()));
        System.out.println("Intern Second Case: "+ (str1 == str6));
        System.out.println("Intern Third Case: "+ (str1 == str7));
        System.out.println("Intern Fourth Case: "+ (str1 == str8));
        System.out.println("Intern Fifth Case: "+ (str6 == str7 ));
        System.out.println("Intern Sixth Class: "+ (str6 == str8));
        System.out.println("Intern Seventh Class: "+(str7 == str8));

        //Replace using Replace first
        System.out.println("Replacing i with o: "+str1.replaceFirst("i", "o"));

        //Replace using replace all
        System.out.println("Replacing all i with o: "+str1.replaceAll("i", "o"));

        //Joining the strings in array
        String[] str9 = {"Hello" , "dosto"};
        String joinedString = String.join(", ",str9);
        System.out.println("The new String is: "+joinedString);

        //Removing leading and trailing white spaces using strip method
        System.out.println("Removing leading and trailing both spaces:"+str3.strip()+"End of string");
        System.out.println("Removing leading white spaces:"+str3.stripLeading()+"End of string");
        System.out.println("Removing trailing white spaces:"+str3.stripTrailing()+"End of string");


    }
}
