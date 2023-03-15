package com.knoldus

import scala.annotation.tailrec

object Factorial extends App{
  def computeFactorial(number : Int) : Int={
    @tailrec
    def calculateFactorialUsingTail(copyOfNumber :Int , result : Int) : Int={
      if(copyOfNumber <= 1)
        {
          result
        }
      else
        {
          calculateFactorialUsingTail(copyOfNumber - 1 , copyOfNumber * result)
        }
    }
    calculateFactorialUsingTail(number , 1)
  }
 //println(computeFactorial(5))
}
