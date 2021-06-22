/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi date:June 22
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the user status code:");
        for (int i = 0; i < StausUser.UserStatus.values().length; i++) {
            System.out.println(i + ": " + 
                    StausUser.UserStatus.values()[i]);
        }
        
        int code = in.nextInt();
        
        StausUser t = new StausUser();
        t.statusDetail(code); 
    }
}
