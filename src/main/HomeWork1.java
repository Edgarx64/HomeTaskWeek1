package main;

public class HomeWork1 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        System.out.println("factorial 5: " + tasks.fact(5));

        System.out.print("Fibonacci ot 7: ");
        tasks.fib(7);

        System.out.print("Emm.. 9! : ");
        tasks.numToWord(9);
    }
}