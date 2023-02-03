public class FormatExample2 {
    public static void main(String[] args) {
        String s1 = String.format("%d",222);
        String s2 = String.format("%s","Dhruv");
        String s3 = String.format("%f",103.55);
        String s4 = String.format("%x",123);
        String s5 = String.format("%c",'c');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}

//output :
//   222
//   Dhruv
//   103.550000
//   7b
//   c