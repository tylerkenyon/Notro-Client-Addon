package eu.shoroa.bridge.feature.c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface a {}


/* Location:              C:\Users\Tyler\Documents\Notro\notro.jar!\eu\shoroa\bridge\feature\c\a.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */