package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.TextField;

public class AddingEmployeesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addressEmployeesField;

    @FXML
    private Button confirmEmployeeButton;

    @FXML
    private TextField nameEmployeesField;

    @FXML
    private TextField patronymicEmployeesField;

    @FXML
    private TextField phoneEmployeesField;

    @FXML
    private ChoiceBox<String> positionEmployeesField;

    @FXML
    private TextField surnameEmployeesField;

    @FXML
    void initialize()
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        ObservableList<String> positionEmployeesList = dbHandler.getDataPositionEmployees();
        positionEmployeesField.setItems(positionEmployeesList);

        confirmEmployeeButton.setOnAction(actionEvent ->
        {
            try
            {
                addEmployee();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addEmployee() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingEmployee(positionEmployeesField.getValue(), surnameEmployeesField.getText(),
                nameEmployeesField.getText(), patronymicEmployeesField.getText(), phoneEmployeesField.getText(),
                addressEmployeesField.getText());

        confirmEmployeeButton.getScene().getWindow().hide();
    }
}