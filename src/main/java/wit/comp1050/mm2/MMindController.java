package wit.comp1050.mm2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class MMindController {

    //region FXML Objects
    //i remember you saying something about hard coding the GUI to avoid having 40+ variables, but i ran out of time to implement it
    @FXML Circle UserPeg1; @FXML Circle UserPeg2; @FXML Circle UserPeg3; @FXML Circle UserPeg4;
    @FXML Circle Guess10Peg1; @FXML Circle Guess10Peg2; @FXML Circle Guess10Peg3; @FXML Circle Guess10Peg4;
    @FXML Circle Guess9Peg1; @FXML Circle Guess9Peg2; @FXML Circle Guess9Peg3; @FXML Circle Guess9Peg4;
    @FXML Circle Guess8Peg1; @FXML Circle Guess8Peg2; @FXML Circle Guess8Peg3; @FXML Circle Guess8Peg4;
    @FXML Circle Guess7Peg1; @FXML Circle Guess7Peg2; @FXML Circle Guess7Peg3; @FXML Circle Guess7Peg4;
    @FXML Circle Guess6Peg1; @FXML Circle Guess6Peg2; @FXML Circle Guess6Peg3; @FXML Circle Guess6Peg4;
    @FXML Circle Guess5Peg1; @FXML Circle Guess5Peg2; @FXML Circle Guess5Peg3; @FXML Circle Guess5Peg4;
    @FXML Circle Guess4Peg1; @FXML Circle Guess4Peg2; @FXML Circle Guess4Peg3; @FXML Circle Guess4Peg4;
    @FXML Circle Guess3Peg1; @FXML Circle Guess3Peg2; @FXML Circle Guess3Peg3; @FXML Circle Guess3Peg4;
    @FXML Circle Guess2Peg1; @FXML Circle Guess2Peg2; @FXML Circle Guess2Peg3; @FXML Circle Guess2Peg4;
    @FXML Circle Guess1Peg1; @FXML Circle Guess1Peg2; @FXML Circle Guess1Peg3; @FXML Circle Guess1Peg4;
    @FXML Text Guess1Count; @FXML Text Guess2Count; @FXML Text Guess3Count; @FXML Text Guess4Count; @FXML Text Guess5Count;
    @FXML Text Guess6Count; @FXML Text Guess7Count; @FXML Text Guess8Count; @FXML Text Guess9Count; @FXML Text Guess10Count;
    @FXML Button UserSubmit;
    @FXML Button exitButton;
    //endregion

    public static int g = 0;

    public void initialize(){
        int[] input = new int[4];
        input[0] = 0; input[1] = 0; input[2] = 0; input[3] = 0;
        Code.array = Code.random();

        //region click detection
        //checks if player clicks on circles, cycles through colors.
        UserPeg1.setOnMouseClicked(e -> {//i know theres probably an easier way to do this but im just happy its running
            input[0]++;
            if(input[0]>5){
                input[0]=0;
            }
            switch(input[0]){
                case 0:
                    UserPeg1.setFill(Color.BLUE);
                    break;
                case 1:
                    UserPeg1.setFill(Color.RED);
                    break;
                case 2:
                    UserPeg1.setFill(Color.GREEN);
                    break;
                case 3:
                    UserPeg1.setFill(Color.YELLOW);
                    break;
                case 4:
                    UserPeg1.setFill(Color.PINK);
                    break;
                case 5:
                    UserPeg1.setFill(Color.ORANGE);
                    break;
            }
        });
        UserPeg2.setOnMouseClicked(e -> {
            input[1]++;
            if(input[1]>5){
                input[1]=0;
            }
            switch(input[1]) {
                case 0:
                    UserPeg2.setFill(Color.BLUE);
                    break;
                case 1:
                    UserPeg2.setFill(Color.RED);
                    break;
                case 2:
                    UserPeg2.setFill(Color.GREEN);
                    break;
                case 3:
                    UserPeg2.setFill(Color.YELLOW);
                    break;
                case 4:
                    UserPeg2.setFill(Color.PINK);
                    break;
                case 5:
                    UserPeg2.setFill(Color.ORANGE);
                    break;
            }
        });
        UserPeg3.setOnMouseClicked(e -> {
            input[2]++;
            if(input[2]>5){
                input[2]=0;
            }
            switch(input[2]) {
                case 0:
                    UserPeg3.setFill(Color.BLUE);
                    break;
                case 1:
                    UserPeg3.setFill(Color.RED);
                    break;
                case 2:
                    UserPeg3.setFill(Color.GREEN);
                    break;
                case 3:
                    UserPeg3.setFill(Color.YELLOW);
                    break;
                case 4:
                    UserPeg3.setFill(Color.PINK);
                    break;
                case 5:
                    UserPeg3.setFill(Color.ORANGE);
                    break;
            }
        });
        UserPeg4.setOnMouseClicked(e -> {
            input[3]++;
            if(input[3]>5){
                input[3]=0;
            }
            switch(input[3]) {
                case 0:
                    UserPeg4.setFill(Color.BLUE);
                    break;
                case 1:
                    UserPeg4.setFill(Color.RED);
                    break;
                case 2:
                    UserPeg4.setFill(Color.GREEN);
                    break;
                case 3:
                    UserPeg4.setFill(Color.YELLOW);
                    break;
                case 4:
                    UserPeg4.setFill(Color.PINK);
                    break;
                case 5:
                    UserPeg4.setFill(Color.ORANGE);
                    break;
            }
        });
        //endregion

        UserSubmit.setOnMouseClicked(e -> {
            int total = 0;
            Color circle1Color;
            Color circle2Color;
            Color circle3Color;
            Color circle4Color;

            total = Code.inputCheck(input);// this checks the submitted colors against the computer colors
            String sTotal = String.valueOf(total);

            //region peg switch
            switch(g){//this sets the number of correct pegs and color of guesses
                case 0:
                    Guess1Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess1Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess1Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess1Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess1Peg4.setFill(circle4Color);
                    break;
                case 1:
                    Guess2Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess2Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess2Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess2Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess2Peg4.setFill(circle4Color);
                    break;
                case 2:
                    Guess3Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess3Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess3Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess3Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess3Peg4.setFill(circle4Color);
                    break;
                case 3:
                    Guess4Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess4Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess4Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess4Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess4Peg4.setFill(circle4Color);
                    break;
                case 4:
                    Guess5Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess5Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess5Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess5Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess5Peg4.setFill(circle4Color);
                    break;
                case 5:
                    Guess6Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess6Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess6Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess6Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess6Peg4.setFill(circle4Color);
                    break;
                case 6:
                    Guess7Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess7Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess7Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess7Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess7Peg4.setFill(circle4Color);
                    break;
                case 7:
                    Guess8Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess8Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess8Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess8Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess8Peg4.setFill(circle4Color);
                    break;
                case 8:
                    Guess9Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess9Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess9Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess9Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess9Peg4.setFill(circle4Color);
                    break;
                case 9:
                    Guess10Count.setText(sTotal);
                    circle1Color = (Color) UserPeg1.getFill();
                    Guess10Peg1.setFill(circle1Color);
                    circle2Color = (Color) UserPeg2.getFill();
                    Guess10Peg2.setFill(circle2Color);
                    circle3Color = (Color) UserPeg3.getFill();
                    Guess10Peg3.setFill(circle3Color);
                    circle4Color = (Color) UserPeg4.getFill();
                    Guess10Peg4.setFill(circle4Color);
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
            //endregion

            g++;
        });

    }
    //---------------------------------------
    //make a popup window when either the code is correct OR the tries run out. popup class?
    //---------------------------------------
    //if(guess > 9){
    //  exitButton.setText("You ran out of tries");
    //}
    //if(total == 4){
    //  exitButton.setText("You won!");
    //}
    //exitButton.setOnMouseClicked(e -> {
    //  System.exit(0);
    //});
    //---------------------------------------

}