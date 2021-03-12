/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.Arrays;

/**
 *
 * @author Phan Thai
 */
public class queue {
   public message msgFront;
   public message msgRear;
   public queue() {
       this.msgFront = null;
       this.msgRear = null;
   }
   //check empty
   public boolean isEmpty() {
       return (this.msgFront == null);
   }
   //insert element
   public void EnQueue(String msgText)
   {
       message newMessage = new message(msgText);
       if (this.isEmpty()) {
           this.msgFront = newMessage;
           this.msgRear = newMessage;
       }
       else {
           this.msgRear.setMsgNext(newMessage);
           this.msgRear = newMessage;
       }
   }
   //delete elememt from the head of queue
   public message Dequeue()
   {
       if (isEmpty()) {
           System.out.println("This list is Empty");
           return null;
       }
       else {
           message element = this.msgFront;
           this.msgFront = this.msgFront.getMsgNext();
            System.out.println("Delete complete ->"+element);
            element.setMsgNext(null);
           return element;
       }
       
   }
   //display element
   void display() {
        int i;
        if (isEmpty()) {
           System.out.println("Empty queue");
        }else {
           this.msgFront.getMsgText();
           System.out.println(" "+msgFront);
           
       }
   }

    void StackDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
