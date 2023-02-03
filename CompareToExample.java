public class CompareToExample {
    public static void main(String[] args) {
        String s1 = "Dhruv";
        String s2 = "Thummar";
        String s3 = "Dhruv";
        String s4 = "Gondal";
        String s5 = "Rajkot";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
    }
}
// output:
// -16
// 0
// -3
// -14