import util.control.Breaks._

class ThePalindrome {
  def find(s: String): Int = {
    var i = s.length()
    while (true) {
      var fleg = true
      breakable {
        for (j <- 0 until s.length()) {
          if ((i - j - 1) < s.length() && s(j) != s(i - j - 1)) {
            fleg = false
            break
          }
        }
      }
      if (fleg) {
        return i
      }
      i += 1
    }
    return i
  }
}