package case_study_furama_resort.src.utils.exception;

import case_study_furama_resort.src.model.person.Person;

import java.time.LocalDate;
import java.util.List;

public class CheckFuramaException extends Exception {
    public CheckFuramaException(String message) {
        super(message);
    }

    public static void checkId(String id) throws CheckFuramaException {
        String regex = "^FU[ECB]-[0-9]{3}$";
        if (!id.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }
    }

    public static void checkName(String name) throws CheckFuramaException {
        String[] strings = name.trim().split(" ");
        String regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,10}$";
        for (String string : strings) {
            if (!string.matches(regex)) {
                throw new CheckFuramaException("Enter incorrect format");
            }
        }
    }

    public static void checkNumberIdentityCard(String numberIdentityCard) throws CheckFuramaException {
        String regex = "^([0-9]{9})|([0-9]{12})$";
        if (!numberIdentityCard.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }
    }

    public static void checkNumberPhone(String numberPhone) throws CheckFuramaException {
        String regex = "^[+][+\\d]{2,6}[-][0][\\d]{9}$";
        if (!numberPhone.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }
    }

    public static void checkEmail(String email) throws CheckFuramaException {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if (!email.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }
    }

    public static void checkAddress(String address) throws CheckFuramaException {
        String[] strings1;
        String regex = "^[A-ZÂÊÔƯĐ][a-záàảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ]{1,5}$";
        String[] strings = address.trim().split(",");
        for (String string : strings) {
            strings1 = string.trim().split(" ");
            for (String s : strings1) {
                if (!s.matches(regex)) {
                    throw new CheckFuramaException("Enter incorrect format");
                }
            }
        }
    }

    public static void checkNameService(String name) throws CheckFuramaException {
        String regex = "^[A-Z][a-z]+$";
        if (!name.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }
    }

    public static void checkIdService(String idService) throws CheckFuramaException {
        String regex = "^(SVVL|SVHO|SVRO)-[0-9]{4}$";
        if (!idService.matches(regex)) {
            throw new CheckFuramaException("Enter incorrect format");
        }

    }

    public static <E extends Person> boolean checkDuplicatesId(String id, List<E> employeeList) throws CheckFuramaException {
        boolean flagId = false;
        for (E e : employeeList) {
            if (e.getId().equals(id)) {
                flagId = true;
                break;
            }
        }
        if (flagId) {
            throw new CheckFuramaException("Id duplicates, re-enter");
        } else {
            return true;
        }
    }

    public static void checkDateEnd(LocalDate dateStart, LocalDate dateEnd) throws CheckFuramaException {
        if (dateEnd.compareTo(dateStart) < 0 || dateEnd.compareTo(LocalDate.now()) < 0) {
            throw new CheckFuramaException("Date end must greater than date start or date now");
        }
    }

    public static void checkDateStart(LocalDate dateStart) throws CheckFuramaException {
        if (dateStart.compareTo(LocalDate.now()) < 0) {
            throw new CheckFuramaException("Date start must greater than date now");
        }
    }
}
