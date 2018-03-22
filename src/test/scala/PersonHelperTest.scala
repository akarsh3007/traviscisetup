import demo._
import org.scalatest.FunSuite

class PersonHelperTest extends FunSuite {

  test("CheckAgeGroupYoung") {

    val input = Person("Test", "User", 26)
    val expected = "Young"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(expected == actual)
  }

  test("checkAgeGroupMid") {
    val input = Person("Test", "User1", 40)
    val expected = "Mid"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(actual == expected)

  }

  test("checkAgeGroupChild") {
    val input = Person("Test", "User1", 12)
    val expected = "Child"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(actual == expected)

  }

  test("checkAgeGroupTeen") {
    val input = Person("Test", "User1", 13)
    val expected = "Teen"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(actual == expected)

  }

  test("checkAgeGroupOld") {
    val input = Person("Test", "User1", 60)
    val expected = "Old"
    val actual = PersonHelper.checkPersonAgeGroup(input)
    assert(actual == expected)

  }

  test("TravisCI env variable") {

    val actual = sys.env("API_KEY")
    val expected = "super_secret"
    assert(actual == expected)

  }

}