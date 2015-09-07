public class ClassWorkii {
    public static void main(String[] args) {
        int a, b;
        a = 1234;
        b = 99;
        //a might not have been initialized
        int c = a + b;
        System.out.println(c);
        int d = 1;
        int i = 0;
        //this won't work because of limit of ints
        while(i<34) {
            d = d * 2;
        }
        System.out.println(d);
            
    }
}
