package uvtechsoft.shree.mylibrary;

import android.app.Activity;
import android.content.Context;

/**
 * Created by shree on 8/2/2019.
 */

public class MyAppInit {

   public static Activity activity;



    public void init(Activity activity)
    {
        MyAppInit.activity = activity;
    }

}
