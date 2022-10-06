package case_study_furama_resort.src.utils.exception;

public class CheckFormatException extends Exception {
    public CheckFormatException(String message) {
        super(message);
    }

    public static void checkId(String id) throws CheckFormatException {
        String regex = "FU[ECB]-[0-9]{3}";
        if(!id.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }

    public static void checkName(String name) throws CheckFormatException {
        String[] strings = name.trim().split(" ");
        String regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
        for (String string : strings) {
            if (!string.matches(regex)) {
                throw new CheckFormatException("Enter incorrect format");
            }
        }
    }

    public static void checkNumberIdentityCard(String numberIdentityCard) throws CheckFormatException {
        String regex = "^([0-9]{9})|([0-9]{12})$";
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

    public static void checkAddress(String address) throws CheckFormatException {
        String[] strings1;
        String regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
        String[] strings = address.trim().split(",");
        for (String string : strings) {
            strings1 = string.trim().split(" ");
            for (String s : strings1) {
                if (!s.matches(regex)) {
                    throw new CheckFormatException("Enter incorrect format");
                }
            }
        }
    }

    public static void checkNameService(String name) throws CheckFormatException {
        String regex = "[A-Z][a-z]+";
        if(!name.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }
    }

    public static void checkIdService(String idService) throws CheckFormatException {
        String regex = "(SVVL|SVHO|SVRO)-[0-9]{4}";
        if(!idService.matches(regex)){
            throw new CheckFormatException("Enter incorrect format");
        }

    }
}
