package id.voela.iduang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import id.voela.iduangs.IDUang;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewParsing);

        String text = IDUang.parsingIDR(1000) + " = " + IDUang.parsingRupiah(1000);
        textView.setText(text);

    }
}
