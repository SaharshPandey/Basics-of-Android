package com.example.iknownothing.threads;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button b;
    TextView tv;

    Handler h=new Handler()
    {@Override
        public void handleMessage(Message m)
        {
            tv=findViewById(R.id.textview);
            tv.setText("No Hello");

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Runnable r=new Runnable() {
                    @Override
                    public void run() {
                        //waiting for 10 seconds........
                        long future=System.currentTimeMillis()+10000;
                        while(System.currentTimeMillis()<future)
                        {
                            synchronized (this)
                            {
                                try{

                                    wait(future-System.currentTimeMillis());
                                }
                                catch(Exception e)
                                {

                                }
                            }
                        }
                        h.sendEmptyMessage(0);
                    }
                };
                Thread t=new Thread(r);
                t.start();

            }
        });


    }
}
