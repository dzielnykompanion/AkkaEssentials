package part1recap

import scala.util.Try

object GeneralRecap extends App{

  val aCondition: Boolean = false

  var aVariable = 42
  aVariable += 1 // aVariable = 43

  // expressions
  val aConditionedVal = if (aCondition) 42 else 65

  // code block
  val aCodeBlock = {
    if(aCondition) 74
    56  // result is the last expression
  }

  // types
  // Unit
  val theUnit = println("Hello, Scala")

  def aFunction(x: Int): Int = x + 1
  // recursion - TAIL recursion
  def factorial(n: Int, acc: Int): Int =
    if (n <= 0) acc
    else factorial(n-1, acc*n)

  // OOP

  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog

  trait Carnivore {
    def eat(a: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(a: Animal): Unit = println("munch munch")
  }

  // method notations
  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog

  // anonymous classes
  val aCarnivore = new Carnivore {
    override def eat(a: Animal): Unit = println("crunch crunch")
  }
  aCarnivore eat aDog

  // generics
  abstract class MyList[+A] // + means covariant f.e. type of MyList of dogs is an extension of MyList of animals

  // companion objects
  object MyList

  // case classes
  case class Person(name: String, age: Int)

  // exceptions
  val aPotentialFailure = try {
    throw new RuntimeException("I'm innocet :(") // Nothing
  } catch {
    case e: Exception => "I caught exception"
  } finally {
    // side effects
    println("some logs")
  }

  // Functional programming
  val incrementer = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }
  val incremented = incrementer(42) // 43

  val anonymousIncrementer = (x: Int) => x + 1
  // Int => Int === Functions1[Int, Int]

  //FP is all about working with functions as first-class
  List(1,2,3).map(incrementer)
  // map = HOF - higher order function (takes other function as arg)

  // for comprehensions
  val pairs = for {
    num <- List(1,2,3,4)
    char <- List('a','b','c','d')
  } yield num + "-" + char
  // List(1,2,3,4).flatMap(num=> List('a','b','c','d').map(char => num + "-" char))

  // Seq, Array, List, Vector, Map, Tupples, Sets

  // "collections"
  // Options and Try
  val anOption = Some(2)
  val aTry = Try {
    throw new RuntimeException
  }

  // pattern matching
  val unknown = 2
  val order = unknown match {
    case 1 => "first"
    case 2 => "second"
    case _ => "unknown"
  }

  val bob = Person("Bob", 22)
  val greeing = bob match {
    case Person(n, _) => s"Hi, my name is $n"
    case _ => "idk"
  }


  // ALL THE PATTERNS


}
