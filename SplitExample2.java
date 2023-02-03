public class SplitExample2 {
    public static void main(String[] args) {
        String s1 = "Hi, how are you?";
        System.out.println("returning words : ");
        for(String w:s1.split("\\s",8)){
            System.out.println(w);
        }
        System.out.println("returning words : ");
        for(String w:s1.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words : ");
        for(String w:s1.split("\\s",2)){
            System.out.println(w);
        }
    }
}

// output:
//     returning words :
//     Hi,
//     how
//     are
//     you?
//     returning words :
//     Hi, how are you?
//     returning words :
//     Hi,
//     how are you?