package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingEmployeesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteEmployeeButton;

    @FXML
    private TextField idEmployeeField;

    @FXML
    void initialize()
    {
        confirmDeleteEmployeeButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteEmployee();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteEmployee() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteEmployee = dbHandler.deleteEmployee(idEmployeeField.getText());

        dbHandler.deleteEmployee(deleteEmployee);

        confirmDeleteEmployeeButton.getScene().getWindow().hide();
    }
}