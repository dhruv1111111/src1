import org.w3c.dom.ls.LSOutput;

public class EndsWithExample {
    public static void main(String[] args) {
        String s1 = "Hi, How are you";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("you"));
        System.out.println(s1.endsWith("are"));
}
}

// output:
//    true
//    true
//    false
