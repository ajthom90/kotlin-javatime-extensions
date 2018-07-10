package com.andrewthom.kotlin.localdate.religious.christian

import java.time.LocalDate

/**
 * Calculates whether the date is Easter Sunday in Western Christianity
 *
 * This code was adapted from C# code at https://stackoverflow.com/questions/2510383/how-can-i-calculate-what-date-good-friday-falls-on-given-a-year/17368567#17368567
 */
fun LocalDate.isEasterSundayInWesternChristianity(): Boolean {
	val easter = getEasterWestern(this.year)
	return easter == this
}

private fun getEasterWestern(year: Int): LocalDate {
	var month = 3
	val g = year % 19 + 1
	val c = year / 100 + 1
	val x = (3 * c) / 4 - 12
	val y = (8 * c + 5) / 25 - 5
	val z = (5 * year) / 4 - x - 10
	var e = (11 * g + 20 + y - x) % 30
	if (e == 24) {
		e++
	}
	if ((e == 25) && (g > 11)) {
		e++
	}
	var n = 44 - e
	if (n < 21) {
		n += 30
	}
	var p = (n + 7) - ((z + n) % 7)
	if (p > 31) {
		p -= 31
		month = 4
	}
	return LocalDate.of(year, month, p)
}

/**
 * Calculates whether the date is Easter Sunday in Eastern Orthodox Christianity
 *
 * This code was adapted from C# code at https://stackoverflow.com/questions/2510383/how-can-i-calculate-what-date-good-friday-falls-on-given-a-year/17368567#17368567
 */
fun LocalDate.isEasterSundayInEasternChristianity(): Boolean {
	val easter = getEasterEastern(this.year)
	return easter == this
}

private fun getEasterEastern(year: Int): LocalDate {
	val a = year % 19
	val b = year % 7
	val c = year % 4

	val d = (19 * a + 16) % 30
	val e = (2 * c + 4 * b + 6 * d) % 7
	val f = (19 * a + 16) % 30
	val key = f + e + 3

	val month = if (key > 30) 5 else 4
	val day = if (key > 30) key - 30 else key

	return LocalDate.of(year, month, day)
}
