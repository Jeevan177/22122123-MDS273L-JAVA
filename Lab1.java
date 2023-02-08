/**
 * Lab1
 */
import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = obj1.nextLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(obj1.nextLine());
        System.out.println("Enter the gender:");
        String gender = obj1.nextLine();
        System.out.println("Enter the reg.no:");
        int reg_no = Integer.parseInt(obj1.nextLine());
        System.out.println("Enter your class:");
        String classs = obj1.nextLine();
        System.out.println("Enter your Height:");
        float height = Float.parseFloat(obj1.nextLine());
        System.out.println("Where are u from:");
        String state = obj1.nextLine();
        
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Gender:"+ gender);
        System.out.println("Reg.no:"+ reg_no);
        System.out.println("Class:"+ classs);
        System.out.println("Height:"+ height);
        System.out.println("State:"+ state);

        if(gender.equals("M")){
            System.out.println("Male");
        }    
        else{
            System.out.println("Female");
        }
              
        switch(state){
            case "Telangana":
                System.out.println("The student is from South.");
                break;
            case "Andhra Pradesh":
                System.out.println("The student is from South.");
                break;
            case "Karnataka":
                System.out.println("The student is from South.");
                break;
            case "Tamil Nadu":
                System.out.println("The student is from South.");
                break;
            case "Kerala":
                System.out.println("The student is from South.");
                break;
            case "Maharastra":
                System.out.println("The student is from West.");
                break;
            case "Odisha":
                System.out.println("The student is from West.");
                break;
            case "Chattisgarh":
                System.out.println("The student is from West.");
                break;
            case "Punjab":
                System.out.println("The student is from North.");
                break;
            case "Harayana":
                System.out.println("The student is from North.");
                break;
            case "Himachal Pradesh":
                System.out.println("The student is from North.");
                break;
            case "Rajasthan":
                System.out.println("The student is from West.");
                break;
            case "Gujarat":
                System.out.println("The student is from West.");
                break;
            case "Madhya Pradesh":
                System.out.println("The student is from West.");
                break;
            case "Assam":
                System.out.println("The student is from East.");
                break;
            case "West Bengal":
                System.out.println("The student is from East.");
                break;
            default:
                System.out.println("The student is from north.");
                break;
    
    
    
        }
    }
}