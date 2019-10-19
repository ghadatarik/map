package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.map.Base.BaseActivity;
import com.example.map.database.MyDataBase;
import com.example.map.database.model.Memory;

public class AddMemory extends BaseActivity implements View.OnClickListener {

    protected EditText title;
    protected EditText content;
    protected Button add ,image;
    double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memory);
        initView();
        latitude=getIntent().getDoubleExtra(getString(R.string.Latitude),0);
        longitude=getIntent().getDoubleExtra(getString(R.string.Longitude),0);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.add) {


            String titleS = title.getText().toString();
            String contentS = content.getText().toString();
            Memory memory =new Memory(titleS,contentS,longitude,latitude);
            MyDataBase.getInstance(this)
                    .notesDao().addMemory(memory);
            showMessage(R.string.note_added_successfully,
                    R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            finish();
                        }
                    },false);

        } else if (view.getId() == R.id.add_image) {

        }
    }

    private void initView() {
        title = (EditText) findViewById(R.id.title);
        content = (EditText) findViewById(R.id.content);
        add = (Button) findViewById(R.id.add);
        image = (Button) findViewById(R.id.add);
        add.setOnClickListener(AddMemory.this);
    }
}
