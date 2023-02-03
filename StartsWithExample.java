public class StartsWithExample{
    public static void main(String[] args) {
        String s1 = "Java is a good language";
        System.out.println(s1.startsWith("J"));
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.startsWith("java"));
    }
}

//output:
//   true
//   true
//   false