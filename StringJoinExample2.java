public class StringJoinExample2 {
    public static void main(String[] args) {
        String s1 = String.join("/","03","02","2023");
        System.out.print(s1);
        String s2 = String.join(":","16","07","23");
        System.out.println(" "+s2);
    }
}


// output:
//   03/02/2023 16:07:23