package case_study_furama_resort.src.utils.exception;

public class CheckFormatException extends Exception {
    public CheckFormatException(String message) {
        super(message);
    }

    public static void checkId(String id) throws CheckFormatException {
        String regex = "FUE-[0-9]{3}-[1-6]";
        if(!id.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }

    public static void checkName(String name) throws CheckFormatException {
        String[] strings = name.trim().split(" ");
        String regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].matches(regex)) {
                throw new CheckFormatException("Enter incorrect format");
            }
        }
    }

    public static void checkNumberIdentityCard(String numberIdentityCard) throws CheckFormatException {
        String regex = "^[0-9]{12}$";
        if (!numberIdentityCard.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }

    public static void checkNumberPhone(String numberPhone) throws CheckFormatException {
        String regex = "^[+][+\\d]{2,6}[-][0][\\d]{9}$";
        if(!numberPhone.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }

    public static void checkEmail(String email) throws CheckFormatException {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if(!email.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }


}
