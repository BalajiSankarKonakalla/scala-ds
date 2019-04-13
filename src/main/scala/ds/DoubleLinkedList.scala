package ds

class DoubleLinkedList[T] private(elements: Seq[T]) extends LinkedList[T] {
  override def toString: String = getStr(sep="<->")
}

object DoubleLinkedList {
  def apply[T](elements: T*): DoubleLinkedList[T] = new DoubleLinkedList[T](elements)
}
