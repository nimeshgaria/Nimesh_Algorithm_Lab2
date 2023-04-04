package org.example.client;

import org.example.service.TransactionService;

public class Client {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        long[] inputTransactions = new long[]{100,200,400,500,600};
        long target = 1200;
        transactionService.checkTransactionTarget(inputTransactions,target);
    }
}
