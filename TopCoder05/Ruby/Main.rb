class ThePalindrome
  def find(s)
    i = s.size
    while true
      fleg = true
      for j in 0...s.size
        if (i - j - 1) < s.size && s[j] != s[i - j - 1]
          fleg = false
          break
        end
      end
      if fleg
        return i
      end
      i += 1
    end
  end
end

s = "qwerty"
puts ThePalindrome.new.find(s)
