package basics;

public class Strings {
    public static void main(String[] args) {

        // strings - a sequence of characters
        // ( References type)
        // 1. String literal
        // (data segment - read only)

        String name1 = "Derrick";
        String name2 = "Derrick";
        // name1, name2 goes to the same location of memory -> stuck memory

        // heap segment - dynamically allocate（割り当てる） memory  -> heap memory
        String name3 = new String("Derrick");  // *argument is original (don't type)

        // #compare reference (== ( double equals) )
        System.out.println(name1 == name2);  // true  : same memory address
        System.out.println(name1 == name3);  // false  : different memory address

        // #compare contents
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name3));

        // Get teh length of String
        String coffee = "Starbucks";
        System.out.println(coffee.length());

        // Get teh substring
        // In python, coffee[0:4] => "Star"
        System.out.println(coffee.substring(0, 4));  // substring( start, length) <-> slice(start, end)

        // Get the index of string
        System.out.println(coffee.indexOf("bucks"));

        // String with for-loop (print every char)
        for (int i = 0; i < coffee.length(); i++) {
            // 'char' (primitive)
            System.out.println(coffee.charAt(i));
        }
        for (int i = 0; i < coffee.length() - 1; i++){
            // 'String'
            System.out.println(coffee.substring(i, i + 1));
        }

        //Converting String to Char array
        char[] chars = coffee.toCharArray();
        System.out.println(chars);
        for (char ch : coffee.toCharArray()) {
            System.out.println(ch);
        }
    }
}
