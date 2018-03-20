import demo._
import org.scalatest.FunSuite

class PersonHelperTest extends FunSuite {

  test("CheckAgeGroup") {

    val input = Person("Akarsh", "Gupta", 26)
    val expected = "young"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(expected == actual)

  }
}