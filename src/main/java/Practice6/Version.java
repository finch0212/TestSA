package Practice6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    String value();
    Date creationDate();
    String author();
    Class<?> previous() default Void.class;
}
