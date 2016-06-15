package com.pallaud.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditedItem;
    Integer pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etEditedItem = (EditText) findViewById(R.id.etEditedItem);
        etEditedItem.setText(getIntent().getStringExtra("text"));
        etEditedItem.setSelection(getIntent().getStringExtra("text").length());
        pos = getIntent().getIntExtra("pos",0);
    }

    public void onSubmit(View view) {
        EditText etEditedItem = (EditText) findViewById(R.id.etEditedItem);
        Intent data = new Intent();
        data.putExtra("newText", etEditedItem.getText().toString());
        data.putExtra("pos", pos);
        setResult(RESULT_OK, data);
        finish();
    }

}
