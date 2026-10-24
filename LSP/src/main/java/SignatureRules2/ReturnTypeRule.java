package SignatureRules2;

public class ReturnTypeRule {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Client client = new Client(child);
        //Client client = new Client(parent);
        client.takeAnimal();
    }
}
