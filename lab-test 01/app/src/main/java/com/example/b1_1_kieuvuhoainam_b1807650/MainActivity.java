package com.example.b1_1_kieuvuhoainam_b1807650;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntest=(Button)findViewById(R.id.btntest); btntest.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                displayToasr("You have chscked TEST Button");
            }

        });

        ImageButton btnImage=(ImageButton) findViewById(R.id.btnImage1); btnImage.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                displayToasr("You have chscked IMAGEButton");
            }
        });

        Button btnexkit=(Button)findViewById(R.id.btnexit); btnexkit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                displayToasr("You have checked EXIT Button");
                System.exit(0);
            }

        });

        ToggleButton btnToggle=(ToggleButton) findViewById(R.id.toggle_1); btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                EditText edit=(EditText)findViewById(R.id.edittext);
                String text=edit.getText().toString();
                TextView txt=(TextView)findViewById(R.id.text);
                if(((ToggleButton)v).isChecked())

                    txt.setText(text);
                else
                    txt.setText("");





            }
        });

        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.rg); radioGroup.setOnCheckedChangeListener(new

                                                                                                                RadioGroup.OnCheckedChangeListener() {
                                                                                                                    @Override
                                                                                                                    public void onCheckedChanged(RadioGroup group, int checkedId)
                                                                                                                    {

                                                                                                                        RadioButton rb1=(RadioButton)findViewById(R.id.rb1); RadioButton rb2=(RadioButton)findViewById(R.id.rb2); ImageView image1=(ImageView)findViewById(R.id.image1); ImageView image2=(ImageView)findViewById(R.id.image2); if (rb1.isChecked()){

                                                                                                                        image1.setVisibility(ImageView.VISIBLE); image2.setVisibility(ImageView.INVISIBLE);
                                                                                                                    }

                                                                                                                        if (rb2.isChecked()){
                                                                                                                            image2.setVisibility(ImageView.VISIBLE);
                                                                                                                            image1.setVisibility(ImageView.INVISIBLE);

                                                                                                                        }
                                                                                                                    }
                                                                                                                });

        CheckBox chkAutoSau=(CheckBox) findViewById(R.id.chkAutosave); chkAutoSau.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(((CheckBox)v).isChecked())

                    displayToasr("AutoSave CheckBox have checked"); else

                    displayToasr("AutoSave CheckBox have unchecked");
            }
        });

        CheckBox chkStar=(CheckBox) findViewById(R.id.star); chkStar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(((CheckBox)v).isChecked())

                    displayToasr("StarStyle CheckBox have checked"); else
                    displayToasr("StarSyle CheckBox have unchecked");

            }
        });
    }

    private void displayToasr(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }
}
