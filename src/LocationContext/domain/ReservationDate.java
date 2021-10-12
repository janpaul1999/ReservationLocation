package LocationContext.domain;

import java.sql.Date;
import java.sql.Time;

public class ReservationDate {
    private Date date;
    private Time time;
    private Long amountTime;

    public ReservationDate(Date date, Time time, Long amountTime){
        this.date = date;
        this.time = time;
        this.amountTime = amountTime;
    }
    
}
