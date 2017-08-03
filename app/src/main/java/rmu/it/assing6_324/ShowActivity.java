package rmu.it.assing6_324;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    ImageView imvshow;
    TextView tvname, tvshowadd, tvshowcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        imvshow = (ImageView) findViewById(R.id.imvShow);
        tvname = (TextView) findViewById(R.id.tvName);
        tvshowadd = (TextView) findViewById(R.id.tvShow_add);
        tvshowcall = (TextView) findViewById(R.id.tvShow_call);

        int i = getIntent().getExtras().getInt("I");
        imvshow.setImageResource(i);
        String name = getIntent().getExtras().getString("S");
        tvname.setText(name);
        String a = getIntent().getExtras().getString("A");
        tvshowadd.setText(a);
        String c = getIntent().getExtras().getString("C");
        tvshowcall.setText(c);

    }
}
