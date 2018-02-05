package com.example.android.japanesequizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ScrollView scrollView;

    public TextView helloTextView;
    public TextView hintOne;
    public TextView hintTwo;
    public TextView hintThree;
    public TextView hintFour;
    public TextView hintFive;
    public TextView hintSix;
    public TextView hintSeven;
    public TextView hintEight;
    public TextView hintNine;
    public TextView hintTen;
    public TextView gradeText;

    public ImageView downPointer;

    public EditText name_input;

    public RadioGroup radioGroup1;
    public RadioGroup radioGroup2;
    public RadioGroup radioGroup3;
    public RadioGroup radioGroup4;
    public RadioGroup radioGroup5;
    public RadioGroup radioGroup6;
    public RadioGroup radioGroup7;
    public RadioGroup radioGroup8;
    public RadioGroup radioGroup9;
    public RadioGroup radioGroup10;


    public RadioButton answer1a;
    public RadioButton answer1b;
    public RadioButton answer1c;

    public RadioButton answer2a;
    public RadioButton answer2b;
    public RadioButton answer2c;

    public RadioButton answer3a;
    public RadioButton answer3b;
    public RadioButton answer3c;

    public RadioButton answer4a;
    public RadioButton answer4b;
    public RadioButton answer4c;

    public RadioButton answer5a;
    public RadioButton answer5b;
    public RadioButton answer5c;

    public RadioButton answer6a;
    public RadioButton answer6b;
    public RadioButton answer6c;

    public RadioButton answer7a;
    public RadioButton answer7b;
    public RadioButton answer7c;

    public RadioButton answer8a;
    public RadioButton answer8b;
    public RadioButton answer8c;

    public RadioButton answer9a;
    public RadioButton answer9b;
    public RadioButton answer9c;

    public RadioButton answer10a;
    public RadioButton answer10b;
    public RadioButton answer10c;

    int correctAnswers;

    String scoreMessage;
    String messageWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scroll_view);
        helloTextView = findViewById(R.id.helloTextView);
        hintOne = findViewById(R.id.hint_one);
        hintTwo = findViewById(R.id.hint_two);
        hintThree = findViewById(R.id.hint_three);
        hintFour = findViewById(R.id.hint_four);
        hintFive = findViewById(R.id.hint_five);
        hintSix = findViewById(R.id.hint_six);
        hintSeven = findViewById(R.id.hint_seven);
        hintEight = findViewById(R.id.hint_eight);
        hintNine = findViewById(R.id.hint_nine);
        hintTen = findViewById(R.id.hint_ten);

        gradeText = findViewById(R.id.gradeText);

        downPointer = findViewById(R.id.downPointer);

        name_input = findViewById(R.id.nameInput);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup7 = findViewById(R.id.radioGroup7);
        radioGroup8 = findViewById(R.id.radioGroup8);
        radioGroup9 = findViewById(R.id.radioGroup9);
        radioGroup10 = findViewById(R.id.radioGroup10);

        answer1a = findViewById(R.id.answer1a);
        answer1b = findViewById(R.id.answer1b);
        answer1c = findViewById(R.id.answer1c);

        answer2a = findViewById(R.id.answer2a);
        answer2b = findViewById(R.id.answer2b);
        answer2c = findViewById(R.id.answer2c);

        answer3a = findViewById(R.id.answer3a);
        answer3b = findViewById(R.id.answer3b);
        answer3c = findViewById(R.id.answer3c);

        answer4a = findViewById(R.id.answer4a);
        answer4b = findViewById(R.id.answer4b);
        answer4c = findViewById(R.id.answer4c);

        answer5a = findViewById(R.id.answer5a);
        answer5b = findViewById(R.id.answer5b);
        answer5c = findViewById(R.id.answer5c);

        answer6a = findViewById(R.id.answer6a);
        answer6b = findViewById(R.id.answer6b);
        answer6c = findViewById(R.id.answer6c);

        answer7a = findViewById(R.id.answer7a);
        answer7b = findViewById(R.id.answer7b);
        answer7c = findViewById(R.id.answer7c);

        answer8a = findViewById(R.id.answer8a);
        answer8b = findViewById(R.id.answer8b);
        answer8c = findViewById(R.id.answer8c);

        answer9a = findViewById(R.id.answer9a);
        answer9b = findViewById(R.id.answer9b);
        answer9c = findViewById(R.id.answer9c);

        answer10a = findViewById(R.id.answer10a);
        answer10b = findViewById(R.id.answer10b);
        answer10c = findViewById(R.id.answer10c);

    }

    /**
     * When CONFIRM button is clicked, the TextView under the button fills with this message.
     */
    public void helloMessage(View view) {
        helloTextView.setText(message(name_input));
        downPointer.setImageResource(R.drawable.down_pointer);
    }

    /**
     * This method creates a string which fills helloTextView.
     *
     * @param name_input is the text that user inputs
     */
    public String message(EditText name_input) {
        Editable nameInput = name_input.getText();

        String helloMessage = getResources().getString(R.string.hello) + " " + nameInput + "!" + " ";
        helloMessage += getResources().getString(R.string.hello_message);
        return helloMessage;
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 1st question.
     */
    public String hintMessageOne() {
        String hintMessage = getResources().getString(R.string.hint_message_1);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 1st question.
     */
    public void hint_message_1(View view) {
        hintOne.setText(hintMessageOne());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 2nd question.
     */
    public String hintMessageTwo() {
        String hintMessage = getResources().getString(R.string.hint_message_2);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 2nd question.
     */
    public void hint_message_2(View view) {
        hintTwo.setText(hintMessageTwo());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 3rd question.
     */
    public String hintMessageThree() {
        String hintMessage = getResources().getString(R.string.hint_message_3);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 3rd question.
     */
    public void hint_message_3(View view) {
        hintThree.setText(hintMessageThree());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 4th question.
     */
    public String hintMessageFour() {
        String hintMessage = getResources().getString(R.string.hint_message_4);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 4th question.
     */
    public void hint_message_4(View view) {
        hintFour.setText(hintMessageFour());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 5th question.
     */
    public String hintMessageFive() {
        String hintMessage = getResources().getString(R.string.hint_message_5);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 5th question.
     */
    public void hint_message_5(View view) {
        hintFive.setText(hintMessageFive());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 6th question.
     */
    public String hintMessageSix() {
        String hintMessage = getResources().getString(R.string.hint_message_6);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 6th question.
     */
    public void hint_message_6(View view) {
        hintSix.setText(hintMessageSix());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 7th question.
     */
    public String hintMessageSeven() {
        String hintMessage = getResources().getString(R.string.hint_message_7);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 7th question.
     */
    public void hint_message_7(View view) {
        hintSeven.setText(hintMessageSeven());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 8th question.
     */
    public String hintMessageEight() {
        String hintMessage = getResources().getString(R.string.hint_message_8);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 8th question.
     */
    public void hint_message_8(View view) {
        hintEight.setText(hintMessageEight());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 9th question.
     */
    public String hintMessageNine() {
        String hintMessage = getResources().getString(R.string.hint_message_9);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 9th question.
     */
    public void hint_message_9(View view) {
        hintNine.setText(hintMessageNine());
    }

    /**
     * This method creates a String which appears if HINT button is clicked in the 10th question.
     */
    public String hintMessageTen() {
        String hintMessage = getResources().getString(R.string.hint_message_10);
        return hintMessage;
    }

    /**
     * This method is called if HINT button is clicked in the 10th question.
     */
    public void hint_message_10(View view) {
        hintTen.setText(hintMessageTen());
    }

    /**
     * This method calculates the number of correct answers.
     */
    public void calculateCorrectAnswers() {
        correctAnswers = 0;

        //Identify correct answers
        if (answer1a.isChecked()) correctAnswers++;
        if (answer2b.isChecked()) correctAnswers++;
        if (answer3a.isChecked()) correctAnswers++;
        if (answer4c.isChecked()) correctAnswers++;
        if (answer5b.isChecked()) correctAnswers++;
        if (answer6b.isChecked()) correctAnswers++;
        if (answer7c.isChecked()) correctAnswers++;
        if (answer8a.isChecked()) correctAnswers++;
        if (answer9c.isChecked()) correctAnswers++;
        if (answer10b.isChecked()) correctAnswers++;
    }

    /**
     * This method creates a message depending on score. The message appears in the toast.
     */
    public void createMessage() {
        if (correctAnswers == 10)
            scoreMessage = getResources().getString(R.string.congratulations_message);

        else {
            scoreMessage = getResources().getString(R.string.try_again) + " " + correctAnswers + "/10.";

        }

    }

    /**
     * This method builds and displays the toast and is called within grade method.
     *
     * @param scoreMessage is the message that appears in the toast, built in createMessage.
     */
    public void displayToast(String scoreMessage) {
        Toast toast = Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * This method creates a message with information about wrong answers. It fills gradeText view
     * and is called within grade method.
     *
     * @param messageWrong is the message with information about wrong answers.
     */
    public void resultsDescription(String messageWrong) {
        messageWrong = "";
        if (!answer1a.isChecked()) messageWrong += getResources().getString(R.string.wrong1);
        if (!answer2b.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong2);
        if (!answer3a.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong3);
        if (!answer4c.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong4);
        if (!answer5b.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong5);
        if (!answer6b.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong6);
        if (!answer7c.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong7);
        if (!answer8a.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong8);
        if (!answer9c.isChecked()) messageWrong += "\n" + getResources().getString(R.string.wrong9);
        if (!answer10b.isChecked())
            messageWrong += "\n" + getResources().getString(R.string.wrong10);
        gradeText.setText(messageWrong);

    }

    /**
     * This method is called when gradeButton is clicked.
     */
    public void grade(View view) {
        calculateCorrectAnswers();
        createMessage();
        displayToast(scoreMessage);
        resultsDescription(messageWrong);
    }

    /**
     * This method is called when resetButton is clicked.
     */
    public void reset(View view) {
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();
        name_input.setText(null);
        name_input.clearFocus();
        scrollView.fullScroll(ScrollView.FOCUS_UP);
        helloTextView.setText(null);
        downPointer.setImageDrawable(null);
        hintOne.setText(null);
        hintTwo.setText(null);
        hintThree.setText(null);
        hintFour.setText(null);
        hintFive.setText(null);
        hintSix.setText(null);
        hintSeven.setText(null);
        hintEight.setText(null);
        hintNine.setText(null);
        hintTen.setText(null);
        gradeText.setText(null);
    }

}

