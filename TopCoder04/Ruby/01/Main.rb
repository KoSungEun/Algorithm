class InterestingDigits
  def dogots(base)
    ans = []
    for n in 2...base
      ok = true
      for k1 in 0...base
        for k2 in 0...base
          for k3 in 0...base
            if (k1+k2*base+k3*base*base) % n == 0 and (k1+k2+k3) % n != 0
              ok = false
              break
            end
          end
          if !ok
            break
          end
        end
        if !ok
          break
        end
      end
      if ok
        ans << n
      end
    end
    return ans 
  end 
end

puts InterestingDigits.new.dogots(10)
