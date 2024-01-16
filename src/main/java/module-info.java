module com.example.rawkash {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rawkash.Controllers to javafx.fxml;
    opens com.example.rawkash.Controllers.Client to javafx.fxml;
    exports com.example.rawkash;
    exports com.example.rawkash.Controllers;
    exports com.example.rawkash.Controllers.Client;
}