package burhan.com.daggertutorial.di.module;

import android.app.Activity;
import android.content.Context;

import burhan.com.daggertutorial.di.ActivityContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
