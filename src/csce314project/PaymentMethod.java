/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;

import java.util.Vector;

/*****************************************
** File:    PaymentMethod.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains the PaymentMethod class. This node has the name of the 
* payment type we're accessing. Card, Cash, Bitcoin , etc. 
**
**
***********************************************/
public class PaymentMethod extends treeNode
{
    
    String addedPaymentType;
    String below = "business";
    public String getBelow()
    {
        return this.below;
    }

    public PaymentMethod(String paymentType) 
    {
       super(nodeType.PaymentMethod, 1234);
       this.addedPaymentType = paymentType;
    }
    //Do we already have a given type trying to be accessed?
    void checkForType(){};
    
    void addType(){}
    void removeType(){}
    
    //We add businesses below this node because we track what business I paid 
    //with what kind of payment method
    void addBusinessVisited(){}

   
   
}
