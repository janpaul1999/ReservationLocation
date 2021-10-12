package SelfReservationContext.Application;

import SelfReservationContext.Data.ReservationRepository;
import SelfReservationContext.Domain.Reservation;

public class ReservationApplicationService {
    private final ReservationRepository resRepository;

    public ReservationApplicationService(ReservationRepository resRepository){
        this.resRepository = resRepository;
    }

    public void closedDesk(Long deskId){
        Reservation reservation = resRepository.findReservationByDesk(deskId);

        reservation.closedDesk();

        resRepository.save(reservation);
    }
}
