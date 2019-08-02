package uvtechsoft.shree.mylibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by shree on 8/2/2019.
 */

public class CustomButton extends Button implements View.OnClickListener {


    Context context;
    Activity activity;

    MyAppInit i;

    public CustomButton(Context context) {
        super(context);
        i = new MyAppInit();
        this.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        final Intent intent = new Intent("my.package.action.MY_ACTION");
        MyAppInit.activity.startActivity(intent);
        //activity.startActivity(new Intent(activity, WelcomeActivity.class));
    }



}
