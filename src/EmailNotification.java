public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "Available in Email";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
       // super.transport();
        System.out.println("Subject: " + getSubject());
        System.out.println("Body: " + getBody());
        System.out.println("Created At: " + getCreatedAt());
        System.out.println("Recipient: " + recipient);
        System.out.println("SMT Provider: " + smtpProvider);
    }

    @Override
    public void superProtectedMethod() {
        super.superProtectedMethod();
        System.out.println("overriding this method.");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() {
        //  return super.clone();
        Object temp = this;
        return  temp;
    }
}
