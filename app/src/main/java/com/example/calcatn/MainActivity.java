package com.example.calcatn;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.ArrayList;
import Data.DatabaseHandler;
import Model.Resistor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spAtnTypes;
    String[] atnTypes = {"L-тип (Z1)", "L-тип (Z2)", "PI-тип", "U-тип (Z1)", "U-тип (Z2)", "T-тип", "H-тип"};
    ArrayAdapter atnTypesAdapter;
    ImageView imageViewScheme;
    TextView textAtnTitle, textView11, textView10, textView9, textView8, textView3, textView4, textView7, textView12, textView14;
    Button button1;
    EditText editInput, editOutput, editAtn;
    String z_1, z_2, a_;
    Integer z1=0, z2=0, a=0;
    Double k=0.0,  r3=0.0, r4=0.0, r5=0.0, r1=0.0, r2=0.0, x;
    String attType="None";
    ArrayList<Double> resistors = new ArrayList<>(1000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        databaseHandler.addRes(new Resistor(1.0));
        databaseHandler.addRes(new Resistor(1.1));
        databaseHandler.addRes(new Resistor(1.2));
        databaseHandler.addRes(new Resistor(1.3));
        databaseHandler.addRes(new Resistor(1.5));
        databaseHandler.addRes(new Resistor(1.6));
        databaseHandler.addRes(new Resistor(1.8));
        databaseHandler.addRes(new Resistor(2.0));
        databaseHandler.addRes(new Resistor(2.2));
        databaseHandler.addRes(new Resistor(2.4));
        databaseHandler.addRes(new Resistor(2.7));
        databaseHandler.addRes(new Resistor(3.0));
        databaseHandler.addRes(new Resistor(3.3));
        databaseHandler.addRes(new Resistor(3.6));
        databaseHandler.addRes(new Resistor(3.9));
        databaseHandler.addRes(new Resistor(4.3));
        databaseHandler.addRes(new Resistor(4.7));
        databaseHandler.addRes(new Resistor(5.1));
        databaseHandler.addRes(new Resistor(5.6));
        databaseHandler.addRes(new Resistor(6.2));
        databaseHandler.addRes(new Resistor(6.8));
        databaseHandler.addRes(new Resistor(7.5));
        databaseHandler.addRes(new Resistor(8.2));
        databaseHandler.addRes(new Resistor(9.1));
        databaseHandler.addRes(new Resistor(0.1));
        databaseHandler.addRes(new Resistor(0.11));
        databaseHandler.addRes(new Resistor(0.12));
        databaseHandler.addRes(new Resistor(0.13));
        databaseHandler.addRes(new Resistor(0.15));
        databaseHandler.addRes(new Resistor(0.16));
        databaseHandler.addRes(new Resistor(0.18));
        databaseHandler.addRes(new Resistor(0.2));
        databaseHandler.addRes(new Resistor(0.22));
        databaseHandler.addRes(new Resistor(0.24));
        databaseHandler.addRes(new Resistor(0.27));
        databaseHandler.addRes(new Resistor(0.3));
        databaseHandler.addRes(new Resistor(0.33));
        databaseHandler.addRes(new Resistor(0.36));
        databaseHandler.addRes(new Resistor(0.39));
        databaseHandler.addRes(new Resistor(0.43));
        databaseHandler.addRes(new Resistor(0.47));
        databaseHandler.addRes(new Resistor(0.51));
        databaseHandler.addRes(new Resistor(0.56));
        databaseHandler.addRes(new Resistor(0.62));
        databaseHandler.addRes(new Resistor(0.68));
        databaseHandler.addRes(new Resistor(0.75));
        databaseHandler.addRes(new Resistor(0.82));
        databaseHandler.addRes(new Resistor(0.91));
        databaseHandler.addRes(new Resistor(10.0));
        databaseHandler.addRes(new Resistor(11.0));
        databaseHandler.addRes(new Resistor(12.0));
        databaseHandler.addRes(new Resistor(13.0));
        databaseHandler.addRes(new Resistor(15.0));
        databaseHandler.addRes(new Resistor(16.0));
        databaseHandler.addRes(new Resistor(18.0));
        databaseHandler.addRes(new Resistor(20.0));
        databaseHandler.addRes(new Resistor(22.0));
        databaseHandler.addRes(new Resistor(24.0));
        databaseHandler.addRes(new Resistor(27.0));
        databaseHandler.addRes(new Resistor(30.0));
        databaseHandler.addRes(new Resistor(33.0));
        databaseHandler.addRes(new Resistor(36.0));
        databaseHandler.addRes(new Resistor(39.0));
        databaseHandler.addRes(new Resistor(43.0));
        databaseHandler.addRes(new Resistor(47.0));
        databaseHandler.addRes(new Resistor(51.0));
        databaseHandler.addRes(new Resistor(56.0));
        databaseHandler.addRes(new Resistor(62.0));
        databaseHandler.addRes(new Resistor(68.0));
        databaseHandler.addRes(new Resistor(75.0));
        databaseHandler.addRes(new Resistor(82.0));
        databaseHandler.addRes(new Resistor(91.0));
        databaseHandler.addRes(new Resistor(100.0));
        databaseHandler.addRes(new Resistor(110.0));
        databaseHandler.addRes(new Resistor(120.0));
        databaseHandler.addRes(new Resistor(130.0));
        databaseHandler.addRes(new Resistor(150.0));
        databaseHandler.addRes(new Resistor(160.0));
        databaseHandler.addRes(new Resistor(180.0));
        databaseHandler.addRes(new Resistor(200.0));
        databaseHandler.addRes(new Resistor(220.0));
        databaseHandler.addRes(new Resistor(240.0));
        databaseHandler.addRes(new Resistor(270.0));
        databaseHandler.addRes(new Resistor(300.0));
        databaseHandler.addRes(new Resistor(330.0));
        databaseHandler.addRes(new Resistor(360.0));
        databaseHandler.addRes(new Resistor(390.0));
        databaseHandler.addRes(new Resistor(430.0));
        databaseHandler.addRes(new Resistor(470.0));
        databaseHandler.addRes(new Resistor(510.0));
        databaseHandler.addRes(new Resistor(560.0));
        databaseHandler.addRes(new Resistor(620.0));
        databaseHandler.addRes(new Resistor(680.0));
        databaseHandler.addRes(new Resistor(750.0));
        databaseHandler.addRes(new Resistor(820.0));
        databaseHandler.addRes(new Resistor(910.0));
        databaseHandler.addRes(new Resistor(1000.0));
        databaseHandler.addRes(new Resistor(1100.0));
        databaseHandler.addRes(new Resistor(1200.0));
        databaseHandler.addRes(new Resistor(1300.0));
        databaseHandler.addRes(new Resistor(1500.0));
        databaseHandler.addRes(new Resistor(1600.0));
        databaseHandler.addRes(new Resistor(1800.0));
        databaseHandler.addRes(new Resistor(2000.0));
        databaseHandler.addRes(new Resistor(2200.0));
        databaseHandler.addRes(new Resistor(2400.0));
        databaseHandler.addRes(new Resistor(2700.0));
        databaseHandler.addRes(new Resistor(3000.0));
        databaseHandler.addRes(new Resistor(3300.0));
        databaseHandler.addRes(new Resistor(3600.0));
        databaseHandler.addRes(new Resistor(3900.0));
        databaseHandler.addRes(new Resistor(4300.0));
        databaseHandler.addRes(new Resistor(4700.0));
        databaseHandler.addRes(new Resistor(5100.0));
        databaseHandler.addRes(new Resistor(5600.0));
        databaseHandler.addRes(new Resistor(6200.0));
        databaseHandler.addRes(new Resistor(6800.0));
        databaseHandler.addRes(new Resistor(7500.0));
        databaseHandler.addRes(new Resistor(8200.0));
        databaseHandler.addRes(new Resistor(9100.0));
        databaseHandler.addRes(new Resistor(10000.0));
        databaseHandler.addRes(new Resistor(11000.0));
        databaseHandler.addRes(new Resistor(12000.0));
        databaseHandler.addRes(new Resistor(13000.0));
        databaseHandler.addRes(new Resistor(15000.0));
        databaseHandler.addRes(new Resistor(16000.0));
        databaseHandler.addRes(new Resistor(18000.0));
        databaseHandler.addRes(new Resistor(20000.0));
        databaseHandler.addRes(new Resistor(22000.0));
        databaseHandler.addRes(new Resistor(24000.0));
        databaseHandler.addRes(new Resistor(27000.0));
        databaseHandler.addRes(new Resistor(30000.0));
        databaseHandler.addRes(new Resistor(33000.0));
        databaseHandler.addRes(new Resistor(36000.0));
        databaseHandler.addRes(new Resistor(39000.0));
        databaseHandler.addRes(new Resistor(43000.0));
        databaseHandler.addRes(new Resistor(47000.0));
        databaseHandler.addRes(new Resistor(51000.0));
        databaseHandler.addRes(new Resistor(56000.0));
        databaseHandler.addRes(new Resistor(62000.0));
        databaseHandler.addRes(new Resistor(68000.0));
        databaseHandler.addRes(new Resistor(75000.0));
        databaseHandler.addRes(new Resistor(82000.0));
        databaseHandler.addRes(new Resistor(91000.0));
        databaseHandler.addRes(new Resistor(100000.0));
        databaseHandler.addRes(new Resistor(110000.0));
        databaseHandler.addRes(new Resistor(120000.0));
        databaseHandler.addRes(new Resistor(130000.0));
        databaseHandler.addRes(new Resistor(150000.0));
        databaseHandler.addRes(new Resistor(160000.0));
        databaseHandler.addRes(new Resistor(180000.0));
        databaseHandler.addRes(new Resistor(200000.0));
        databaseHandler.addRes(new Resistor(220000.0));
        databaseHandler.addRes(new Resistor(240000.0));
        databaseHandler.addRes(new Resistor(270000.0));
        databaseHandler.addRes(new Resistor(300000.0));
        databaseHandler.addRes(new Resistor(330000.0));
        databaseHandler.addRes(new Resistor(360000.0));
        databaseHandler.addRes(new Resistor(390000.0));
        databaseHandler.addRes(new Resistor(430000.0));
        databaseHandler.addRes(new Resistor(470000.0));
        databaseHandler.addRes(new Resistor(510000.0));
        databaseHandler.addRes(new Resistor(560000.0));
        databaseHandler.addRes(new Resistor(620000.0));
        databaseHandler.addRes(new Resistor(680000.0));
        databaseHandler.addRes(new Resistor(750000.0));
        databaseHandler.addRes(new Resistor(820000.0));
        databaseHandler.addRes(new Resistor(910000.0));
        databaseHandler.addRes(new Resistor(1000000.0));
        databaseHandler.addRes(new Resistor(1100000.0));
        databaseHandler.addRes(new Resistor(1200000.0));
        databaseHandler.addRes(new Resistor(1300000.0));
        databaseHandler.addRes(new Resistor(1500000.0));
        databaseHandler.addRes(new Resistor(1600000.0));
        databaseHandler.addRes(new Resistor(1800000.0));
        databaseHandler.addRes(new Resistor(2000000.0));
        databaseHandler.addRes(new Resistor(2200000.0));
        databaseHandler.addRes(new Resistor(2400000.0));
        databaseHandler.addRes(new Resistor(2700000.0));
        databaseHandler.addRes(new Resistor(3000000.0));
        databaseHandler.addRes(new Resistor(3300000.0));
        databaseHandler.addRes(new Resistor(3600000.0));
        databaseHandler.addRes(new Resistor(3900000.0));
        databaseHandler.addRes(new Resistor(4300000.0));
        databaseHandler.addRes(new Resistor(4700000.0));
        databaseHandler.addRes(new Resistor(5100000.0));
        databaseHandler.addRes(new Resistor(5600000.0));
        databaseHandler.addRes(new Resistor(6200000.0));
        databaseHandler.addRes(new Resistor(6800000.0));
        databaseHandler.addRes(new Resistor(7500000.0));
        databaseHandler.addRes(new Resistor(8200000.0));
        databaseHandler.addRes(new Resistor(9100000.0));


        List<Resistor> resList = databaseHandler.getAllRes();
        for (Resistor resistor : resList){
            resistors.add(resistor.getValue());
        }

        for (Resistor resistor : resList){
            Resistor deleteRes = databaseHandler.getRes(resistor.getId());
            databaseHandler.deleteRes(deleteRes);
        }


        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spAtnTypes = findViewById(R.id.spAtnTypes);
            atnTypesAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, atnTypes);
            atnTypesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spAtnTypes.setAdapter(atnTypesAdapter);
            spAtnTypes.setPrompt("Тип аттенюатора");
            spAtnTypes.setOnItemSelectedListener(onItemSelectedListener());
            imageViewScheme = findViewById(R.id.imageView2);
            Toast.makeText(getApplicationContext(), "Made by Sergey Kirakozov", Toast.LENGTH_LONG).show();

            button1 = findViewById(R.id.button1);
            editInput = findViewById(R.id.editInput);
            editOutput = findViewById(R.id.editOutput);
            editAtn = findViewById(R.id.editAtn);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    z_1 = String.valueOf(editInput.getEditableText());
                    z_2 = String.valueOf(editOutput.getEditableText());
                    a_ = String.valueOf(editAtn.getEditableText());

                    z1 = Integer.parseInt(z_1);
                    z2 = Integer.parseInt(z_2);
                    a = Integer.parseInt(a_);

                    
                    if (attType.equals("None")) {
                        textView11.setText("unknown");
                    } else {
                        if (attType.equals("L_type_z1")) {
                            k = Math.pow(10.0, a / 20.0);
                            r1 = z1 * (k - 1) / k;
                            r2 = z1 / (k - 1);
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" Ω");
                            }
                            if ((r2/1000.0) >= 1){
                                r2 = r2 / 1000.0;
                                textView10.setText("R2 = " + r2+" kΩ");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" kΩ");
                            } else {
                                textView10.setText("R2 = " + r2+" Ω");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");

                        }

                        if (attType.equals("L_type_z2")) {
                            k = Math.pow(10.0, a / 20.0);
                            r1 = z2 * (k - 1);
                            r2 = z2 * k / (k - 1);
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" Ω");
                            }
                            if ((r2/1000.0) >= 1){
                                r2 = r2 / 1000.0;
                                textView10.setText("R2 = " + r2+" kΩ");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" kΩ");
                            } else {
                                textView10.setText("R2 = " + r2+" Ω");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");
                        }

                        if (attType.equals("PI_type")) {
                                k = Math.pow(10.0, a / 20.0);
                                r2 = z1 * (k * k - 1) / (2*k);
                                r1 = r3 = z1 * (k + 1) / (k - 1);
                                if ((r1/1000.0) >= 1){
                                    r1 = r1 / 1000.0;
                                    textView11.setText("R1 = R3 = " + r1+" kΩ");
                                    int nearest_idx1=0;
                                    double delta1=Math.abs(resistors.get(0) -r1);
                                    for(int i=0; i<resistors.size();i++) {
                                        if (Math.abs(resistors.get(i) -r1)<delta1) {
                                            delta1=Math.abs(resistors.get(i) -r1);
                                            nearest_idx1=i;
                                        }
                                    }
                                    textView7.setText("        R1 = R3 = "+ resistors.get(nearest_idx1) +" kΩ");
                                } else {
                                    textView11.setText("R1 = R3 = " + r1+" Ω");
                                    int nearest_idx1=0;
                                    double delta1=Math.abs(resistors.get(0) -r1);
                                    for(int i=0; i<resistors.size();i++) {
                                        if (Math.abs(resistors.get(i) -r1)<delta1) {
                                            delta1=Math.abs(resistors.get(i) -r1);
                                            nearest_idx1=i;
                                        }
                                    }
                                    textView7.setText("        R1 = R3 = "+ resistors.get(nearest_idx1) +" Ω");
                                }
                                if ((r2/1000.0) >= 1){
                                    r2 = r2 / 1000.0;
                                    textView10.setText("R2 = " + r2+" kΩ");
                                    int nearest_idx2=0;
                                    double delta2=Math.abs(resistors.get(0) -r2);
                                    for(int i=0; i<resistors.size();i++) {
                                        if (Math.abs(resistors.get(i) -r2)<delta2) {
                                            delta2=Math.abs(resistors.get(i) -r2);
                                            nearest_idx2=i;
                                        }
                                    }
                                    textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" kΩ");
                                } else {
                                    textView10.setText("R2 = " + r2+" Ω");
                                    int nearest_idx2=0;
                                    double delta2=Math.abs(resistors.get(0) -r2);
                                    for(int i=0; i<resistors.size();i++) {
                                        if (Math.abs(resistors.get(i) -r2)<delta2) {
                                            delta2=Math.abs(resistors.get(i) -r2);
                                            nearest_idx2=i;
                                        }
                                    }
                                    textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" Ω");
                                }
                                textView9.setText("");
                                textView8.setText("");
                            }

                        
                        if (attType.equals("U_type_z1")) {
                            k = Math.pow(10.0, a / 20.0);
                            r1 = z1 * (k - 1) / k;
                            r2 = z1 / (k - 1);
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" Ω");
                            }
                            if ((r2/1000.0) >= 1){
                                r2 = r2 / 1000.0;
                                textView10.setText("R2 = " + r2+" kΩ");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" kΩ");
                            } else {
                                textView10.setText("R2 = " + r2+" Ω");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");

                        }

                        if (attType.equals("U_type_z2")) {
                            k = Math.pow(10.0, a / 20.0);
                            r1 = z2 * (k - 1);
                            r2 = z2 * k / (k - 1);
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = "+ resistors.get(nearest_idx1) +" Ω");
                            }
                            if ((r2/1000.0) >= 1){
                                r2 = r2 / 1000.0;
                                textView10.setText("R2 = " + r2+" kΩ");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" kΩ");
                            } else {
                                textView10.setText("R2 = " + r2+" Ω");
                                int nearest_idx2=0;
                                double delta2=Math.abs(resistors.get(0) -r2);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta2) {
                                        delta2=Math.abs(resistors.get(i) -r2);
                                        nearest_idx2=i;
                                    }
                                }
                                textView12.setText("        R2 = "+ resistors.get(nearest_idx2) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");

                        }

                        if (attType.equals("T_type")) {
                                k = Math.pow(10.0, a / 20.0);
                                x = Math.sqrt(z1 * z2);
                                r1 = r2 = z1 * (k - 1) / (k + 1);
                                r3 = x * 2 * k / ((k - 1) * (k + 1));
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = R2 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = R2 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = R2 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = R2 = "+ resistors.get(nearest_idx1) +" Ω");
                            }

                            if ((r3/1000.0) >= 1){
                                r3 = r3 / 1000.0;
                                textView10.setText("R3 = " + r3+" kΩ");
                                int nearest_idx3=0;
                                double delta3=Math.abs(resistors.get(0) -r3);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r3)<delta3) {
                                        delta3=Math.abs(resistors.get(i) -r3);
                                        nearest_idx3=i;
                                    }
                                }
                                textView12.setText("        R3 = "+ resistors.get(nearest_idx3) +" kΩ");
                            } else {
                                textView10.setText("R3 = " + r3+" Ω");
                                int nearest_idx3=0;
                                double delta3=Math.abs(resistors.get(0) -r3);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta3) {
                                        delta3=Math.abs(resistors.get(i) -r3);
                                        nearest_idx3=i;
                                    }
                                }
                                textView12.setText("        R3 = "+ resistors.get(nearest_idx3) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");
                            }
                        
                        if (attType.equals("H_type")) {
                                k = Math.pow(10.0, a / 20.0);
                                x = Math.sqrt(z1 * z2);
                                r1 = r2 = r4 = r5 = (z1 * (k - 1) / (k + 1)) / 2;
                                r3 = x * 2 * k / ((k - 1) * (k + 1));
                            if ((r1/1000.0) >= 1){
                                r1 = r1 / 1000.0;
                                textView11.setText("R1 = R2 = R4 = R5 = " + r1+" kΩ");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = R2 = R4 = R5 = "+ resistors.get(nearest_idx1) +" kΩ");
                            } else {
                                textView11.setText("R1 = R2 = R4 = R5 = " + r1+" Ω");
                                int nearest_idx1=0;
                                double delta1=Math.abs(resistors.get(0) -r1);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r1)<delta1) {
                                        delta1=Math.abs(resistors.get(i) -r1);
                                        nearest_idx1=i;
                                    }
                                }
                                textView7.setText("        R1 = R2 = R4 = R5 = "+ resistors.get(nearest_idx1) +" Ω");
                            }
                            if ((r3/1000.0) >= 1){
                                r3 = r3 / 1000.0;
                                textView10.setText("R3 = " + r3+" kΩ");
                                int nearest_idx3=0;
                                double delta3=Math.abs(resistors.get(0) -r3);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r3)<delta3) {
                                        delta3=Math.abs(resistors.get(i) -r3);
                                        nearest_idx3=i;
                                    }
                                }
                                textView12.setText("        R3 = "+ resistors.get(nearest_idx3) +" kΩ");
                            } else {
                                textView10.setText("R3 = " + r3+" Ω");
                                int nearest_idx3=0;
                                double delta3=Math.abs(resistors.get(0) -r3);
                                for(int i=0; i<resistors.size();i++) {
                                    if (Math.abs(resistors.get(i) -r2)<delta3) {
                                        delta3=Math.abs(resistors.get(i) -r3);
                                        nearest_idx3=i;
                                    }
                                }
                                textView12.setText("        R3 = "+ resistors.get(nearest_idx3) +" Ω");
                            }
                            textView9.setText("");
                            textView8.setText("");
                        }
                    }
                }
            });
        }
    }

    AdapterView.OnItemSelectedListener onItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String)adapterView.getItemAtPosition(i);
                textAtnTitle = findViewById(R.id.textView6);
                textView11 = findViewById(R.id.textView11);
                textView10 = findViewById(R.id.textView10);
                textView9 = findViewById(R.id.textView9);
                textView8 = findViewById(R.id.textView8);
                textView3 = findViewById(R.id.textView3);
                textView4 = findViewById(R.id.textView4);
                textView7 = findViewById(R.id.textView7);
                textView12 = findViewById(R.id.textView12);
                textView14 = findViewById(R.id.textView14);

                if (item == "L-тип (Z1)") {
                    textAtnTitle.setText("L-аттенюатор (Z1)");
                    imageViewScheme.setImageResource(R.drawable.scheme1);
                    attType="L_type_z1";
                    textView3.setText("");
                    textView4.setText("");

                }
                if (item == "L-тип (Z2)") {
                    textAtnTitle.setText("L-аттенюатор (Z2)");
                    imageViewScheme.setImageResource(R.drawable.scheme1);
                    attType = "L_type_z2";
                    textView3.setText("");
                    textView4.setText("");
                }

                if (item == "PI-тип") {
                    textAtnTitle.setText("PI-аттенюатор");
                    imageViewScheme.setImageResource(R.drawable.scheme2);
                    attType="PI_type";
                    textView3.setText("Для этого типа обязательно условие:");
                    textView4.setText("Z1 = Z2 !!!");

                }
                if (item == "U-тип (Z1)") {
                    textAtnTitle.setText("U-аттенюатор (Z1)");
                    imageViewScheme.setImageResource(R.drawable.scheme3);
                    attType="U_type_z1";
                    textView3.setText("");
                    textView4.setText("");
                }
                if (item == "U-тип (Z2)") {
                    textAtnTitle.setText("U-аттенюатор (Z2)");
                    imageViewScheme.setImageResource(R.drawable.scheme3);
                    attType="U_type_z2";
                    textView3.setText("");
                    textView4.setText("");
                }

                if (item == "T-тип") {
                    textAtnTitle.setText("T-аттенюатор");
                    imageViewScheme.setImageResource(R.drawable.scheme4);
                    attType="T_type";
                    textView3.setText("Для этого типа обязательно условие:");
                    textView4.setText("Z1 = Z2 !!!");
                }
                if (item == "H-тип") {
                    textAtnTitle.setText("H-аттенюатор");
                    imageViewScheme.setImageResource(R.drawable.scheme5);
                    attType="H_type";
                    textView3.setText("Для этого типа обязательно условие:");
                    textView4.setText("Z1 = Z2 !!!");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
    }

}
