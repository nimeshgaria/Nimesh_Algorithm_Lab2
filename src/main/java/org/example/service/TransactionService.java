package org.example.service;

public class TransactionService {
    public void checkTransactionTarget(long[] array, long target){
        long totalCount =0;
        for(int i =0 ; i<array.length ; i++){
            totalCount  = totalCount + array[(int) i];

            if(totalCount > target){
                System.out.println("Target value achieved after" +(i+1) + " transactions" );
                break;
            }
            System.out.println("Target value is not achieved after " +(i+1) + "transactions");
        }
    }
    public void checkTransactionTarget2(long[] array, long target){
        long totalCount = 0;
        for(long i=0; i< array.length; i++){
            totalCount = totalCount + array[(int)i];
            if(totalCount < target){
                continue;
            }else{
                System.out.println("Target value is not achieved after" +(i+1)+ "transactions");
            }
        }
    }
}
