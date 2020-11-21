/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;

import java.util.ArrayList;

/*****************************************
** File:    treeNode.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains the treeNode class for the final project in CSCE 314.
** This is the basis of our tree. All nodes have a type designation, but also
* have a hash value. We generate our hashValue here as well. Our root (Bank)
* will be made here as well considering it is the one of  kind factor.
**
***********************************************/
public class treeNode {
    public enum nodeType{
        Transaction, Business, User, PaymentMethod;
    }
    
    nodeType nodeType1;
    int hashVal;
    
    //In a binary tree we would go Left and Right, here we store the address
    //of the children node below us.
    ArrayList <treeNode> children;
    
    void addChild(){}
    void removeChild(){}
    // What are the children below my current node?
    public ArrayList<treeNode> getChildren() {
        return children;
    }
    
    //Print my tree
    void print(){}
    
    //update our tree when we change hash value
    void updateToRoot(){}
    
    //Generates a hash Value for our node regardless of type
    public int hashGenerator(){ return 0;}
}
