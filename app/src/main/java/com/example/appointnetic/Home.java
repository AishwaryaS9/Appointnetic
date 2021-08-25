package com.example.appointnetic;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment
{

    SQLiteDatabase db;
    Bundle bundle;
    String   username,email;
    StringBuilder outputText = new StringBuilder();
    private static final String TAG = "NavigationDrawer";

    private static final int ERROR_DIALOG_REQUEST = 9001;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //setContentView(R.layout.home);
        Intent getlogindata = getActivity().getIntent();
        // Intent getlogindataFromhome=getIntent();
        username = getlogindata.getStringExtra("username");
        email = getlogindata.getStringExtra("Email");

        ImageButton btn_doc = getView().findViewById(R.id.imageButtonDoc);
      /*  ImageButton btn_phar = getView().findViewById(R.id.imageButtonPharm);*/



        btn_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent=new Intent(getActivity(),DoctorsList.class);

                intent.putExtra("username", username);
                intent.putExtra("Email", email);



                startActivity(intent);




            }
        });
    /*    btn_phar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent=new Intent(getActivity(),Pharmacy_MapsActivity.class);
                startActivity(intent);




            }
        });*/









    }




}
