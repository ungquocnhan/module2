package ss17_string_regex.practice.validate_account;

public class Main {

    public static final String[] VALID_ACCOUNT = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] INVALID_ACCOUNT = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        Account account = new Account();
        for (String string : VALID_ACCOUNT) {
            boolean isvalid = account.validate(string);
            System.out.println("Account is " + string + " is valid: " + isvalid);
        }
        for (String string : INVALID_ACCOUNT) {
            boolean isvalid = account.validate(string);
            System.out.println("Account is " + string + " is valid: " + isvalid);
        }

    }
}
