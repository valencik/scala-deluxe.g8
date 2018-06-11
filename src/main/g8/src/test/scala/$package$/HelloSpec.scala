package $package$

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }

  it should "print hello" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      Hello.main(Array())
    }
    stream.toString shouldEqual "hello\n"
  }
}
