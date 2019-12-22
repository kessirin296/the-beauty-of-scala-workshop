package exercises

/**
 * on every year that is evenly divisible by 4
 * except every year that is evenly divisible by 100
 * unless the year is also evenly divisible by 400
 */
class Leap {
  def year(year: Int): Boolean = ???
  // หาร 4 ลงตัว && (หาร 400 ลงตัว || !(หาร 100 ลงตัว))
}
