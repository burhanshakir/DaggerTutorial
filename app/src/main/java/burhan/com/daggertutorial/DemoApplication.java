package burhan.com.daggertutorial;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import burhan.com.daggertutorial.data.DataManager;
import burhan.com.daggertutorial.di.component.ApplicationComponent;
import burhan.com.daggertutorial.di.component.DaggerApplicationComponent;
import burhan.com.daggertutorial.di.module.ApplicationModule;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */

public class DemoApplication extends Application
{
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;


    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
