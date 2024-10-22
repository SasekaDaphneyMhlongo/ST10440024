
package ST10440024;

import java.util.Scanner;

public class ST10440024
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String un;
        String pw;
        
        
        
        
        System.out.println("Enter a Username");
        String username = scan.nextLine();
        System.out.println("Enter a Password");
        String password = scan.nextLine();

        UserValidator validator = new UserValidator();
        
        if (validator.isValidUsername(username)) {
            System.out.println("Username successfully captured ");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            
        }

        if (validator.isValidPassword(password)) {
            System.out.println("Password successfully captured");
       
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, and a special character.");
        }
        
        if((validator.isValidPassword(password)) && (validator.isValidUsername(username))) {
        System.out.println("\nLogin : \n\n");
         System.out.println("Enter Your Username");
          un = scan.nextLine();
         System.out.println("Enter your password");
          pw = scan.nextLine();
         
            if((un.contains(username)) && (pw.contains(password))) {
             
             System.out.println("\nLogin successful\n");
            
            System.out.println("Enter your name");
            String name = scan.nextLine();
            System.out.println("Enter your last name");
            String surname = scan.nextLine();
            
             System.out.println("\nWelcome " + name + " " + surname + ", it is great to see you again.");
             
                System.out.println("\nWELCOME to EasyKanban\n\n");
                
                System.out.println("Choose one of the following options : \n");
                System.out.println("Option 1 : Add tasks");
                System.out.println("Option 2 : Show report ( coming soon)");
                System.out.println("Option 3 : Quit");
                System.out.println("\nOption :");
                int option = scan.nextInt();
              
                if(option != 3){
                   
                if(option == 1){
                    tasks.addTasks(scan); 
                }

                if(option == 2){
                   
                    System.out.println(" coming soon");
                }
             
                }else {
                System.out.println("Username or password incorrect, please try again");
            }
          
        }else{
            
            System.out.println("\n Username or Password haven't met the requirements to continue ");
        }
                
            
        
    } 
    
    
    }



    }

