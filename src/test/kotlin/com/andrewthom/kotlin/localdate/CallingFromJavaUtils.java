package com.andrewthom.kotlin.localdate;

import com.andrewthom.kotlin.localdate.us.UnitedStatesHoliday;

import java.time.LocalDate;

import static com.andrewthom.kotlin.localdate.HolidayUtils.isAnyOfTheseHolidays;

/**
 * This is to see what it is like to call stuff from Java
 */
public class CallingFromJavaUtils {
	public static boolean getAnyOfTheseHolidays() {
		return isAnyOfTheseHolidays(LocalDate.of(2018, 12, 25), UnitedStatesHoliday.CHRISTMAS_DAY, UnitedStatesHoliday.CHRISTMAS_EVE);
	}
}
