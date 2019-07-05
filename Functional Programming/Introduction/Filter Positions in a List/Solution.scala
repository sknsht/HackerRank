def f(arr: List[Int]): List[Int] = {
  val elemsWithIndices = arr.zipWithIndex
  val filteredPairs = elemsWithIndices.filter(pair => pair._2 % 2 == 1)
  val selectedElements = filteredPairs.map(_._1)
  selectedElements
}