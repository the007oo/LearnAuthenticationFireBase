package com.phattarapong.learnauthenticationfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnEmail, btnPhone, btnGoogle, btnFacebook, btnTwitter, btnGithub, btnAnonymous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEmail = (Button) findViewById(R.id.btn_email);
        btnPhone = (Button) findViewById(R.id.btn_phone);
        btnGoogle = (Button) findViewById(R.id.btn_google);
        btnFacebook = (Button) findViewById(R.id.btn_facebook);
        btnTwitter = (Button) findViewById(R.id.btn_twitter);
        btnGithub = (Button) findViewById(R.id.btn_github);
        btnAnonymous = (Button) findViewById(R.id.btn_anonymous);

        btnEmail.setOnClickListener(this);
        btnPhone.setOnClickListener(this);
        btnGoogle.setOnClickListener(this);
        btnFacebook.setOnClickListener(this);
        btnTwitter.setOnClickListener(this);
        btnGithub.setOnClickListener(this);
        btnAnonymous.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_email:
                startActivity(new Intent(this,EmailActivity.class));
                break;
            case R.id.btn_phone:
                startActivity(new Intent(this,PhoneActivity.class));
                break;
            case R.id.btn_google:
                startActivity(new Intent(this,GoogleActivity.class));
                break;
            case R.id.btn_facebook:
                startActivity(new Intent(this,FacebookActivity.class));
                break;
            case R.id.btn_twitter:
                startActivity(new Intent(this,TwitterActivity.class));
                break;
            case R.id.btn_github:
                startActivity(new Intent(this,GitHubActivity.class));
                break;
            case R.id.btn_anonymous:
                startActivity(new Intent(this,AnonymousActivity.class));
                break;
        }
    }
}
