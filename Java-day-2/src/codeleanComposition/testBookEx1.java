package codeleanComposition;

public class testBookEx1 {
    public static void main(String[] args) {
        AuthorEx1 ahTeck = new AuthorEx1("Tan Ah Teck", "teck@somewhere.com", 'm');
        System.out.println(ahTeck);

        BookEx1 dummyBook = new BookEx1("Java for dummies", ahTeck, 99.99, 9);
        System.out.println(dummyBook);

        dummyBook.setPrice(88.88);
        dummyBook.setQty(8);

        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());

        System.out.println("Author name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("Author gender is: " + dummyBook.getAuthor().getGender());

        BookEx1 moreDummyBook = new BookEx1("Java for more dummies",
                new AuthorEx1("Peter Lee", "peter@nowhere.com", 'm'), 19.99, 8);

        System.out.println(moreDummyBook);
    }
}
