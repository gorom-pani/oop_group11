module com.example.g11_project.g11_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.g11_project.g11_project to javafx.fxml;
    exports com.example.g11_project.g11_project;
}