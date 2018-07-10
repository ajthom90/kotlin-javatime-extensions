# Kotlin Extensions for java.time

Some handy Kotlin extensions for java.time classes

[![Release](https://jitpack.io/v/com.andrewthom/spring-security-login-logger.svg)](https://jitpack.io/#com.andrewthom/spring-security-login-logger)

To use, add the following repository to your Maven configuration: 

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

And add the following dependency: 

```
<dependency>
  <groupId>com.andrewthom</groupId>
  <artifactId>kotlin-javatime-extensions</artifactId>
  <version>0.1</version> <!-- Replace with whatever the current version is -->
</dependency>
```

### Examples

This library has some basic date functions.  At this time, I have added holidays from the United States.  It can be used in a few different ways:

```kotlin
fun calculateHolidays() {
	val localDate = LocalDate.of(2018, 1, 1)
	localDate.isNewYearsDay() // returns true
	localDate.isChristmas() // returns false
	localDate.isAnyOfTheseHolidays(UnitedStatesHolidays.NEW_YEARS_DAY, UnitedStatesHolidays.CHRISTMAS) // returns true
	localDate.isAnyOfTheseHolidays(UnitedStatesHolidays.MLK_DAY, UnitedStatesHolidays.LABOR_DAY) // returns false
}
```