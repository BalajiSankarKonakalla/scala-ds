package ds

import scala.annotation.tailrec

class LinkedList[T] (elements: Seq[T]) {

  val head = new Node(elements.head)

  @tailrec
  protected final def tail(n: Node[T] = head): Node[T] = {
    n.next match {
      case nextEle: Some[Node[T]] => tail(nextEle.get)
      case None => n
    }
  }
  elements.tail.foreach(e => tail().next = Some(new Node[T](e)))

  override def toString: String = {
    getStr()
  }


  def getDirection(node: Node[T], direction: Boolean = true): Option[Node[T]] = direction match {
    case true => node.next
    case false => node.prev
  }

  @tailrec
  protected final def getStr(n: Node[T] = head,  s:String = "", sep: String = " -> ", direction: Boolean = true): String = {
    getDirection(n,direction) match {
      case t: Some[Node[T]] => getStr(t.get, s + n.data + sep, sep, direction)
      case _ => s + n.data
    }
  }

  def insert(n: T) = tail().next=Some(new Node(n))

}

object LinkedList{
  def apply[T](elements: T*) = new LinkedList(elements)
}
