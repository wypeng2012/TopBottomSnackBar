package com.github.topbottomsnackbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.topbottomsnackbar.TBSnackbar;

import static com.github.topbottomsnackbar.TBSnackbar.STYLE_SHOW_BOTTOM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showtop(View view) {
        // if you use STYLE_SHOW_TOP and your activity has toolbar or actionbar ,you should use "findViewById(android.R.id.content)",must not use "getWindow().getDecorView()"
        TBSnackbar.make(findViewById(android.R.id.content), "This is a top snack!", TBSnackbar.LENGTH_SHORT, TBSnackbar.STYLE_SHOW_TOP).show();
    }

    public void showbottom(View view) {
        // if you use STYLE_SHOW_BOTTOM  ,you can use any view.But if you use CoordinatorLayout,you must use CoordinatorLayout.
        TBSnackbar.make(findViewById(android.R.id.content), "This is a bottom snack!", TBSnackbar.LENGTH_SHORT, TBSnackbar.STYLE_SHOW_BOTTOM).show();
    }

    public void showfitsystemwindow(View view) {
        startActivity(new Intent(this, FitSysActivity.class));
        // if you use STYLE_SHOW_TOP_FITSYSTEMWINDOW ,you must use getWindow().getDecorView()
        // TBSnackbar.make(findViewById(android.R.id.content),"This is a bottom snack!",TBSnackbar.LENGTH_SHORT,TBSnackbar.STYLE_SHOW_TOP_FITSYSTEMWINDOW).show();
    }

    public void showicon(View view) {

        TBSnackbar snackbar = TBSnackbar.make(findViewById(android.R.id.content), "This is a left icon snack!", TBSnackbar.LENGTH_SHORT, TBSnackbar.STYLE_SHOW_TOP);
        snackbar.setIconLeft(R.mipmap.ic_core,24);
        snackbar.show();
    }
    public void showaction(View view) {

        final TBSnackbar snackbar = TBSnackbar.make(findViewById(android.R.id.content), "This is a action snack!", TBSnackbar.LENGTH_INDEFINITE, TBSnackbar.STYLE_SHOW_TOP);
        snackbar.setAction("Action", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }
}
