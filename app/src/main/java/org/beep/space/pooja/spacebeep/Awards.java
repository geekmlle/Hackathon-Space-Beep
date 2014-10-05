package org.beep.space.pooja.spacebeep;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Awards extends Activity {

    private TextView mTextView;
    private Button b1;
    private int awards;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("award_image");
            System.out.println("Awards: "+value);
            try{
                int x = Integer.parseInt(value);
                awards = x;

                Resources resources = getResources();


                switch(x){
                    case 0:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_0);
                            }
                        }, 1000);
                        break;
                    }
                    case 1:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_1);
                            }
                        }, 1000);
                        //iv.setImageDrawable(resources.getDrawable(R.drawable.award_1));
                        break;
                    }
                    case 2:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_2);
                            }
                        }, 1000);
                        //iv.setImageDrawable(resources.getDrawable(R.drawable.award_2));
                        break;
                    }
                    case 3:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_3);
                            }
                        }, 1000);
                        break;
                    }
                    case 4:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_4);
                            }
                        }, 1000);
                        break;
                    }
                    case 5:{
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                iv.setBackgroundResource(R.drawable.award_5);
                            }
                        }, 1000);
                        //iv.setImageDrawable(resources.getDrawable(R.drawable.award_5));
                        break;
                    }
                }

            }catch(Exception e){}
        }
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
                iv = (ImageView) stub.findViewById(R.id.imageView2);
                b1 = (Button) stub.findViewById(R.id.play_button);
            }
        });
    }


    public void awardsButtonPlayClicked (View target){
        Intent intent = new Intent(Awards.this, Space.class);
        intent.putExtra("award_image", String.valueOf(awards));
        startActivity(intent);
    }
}
