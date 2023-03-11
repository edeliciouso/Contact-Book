import java.util.LinkedList;
import java.util.Scanner;

public class ContactBooks {
    public static void main(String[] args){
        String name;
        String phone;
        String email;
        String menu;
        String delete;
        String search;
        String find;
        LinkedList<Contacts> book = new LinkedList<>();
        boolean quit = false;

        while(quit == false){ // loops until the user quits
            System.out.println("*****************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("*****************************");
            System.out.print("Please enter a command: ");

            Scanner scn = new Scanner(System.in);
            menu = scn.nextLine().toUpperCase();

            switch(menu) {
                case "A":
                    System.out.println("Add an entry:");
                    System.out.print("Name: ");
                    name = scn.nextLine();
                    System.out.print("Phone Number: ");
                    phone = scn.nextLine();
                    System.out.print("Email: ");
                    email = scn.nextLine();
                    Contacts contacts = new Contacts(name, phone, email);
                    book.add(contacts);
                    break;
                case "D":
                    System.out.print("Enter a name to delete entry: ");
                    delete = scn.nextLine();
                    int i = 0;
                    while(i < book.size()) {
                        if (book.get(i).name.equals(delete)) {
                            book.remove(i);
                        }
                        i++; // stop the loop
                    }
                    break;
                case "E":
                    System.out.print("Search an email: ");
                    search = scn.nextLine();
                    int k = 0;
                    while(k < book.size()) {
                        for (k = 0; k < book.size(); k++) {
                            if (book.get(k).email.equals(search)) {
                                System.out.println(book.get(k));
                            }
                        }
                    }
                    break;
                case "P":
                    System.out.println("List of contacts:");
                    for(int j = 0; j < book.size(); j++){
                        System.out.println(book.get(j));
                    }
                    break;
                case "S":
                    System.out.print("Search for a contact: ");
                    find = scn.nextLine();
                    int h = 0;
                    while(h < book.size()) {
                        for (h = 0; h < book.size(); h++) {
                            if (book.get(h).name.equals(find)) {
                                System.out.println(book.get(h));
                            }
                        }
                    }
                    break;
                case "Q":
                    System.out.println("Thank you for using the contact book.");
                    quit = true; // quits the program
                    break;
                default:
                    System.out.println("Unknown entry");
            }
        }
    }
}

