public class SplitExample {
    public static void main(String[] args) {
        String s1 = "Hi, How are you?";
        String[] s = s1.split("\\s");
        for(String w:s) {
            System.out.println(w);
        }
    }
}


// output :
//     Hi,
//     How
//     are
//     you?