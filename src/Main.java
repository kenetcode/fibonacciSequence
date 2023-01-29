public class Main {
    public static void main(String[] args) {
        //Programa que genere infinitos numero de la sucesión de fibonacci
        //Primero dos terminos unicos de la sucesión
        /*int f0 = 0, f1 = 1, f2 = 0, f3, f4, f5;
        System.out.println(f0);
        System.out.println(f1);
        f2 = f1 + f0;
        System.out.println(f2);
        f3 = f2 + f1;
        System.out.println(f3);
        f4 = f3 + f2;
        System.out.println(f4);
        f5 = f4 + f3;
        System.out.println(f5);*/

        int n = 8, fib0 = 0, fib1 = 1, temp = 0, result = 0;
        System.out.println(fib0);
        System.out.println(fib1);
        for (int i = 1; i < 20; i++) {
            if (i > 0) {
                temp = fib0;
                fib0 = fib1;
                fib1 = fib1 + temp;
                n = n - 1;
            } else {
                result = fib0;
            }
            System.out.println(fib1);
        }
    }
}
