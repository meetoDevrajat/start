package co.terx.spinner_start;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.widget.Toast;





import android.app.Activity;


public  class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        Spinner spin =  findViewById(R.id.spinnerState);
        ArrayAdapter<CharSequence> dataadapter = ArrayAdapter.createFromResource(this,
                R.array.india_states, android.R.layout.simple_spinner_item);
        dataadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(dataadapter);
        spin.setOnItemSelectedListener(this);


        Spinner spin2 =  findViewById(R.id.spinnerCity);
        ArrayAdapter<CharSequence> cityadapter = ArrayAdapter.createFromResource(this,
                R.array.india_top_places, android.R.layout.simple_spinner_item);
        cityadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(cityadapter);
        spin2.setOnItemSelectedListener(this);


        Spinner spin3 =  findViewById(R.id.spinnerBlood);
        ArrayAdapter<CharSequence> badapter = ArrayAdapter.createFromResource(this,
                R.array.SelectBloodGroup, android.R.layout.simple_spinner_item);
        badapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(badapter);
        spin3.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id ){
        Spinner spin = (Spinner)parent;
        Spinner spin2 = (Spinner)parent;
        Spinner spin3 = (Spinner)parent;


        if(spin.getId() == R.id.spinnerState)
        {

        }
        if(spin2.getId() == R.id.spinnerCity)
        {

        }
        if(spin3.getId() == R.id.spinnerBlood)
        {


        }



    }

    public void onNothingSelected(AdapterView<?> parent){
        Toast.makeText(this, "Choose Countries :", Toast.LENGTH_SHORT).show();
    }
}