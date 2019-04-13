package ds

import org.scalatest.{FunSuite, Matchers}

class DoubleLinkedListTest extends FunSuite with Matchers{

  test("Create DoubleLinkedList") {
    val dll = DoubleLinkedList(1,2,3,4)

    println(dll.toString)
  }

}
