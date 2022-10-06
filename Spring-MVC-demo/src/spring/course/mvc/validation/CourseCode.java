package spring.course.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	// DEFINE DEFAULT COURSE CODE
	public String value() default "LUV";
	
	// DEFINE DEFAULT ERROR MESSAGE
	public String message() default "Must start with LUV";
	
	// DEFINE GROUPS
	public Class<?>[] groups() default {};
	
	// DEFINE DEFAULT PAYLOADS
	public Class<? extends Payload>[] payload() default {}; 
}
