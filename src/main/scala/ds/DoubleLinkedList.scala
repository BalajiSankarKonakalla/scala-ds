package ds

import scala.annotation.tailrec

class DoubleLinkedList[T] (elements: Seq[T]) extends LinkedList(elements) {

  makeDLL()

  @tailrec
  private def makeDLL[T](p : Option[Node[T]] = None, n : Node[T] = head):Unit = {
    n.prev = p
    n.next match {
      case nd: Some[Node[T]] => makeDLL(Some(n), nd.get)
      case None =>
    }
  }

  override def toString: String = getStr() + "\n" + getStr(direction = false, n = tail())

}

object DoubleLinkedList {
  def apply[T](elements: T*): DoubleLinkedList[T] = new DoubleLinkedList[T](elements)
}
