package com.andrewthom.kotlin.localdate.us

import java.time.LocalDate
import java.time.Month

/**
 *
 */

fun LocalDate.isNewYearsDay() = dayOfMonth == 1 && month == Month.JANUARY
fun LocalDate.isChristmasDay() = dayOfMonth == 25 && month == Month.DECEMBER
fun LocalDate.isChristmasEve() = dayOfMonth == 24 && month == Month.DECEMBER