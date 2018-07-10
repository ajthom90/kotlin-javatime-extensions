package com.andrewthom.kotlin.localdate;

import com.andrewthom.kotlin.localdate.religious.christian.ChristianHoliday;
import com.andrewthom.kotlin.localdate.us.UnitedStatesHoliday;

import java.time.LocalDate;

/**
 * This is used to test calling the Kotlin methods from Java
 */
public class CallingFromJavaUtils {
	public static boolean getAnyOfTheseHolidaysChristmas_ShouldReturnTrue() {
		return HolidayUtils.isAnyOfTheseHolidays(LocalDate.of(2018, 12, 25), UnitedStatesHoliday.CHRISTMAS_DAY, UnitedStatesHoliday.CHRISTMAS_EVE, ChristianHoliday.EASTER_WESTERN_CHRISTIANITY);
	}
}
