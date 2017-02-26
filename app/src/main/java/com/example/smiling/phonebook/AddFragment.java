package com.example.smiling.phonebook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;


public class AddFragment extends Fragment{

    private CountryCodePicker ccp;
    private String countryCode;
    private EditText phoneNumberEditText;

    public AddFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        ccp = (CountryCodePicker) view.findViewById(R.id.country_code_picker);
        phoneNumberEditText = (EditText) view.findViewById(R.id.phone_number_edit_text);
            countryCode = ccp.getSelectedCountryCodeWithPlus();
            phoneNumberEditText.setText(countryCode);
            ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
                @Override
                public void onCountrySelected() {
                    countryCode = ccp.getSelectedCountryCodeWithPlus();
                    phoneNumberEditText.setText(countryCode);
                }
            });

            return view;
    }

}
