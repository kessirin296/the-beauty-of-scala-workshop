package exercises

class Palindrome {

  /**
   * Check the string is palindrome
   *  - case insensitive
   * Hint: use scala string tools
   * @param input
   * @return Yes or No depends on string is palindrome
   */
  //  def of(input: String): String = if (input.toLowerCase() == input.reverse.toLowerCase()) "Yes" else "No"

  def of(input: String): String = if (input equalsIgnoreCase input.reverse) "Yes" else "No"
}
