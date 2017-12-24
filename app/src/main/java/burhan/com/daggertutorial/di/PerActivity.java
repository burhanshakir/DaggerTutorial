package burhan.com.daggertutorial.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)

public @interface PerActivity {
}
