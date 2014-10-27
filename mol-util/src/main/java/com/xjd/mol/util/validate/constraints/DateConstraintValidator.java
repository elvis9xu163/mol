package com.xjd.mol.util.validate.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.xjd.mol.util.DateUtil;
import com.xjd.mol.util.validate.constraints.Date.DatePattern;

/**
 * <pre>
 * 
 * </pre>
 * 
 * @author elvis.xu
 * @since 2014-6-23
 */
public class DateConstraintValidator implements ConstraintValidator<Date, String> {

	private String pattern;

	@Override
	public void initialize(Date constraintAnnotation) {
		DatePattern pat = constraintAnnotation.pattern();
		pattern = pat.getValue();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtils.isEmpty(value)) {
			return true;
		}

		java.util.Date rt = DateUtil.parse(value, pattern);

		if (rt != null) {
			return true;
		}

		return false;
	}

}
