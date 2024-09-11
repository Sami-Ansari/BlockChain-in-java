package com.example.pr1;

import BlockChain.BlockChain;
import BlockChain.Block;
import Cryptocurrency.Miner;
import Cryptocurrency.Transactions;
import Cryptocurrency.Wallet;
import Cryptocurrency.TransactionOutput;
import constants.Constants;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.Security;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventListener;

public class CryptoApp extends Application {
    public static int amount1;
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Group root4 = new Group();
        Group root5 = new Group();
        Group root6 = new Group();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);
        Scene scene2 = new Scene(root2, 500, 500, Color.WHITE);
        Scene scene3 = new Scene(root3, 500, 500, Color.WHITE);
        Scene scene4 = new Scene(root4, 500, 500, Color.WHITE);
        Scene scene5 = new Scene(root5, 500, 500, Color.WHITE);
        Scene scene6 = new Scene(root6, 500,500, Color.WHITE);

        Label lb = new Label();
        lb.setText("Connected To Main Etherium Network");
        lb.setLayoutX(120);
        lb.setLayoutY(15);
        lb.setFont(Font.font("Verdana", 15));


        Rectangle rec = new Rectangle(0, 0, Color.TRANSPARENT);
        rec.setStroke(Color.BLACK);
        rec.setStrokeWidth(2);
        rec.setManaged(false);
        rec.setLayoutX(117.5);
        rec.setLayoutY(12);
        rec.setHeight(25);
        rec.setWidth(300);

        Image img7 = new Image("file:///C:/pr1/ethpic.jpg");
        ImageView imgv9 = new ImageView(img7);
        imgv9.setFitHeight(30);
        imgv9.setFitWidth(30);
        imgv9.setX(240);
        imgv9.setY(135);


        Text txt = new Text();
        txt.setText("User A(Sami)");
        txt.setLayoutX(203);
        txt.setLayoutY(115);
        txt.setFont(Font.font("Verdana", 16));
        txt.setStrokeWidth(6);



        double c = 500 ;
        double acc1 = c - amount1;
        Text txt2 = new Text();
        txt2.setText(String.valueOf(acc1));
        txt2.setLayoutX(180);
        txt2.setLayoutY(220);
        txt2.setFont(Font.font("Verdana", 36));
        txt2.setStrokeWidth(10);


        String USD = "   ETH";
        Text txt3 = new Text();
        txt3.setText(USD);
        txt3.setLayoutX(265);
        txt3.setLayoutY(220);
        txt3.setFont(Font.font("Verdana", 36));
        txt3.setStrokeWidth(10);

        int acus1 = 800000;
        Text txt4 = new Text();
        txt4.setText(String.valueOf(acus1) + " USD");
        txt4.setLayoutX(210);
        txt4.setLayoutY(250);
        txt4.setFont(Font.font("Verdana", 18));

        Button but1 = new Button("Send");
        but1.setScaleX(1.5);
        but1.setScaleY(1.5);
        but1.setScaleZ(1.5);
        but1.setLayoutX(227);
        but1.setLayoutY(300);
        but1.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but1.setOnAction(actionEvent -> stage.setScene(scene3));

        Button but4 = new Button("Change User");
        but4.setScaleX(1.5);
        but4.setScaleY(1.5);
        but4.setScaleZ(1.5);
        but4.setLayoutX(205);
        but4.setLayoutY(355);
        but4.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but4.setOnAction(actionEvent -> stage.setScene(scene2));


        Image img = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv = new ImageView(img);
        imgv.setFitWidth(45);
        imgv.setFitHeight(45);
        imgv.setX(5);

        Image img2 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv2 = new ImageView(img2);
        imgv2.setFitWidth(55);
        imgv2.setFitHeight(45);
        imgv2.setX(450);


        Line ln = new Line();
        ln.setStartX(1);
        ln.setEndX(600);
        ln.setStartY(50);
        ln.setEndY(50);
        ln.setStrokeWidth(0.25);

        // scene 2

        Label lb2 = new Label();
        lb2.setText("Connected To Main Etherium Network");
        lb2.setLayoutX(125);
        lb2.setLayoutY(15);
        lb2.setFont(Font.font("Verdana", 15));

        Rectangle rec2 = new Rectangle(0, 0, Color.TRANSPARENT);
        rec2.setStroke(Color.BLACK);
        rec2.setStrokeWidth(2);
        rec2.setManaged(false);
        rec2.setLayoutX(117.5);
        rec2.setLayoutY(12);
        rec2.setHeight(25);
        rec2.setWidth(300);


        Text txt5 = new Text();
        txt5.setText("User B(Faiz)");
        txt5.setLayoutX(203);
        txt5.setLayoutY(115);
        txt5.setFont(Font.font("Verdana", 16));
        txt5.setStrokeWidth(6);


        double acc2 = 5000;
        Text txt6 = new Text();
        txt6.setText(String.valueOf(acc1));
        txt6.setLayoutX(180);
        txt6.setLayoutY(220);
        txt6.setFont(Font.font("Verdana", 36));
        txt6.setStrokeWidth(10);

        String USD2 = "ETH";
        Text txt7 = new Text();
        txt7.setText(USD);
        txt7.setLayoutX(265);
        txt7.setLayoutY(220);
        txt7.setFont(Font.font("Verdana", 36));
        txt7.setStrokeWidth(10);

        int acus2 = 800000;
        Text txt8 = new Text();
        txt8.setText(String.valueOf(acus1) + " USD");
        txt8.setLayoutX(210);
        txt8.setLayoutY(250);
        txt8.setFont(Font.font("Verdana", 18));

        Button but2 = new Button("Send");
        but2.setScaleX(1.5);
        but2.setScaleY(1.5);
        but2.setScaleZ(1.5);
        but2.setLayoutX(227);
        but2.setLayoutY(300);
        but2.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but2.setOnAction(actionEvent -> stage.setScene(scene6));

        Image img3 = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv3 = new ImageView(img3);
        imgv3.setFitWidth(45);
        imgv3.setFitHeight(45);
        imgv3.setX(5);

        Image img4 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv4 = new ImageView(img4);
        imgv4.setFitWidth(55);
        imgv4.setFitHeight(45);
        imgv4.setX(450);

        Image img11 = new Image("file:///C:/pr1/ethpic.jpg");
        ImageView imgv11 = new ImageView(img11);
        imgv11.setFitHeight(30);
        imgv11.setFitWidth(30);
        imgv11.setX(240);
        imgv11.setY(135);

        Button but6 = new Button("Change User");
        but6.setScaleX(1.5);
        but6.setScaleY(1.5);
        but6.setScaleZ(1.5);
        but6.setLayoutX(205);
        but6.setLayoutY(355);
        but6.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but6.setOnAction(actionEvent -> stage.setScene(scene));

        Line ln2 = new Line();
        ln2.setStartX(1);
        ln2.setEndX(600);
        ln2.setStartY(50);
        ln2.setEndY(50);
        ln2.setStrokeWidth(0.25);


        //scene 3


        Label lb4 = new Label();
        lb4.setText("Connected To Main Etherium Network");
        lb4.setLayoutX(125);
        lb4.setLayoutY(15);
        lb4.setFont(Font.font("Verdana", 15));

        Rectangle rec3 = new Rectangle(0, 0, Color.TRANSPARENT);
        rec3.setStroke(Color.BLACK);
        rec3.setStrokeWidth(2);
        rec3.setManaged(false);
        rec3.setLayoutX(117.5);
        rec3.setLayoutY(12);
        rec3.setHeight(25);
        rec3.setWidth(300);

        //reciver button and textfield
        Text rec4 = new Text();
        rec4.setFont(Font.font("Verdana", 16));
        rec4.setText("Receiver");
        rec4.setLayoutX(120);
        rec4.setLayoutY(190);

        TextField tf2 = new TextField(); // tf2 receiver address
        tf2.setLayoutX(200);
        tf2.setLayoutY(170);
        tf2.setOnAction(actionEvent -> tf2.getText());


        // amount text and text field

        TextField tf3 = new TextField();
        tf3.setLayoutX(200);
        tf3.setLayoutY(220);

        tf3.setOnAction(actionEvent -> tf3.getText());
//        amount1 = Integer.parseInt(tf3.getText());
//        double amount1 = Integer.parseInt(tf3.getText());

        // amount text and text field setting
        Text txtt2 = new Text();
        txtt2.setText("Amount");
        txtt2.setFont(Font.font("Verdana", 16));
        txtt2.setLayoutX(125);
        txtt2.setLayoutY(240);

        Button butt4 = new Button("Add Transaction");
        butt4.setLayoutX(215);
        butt4.setLayoutY(280);
        butt4.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        butt4.setScaleX(1.25);
        butt4.setScaleY(1.25);
        butt4.setScaleZ(1.25);

        Image img5 = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv5 = new ImageView(img5);
        imgv5.setFitWidth(45);
        imgv5.setFitHeight(45);
        imgv5.setX(5);

        Image img6 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv6 = new ImageView(img6);
        imgv6.setFitWidth(55);
        imgv6.setFitHeight(45);
        imgv6.setX(450);

        Line ln3 = new Line();
        ln3.setStartX(1);
        ln3.setEndX(600);
        ln3.setStartY(50);
        ln3.setEndY(50);
        ln3.setStrokeWidth(0.25);


        // ok screen for user a //scene 4
        Text txtt3 = new Text();
        txtt3.setText("Transaction Sent Succesfully");
        txtt3.setLayoutX(125);
        txtt3.setLayoutY(200);
        txtt3.setFont(Font.font("Verdana", 18));

        Button but44 = new Button("Ok");
        but44.setLayoutX(220);
        but44.setLayoutY(230);
        but44.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but44.setOnAction(actionEvent -> stage.setScene(scene));
        but44.setScaleX(1.25);
        but44.setScaleY(1.25);
        but44.setScaleZ(1.25);

        Image img55 = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv55 = new ImageView(img55);
        imgv55.setFitWidth(45);
        imgv55.setFitHeight(45);
        imgv55.setX(5);

        Image img44 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv44 = new ImageView(img44);
        imgv44.setFitWidth(55);
        imgv44.setFitHeight(45);
        imgv44.setX(450);

        Line ln44 = new Line();
        ln44.setStartX(1);
        ln44.setEndX(600);
        ln44.setStartY(50);
        ln44.setEndY(50);
        ln44.setStrokeWidth(0.25);

        Label lb44 = new Label();
        lb44.setText("Connected To Main Etherium Network");
        lb44.setLayoutX(125);
        lb44.setLayoutY(15);
        lb44.setFont(Font.font("Verdana", 15));

        Rectangle rec44 = new Rectangle(0, 0, Color.TRANSPARENT);
        rec44.setStroke(Color.BLACK);
        rec44.setStrokeWidth(2);
        rec44.setManaged(false);
        rec44.setLayoutX(117.5);
        rec44.setLayoutY(12);
        rec44.setHeight(25);
        rec44.setWidth(300);

        //scene 5 ok to user b

        Text txtt55 = new Text();
        txtt55.setText("Transaction Sent Succesfully");
        txtt55.setLayoutX(125);
        txtt55.setLayoutY(200);
        txtt55.setFont(Font.font("Verdana", 18));

        Button but55 = new Button("Ok");
        but55.setLayoutX(220);
        but55.setLayoutY(230);
        but55.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        but55.setOnAction(actionEvent -> stage.setScene(scene2));
        but55.setScaleX(1.25);
        but55.setScaleY(1.25);
        but55.setScaleZ(1.25);

        Image img555 = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv555 = new ImageView(img555);
        imgv555.setFitWidth(45);
        imgv555.setFitHeight(45);
        imgv555.setX(5);

        Image img444 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv444 = new ImageView(img444);
        imgv444.setFitWidth(55);
        imgv444.setFitHeight(45);
        imgv444.setX(450);

        Line ln444 = new Line();
        ln444.setStartX(1);
        ln444.setEndX(600);
        ln444.setStartY(50);
        ln444.setEndY(50);
        ln444.setStrokeWidth(0.25);

        Label lb444 = new Label();
        lb444.setText("Connected To Main Etherium Network");
        lb444.setLayoutX(125);
        lb444.setLayoutY(15);
        lb444.setFont(Font.font("Verdana", 15));

        Rectangle rec444 = new Rectangle(0, 0, Color.TRANSPARENT);
        rec444.setStroke(Color.BLACK);
        rec444.setStrokeWidth(2);
        rec444.setManaged(false);
        rec444.setLayoutX(117.5);
        rec444.setLayoutY(12);
        rec444.setHeight(25);
        rec444.setWidth(300);


        //scene 6 user b data

        Label lb6 = new Label();
        lb6.setText("Connected To Main Etherium Network");
        lb6.setLayoutX(125);
        lb6.setLayoutY(15);
        lb6.setFont(Font.font("Verdana", 15));

        Rectangle rec6 = new Rectangle(0, 0, Color.TRANSPARENT);
        rec6.setStroke(Color.BLACK);
        rec6.setStrokeWidth(2);
        rec6.setManaged(false);
        rec6.setLayoutX(117.5);
        rec6.setLayoutY(12);
        rec6.setHeight(25);
        rec6.setWidth(300);

        //reciver button and textfield
        Text txtt6 = new Text();
        txtt6.setFont(Font.font("Verdana", 16));
        txtt6.setText("Receiver");
        txtt6.setLayoutX(120);
        txtt6.setLayoutY(190);

        TextField tf6 = new TextField(); // tf2 receiver address
        tf6.setLayoutX(200);
        tf6.setLayoutY(170);
        tf6.setOnAction(actionEvent -> tf6.getText());
        System.out.println(tf6.getText());


        // amount text and text field

        TextField tf7 = new TextField();
        tf7.setLayoutX(200);
        tf7.setLayoutY(220);
        tf7.setOnAction(actionEvent -> tf7.getText());

//        double amount1 = Integer.parseInt(tf3.getText());

        // amount text and text field setting
        Text txtt7 = new Text();
        txtt7.setText("Amount");
        txtt7.setFont(Font.font("Verdana", 16));
        txtt7.setLayoutX(125);
        txtt7.setLayoutY(240);

        Button butt6 = new Button("Add Transaction");
        butt6.setLayoutX(215);
        butt6.setLayoutY(280);
        butt6.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        butt6.setScaleX(1.25);
        butt6.setScaleY(1.25);
        butt6.setScaleZ(1.25);
        butt6.setOnAction(actionEvent -> tf7.getText());

        Button goback = new Button("Go Back");
        goback.setLayoutX(240);
        goback.setLayoutY(320);
        goback.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        goback.setScaleX(1.25);
        goback.setScaleY(1.25);
        goback.setScaleZ(1.25);
        goback.setOnAction(actionEvent -> stage.setScene(scene));

        Button goback2 = new Button("Go Back");
        goback2.setLayoutX(240);
        goback2.setLayoutY(320);
        goback2.setStyle("-fx-background-color: darkblue; -fx-text-fill: white");
        goback2.setScaleX(1.25);
        goback2.setScaleY(1.25);
        goback2.setScaleZ(1.25);
        goback2.setOnAction(actionEvent -> stage.setScene(scene2));
        Image img66 = new Image("file:///C:/pr1/metalogo.png");
        ImageView imgv66 = new ImageView(img66);
        imgv66.setFitWidth(45);
        imgv66.setFitHeight(45);
        imgv66.setX(5);

        Image img67 = new Image("file:///C:/pr1/bitpic.png");
        ImageView imgv67 = new ImageView(img67);
        imgv67.setFitWidth(55);
        imgv67.setFitHeight(45);
        imgv67.setX(450);

        Line ln6 = new Line();
        ln6.setStartX(1);
        ln6.setEndX(600);
        ln6.setStartY(50);
        ln6.setEndY(50);
        ln6.setStrokeWidth(0.25);







        stage.setTitle("Cryto Wallet");
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

        root.getChildren().add(lb);
        root.getChildren().add(ln);
        root.getChildren().add(imgv);
        root.getChildren().add(imgv2);
        root.getChildren().add(imgv9);
        root.getChildren().add(txt);
        root.getChildren().add(txt2);
        root.getChildren().add(txt3);
        root.getChildren().add(txt4);
        root.getChildren().add(but1);
        root.getChildren().add(rec);
        root.getChildren().add(but4);


        root2.getChildren().add(lb2);
        root2.getChildren().add(rec2);
        root2.getChildren().add(txt5);
        root2.getChildren().add(txt6);
        root2.getChildren().add(txt7);
        root2.getChildren().add(txt8);
        root2.getChildren().add(ln2);
        root2.getChildren().add(but2);
        root2.getChildren().add(imgv3);
        root2.getChildren().add(imgv4);
        root2.getChildren().add(imgv11);
        root2.getChildren().add(but6);

        root3.getChildren().add(imgv5);
        root3.getChildren().add(imgv6);
        root3.getChildren().add(rec3);
        root3.getChildren().add(rec4);
        root3.getChildren().add(tf2);
        root3.getChildren().add(tf3);
        root3.getChildren().add(butt4);
        root3.getChildren().add(ln3);
        root3.getChildren().add(txtt2);
        root3.getChildren().add(lb4);
        root3.getChildren().add(goback);

        root4.getChildren().add(txtt3);
        root4.getChildren().add(ln44);
        root4.getChildren().add(lb44);
        root4.getChildren().add(imgv44);
        root4.getChildren().add(imgv55);
        root4.getChildren().add(but44);

        root5.getChildren().add(lb444);
        root5.getChildren().add(ln444);
        root5.getChildren().add(rec444);
        root5.getChildren().add(txtt55);
        root5.getChildren().add(imgv444);
        root5.getChildren().add(imgv555);
        root5.getChildren().add(but55);


        root6.getChildren().add(lb6);
        root6.getChildren().add(ln6);
        root6.getChildren().add(rec6);
        root6.getChildren().add(imgv67);
        root6.getChildren().add(imgv66);
        root6.getChildren().add(txtt7);
        root6.getChildren().add(txtt6);
        root6.getChildren().add(butt6);
        root6.getChildren().add(tf6);
        root6.getChildren().add(tf7);
        root6.getChildren().add(goback2);



//        //the security provider is Bouncy Castle: more flexible than JCE
        Security.addProvider(new BouncyCastleProvider());
//
//        //create wallets + blockchain + the single miner in the network
        Wallet userA = new Wallet();
        Wallet userB = new Wallet();
        Wallet lender = new Wallet();
        BlockChain chain = new BlockChain();
        Miner miner = new Miner();
        int amount = 0;
        //create genesis transaction that sends 500 coins to userA:
        Transactions genesisTransaction = new Transactions(lender.getPublicKey(), userA.getPublicKey(), 500, null);
        genesisTransaction.generateSignature(lender.getPrivateKey());
        genesisTransaction.setTransactionId("0");
        genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.getReceiver(), genesisTransaction.getAmount(), genesisTransaction.getTransactionId()));
        BlockChain.UTXOs.put(genesisTransaction.outputs.get(0).getId(), genesisTransaction.outputs.get(0));

        System.out.println("Constructing the genesis block...");
        Block genesis = new Block(Constants.GENESIS_PREV_HASH);
        genesis.addTransaction(genesisTransaction);
        miner.mine(genesis, chain);
        Block block1 = new Block(genesis.getHash());
        System.out.println("\nuserA's balance is: " + userA.calculateBalance());


        butt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                int amount;
                amount = Integer.parseInt(tf3.getText());
                System.out.println("\nSami balance is: " + userA.calculateBalance());
                System.out.println("Sami tries to send money (" + tf3.getText() + " coins) to " + tf2.getText() + "...\n");
                block1.addTransaction(userA.transferMoney(userB.getPublicKey(), amount));
                miner.mine(block1, chain);
                System.out.println("\nSami balance is: " + userA.calculateBalance());
                System.out.println(tf2.getText() + " balance is: " + userB.calculateBalance());

            }
        });
        butt6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                int amount;
                amount = Integer.parseInt(tf7.getText());
                Block block2 = new Block(block1.getHash());
                System.out.println("\nFaiz balance is: " + userB.calculateBalance());
                System.out.println("Faiz tries to send money (" + tf7.getText() + " coins) to " + tf6.getText() + "...\n");
                block2.addTransaction(userB.transferMoney(userA.getPublicKey(), amount));
                miner.mine(block2, chain);
                System.out.println("\nFaiz balance is: " + userB.calculateBalance());
                System.out.println(tf6.getText() + " balance is: " + userA.calculateBalance());

            }
        });


    }
////}
////    public static void main(String[] args)
////    {
////        launch();
////    }
}
