package ds

import org.scalatest.{FunSuite, Matchers}

class LinkedListTest extends FunSuite with Matchers{
  test("creation of linked List"){
    // val adfsa = new LinkedList(2,3,6)
    val ll = LinkedList(2,3,6)
    println(ll)
    ll.head shouldBe new Node(2)
    ll.toString shouldBe "2 -> 3 -> 6"
  }
}
