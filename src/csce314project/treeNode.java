/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.SwingUtilities;

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
        Root,Transaction, Business, User, PaymentMethod;
    }
    
    nodeType nodeType1;
    int hashVal;
    private treeNode leftNode;
    private treeNode rightNode;
    private treeNode rootNode;
    private treeNode tail;
    String below;
          
    
    //In a binary tree we would go Left and Right, here we store the address
    //of the children node below us.
    
    public treeNode(nodeType type, int hashVal)
    {
        this.hashVal = hashVal ;
        this.nodeType1 = type;
        leftNode= null;
        rightNode = null;
        tail = this;
        
        if(this.nodeType1 == nodeType.Root)
        {
            rootNode = this;
        }
       
        setBelow(this.nodeType1);
        
        System.out.println(this.nodeType1 + " " + this.hashVal + " "+ this.below);
    }
   public void setBelow(nodeType type)
    {
        switch (type)
        {
            case Root:
                this.below = "User";
                break;
            case Transaction:
                this.below = "None";
                break;
            case Business:
                this.below = "Transaction";
                break;
            case User:
                this.below = "PaymentMethod"; 
                break;
            case PaymentMethod:
                this.below = "Business";
                break;
        }
    
    }
    void removeChild(){}
    
    public nodeType getNodeType()
    {
        return this.nodeType1;
    }
      public String getBelow()
    {
        return this.below;
    }
    void addChild(treeNode addedNode)
    { 
        
      
      treeNode temp = rootNode.tail;
    
      if(temp.checkLeftEmpty() && temp.getBelow()==addedNode.nodeType1.toString())
      {
          
          temp.leftNode=addedNode;
          //rootNode.tail = addedNode;
          System.out.println("We added left "+ addedNode.nodeType1.toString());

      }
      else if (temp.checkRightEmpty() && temp.getBelow()== addedNode.nodeType1.toString())
      {
          temp.rightNode=addedNode;
          rootNode.tail = addedNode;
          
          System.out.println("We added right " + addedNode.nodeType1.toString());
          
      }
      
      
        
    }
    // What are the children below my current node?
//    public ArrayList<User> getChildren() {
//        return children;
//    }
    public boolean checkLeftEmpty()
    {
        return this.leftNode == null;
    }
    public boolean checkRightEmpty()
    {
        return this.rightNode == null;
    }
    //Print my tree
    public boolean print()
    {
        System.out.println("this is a "+ this.nodeType1);
        while(this!= tail )
        {
            System.out.println("WE:RE INSIDE BOIS");
            treeNode tempL = this.leftNode;
            System.out.println(this.nodeType1.toString());
            if(!this.checkLeftEmpty())
            {
              System.out.println("We went left");
              System.out.println(tempL.nodeType1);
              tempL.print();
              
            }
            
            treeNode tempR = this.rightNode;
            if(!this.checkRightEmpty())
            {
              System.out.println("We went right");
              System.out.println(tempR.nodeType1);
            
            }
            
//            else
//            {
//                tail=temp;
//            }
//            if(!temp.checkRightEmpty())
//            {
//                System.out.println("we went right");             
//                System.out.println(tempR.nodeType1);
//                tempR.print();
//            }
//            else
//            {
//                rootNode.tail=tempL;
//                return false;
//            }
        }  
        
        return false;
    }
      
    
    public treeNode getRoot()
    {
        return this.rootNode;
    }
    
    //update our tree when we change hash value
    void updateToRoot(){}
    
    //Generates a hash Value for our node regardless of type
    public int hashGenerator(){ return 0;}
}
