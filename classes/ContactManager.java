package classes;

public class ContactManager {
    // fields
    Contact[] friendsList;
    int friendsCount;

    // constructor
    ContactManager() {
        friendsList = new Contact[500];
        friendsCount = 0;
    }

    // methods
    void addContact(Contact contact) {
        friendsList[friendsCount] = contact;
        friendsCount ++;
    }

    // return type
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (friendsList[i].name.equals(searchName)){
                System.out.println("Found the match!");
                System.out.println(friendsList[i].name);
                System.out.println(friendsList[i].phone);
                System.out.println(friendsList[i].mail);
                return friendsList[i];
            }
        }
        System.out.println("No match!");
        return null;
    }

    void printAllContacts() {
        int i = 0;
        for (Contact contact : friendsList) {
           if(i == friendsCount) { break; }
            System.out.println("[" + i + "]: " + contact.name + " - " + contact.phone + ", " + contact.mail);
           i++;
        }
    }
}
