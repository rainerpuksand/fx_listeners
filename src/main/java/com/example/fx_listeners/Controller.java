package com.example.fx_listeners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button btn, btn2;

    @FXML
    Label lbl;

    @FXML
    TextField txt;



    @FXML
    public void btn_Click(ActionEvent e){

        System.out.println("Send Button Clicked");
        String name = txt.getText();
        System.out.println( "Hi " + name );
        lbl.setText(name);

    }

    @FXML
    public void pressEnter(KeyEvent e){

        if( e.getCode() == KeyCode.ENTER ){
            String name = txt.getText();
            System.out.println( "Hi " + name );
            lbl.setText(name);
           // btn.requestFocus(); //no setFocus
        }
        if (e.getCode() == KeyCode.SPACE) {
            System.out.println("Shooootttt...........");
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ooo jeeeee");
            }
        });



        /*txt.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

               if( event.getCode() == KeyCode.ENTER ){
                   String name = txt.getText();
                   System.out.println( "Hi " + name );
                   lbl.setText(name);
               }

            }
        });*/
        //===============================================

        txt.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(newValue){
                    lbl.setText("Some one is typing...");
                }else{
                    lbl.setText("");
                }
            }
        });


    }
}
