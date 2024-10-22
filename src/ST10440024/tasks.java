
package st10440024;


import java.util.Scanner;

import java.util.Scanner;

public class tasks {
    private String name;
    private int number;
    private String lastname;
    
    public tasks(String nn, String nm, int num) {
        name = nn;
        lastname = nm;
        number = num;
    }
    public String Auto() {
        String newname = name.toUpperCase();
        String newlast = lastname.toUpperCase();
        String result = "taskID :\n" + newname.substring(0, 2) + ":" + number + ":" + (newlast.substring(lastname.length() - 3));
        return result;
    
    }
    
    public boolean description(String descript) {
        return descript.length() <= 50;
    }
    
    public static void addTasks(Scanner scan) {
        System.out.println("How many tasks would you like to add? ");
        int tk = scan.nextInt();
        scan.nextLine(); // Consume newline
        
        String[] task = new String[tk];
        int[] tasknum = new int[tk];
        String[] descript = new String[tk];
        String[] devdet = new String[tk];
        int[] durat = new int[tk];
        String[] tID = new String[tk];
        int[] taskstat = new int[tk];
        tasks[] task1 = new tasks[tk];
        
        for (int i = 0; i < tk; i++) {
            System.out.println("\nTask " +(i+1)+ "'s name : ");
            task[i] = scan.nextLine();
            
            System.out.println("Task number : ");
            tasknum[i] = scan.nextInt();
            scan.nextLine(); 
            
            while (true) {
                System.out.println("Task Description :  ");
                descript[i] = scan.nextLine();
                if (descript[i].length() <= 50) {
                    break;
                } else {
                    System.out.println("The description you have entered has more than 50 characters, please use less than 50 characters.");
                }
            }
            
            System.out.println("Developer details : ");
            devdet[i] = scan.nextLine();
           
            
            task1[i] = new tasks(task[i], devdet[i], tasknum[i]);
            System.out.println(task1[i].Auto());
            
            System.out.println("\nTask Duration in hours : ");
            durat[i] = scan.nextInt();
            scan.nextLine(); 
            System.out.println("Task Status : ");
            System.out.println("1. To do");
            System.out.println("2. Done");
            System.out.println("3. Doing");
            System.out.println("\nOption : ");
            taskstat[i] = scan.nextInt();
            scan.nextLine();
        }
        
        
        for (int nn = 0; nn < tk; nn++) {
            System.out.println("\n\nTask " + (nn + 1) + "'s name : \t"  + task[nn]);
            System.out.println("Task number : \t"  + tasknum[nn]);
            System.out.println("Task Description : \t" + descript[nn]);
            System.out.println("Developer Details : \t" + devdet[nn]);
            System.out.println(task1[nn].Auto());
            System.out.println("Duration : \t" + durat[nn]);
            
            String status = switch (taskstat[nn]) {
                case 1 -> "To Do";
                case 2 -> "Done";
                case 3 -> "Doing";
                default -> "Unknown";
            };
            
            System.out.println("Task Status : \t" + status);
        }
        
        
        tasks max = new tasks("", "", 0);
        int totalhours = max.returntotalhours(durat);
        System.out.println("\n\nThe total duration of all tasks is : " + totalhours);
        
        
        System.out.println("\n\nTasks that are Done :");
        System.out.println("Developer\tTask names\tTask Duration(hours)");
        
        for (int yy = 0; yy < tk; yy++) {
            if (taskstat[yy] == 2) {
                System.out.println(devdet[yy] + "\t\t" + task[yy] + "\t\t\t   " + durat[yy]);
            }
                                        }
        
        Duration(devdet,durat);
        
        
        
        System.out.println("Do you want to search for a task?\n1.Yes\n2.No\n\nOption :");
        int search = scan.nextInt();
        
       
        
        if( search == 1){
             System.out.println("Enter the task name that you're looking for : ");
        String hh = scan.next();
        if(true){
        for(int yy = 0; yy < tk; yy++){
            if(hh.equalsIgnoreCase(task[yy])){
                System.out.println("\ntask name is : "+task[yy]);
                if(taskstat[yy] == 1)
                {
                    System.out.println("the task status is : To Do");
                }
                if(taskstat[yy] == 2)
                    {
                    System.out.println("the task status is : Done");
                }
                    if(taskstat[yy] == 3)
                        {
                    System.out.println("the task status is : Doing");
                }
            }
        }
        }else {
        System.out.println("Invalid Search please try again");
                }
        }
        else{
                System.out.println("Okay,we'll continue...");
            }
        
        System.out.println("\nDo you want to delete a task?\n1.Yes\n2.No");
        int Decision = scan.nextInt();
        
        if(Decision == 1){
            System.out.println("Which task would you like to delete? (type the tasks name) ");
            String delete = scan.next();
                    
                    for(int zz = 0; zz < tk; zz++){
                    if(task[zz].equalsIgnoreCase(delete)){
                        continue;
                                                         }
                    
            System.out.println("\n The new report for the remaining tasks : ");
            System.out.println("\n\nTask " + (zz + 1) + "'s name : \t"  + task[zz]);
            System.out.println("Task number : \t"  + tasknum[zz]);
            System.out.println("Task Description : \t" + descript[zz]);
            System.out.println("Developer Details : \t" + devdet[zz]);
            System.out.println(task1[zz].Auto());
            System.out.println("Duration : \t" + durat[zz]);
            String status = switch (taskstat[zz]) {
                case 1 -> "To Do";
                case 2 -> "Done";
                case 3 -> "Doing";
                default -> "Unknown";
            };
            System.out.println("Task Status : \t" +status);
                        
                        
            }
            
        }
    }
    
    
    
    
    //external methods:
    
    
    

    
    
    public int returntotalhours(int[] duration) {
        int total = 0;
        for (int dur : duration) {
            total += dur;
        }
        return total;
    }
    public static void Duration(String[] name,int jjj[])
    {
        
        int j;
        int h = 0;
        j = jjj[h];
        int b;
        
        String bb = name[h];     
        for( b = 0;b < jjj.length;b++)
        {
            if(jjj[b] > j)
            {
                
                j = jjj[b];
            }
          bb = name[b];
        }
                
                System.out.println("\n\nMOST HOURS : ");
                System.out.println("Developer\tDuration");
                System.out.println(""+bb+"\t\t"+j+"\n\n");
    }
    
}