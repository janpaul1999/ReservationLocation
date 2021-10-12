package sample;

import SelfReservationContext.Adapter.RestService;
import SelfReservationContext.Application.ReservationApplicationService;
import SelfReservationContext.Data.ReservationRepository;

public class Main {

    public static void main(String[] args) {
        ReservationRepository reservationRepository = new ReservationRepository();
        ReservationApplicationService applicationService = new ReservationApplicationService(reservationRepository);
        RestService restService = new RestService(applicationService);

        restService.closedDesk(10L);
    }

}

/* import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
} */
