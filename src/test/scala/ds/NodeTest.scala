package ds

import org.scalatest.{FunSuite, Matchers}

class NodeTest extends FunSuite with Matchers{

  test("create new node"){
    val nd = new Node(5)

    nd.data shouldBe 5
    nd.next shouldBe None
  }

}
