import scala.collection.mutable._
object CollDemo {
  def main(args: Array[String]): Unit = {
//    val lst = LinkedList(-1, -2, 3, 4)
//    var cur = lst
//    while (cur != Nil) {
//      if (cur.elem < 0) cur.elem = 0
//      cur = cur.next
//    }
//    lst.map(println(_))

    val set = Set(1, 2, 3, 4)
    set.add(2)
    println(set)
  }
}
