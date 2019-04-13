package ds

import org.scalatest.{FunSuite, Matchers}

class LinkedListTest extends FunSuite with Matchers{
  test("creation of linked List"){
    val ll = LinkedList(2,3,6)
    ll.insert(99)

    ll.head shouldBe new Node(2)
    ll.toString shouldBe "2 -> 3 -> 6 -> 99"

  }

}
