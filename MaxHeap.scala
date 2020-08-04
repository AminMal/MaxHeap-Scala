import java.util.Vector

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm

trait DS {
  def insert(element: Int): Unit
  def removeMax: Unit
  def getMax: Int
  def clear: Unit
}

class MaxHeap extends DS {
  private val data = new Vector[Int]

  override def insert(element: Int): Unit = data.addElement(element)


  override def removeMax: Unit = data.removeElementAt(0); heapify


  override def getMax: Int = {
    heapify
    data.get(0)
  }

  override def clear: Unit = data.removeAllElements()

  private def depth: Int = (math.round(math.log10(data.size()/math.log10(2)))+ 1).asInstanceOf[Int]

  private def rightChildIndex(parentIndex: Int): Int =
    if (parentIndex * 2 + 2 > data.size() - 1) parentIndex
    else parentIndex * 2 + 2

  private def leftChildIndex(parentIndex: Int): Int =
    if (parentIndex * 2 + 1 > data.size() - 1) parentIndex
    else parentIndex * 2 + 1
   private def swap(parentIndex: Int , childIndex: Int): Unit = {
     val helper = data.get(parentIndex)
     data.set(parentIndex , data.get(childIndex))
     data.set(childIndex, helper)
   }

  private def hasNext(index: Int): Boolean = index < data.size() - 1

  private def heapify: Vector[Int] = {

    var rootIndex = 0
    var rightIndex = 0
    var leftIndex = 0

    var right = 0
    var left = 0
    var root = 0
    for (_: Int <- 1 to depth) {
      for (i: Int <- 0 until data.size()) {
        rootIndex = i
        rightIndex = rightChildIndex(rootIndex)
        leftIndex  = leftChildIndex(rootIndex)
        root = data.get(rootIndex)
        right = data.get(rightIndex)
        left = data.get(leftIndex)
        if (left > root) swap(leftIndex , rootIndex)
        if (right > root) swap(rightIndex , rootIndex)
      }
    }
    data
  }

  def getHeap: Vector[Int] = heapify


}

