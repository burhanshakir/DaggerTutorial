package burhan.com.daggertutorial.di.component;

import burhan.com.daggertutorial.MainActivity;
import burhan.com.daggertutorial.di.PerActivity;
import burhan.com.daggertutorial.di.module.ActivityModule;
import dagger.Component;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent
{
    void inject(MainActivity mainActivity);

}
