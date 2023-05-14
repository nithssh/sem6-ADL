import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button go;
    EditText site;
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        site = (EditText) findViewById(R.id.website_name);
        go = (Button) findViewById(R.id.go);

        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new MyBrowser());

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = site.getText().toString();
                myWebView.loadUrl(url);
            }
        });
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
