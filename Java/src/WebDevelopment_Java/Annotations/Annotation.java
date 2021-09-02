package WebDevelopment_Java.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;


// below annotation will be retained in all stages.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface SingleValue{
    String name();
}

// below annotation will be retained by compiler while compiling.
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@interface MultipleValue{
    String name();
    int age() default 18;
    int year();
    String company() default "";
}


public class Annotation {

/*
    @SingleValue(name="Chandra Shekhar")
    int num = 10;
    // above is giving the compile error, as we are applying method annotation to field annotation.
 */

    @MultipleValue(name = "Chandra Shekhar",age=21,year=2021,company="Beehyv")
    int num = 10;

/*
    @MultipleValue(name="Chandra Shekhar", age=21,year=2021,company="Beehyv")
    public void method(){
        System.out.println("In Super class of Annotations");
    }
    // compile error as MultipleValue annotation is only for field not method.
 */
    @SingleValue(name="Chandra Shekhar")
    public void method(){
        System.out.println("In Super class of Annotations");
    }



    @Deprecated
    public void method1(){
        System.out.println("Checking Deprecated annotation");
    }


    public static void main(String[] args) {
        Annotation c = new Annotation();
        c.method();//override.

    }
}

/*
Custom Annotations: Marker Annotations (an annotations that has no method):
i) Override
ii) Deprecated
 */

class ChildAnnotations extends Annotation {
    @Override // marker annotation
    public void method(){
        System.out.println("In child annotations class");
    }

    @SuppressWarnings("deprecation")
    public void childMethod1(){
        Annotation a = new Annotation();
        a.method();
    }

    // same as childMethod1 but not suppressing the warnings of deprecated.
    public void childMethod2(){
        Annotation a = new Annotation();
        a.method1();
    }

    @SuppressWarnings("unchecked")
    public void childMethod3(){
        List l = new ArrayList();
        l.add(2);
        l.add("Hello");
        l.add(true);
    }

    // same as childMethod2 but not suppressing the warnings of unchecked.
    public void childMethod4(){
        List l = new ArrayList();
        l.add(2);
        l.add("Hello");
        l.add(true);
    }

}