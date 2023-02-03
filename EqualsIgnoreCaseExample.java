public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String s1 = "dhruv";
        String s2 = "dhruv";
        String s3 = "DHRUV";
        String s4 = "Thummar";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

    }
}


// output:
//     true
//     true
//     false