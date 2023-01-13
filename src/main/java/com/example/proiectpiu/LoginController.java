package com.example.proiectpiu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private TextArea username;

    @FXML
    private TextArea password;

    @FXML
    private TextArea newUsername;

    @FXML
    private TextArea newPassword;

    @FXML
    private TextFlow textFlow1;

    @FXML
    private TextFlow textFlow2;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) throws IOException{
        String usernameField = username.getText();
        String passwordField = password.getText();
        boolean isValid = validateCredentials(usernameField, passwordField);
        if (isValid) {
            Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Credentialele introduse nu sunt gasite in fisierul json");
            Text t1 = new Text("Credentialele introduse sunt gresite!");
            textFlow1.getChildren().add(t1);
            textFlow1.setTextAlignment(TextAlignment.CENTER);
            textFlow1.autosize();
        }
    }

    public boolean validateCredentials(String username, String password) {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/com/example/proiectpiu/users.json"));
            String jsonString = new String(jsonData);

            JSONArray users = new JSONArray(jsonString);
            for(int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);
                if (user.getString("username").equals(username) && user.getString("password").equals(password)) {
                    return true;
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    @FXML
    protected void handleRegistrationButtonAction(ActionEvent event) throws IOException{
        String newuser = newUsername.getText();
        String newpass = newPassword.getText();

        JSONObject newUser = new JSONObject();
        newUser.put("username", newuser);
        newUser.put("password", newpass);
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/com/example/proiectpiu/users.json"));
            String jsonxString = new String(jsonData);

            JSONArray users = new JSONArray(jsonxString);
            users.put(newUser);

            //write the updated JSONArray back to the users.json file
            Files.write(Paths.get("src/main/resources/com/example/proiectpiu/users.json"), users.toString().getBytes());
            Text t2 = new Text("Utilizatorul a fost adaugat cu succes! Va rugam sa va logati.");
            textFlow2.getChildren().add(t2);
            textFlow2.setTextAlignment(TextAlignment.CENTER);
            textFlow2.autosize();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}