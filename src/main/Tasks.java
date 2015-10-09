package main;

public class Tasks {
    int fact(int i){
        if (i <= 1)
            return 1;
        return fact(i-1)*i;
    }
    void fib(int n){
        if (n>=1){
            int i=0;
            int j=1;
            System.out.print("0 ");
            int k=1;
            while (++k <= n){
                System.out.print(j + " ");
                int tmp = i + j;
                i = j;
                j = tmp;
            }
        }
        System.out.println();
    }
    void numToWord(int k){
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        try{
            System.out.println(word[k]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oh no! This is ERROR!");
        }
    }
}