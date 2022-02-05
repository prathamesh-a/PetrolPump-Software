module me.prathamesh.petrolpump {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.prathamesh.petrolpump to javafx.fxml;
    exports me.prathamesh.petrolpump;
}