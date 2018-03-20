package demo

object PersonHelper {

  def checkPersonAgeGroup(person: Person) : String = {

    if(person.age < 13 )
      "Child"
    else if(person.age <= 19 && person.age > 13)
      "Teen"
    else if(person.age <= 35 && person.age > 19)
      "young"
    else if(person.age <= 48 && person.age > 35)
      "Mid"
    else
      "old"
  }

}
