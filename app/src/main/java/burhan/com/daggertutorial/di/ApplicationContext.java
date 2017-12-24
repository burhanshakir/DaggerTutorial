package burhan.com.daggertutorial.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by burhanuddinshakir on 24/12/17.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)

public @interface ApplicationContext {
}
