package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class AddingDiscountsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDiscountButton;

    @FXML
    private TextField discountNameField;

    @FXML
    private TextField percentageField;

    @FXML
    void initialize()
    {
        confirmDiscountButton.setOnAction(actionEvent ->
        {
            try
            {
                addDiscount();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addDiscount() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingDiscount(discountNameField.getText(), percentageField.getText());

        confirmDiscountButton.getScene().getWindow().hide();
    }
}