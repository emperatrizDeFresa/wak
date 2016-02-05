package emperatriz.wak;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main extends Activity {


    WebView wv;
    LinearLayout iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        iv = (LinearLayout) findViewById(R.id.iv);
        wv = (WebView) findViewById(R.id.wv);
        wv.loadUrl("http://wearekiddys.com/");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                iv.setVisibility(View.GONE);
                wv.setVisibility(View.VISIBLE);
            }
        });


    }


}
