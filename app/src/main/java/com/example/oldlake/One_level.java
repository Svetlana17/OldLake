package com.example.oldlake;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class One_level extends  AppCompatActivity {
  /// Отсюда берем текст
    //Текст прописала в классе TwoTable
    TwoTable twoTable = new TwoTable();

    Delays delay = new Delays();



    public int line = -1;
    public int counterSecondLine = 0;
    public int secondYes = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_level);

        final TextView textView0 = findViewById(R.id.textView0);
        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);
        final TextView textView4 = findViewById(R.id.textView4);
        final TextView yesTwoLine = findViewById(R.id.yesTwoLine);
        final TextView noTwoLine = findViewById(R.id.noTwoLine);
        final TextView textView6 = findViewById(R.id.textView6);
        final ImageView imageView7 = findViewById(R.id.imageView7);
        final TextView textView8 = findViewById(R.id.textView8);
        final TextView textView9 = findViewById(R.id.textView9);
        final ImageView imageView10 = findViewById(R.id.imageView10);
        final TextView textView11 = findViewById(R.id.textView11);
        final TextView textView12 = findViewById(R.id.textView12);
        final TextView textView13 = findViewById(R.id.textView13);
        final TextView next_btn_two = findViewById(R.id.next_btn_two);


        textView0.setText(twoTable.twoScenario_en[0]);
        textView1.setText(twoTable.twoScenario_en[1]);
        textView2.setText(twoTable.twoScenario_en[2]);
        textView3.setText(twoTable.twoScenario_en[3]);
        textView4.setText(twoTable.twoScenario_en[4]);
        //button YES, NO 5
        textView6.setText(twoTable.twoScenario_en[6]);
        //image 8
        textView8.setText(twoTable.twoScenario_en[8]);
        textView9.setText(twoTable.twoScenario_en[9]);
        //image 10
        textView11.setText(twoTable.twoScenario_en[11]);
        textView12.setText(twoTable.twoScenario_en[12]);
        textView13.setText(twoTable.twoScenario_en[13]);
        //code inVisible
        textView0.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);

        yesTwoLine.setVisibility(View.INVISIBLE); //click yes
        noTwoLine.setVisibility(View.INVISIBLE); //click no

        textView6.setVisibility(View.INVISIBLE);
        imageView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);

        textView9.setVisibility(View.GONE);
        imageView10.setVisibility(View.GONE);
        textView11.setVisibility(View.GONE);

        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        next_btn_two.setVisibility(View.INVISIBLE);
        // command start asyncTask
        delay.execute();
    }
    //command clause to game
    @Override
    public void onBackPressed() {
        delay.cancel(true);
        delay = null;
        try {
            Intent intent = new Intent(One_level.this, StartActivity.class); startActivity(intent); finish();
        } catch (Exception e) {

        }
    }

    //start asyncTask
    class Delays extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            while (line <= 13) {
                if (counterSecondLine == 0 & line == 5) {
                    line = 5;
                    if (isCancelled()) return null;
                } else {
                    if (secondYes == 1 & line == 8) {
                        line = 11 ;
                    }
                    publishProgress(line = line + 1);
                    try {
                        Thread.sleep(350);
                        if (isCancelled()) return null;
                    } catch (Exception e) { }
                }
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            final TextView textView0 = findViewById(R.id.textView0);
            final TextView textView1 = findViewById(R.id.textView1);
            final TextView textView2 = findViewById(R.id.textView2);
            final TextView textView3 = findViewById(R.id.textView3);
            final TextView textView4 = findViewById(R.id.textView4);
            final TextView yesTwoLine = findViewById(R.id.yesTwoLine);
            final TextView noTwoLine = findViewById(R.id.noTwoLine);
            final TextView textView6 = findViewById(R.id.textView6);
            final ImageView imageView7 = findViewById(R.id.imageView7);
            final TextView textView8 = findViewById(R.id.textView8);
            final TextView textView9 = findViewById(R.id.textView9);
            final ImageView imageView10 = findViewById(R.id.imageView10);
            final TextView textView11 = findViewById(R.id.textView11);
            final TextView textView12 = findViewById(R.id.textView12);
            final TextView textView13 = findViewById(R.id.textView13);
            final TextView next_btn_two = findViewById(R.id.next_btn_two);
            final Animation a = AnimationUtils.loadAnimation(One_level.this, R.anim.anim_aipha);

            switch (line) {
                case 0: textView0.setVisibility(View.VISIBLE);textView0.startAnimation(a);break;
                case 1: textView1.setVisibility(View.VISIBLE);textView1.startAnimation(a);break;
                case 2: textView2.setVisibility(View.VISIBLE);textView2.startAnimation(a);break;
                case 3: textView3.setVisibility(View.VISIBLE);textView3.startAnimation(a);break;
                case 4: textView4.setVisibility(View.VISIBLE);textView4.startAnimation(a);break;
                case 5: yesTwoLine.setVisibility(View.VISIBLE);yesTwoLine.startAnimation(a);
                    yesTwoLine.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (counterSecondLine == 0) {
                                    v.startAnimation(a);
                                    counterSecondLine = 1;
                                    textView9.setVisibility(View.GONE);
                                    imageView10.setVisibility(View.GONE);
                                    textView11.setVisibility(View.GONE);
                                    secondYes = 1;
                                }
                            } catch (Exception e) {

                            }
                        }
                    });
                    noTwoLine.setVisibility(View.VISIBLE);
                    noTwoLine.startAnimation(a);
                    noTwoLine.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (counterSecondLine == 0) {
                                    v.startAnimation(a);
                                    counterSecondLine = 1;
                                    textView6.setVisibility(View.GONE);
                                    imageView7.setVisibility(View.GONE) ;
                                    textView8.setVisibility(View.GONE);
                                    line = line + 3;
                                    textView9.setVisibility(View.VISIBLE);
                                    imageView10.setVisibility(View.VISIBLE);
                                    textView11.setVisibility(View.VISIBLE);

                                }
                            } catch (Exception e) {   }
                        }
                    });
                    break;
                case 6:
                    textView6.setVisibility(View.VISIBLE);
                    textView6.startAnimation(a);
                break;
                case 7:
                    imageView7.setVisibility(View.VISIBLE);
                    imageView7.startAnimation(a);
                    break;
                case 8:
                    textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);
                    break;

                case 9: textView9.setVisibility(View.VISIBLE);textView9.startAnimation(a);break;
                case 10: imageView10.setVisibility(View.VISIBLE);imageView10.startAnimation(a);break;
                case 11: textView11.setVisibility(View.VISIBLE);textView11.startAnimation(a);break;

                case 12: textView12.setVisibility(View.VISIBLE);textView12.startAnimation(a);break;
                case 13: textView13.setVisibility(View.VISIBLE);textView13.startAnimation(a);break;
                case 14: next_btn_two.setVisibility(View.VISIBLE);next_btn_two.startAnimation(a);
                    next_btn_two.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            v.startAnimation(a);
                            try {
                                Intent intent = new Intent(One_level.this, Three_level.class);
                                startActivity(intent);
                                finish();
                            } catch (Exception e) { }
                        }
                    });
                default: break;
            }
        }
    }
}
