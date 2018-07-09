package com.andrewthom.kotlin.localdate

import java.time.LocalDate

/**
 * returns a range from the start date (the receiver) through the end date given (inclusive of the end date)
 */
infix fun LocalDate.thru(endDate: LocalDate): List<LocalDate> {
	val list = mutableListOf<LocalDate>()
	var currentDate = this
	while (currentDate <= endDate) {
		list.add(currentDate)
		currentDate = currentDate.plusDays(1)
	}
	return list.toList()
}
