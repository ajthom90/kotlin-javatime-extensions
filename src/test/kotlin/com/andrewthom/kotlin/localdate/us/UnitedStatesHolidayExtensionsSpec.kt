package com.andrewthom.kotlin.localdate.us

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.time.LocalDate
import kotlin.test.assertEquals

object ThanksgivingSpec: Spek({
	given("a date") {
		on("checking thanksgiving 2018") {
			val thanksgiving2018 = LocalDate.of(2018, 11, 22)
			val isThanksgiving = thanksgiving2018.isThanksgiving()
			it("should be true") {
				assertEquals(true, isThanksgiving)
			}
		}
		on("checking thanksgiving 2017") {
			val thanksgiving2017 = LocalDate.of(2017, 11, 23)
			val isThanksgiving = thanksgiving2017.isThanksgiving()
			it("should be true") {
				assertEquals(true, isThanksgiving)
			}
		}
		on("checking non-thanksgiving dates") {
			val notThanksgiving1 = LocalDate.of(2019, 11, 21)
			val notThanksgiving2 = LocalDate.of(2019, 11, 29)
			val notThanksgiving3 = LocalDate.of(2018, 11, 28)
			it("should not be true") {
				assertEquals(false, notThanksgiving1.isThanksgiving())
				assertEquals(false, notThanksgiving2.isThanksgiving())
				assertEquals(false, notThanksgiving3.isThanksgiving())
			}
		}
	}
})

object ChristmasSpec: Spek({
	given("a date") {
		on("checking Christmas day") {
			val christmas = LocalDate.of(2018, 12, 25)
			it("should be true") {
				assertEquals(true, christmas.isChristmasDay())
			}
		}
		on("checking Christmas eve") {
			val christmas = LocalDate.of(2018, 12, 24)
			it("should be true") {
				assertEquals(true, christmas.isChristmasEve())
			}
		}
		on("checking Christmas Day - not the day") {
			val christmas = LocalDate.of(2018, 12, 24)
			it("should be false") {
				assertEquals(false, christmas.isChristmasDay())
			}
		}
		on("checking Christmas Eve - not the day") {
			val christmas = LocalDate.of(2018, 12, 25)
			it("should be false") {
				assertEquals(false, christmas.isChristmasEve())
			}
		}
	}
})

object MLKSpec: Spek({
	given("a date") {
		on("checking MLK day") {
			val mlkDay = LocalDate.of(2018, 1, 15)
			it("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		on("checking MLK Day - not the day") {
			val christmas = LocalDate.of(2018, 1, 16)
			it("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
		on("checking MLK day 2017") {
			val mlkDay = LocalDate.of(2017, 1, 16)
			it("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		on("checking MLK Day 2017 - not the day") {
			val christmas = LocalDate.of(2017, 1, 15)
			it("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
		on("checking MLK day 2020") {
			val mlkDay = LocalDate.of(2020, 1, 20)
			it("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		on("checking MLK Day 2020 - not the day") {
			val christmas = LocalDate.of(2020, 1, 15)
			it("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
	}
})
