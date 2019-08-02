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


    public CustomButton(Context context) {
        super(context);
        this.context= context;
     }




    @Override
    public void onClick(View v) {
        MyAppInit.activity.startActivity(new Intent(MyAppInit.activity, WelcomeActivity.class));
    }



}
