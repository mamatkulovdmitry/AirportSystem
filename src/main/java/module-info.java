module koltsovo.koltsovointernationalairport {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens koltsovo.koltsovointernationalairport to javafx.fxml;
    exports koltsovo.koltsovointernationalairport;
}