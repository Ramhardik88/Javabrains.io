package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblem {
    public static void main(String []args){


            int [] coins = {1, 2, 5, 10, 50, 100, 500,2000};
            int amount = 758;
            System.out.println("Coins available: "+ Arrays.toString(coins));
            System.out.println("Target amount: "+ amount);
            CoinChangeProblem.coinChangeProblem(coins, amount);
        }


    static void coinChangeProblem(int [] coins, int N) {
        Arrays.sort(coins);
        int index=coins.length-1;

        while (true){
            int coinvalue=coins[index];index--;
            int maxvalue=(N/coinvalue)*coinvalue;
            if(maxvalue>0){
                System.out.println("Coinvalue"+coinvalue+"taken value"+(N/coinvalue));
                N=N-maxvalue;
            }
            if(N==0){
                break;
            }
        }

    }

}
