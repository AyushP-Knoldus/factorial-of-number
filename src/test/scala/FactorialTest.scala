package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class FactorialTest extends AnyFlatSpec with Matchers{
  try
  {
    "Factorial" should "calculate the correct factorial value for 0" in {
      assert(Factorial.computeFactorial(0) == 1)
    }
    "Factorial" should "calculate the correct factorial value for 5" in {
      assert(Factorial.computeFactorial(5) === 120)
    }
    "Factorial" should "calculate the correct factorial value for 8" in {
      assert(Factorial.computeFactorial(8) == 40320)
    }
  }
  catch
  {
    case error: Exception =>
      println("Error while calculating factorial of a number " + error.getMessage)

  }

}
