/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

/**
 *
 * @author Phan Thai
 */
public class message {
    private message msgNext;
    private String msgText;
    public message(String msgText) {
        this.msgText = msgText;
        this.msgNext = null;
    }
    public message getMsgNext() {
        return msgNext;
    }
    public void setMsgNext(message msgNext) {
        this.msgNext = msgNext;
    }
    public String getMsgText() {
        return msgText;
    }
    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }
    
}
