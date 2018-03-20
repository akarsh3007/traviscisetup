import demo.{Person, PersonHelper}

object Main  {

  def main(args: Array[String]): Unit = {

      println(PersonHelper.checkPersonAgeGroup( Person("Akarsh", "Gupta", 26)))

  }

}
