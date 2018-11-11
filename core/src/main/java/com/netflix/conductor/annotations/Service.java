package com.netflix.conductor.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Use the annotation to allow parameterized
 * validation on API.
 *
 * @author fjhaveri
 * Annotation
 */

@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface Service {

}