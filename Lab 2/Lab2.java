import java.util.Scanner;
public class Lab2 {

        
    public static void main(String[] args) {
        String[] Name = new String[1024];
        Scanner sc = new Scanner(System.in);
        int key = 1;
        do {
            int condition;
            System.out.println("1.Enter the Name:");
            System.out.println("2.Search for Name:");
            System.out.println("3.Remove a Name:");
            System.out.println("4.Show all Names:");
            System.out.println("Select the option that you want to choose:");
            condition = Integer.parseInt(sc.next());
            switch (condition) {
                case 1:
                    {
                        System.out.println("enter the name:");
                        String name = sc.next();
                        for(int i=0;i<Name.length;i++){
                            if(Name[i] == null){
                                Name[i] = name;
                                break;
                            }
                            if(Name[i].equals(name)){
                                System.out.println("Name already exist");
                                break;
                        }
                    } 
                    break;
                }

                case 2:
                    {
                        System.out.println("Search for the name:");
                        String name = sc.next();
                        int found = 0;
                        for(int i = 0;i<=Name.length;i++){
                            if(Name[i] == null){
                                break;
                            }
                            if(Name[i].equals(name)){
                                System.out.println("Found");
                                break;
                            }
                        }
                    }
                    break;
                   
                case 3:
                    {
                        int y = 0;
                        System.out.println("Removing a name:");
                        String name = sc.next();
                        int found = 0;
                        for(int i = 0;i<=Name.length;i++){
                            if(Name[i] == null){
                                break;
                            }
                            if(Name[i].equals(name)){
                                name = "0";
                                y = 1;
                            }
                            Name[i] = Name[i+y];
                        }
                        break;
                    }
                case 4:
                   {
                        for(int i = 0; i<Name.length;i++){
                            if(Name[i] == null)
                            break;
                            System.out.println(Name[i]+",");
                        }
                        System.out.println();
                        break;
                   } 
                default:{
                    System.out.println("Wrong value");
                    break;
                }
            }
            System.out.println("Want to add some more?");
            key = Integer.parseInt(sc.next());
        } while(key == 1);  
    }
}
