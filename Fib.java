public class Fib{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int a = 1;
        int b = 1;
        int fib = 0;
        for(int i = 0; i<=n; i++){
            fib = a + b;//2
            a = b;//1+1
            b = fib;//1=2
            System.out.println("Fib"+" "+fib);
            i++;
        }
        System.out.println("N number Fib"+" "+fib);
    }
}