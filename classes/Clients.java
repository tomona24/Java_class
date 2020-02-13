package classes;

public class Clients {
    public static void main(String[] args) {
        Contact lucas = new Contact("Lucas", "778-318-3796");
        Contact tomona = new Contact("Tomona", "888-888-888", "tomona.sako@gmail.com");

        ContactManager phoneBook = new ContactManager();
        phoneBook.addContact(lucas);
        phoneBook.addContact(tomona);

        phoneBook.printAllContacts();
        phoneBook.searchContact("Martin");
        phoneBook.searchContact("Lucas");
    }
}
