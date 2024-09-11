module com.example.pr1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.bouncycastle.provider;
//    requires jfxrt;
//    requires rt;


    opens com.example.pr1 to javafx.fxml;
    exports com.example.pr1;
}