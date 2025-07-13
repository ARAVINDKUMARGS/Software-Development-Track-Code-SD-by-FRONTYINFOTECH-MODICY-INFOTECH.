import java.util.*;

class Contact {
    String name, phone, email;
    Contact(String name, String phone, String email) {
        this.name = name; this.phone = phone; this.email = email;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Contact\n2. View\n3. Edit\n4. Delete\n5. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: add(); break;
                case 2: view(); break;
                case 3: edit(); break;
                case 4: delete(); break;
                case 5: return;
            }
        }
    }

    static void add() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        contacts.add(new Contact(name, phone, email));
    }

    static void view() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            System.out.println((i + 1) + ". " + c.name + " | " + c.phone + " | " + c.email);
        }
    }

    static void edit() {
        view();
        System.out.print("Enter contact number to edit: ");
        int i = sc.nextInt() - 1; sc.nextLine();
        if (i >= 0 && i < contacts.size()) {
            System.out.print("New Name: ");
            contacts.get(i).name = sc.nextLine();
            System.out.print("New Phone: ");
            contacts.get(i).phone = sc.nextLine();
            System.out.print("New Email: ");
            contacts.get(i).email = sc.nextLine();
        }
    }

    static void delete() {
        view();
        System.out.print("Enter contact number to delete: ");
        int i = sc.nextInt() - 1;
        if (i >= 0 && i < contacts.size()) {
            contacts.remove(i);
        }
    }
}