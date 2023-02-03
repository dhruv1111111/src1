public class StringGetBytesExample {
    public static void main(String[] args) {
    String s1 = "ABCdef";
    byte[] barr = s1.getBytes();
    for(int i=0;i<barr.length;i++) {
        System.out.println(barr[i]);
    }
    }
}


//output :
//    65
//    66
//    67
//    100
//    101
//    102