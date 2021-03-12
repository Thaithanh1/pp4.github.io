/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author Phan Thai
 */
public class P4 {
    public static void main(String[] args) {
        try {
            queue que = new queue();
            Stack st = new Stack();
            int fullStk = 250;
            int choiceNumber;
            //String message;
            Scanner scanner = new Scanner(System.in);
            for (;;) {
                System.out.println("1. Enter your message");
                System.out.println("2. Show");
                System.out.println("3. Delete");
                System.out.println("4. Exit");
                do {
                    System.out.println("Choose an opption  (1/2/3/4): ");
                    choiceNumber = scanner.nextInt();
                } while ((choiceNumber < 1) || (choiceNumber > 4));
                switch (choiceNumber) {
                    case 1:
                        System.out.println("Typing");
                        String message = scanner.next();
                        if (fullStk <= 250) {
                            st.push(message);
                        } else {
                            System.out.println("out of memory's hand");
                        }
                        break;

                    case 2:
                        System.out.println("Show mesage");
                        //st.display();
                        break;
                    case 3:
                        System.out.println("Delete message");
                        st.pop();
                        break;
                    case 4:
                        System.out.println("You will be exit! Good bye !^_^!");
                        System.exit(0); // Exit
                        break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
