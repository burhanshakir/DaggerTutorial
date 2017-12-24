package burhan.com.daggertutorial.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import burhan.com.daggertutorial.DemoApplication;
import burhan.com.daggertutorial.data.DataManager;
import burhan.com.daggertutorial.data.DbHelper;
import burhan.com.daggertutorial.data.SharedPrefsHelper;
import burhan.com.daggertutorial.di.ApplicationContext;
import burhan.com.daggertutorial.di.module.ApplicationModule;
import dagger.Component;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}
