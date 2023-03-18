package Lab5;

import java.util.*;

class Student {
    int Reg_no;
    String Name;
    String Email;
    long Phone_number;
    String Class;
    String Department;

    public Student(int Reg_no, String Name, String Email, long Phone_number, String Class, String Department) {
        this.Reg_no = Reg_no;
        this.Name = Name;
        this.Email = Email;
        this.Phone_number = Phone_number;
        this.Class = Class;
        this.Department = Department;

    }

    public void printDetails() {
        System.out.println("Reg_No: " + Reg_no);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone Number: " + Phone_number);
        System.out.println("Class: " + Class);
        System.out.println("Department: " + Department);
    }
}

public class Lab5 {
    static Scanner sc = new Scanner(System.in);
    static int counter = 0;

    public static int addStudent(Student studentarray[]) {
        System.out.println("Enter a Reg_no:");
        int reg_no = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        System.out.println("Enter a Email:");
        String email = sc.nextLine();
        System.out.println("Enter Phone Number:");
        long phone = Long.parseLong(sc.nextLine());
        System.out.println("Enter class:");
        String classs = sc.nextLine();
        System.out.println("Enter department:");
        String department = sc.nextLine();
        studentarray[counter] = new Student(reg_no, name, email, phone, classs, department);
        counter++;
        return counter;
    }

    public static void searchStudent(Student studentarray[]){
        System.out.println("How do you want to search a student:");
        System.out.println("1. Name");
        System.out.println("2. Reg_no");
        int opt = Integer.parseInt(sc.nextLine());
        if(opt == 1){
            System.out.println("Enter the name u want to search: ");
            String name = sc.nextLine();
            for(int i = 0;i<counter;i++){
                if(name.equalsIgnoreCase(studentarray[i].Name)){
                    System.out.println("Student Found");
                }
            }
        } else if(opt == 2){
            System.out.println("Enter the Reg_no you want to search: ");
            int reg_no = Integer.parseInt(sc.nextLine());
            for(int i=0;i<counter;i++){
                int Reg = studentarray[i].Reg_no;
                if(reg_no == Reg){
                    System.out.println("Student Found");
                }
            }
        }
    }
    public static void displayStudent(Student studentarray[]){
        System.out.println(" Student Details ");
        for(int i =0;i<counter;i++){
            studentarray[i].printDetails();
        }
    }



    public static void main(String[] args) {
        Student studentarray[]= new Student[100];
        char choice = 'n';

        do{
            choice = sc.nextLine().charAt(0);
            System.out.println("Options");
            System.out.println("1. Add Name");
            System.out.println("2. Search a Student");
            System.out.println("3. Display Student Details");
 
            int option = Integer.parseInt(sc.nextLine());
            switch(option){
                case 1:
                    addStudent(studentarray);
                    break;
                case 2:
                    searchStudent(studentarray);
                    break;
                case 3:
                    displayStudent(studentarray);
                    break;
            }


        }while(choice == 'n' || choice == 'N');
    }
}
