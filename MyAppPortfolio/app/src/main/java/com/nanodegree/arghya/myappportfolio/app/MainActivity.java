package com.nanodegree.arghya.myappportfolio.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonPopularMovie, mButtonStockHawk, mButtonBuildItBigger, mButtonMakeMaterialApp;
    private Button mButtonGoUbiquitos, mButtonCapstone;
    private Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonPopularMovie = (Button) findViewById(R.id.button_popular_movies);
        mButtonStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        mButtonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        mButtonMakeMaterialApp = (Button) findViewById(R.id.button_make_material_app);
        mButtonGoUbiquitos = (Button) findViewById(R.id.button_go_ubiquitous);
        mButtonCapstone = (Button) findViewById(R.id.button_capstone);

        mButtonPopularMovie.setOnClickListener(this);
        mButtonStockHawk.setOnClickListener(this);
        mButtonBuildItBigger.setOnClickListener(this);
        mButtonMakeMaterialApp.setOnClickListener(this);
        mButtonGoUbiquitos.setOnClickListener(this);
        mButtonCapstone.setOnClickListener(this);

    }


    private  void showToast(int movieNameID) {

        String toastString = String.format(getResources().getString(R.string.string_toast),
                getResources().getString(movieNameID).toLowerCase());

        if (mToast != null) {
            mToast.cancel();
        }

        mToast.makeText(this, toastString, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

        mToast = new Toast(getApplicationContext());

        switch (v.getId()) {

            case R.id.button_popular_movies:
                showToast(R.string.string_button1);
                break;

            case R.id.button_stock_hawk:
                showToast(R.string.string_button2);
                break;

            case R.id.button_build_it_bigger:
                showToast(R.string.string_button3);
                break;

            case R.id.button_make_material_app:
                showToast(R.string.string_button4);
                break;

            case R.id.button_go_ubiquitous:
                showToast(R.string.string_button5);
                break;

            case R.id.button_capstone:
                showToast(R.string.string_button6);
                break;
        }

    }

    @Override
    protected void onDestroy() {
        if (mToast != null) {
            mToast = null;
        }
        super.onDestroy();
    }
}
