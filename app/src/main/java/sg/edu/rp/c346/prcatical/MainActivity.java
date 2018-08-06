package sg.edu.rp.c346.prcatical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    WebView wvWebsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn = findViewById(R.id.spinner1);
        wvWebsite = findViewById(R.id.webView1);
        wvWebsite.setWebViewClient(new WebViewClient());
        wvWebsite.loadUrl("https://www.rp.edu.sg/");
//        int pos = spn.getSelectedItemPosition();
//
//        if(pos==0){
//            wvWebsite.loadUrl("https://www.rp.edu.sg/");
//        }else{
//            wvWebsite.loadUrl("https://www.rp.edu.sg/student-life");
//        }
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        wvWebsite.loadUrl("https://www.rp.edu.sg/");

                        break;
                    case 1:
                        wvWebsite.loadUrl("https://www.rp.edu.sg/student-life");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
