package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingBoardingPassesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteBoardingPassButton;

    @FXML
    private TextField idBoardingPassField;

    @FXML
    void initialize()
    {
        confirmDeleteBoardingPassButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteBoardingPass();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteBoardingPass() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteBoardingPass = dbHandler.deleteBoardingPasses(idBoardingPassField.getText());

        dbHandler.deleteBoardingPasses(deleteBoardingPass);

        confirmDeleteBoardingPassButton.getScene().getWindow().hide();
    }
}