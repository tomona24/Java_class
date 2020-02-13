package basics;

public class HelloWorld {
    // main() -> you must have this method to run your java program
    // psvm + tab
    public static void main(String[] args) {
        // sout + tab
        System.out.println("Hello, World");  // printIn -> print with newline
        System.out.print("Bye!\n");  // without newline \n : newline
        // printf -> print with format
        // %s : string, %d : decimal int, %f: float,
        System.out.printf("%s starts at %02d:%d\n", "Java Class", 8, 45);
        // %02 = display it as 2 digits (without 02, it display only 1 digit)
    }
    // python - interpreted language(compile a little bit run, compile a little bit run...)
    // java - compiled language
    //      - source code -> 'byte code'
    //      - runs on JVM (Java Virtual Machine)
    //      - Java is very 'portable', for the application can run on any devices if you have Virtual Machine.
    //      - 1990s James Gosling (Canadian) designed Java
    //      - 'Enterprise' sized Application
    //      - 'Object-Oriented' Programming Language

}
