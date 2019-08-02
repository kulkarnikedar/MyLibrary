package uvtechsoft.shree.mylibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by shree on 8/2/2019.
 */

public class CustomButton extends Button implements View.OnClickListener {

    MyAppInit i;

    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init(){
        setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        final Intent intent = new Intent("my.package.action.MY_ACTION");
        MyAppInit.activity.startActivity(intent);
        //activity.startActivity(new Intent(activity, WelcomeActivity.class));
    }



}
