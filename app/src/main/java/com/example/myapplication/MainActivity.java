package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText omsætning;
    private EditText vareforbrug;
    private EditText bruttofortjeneste;
    private EditText markedsfoeringsomkostninger;
    private EditText markedsfoeringsbidrag;
    private EditText oevrigeKapacitetsomkostninger;
    private EditText indtjeningsbidrag;
    private EditText afskrivninger;
    private EditText resultatFoerRenter;
    private EditText renteomkostninger;
    private TextView result;
    private Button knap;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        omsætning = findViewById(R.id.omsætning);
        final String OsPlaceholder = "omsætning";
        omsætning.setHint(OsPlaceholder);

        vareforbrug = findViewById(R.id.vareforbrug);
        final String VfPlaceholder = "vareforbrug";
        vareforbrug.setHint(VfPlaceholder);

        bruttofortjeneste = findViewById(R.id.bruttofortjeneste);
        final String BfTPlaceholder = "bruttofortjeneste";
        bruttofortjeneste.setHint(BfTPlaceholder);

        markedsfoeringsomkostninger = findViewById(R.id.markedsfoeringsomkostninger);
        final String MfOPlaceholder = "markedsfoeringsomkostninger";
        markedsfoeringsomkostninger.setHint(MfOPlaceholder);

        markedsfoeringsbidrag = findViewById(R.id.markedsfoeringsbidrag);
        final String MfBPlaceholder = "markedsfoeringsbidrag";
        markedsfoeringsbidrag.setHint(MfBPlaceholder);

        oevrigeKapacitetsomkostninger = findViewById(R.id.oevrigeKapacitetsomkostninger);
        final String ovKoPlaceholder = "oevrigeKapacitetsomkostninger";
        oevrigeKapacitetsomkostninger.setHint(ovKoPlaceholder);

        indtjeningsbidrag = findViewById(R.id.indtjeningsbidrag);
        final String IbPlaceholder = "indtjeningsbidrag";
        indtjeningsbidrag.setHint(IbPlaceholder);

        afskrivninger = findViewById(R.id.afskrivninger);
        final String AsPlaceholder = "afskrivninger";
        afskrivninger.setHint(AsPlaceholder);

        resultatFoerRenter = findViewById(R.id.resultatFoerRenter);
        final String RfRPlaceholder = "resultatFoerRenter";
        resultatFoerRenter.setHint(RfRPlaceholder);

        renteomkostninger = findViewById(R.id.renteomkostninger);
        final String RomPlaceholder = "renteomkostninger";
        renteomkostninger.setHint(RomPlaceholder);

        result = findViewById(R.id.result);
        final String resultText = "result = ";
        result.setText(resultText);

        knap = findViewById(R.id.Udregn);
        knap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(omsætning.getText().toString().isEmpty()){omsætning.setText(String.valueOf(first));}else{first = Double.parseDouble(omsætning.getText().toString());}
                if(vareforbrug.getText().toString().isEmpty()){vareforbrug.setText(String.valueOf(second));}else{second = Double.parseDouble(vareforbrug.getText().toString());}
                if(markedsfoeringsomkostninger.getText().toString().isEmpty()){markedsfoeringsomkostninger.setText(String.valueOf(fourth));}else{fourth = Double.parseDouble(markedsfoeringsomkostninger.getText().toString());}
                if(oevrigeKapacitetsomkostninger.getText().toString().isEmpty()){oevrigeKapacitetsomkostninger.setText(String.valueOf(sixth));}else{sixth = Double.parseDouble(oevrigeKapacitetsomkostninger.getText().toString());}
                if(afskrivninger.getText().toString().isEmpty()){afskrivninger.setText(String.valueOf(eighth));}else{eighth = Double.parseDouble(afskrivninger.getText().toString());}
                if(renteomkostninger.getText().toString().isEmpty()){renteomkostninger.setText(String.valueOf(tenth));}else{tenth = Double.parseDouble(renteomkostninger.getText().toString());}
                third = first - second;

                fifth = third - fourth;

                seventh = fifth - sixth;

                ninth = seventh - eighth;

                Fresult = ninth - tenth;
                result.setText(resultText + Fresult);

                omsætning = findViewById(R.id.omsætning);
                omsætning.setText(String.valueOf(first));

                vareforbrug = findViewById(R.id.vareforbrug);
                vareforbrug.setText(String.valueOf(second));

                bruttofortjeneste = findViewById(R.id.bruttofortjeneste);
                bruttofortjeneste.setText(String.valueOf(third));

                markedsfoeringsomkostninger = findViewById(R.id.markedsfoeringsomkostninger);
                markedsfoeringsomkostninger.setText(String.valueOf(fourth));

                markedsfoeringsbidrag = findViewById(R.id.markedsfoeringsbidrag);
                markedsfoeringsbidrag.setText(String.valueOf(fifth));

                oevrigeKapacitetsomkostninger = findViewById(R.id.oevrigeKapacitetsomkostninger);
                oevrigeKapacitetsomkostninger.setText(String.valueOf(sixth));

                indtjeningsbidrag = findViewById(R.id.indtjeningsbidrag);
                indtjeningsbidrag.setText(String.valueOf(seventh));

                afskrivninger = findViewById(R.id.afskrivninger);
                afskrivninger.setText(String.valueOf(eighth));

                resultatFoerRenter = findViewById(R.id.resultatFoerRenter);
                resultatFoerRenter.setText(String.valueOf(ninth));

                renteomkostninger = findViewById(R.id.renteomkostninger);
                renteomkostninger.setText(String.valueOf(tenth));







            }
        });




    }

}