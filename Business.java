/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;

import java.util.Vector;
/*****************************************
** File:    Business.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains Business class, the business must have a name, and we 
* have a numberOfTransaction under this business variable that is updated after 
* each new Transaction.
**
***********************************************/
public class Business extends treeNode{
    String businessName;
    int numberOfTrans;
    
    public Business(String businessName)
    {
        this.businessName = businessName;
    }
    void addTransaction(){}
    int getNumOfTrans(){ return 0;}
    void setNumOfTrans(){}
    
    
}
