class InterestingDigits
  def dogots(base)
    ans = []
    for i in 2...base
      if (base-1) % i == 0
        ans << i
      end
    end
    return ans 
  end 
end

puts InterestingDigits.new.dogots(10)
