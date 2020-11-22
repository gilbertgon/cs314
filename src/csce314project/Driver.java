/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csce314project;

import java.io.IOException;
import java.util.Scanner;

/*****************************************
** File:    Driver.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains the main driver program for the final project in CSCE 314.
** The idea revolves around a Bank having two or more Users who visit business 
* and make transactions using some form of payment method we can track. When does
* a user make a transaction? Whenever the hashes of the nodes at the very bottom
* change. We take as inputs User names, types of payments, transaction information
**
***********************************************/

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Input User Name");
        Scanner inputUser = new Scanner (System.in);
        String userName = inputUser.nextLine();
        
        //Check if user previously exists from a list of users
        //if not then make new user
        System.out.println(userName + "has Cash & Credit available");
        System.out.println(userName + " made a transaction ? Y/N");
        
        
        
        if(inputUser.nextLine().toLowerCase() == "y")
        {
            //add transaction to the tree
                /*Ask for business name*/
                    /*If business name exists, add a new transaction to  list*/
                        //Adding new transaction
                               /*Add the amount of money, the date, & assign hash value*/
                               
                    /*If it doesn't make new business and add new trans*/
                         //Adding new transaction
                               /*Add the amount of money, the date, & assign hash value*/
        }
        
        else // user didn't make a transaction just exit
        {
        
        }
        
        
       
    }
    
}
