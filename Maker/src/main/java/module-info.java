module org.graeme.maker {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens org.graeme.maker to javafx.fxml;
    exports org.graeme.maker;
}