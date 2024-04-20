package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingDiscountsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteDiscountButton;

    @FXML
    private TextField idDiscountField;

    @FXML
    void initialize()
    {
        confirmDeleteDiscountButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteDiscount();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteDiscount() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteDiscount = dbHandler.deleteDiscount(idDiscountField.getText());

        dbHandler.deleteDiscount(deleteDiscount);

        confirmDeleteDiscountButton.getScene().getWindow().hide();
    }
}