package com.xjd.mol.util;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

import com.xjd.mol.util.enums.BoolEnum;

public class EnumUtilTest {

	@Test
	public void testValid() {
		assertThat(EnumUtil.valid(BoolEnum.class, "1")).isTrue();
		assertThat(catchException(EnumUtil.valid(BoolEnum.class, 1)), instanceOf);
	}

}
