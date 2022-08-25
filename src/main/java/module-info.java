module wit.comp1050.mm2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens wit.comp1050.mm2 to javafx.fxml;
    exports wit.comp1050.mm2;
}