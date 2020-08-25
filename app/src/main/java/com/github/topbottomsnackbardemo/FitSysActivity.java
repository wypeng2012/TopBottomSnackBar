package com.github.topbottomsnackbardemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.topbottomsnackbar.TBSnackbar;

import qiu.niorgai.StatusBarCompat;

public class FitSysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitsystem);
        StatusBarCompat.translucentStatusBar(this,true);
    }

    public void showfitsystemwindow(View view){
        // if you use STYLE_SHOW_TOP_FITSYSTEMWINDOW ,you must use getWindow().getDecorView()
       TBSnackbar.make(getWindow().getDecorView(),"This is a fitsystemwindow snack!", TBSnackbar.LENGTH_SHORT,TBSnackbar.STYLE_SHOW_TOP_FITSYSTEMWINDOW).show();
    }

}
