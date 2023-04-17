package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
class FactorialTest extends AnyFlatSpec {
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