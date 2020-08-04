import java.util

object TestClass extends App {

  val myHeap = new MaxHeap
  myHeap insert(2)
  myHeap insert(3)
  myHeap insert(4)
  myHeap insert(1)
  myHeap insert(5)
  myHeap insert(7)
  myHeap insert(10)
  println(myHeap.getHeap)
  println("Max is:")
  println(myHeap.getMax)
  myHeap.removeMax
  println("Max Removed!")
  println("Now Max is:")
  println(myHeap.getMax)

  println(myHeap.getHeap)

  myHeap.removeMax
  println("Max is removed!")
  println("Now Max is: ")
  println(myHeap.getMax)
  println(myHeap.getHeap)
}
