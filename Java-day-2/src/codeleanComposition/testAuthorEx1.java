package codeleanComposition;

public class testAuthorEx1 {
    public static void main(String[] args) {
        AuthorEx1 ahTeck = new AuthorEx1("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("Name is: " + ahTeck.getName());
        System.out.println("Gender is: " + ahTeck.getGender());
        System.out.println("Email is: " + ahTeck.getEmail());
    }
}
