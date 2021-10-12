package LocationContext.domain;

public class Reservation {
    private ReservationDate reservationDate;
    private Employee employee;
    private Desk desk;

    public Reservation(ReservationDate reservationDate, Employee employee, Desk desk){
        this.reservationDate = reservationDate;
        this.employee = employee;
        this.desk = desk;
    }

    
}
