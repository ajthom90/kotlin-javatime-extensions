@file:JvmName("HolidayUtils")

package com.andrewthom.kotlin.localdate

import java.time.LocalDate

fun LocalDate.isAnyOfTheseHolidays(vararg holiday: Holiday): Boolean {
	return this.isAnyOfTheseHolidays(holiday.asIterable())
}

fun LocalDate.isAnyOfTheseHolidays(holidays: Iterable<Holiday>): Boolean {
	return holidays.any { it.evaluate(this) }
}
