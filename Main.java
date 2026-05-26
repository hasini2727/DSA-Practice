import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String [] args){
        HashMap <String, Long> Contacts = new HashMap <> ();
        Scanner sc = new Scanner(System.in);
        Contacts.put("Hasini", 9705982446L);
        Contacts.put("Chandu", 9908056576L);
        Contacts.put("Jyothi", 9052631323L);
       for(String contact:Contacts.keySet()){
        System.out.println(contact + ": " +  Contacts.get(contact));
       }
       System.out.println("Enter the name: ");
       String Name = sc.nextLine();
       System.out.println("The mobile number of " + Name + " is: " + Contacts.get(Name));
       sc.close();
    }
}