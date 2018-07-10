package com.andrewthom.kotlin.localdate

import java.time.LocalDate

interface Holiday {
	fun evaluate(localDate: LocalDate): Boolean
}

