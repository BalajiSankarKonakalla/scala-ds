package ds

class Node[T](val data: T) {
  var next: Option[Node[T]] = None

  var prev: Option[Node[T]] = None
  //def setData[T](d:T) = new node(d)

  override def equals(that: Any) = that match{
    case other:  Node[T] => data.equals(other.data)
    case _ => false
  }

}
