public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        EmailNotification email = new EmailNotification("Testig Email", "Does it work?","You", "JavaClassProvider");

        email.transport();
        email.showStatus();
        email.superProtectedMethod();

        System.out.println();

        TextNotification text= new TextNotification("Testing text", "Sup", "Yo", "J-Mobile");

        text.transport();
        text.showStatus();


        //Trying to create a clone on email
        Object emailNotificationClone = email.clone();
        System.out.println(emailNotificationClone.equals(email));

    }
}
