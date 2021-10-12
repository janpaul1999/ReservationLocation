package SelfReservationContext.Adapter;

import SelfReservationContext.Application.ReservationApplicationService;

public class RestService {
    private final ReservationApplicationService reservationService;

    public RestService(ReservationApplicationService rService){
        this.reservationService = rService;
    }

    public void closedDesk(Long deskId){
        reservationService.closedDesk(deskId);
    }
}
