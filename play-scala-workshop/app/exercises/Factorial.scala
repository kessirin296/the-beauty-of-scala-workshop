package exercises

class Factorial {
  def of(n: Int): Int = n match {
    case 0 => 1
    case x => x * of(x-1)
  }
}
