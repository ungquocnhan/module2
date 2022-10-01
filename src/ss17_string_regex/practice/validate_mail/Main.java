package ss17_string_regex.practice.validate_mail;

public class Main {
    public static final String[] VALID_EMAIL = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] INVALID_EMAIL = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        Email email1 = new Email();
        for (String email : VALID_EMAIL){
            boolean isvalid = email1.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : INVALID_EMAIL) {
            boolean isvalid = email1.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }



}
