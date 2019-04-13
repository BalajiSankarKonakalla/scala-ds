package ds

import scala.annotation.tailrec

class LinkedList[T] private(elements: Seq[T]) {

  val head = new Node(elements.head)
  @tailrec
  private def tail(n: Node[T] = head): Node[T] = {
    n.next match {
      case nextEle: Some[Node[T]] => tail(nextEle.get)
      case None => n
    }
  }
  elements.tail.foreach(e => tail().next = Some(new Node[T](e)))

  override def toString: String = {
    getStr(head)
  }

  @tailrec
  protected final def getStr(n: Node[T] = head,  s:String = "", sep: String = " -> "): String = {
    n.next match {
      case t: Some[Node[T]] => getStr(t.get, s + n.data + sep)
      case _ => s + n.data
    }
  }

}

object LinkedList{
  def apply[T](elements: T*) = new LinkedList(elements)
}
