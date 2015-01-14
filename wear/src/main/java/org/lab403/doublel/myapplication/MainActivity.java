package org.lab403.doublel.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button btn1;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                mTextView.setText("lab403");

                btn1=(Button)stub.findViewById(R.id.btn1);
                btn1.setText("大力的按我！！！！！");
                btn1.setOnClickListener(this.btnLinstener);

                txt1=(TextView)stub.findViewById(R.id.txt);
                txt1.setOnClickListener(this.btnLinstener);

            }

            private View.OnClickListener btnLinstener=new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mTextView.setText("e04 你按了我！！！！！！");

                }
            };
        });
    }
}
