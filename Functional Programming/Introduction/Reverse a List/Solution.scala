def f(arr: List[Int]): List[Int] =
  (for (i <- arr.length - 1 to 0 by -1) yield arr(i)).toList