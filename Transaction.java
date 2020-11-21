/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;

import java.util.Vector;

/*****************************************
** File:    Transaction.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains the Transaction class for the final project in CSCE 314.
** This class has a transactionList vector to continously add more transactions
* under the same business. We want to keep a date of our transaction to later
* query if needed, as well as the amount the transaction was made of.
**
**
***********************************************/
public class Transaction extends treeNode{
    double amount;
    String date;
    Vector<Transaction> transactionList;
    
    public Transaction(double amount, String date)
    {}
    
    //we can generate a new hashvalue if we added a transaction to our list
    int getHashValue()
    {
        return hashVal;
    }
    //output the Transaction info available for a certain Date
    String getTransInfo(String date)
    {
        String output = amount + " " + date;
        return output;
    }
    
    
    
    
}
