/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author Phan Thai
 */
public class stack {
    private final int fullStk;
    private String[] msgText;
    private int msgTop;
    public stack(int fullStk){
        this.fullStk = fullStk;
        this.msgText = new String[fullStk];
        this.msgTop = -1;
        
    }
    //check empty
    public boolean isEmpty(){
        return (this.msgTop == -1);
    }
    
    //add an element
    public void Push(String newMsgText) {
        if (this.msgTop == (this.fullStk - 1)) {
            System.out.println("This stack is full now !!!");
        }
        else {
            this.msgText[(++this.msgTop)] = newMsgText;
        }
    }
    //delete
    public String Pop() {
        if (!isEmpty()) {
            String msgPop = "";
            this.msgText[(--this.msgTop)] = msgPop;
            //return this.msgText[(--this.msgTop)];
            this.msgTop--;
            return String.valueOf(msgPop);
        }
        else {
            System.out.println("Empty");
            //return this.msgText[(--this.msgTop)];
            return "msgPop";
        }
    }
    //display
    public void display() {
        /**if (isEmpty()) {
        *    System.out.println("Empty stack");
        *}else {
        *    System.out.println("%d ->" + msgText );
        *   
        *   
        }*/
            System.out.println(this.msgText[0]);
        
    }
}
