import demo.{Person, PersonHelper}

object Main  {

  def main(args: Array[String]): Unit = {

      println(PersonHelper.checkPersonAgeGroup( Person("Test", "User", 26)))

      println(PersonHelper.checkPersonAgeGroup( Person("Test", "User1", 38)))

  }

}
