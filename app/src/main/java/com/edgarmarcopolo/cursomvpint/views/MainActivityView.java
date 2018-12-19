package com.edgarmarcopolo.cursomvpint.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.edgarmarcopolo.cursomvpint.R;
import com.edgarmarcopolo.cursomvpint.interfaces.MainActivityPresenter;
import com.edgarmarcopolo.cursomvpint.presenters.MainActivityPresenterImpl;

public class MainActivityView extends AppCompatActivity implements com.edgarmarcopolo.cursomvpint.interfaces.MainActivityView {

    TextView textView;
    EditText editText;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);

        presenter = new MainActivityPresenterImpl(this);
    }

    public void sendData(View v){
        presenter.addName(editText.getText().toString());
    }

    @Override
    public void showResult(String s) {
        textView.setText(s);
    }
}
