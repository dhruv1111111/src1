public class StringToCharArrayExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] ch = s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}

//output
//  H
//  e
//  l
//  l
//  o
