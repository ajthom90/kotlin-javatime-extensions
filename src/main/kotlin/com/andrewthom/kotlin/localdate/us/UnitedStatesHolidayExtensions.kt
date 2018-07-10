package com.andrewthom.kotlin.localdate.us

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import java.time.YearMonth
import java.time.temporal.TemporalAdjusters

/**
 * Returns if the date is New Years Day in the US
 */
fun LocalDate.isNewYearsDay() = dayOfMonth == 1 && month == Month.JANUARY

/**
 * Returns if the date is Christmas Day in the US
 */
fun LocalDate.isChristmasDay() = dayOfMonth == 25 && month == Month.DECEMBER

/**
 * Returns true if the date is Christmas Eve in the US
 */
fun LocalDate.isChristmasEve() = dayOfMonth == 24 && month == Month.DECEMBER

/**
 * Returns true if the date is the Fourth of July (U.S. Independence Day)
 */
fun LocalDate.isIndependenceDayUSA() = isFourthOfJuly()

/**
 * Returns true if the date is the Fourth of July (U.S. Independence Day)
 */
fun LocalDate.isFourthOfJuly() = dayOfMonth == 4 && month == Month.JULY

/**
 * Returns true if the date is Martin Luther King Jr. Day in the USA
 */
fun LocalDate.isMLKDay(): Boolean {
	val mlkDay = LocalDate.of(this.year, Month.JANUARY, 1).with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY))
	return this == mlkDay
}

/**
 * Returns true if the date is Martin Luther King Jr. Day in the USA
 */
fun LocalDate.isMartinLutherKingJrDay() = isMLKDay()

/**
 * Returns true if the date is Thanksgiving in the USA
 */
fun LocalDate.isThanksgiving(): Boolean {
	val thanksgiving = YearMonth.of(this.year, Month.NOVEMBER).atDay(1).with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY))
	return this == thanksgiving
}

/**
 * Returns true if the date is the day after Thanksgiving
 *
 * Many businesses treat the day after Thanksgiving as a holiday, so it is included for convenience
 */
fun LocalDate.isDayAfterThanksgiving(): Boolean {
	val dayAfterThanksgiving = YearMonth.of(this.year, Month.NOVEMBER).atDay(1).with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY)).plusDays(1)
	return this == dayAfterThanksgiving
}

/**
 * Returns true if the date is Memorial Day in the US
 */
fun LocalDate.isMemorialDay(): Boolean {
	val memorialDay = LocalDate.of(this.year, Month.MAY, 1).with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY))
	return this == memorialDay
}

/**
 * Returns true if the date is Labor Day in the US
 */
fun LocalDate.isLaborDay(): Boolean {
	val laborDay = LocalDate.of(this.year, Month.SEPTEMBER, 1).with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY))
	return this == laborDay
}

/**
 * Returns if the date is Kwanzaa in the US
 */
fun LocalDate.isKwanzaa() = dayOfMonth == 26 && month == Month.DECEMBER
