import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView);
        Button one = (Button) findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("1");
            }
        });
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("2");
            }
        });
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("3");
            }
        });
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("4");
            }
        });
        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("5");
            }
        });
        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("6");
            }
        });
        Button enter = (Button) findViewById(R.id.button7);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("\n");
            }
        });
        Button zero = (Button) findViewById(R.id.button8);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("0");
            }
        });
        Button del = (Button) findViewById(R.id.button9);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len = tv.getText().toString().length();
                if (len != 0)
                    tv.setText(tv.getText().toString().substring(0, len - 1));
            }
        });
    }
}
