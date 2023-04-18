/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.crud_ta;
import com.altriaa.crud_ta.View.ViewCRUD;
import java.util.Scanner;
/**
 *
 * @author Altriaa
 */
public class Crud_ta {

    public static void main(String[] args) {
        ViewCRUD.showMenu();
        // Jalankan kemabali program
        Scanner input = new Scanner(System.in);
        int rebuild;
        try{
            do {
                System.out.println(" ");
                System.out.println("Rebuild Program? Type '1' to rebuild");
                rebuild = input.nextInt();
                if (rebuild == 1){
                    ViewCRUD.showMenu();
                }
            } while (rebuild == 1);
            System.out.println("Program Ended");
        }catch(Exception ex){
            System.out.println("Program Ended");
        }
        
    }
}
