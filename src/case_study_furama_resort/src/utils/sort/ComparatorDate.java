package case_study_furama_resort.src.utils.sort;

import case_study_furama_resort.src.model.Booking;

import java.util.Comparator;

public class ComparatorDate implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if(o1.getDateStart().isBefore(o2.getDateStart())){
            return 1;
        }else if(o1.getDateStart().isEqual(o2.getDateStart())){
            return o1.getDateEnd().compareTo(o2.getDateEnd());
        }else {
            return -1;
        }
    }
}
