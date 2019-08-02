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

    Activity activity;
    Context context;

    public CustomButton(Activity activity) {
        super(activity);
        this.activity = activity;
    }


    @Override
    public void onClick(View v) {
        activity.startActivity(new Intent(activity, WelcomeActivity.class));
    }
}
