module com.example.lab_1_ {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lab_1_ to javafx.fxml;
    exports com.example.lab_1_;
}