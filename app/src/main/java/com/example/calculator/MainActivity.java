package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ViewDigit;
    private EditText inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);

        ViewDigit = findViewById(R.id.ViewDigit);

        inputText.setShowSoftInputOnFocus(false);
    }

    private void updateText(String update){
        String past = inputText.getText().toString();

        int position = inputText.getSelectionStart();
        String left = past.substring(0, position);
        String right = past.substring(position);

        inputText.setText(String.format("%s%s%s", left, update, right));
        inputText.setSelection(position + update.length());

    }

    public void zeroButton(View view){
        updateText(getResources().getString(R.string.zero));
    }
    public void oneButton(View view){
        updateText(getResources().getString(R.string.one));
    }
    public void twoButton(View view){
        updateText(getResources().getString(R.string.two));
    }
    public void threeButton(View view){
        updateText(getResources().getString(R.string.three));
    }
    public void fourButton(View view){
        updateText(getResources().getString(R.string.four));
    }
    public void fiveButton(View view){
        updateText(getResources().getString(R.string.five));
    }
    public void sixButton(View view){
        updateText(getResources().getString(R.string.six));
    }
    public void sevenButton(View view){
        updateText(getResources().getString(R.string.seven));
    }
    public void eightButton(View view){
        updateText(getResources().getString(R.string.eight));
    }
    public void nineButton(View view){
        updateText(getResources().getString(R.string.nine));
    }
    public void equalsButton(View view){
        updateText(getResources().getString(R.string.equals));
    }
    public void subButton(View view){
        updateText(getResources().getString(R.string.sub));
    }
    public void addButton(View view){
        updateText(getResources().getString(R.string.add));
    }
    public void multiplyButton(View view){
        updateText(getResources().getString(R.string.multiply));
    }
    public void divButton(View view){
        updateText(getResources().getString(R.string.div));
    }
    public void percentButton(View view){
        updateText(getResources().getString(R.string.percent));
    }
    public void pointButton(View view){
        updateText(getResources().getString(R.string.point));
    }
    public void clearButton(View view){
        inputText.setText("");
    }
    public void backspaceButton(View view){
        int position = inputText.getSelectionStart();
        int length = inputText.getText().length();

        if (position != 0 && length != 0){
            SpannableStringBuilder select = (SpannableStringBuilder) inputText.getText();
            select.replace(position-1, position, "");
            inputText.setText(select);
            inputText.setSelection(position-1);
        }
    }
}