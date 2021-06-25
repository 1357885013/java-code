package ljj.base.classes.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface test {
    public enum FontColor {BLUE, RED, GREEN}

    String name();

    public String tableName() default "className";
}
