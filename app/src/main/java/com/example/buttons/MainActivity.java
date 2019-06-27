package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout linearLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = {"slide activity (fragment)", "button2", "button3"};
        linearLayout = findViewById(R.id.linLayout);
        for (int i = 0; i < 3; i++) {
            button = new Button(this);
            button.setId(View.generateViewId());
            button.setText(names[i]);
            button.setTag(i);
            linearLayout.addView(button);
            button.setOnClickListener(this);


        }

//        constraintLayout.setId(View.generateViewId());
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT
//        );
//        constraintLayout.setLayoutParams(layoutParams);
//        setContentView(constraintLayout);
//        Button button = new Button(this);
//        button.setId(View.generateViewId());
//        button.setText("button1");
//        ConstraintLayout.LayoutParams buttonParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        button.setLayoutParams(buttonParams);
//        ConstraintSet constraintSet = new ConstraintSet();
//        constraintSet.clone(constraintLayout);
//        constraintSet.connect(button.getId(), ConstraintSet.TOP, constraintLayout.getId(), ConstraintSet.TOP, 0);
//        constraintSet.connect(button.getId(), ConstraintSet.BOTTOM, constraintLayout.getId(), ConstraintSet.BOTTOM, 0);
//        constraintSet.connect(button.getId(), ConstraintSet.LEFT, constraintLayout.getId(), ConstraintSet.LEFT, 0);
//        constraintSet.connect(button.getId(), ConstraintSet.RIGHT, constraintLayout.getId(), ConstraintSet.RIGHT, 0);
//        constraintSet.setVerticalBias(button.getId(), (float)0.2);
//        constraintSet.setHorizontalBias(button.getId(), (float)0.2);
//        constraintSet.applyTo(constraintLayout);
//        button.setTag("button1");
//        constraintLayout.addView(button);
    }

    @Override
    public void onClick(View view) {
        String string = view.getTag().toString();
        if (string.equals("0")) {
            Intent intent = new Intent(this, SlideActivity.class);
            startActivity(intent);
        }else if(string.equals("1")){
            Intent intent = new Intent(this, ActivityDynamicFragment.class);
            startActivity(intent);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setDuration(1000);
        animationSet.setInterpolator(new BounceInterpolator());
        //TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, view.getTop(), toYDelta);
        //for (int j = 0; j < 3; j++) {

//            if (string.equals(Integer.toString(j))) {
//                Toast.makeText(this, "button" + Integer.toString(j + 1) + "was clicked", Toast.LENGTH_SHORT).show();
//            }

        //}

    }
}
