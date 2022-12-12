package com.example.proiectpiu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane anchorPane;

    @FXML
    protected void onExitButtonClick() { System.exit(0); }

    @FXML
    protected void onCreateButtonClick(javafx.event.ActionEvent event) throws IOException
    {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main-view.fxml")));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onAboutButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("about-view.fxml"));
        Parent root = loader.load();
        stage.setTitle("About");
        stage.setScene(new Scene(root, 350, 150));
        stage.show();
    }

    private double startX;
    private double startY;

    @FXML
    protected void onAddButtonClickTS2(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_2.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickTS4(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_4.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickTS6(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_6.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickTS8(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_8.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickTS10(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_10.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickTS12(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Patrat_12.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickCS6(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rotund_6.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickCS8(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rotund_8.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickCS10(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rotund_10.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickCS12(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rotund_12.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickBM(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bar_mare.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onAddButtonClickBmic(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bar_mic.png")));
        Label label = new Label("", new ImageView(image));
        anchorPane.getChildren().addAll(label);
        label.setOnMousePressed(e -> {
            startX = e.getSceneX() - label.getTranslateX();
            startY = e.getSceneY() - label.getTranslateY();
        });
        label.setOnMouseDragged(e -> {
            label.setTranslateX(e.getSceneX() - startX);
            label.setTranslateY(e.getSceneY() - startY);
        });
    }

    @FXML
    protected void onBackButtonClick(javafx.event.ActionEvent event) throws IOException
    {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSaveButtonClick(javafx.event.ActionEvent event) throws IOException {
        WritableImage image = anchorPane.snapshot(new SnapshotParameters(), null);

        FileChooser stegoImageSaver = new FileChooser();
        stegoImageSaver.setTitle("Save Image File");
        stegoImageSaver.setInitialDirectory(new File("C:\\"));
        stegoImageSaver.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG Files", "*.png"),
                new FileChooser.ExtensionFilter("BMP Files", "*.bmp"),
                new FileChooser.ExtensionFilter("GIF Files", "*.gif"));
        File f1 = stegoImageSaver.showSaveDialog(null);

        if (f1 != null) {
            String name = f1.getName();
            String extension = name.substring(1+name.lastIndexOf(".")).toLowerCase();
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), extension, f1);
        }
    }

    @FXML
    protected void onDeleteButtonClick(){
        anchorPane.getChildren().removeAll(anchorPane.getChildren().get(anchorPane.getChildren().size() - 1));
    }
}
