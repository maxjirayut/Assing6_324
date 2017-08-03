package rmu.it.assing6_324;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MailActivity extends AppCompatActivity {

    TextView tvmailname,tvmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        tvmailname = (TextView) findViewById(R.id.tvMailName);
        tvmail = (TextView) findViewById(R.id.tvMail);

        String mailname = getIntent().getExtras().getString("MAILNAME");
        tvmailname.setText(mailname);
        String mail = getIntent().getExtras().getString("MAIL");
        tvmail.setText(mail);

    }
}
