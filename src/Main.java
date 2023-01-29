public class Main {
    public static void main(String[] args) {
        //Programa que genere infinitos numero de la sucesión de fibonacci
        //Este programa esta optimizado actualmente solo para mostrar hasta la posicion 92 de la sucesion, ya que es lo
        //que permite el tipo de dato long en Java

        long fib0 = 0l, fib1 = 1, result = 0, first = 0, second = 0, n = 0;
        result = fib1 + fib0;
        System.out.println("Fib Pos # " + n + "     " + fib0);
        n++;
        System.out.println("Fib Pos # " + n + "     " + fib1);
        n++;
        System.out.println("Fib Pos # " + n + "     " + result);
        while (n < 92) {
            n++;
            second = result;
            first = fib1;
            result = second + first;
            fib1 = second;
            System.out.println("Fib Pos # " + n + "     " + result);
        }
    }
}
