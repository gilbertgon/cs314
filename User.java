/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project314;
/*****************************************
** File:    User.java
** Project: CSCE 314 Project , Fall 2020
** Author:  Shikhar Baheti & Gilbert Gonzalez
** Date:    11/7/2020
** Section: 512
** E-mail:  gilbertglz@tamu.edu & shikhar@tamu.edu
**
**   This file contains the User class; We must have a name for a user.
* 
**
**
***********************************************/
public class User extends treeNode {
    String userName;
    public User(String name)
    {
        this.userName = name;
    }
    String getUserName(){return this.userName;}
    
//We add mehod here to a specific user but not all users.
    void addPayMethod(){}
    
}
