public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String A = "abbacaaaaaadaaaaa";
        int i=0;
        while (i<A.length()-1) {
            if (A.charAt(i+1)==A.charAt(i)) {
                A = A.substring(0, i) + A.substring(i+2);
                i=0;
            } else {
                i++;
            }
        }
        System.out.println(A);
     }
}
