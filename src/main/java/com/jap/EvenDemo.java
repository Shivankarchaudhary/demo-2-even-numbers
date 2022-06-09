package com.jap;

public class EvenDemo
{
    public static void main( String[] args )
    {
        int numbers[] = {23,34,56,67,12,45,56,45,67,66};
        int sum=0;

        for (int i=0;i<numbers.length;i++){
            if(numbers[i] %2==0){
                sum = sum+numbers[i];
            }
        }
        System.out.println("Sum of even numbers" + sum);
    }
}





