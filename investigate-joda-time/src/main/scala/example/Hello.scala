package example

import org.joda.time.{DateTime, DateTimeZone, LocalDateTime}

object Hello extends Greeting with App {
  val dateTime = new DateTime(2021, 5, 8, 16, 30)
  println(s"dateTime: $dateTime")

  val localDateTime = new LocalDateTime(2021, 5, 8, 16, 30)
  println(s"localDateTime: $localDateTime")

  val res1 = dateTime == localDateTime
  val res2 = dateTime.toLocalDateTime == localDateTime

  println(s"$res1, $res2")
  println(dateTime.withZone(DateTimeZone.UTC))
}

trait Greeting {
  lazy val greeting: String = "hello"
}
