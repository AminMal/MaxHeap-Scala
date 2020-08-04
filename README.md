#Max Heap Data Structure implemented in Scala!
So basically, you have to create an instance from class MaxHeap like so:
    
    val myHeap = new maxHeap
Then you can use your object to insert Integer elements into your Heap like so:

    myHeap.insert(9)
getHeap method returns the whole heap as a Vector (java.util.Vector), so you can use it however you need to, you can also print the result using this method:

    println(myHeap.getHeap)
There are other methods such as:
* getMax: Int => This method returns the maximum amount in the heap.
* removeMax => This method removes the current maximum amount in heap.
* clear() => This method removes all elements from heap. 