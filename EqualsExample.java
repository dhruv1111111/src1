public class EqualsExample {
    public static void main(String[] args) {
        String s1 = "Dhruv";
        String s2 = "Thummar";
        String s3 = "Dhruv";
        String s4 = "Rajkot";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}


// output:
//    false
//    true
//    false
