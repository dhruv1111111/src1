public class FormatExample {
    public static void main(String[] args) {
        String name = "Dhruv";
        String s1 = String.format("name is %s",name);
        String s2 = String.format("value is %f",32.33434);
        String s3 = String.format("value is %15.10f",32.33434);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

// output:
// name is Dhruv
// value is 32.334340
// value is   32.3343400000