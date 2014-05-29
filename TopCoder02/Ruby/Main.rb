class InterestingParty
  def bestInvitation(first,second)
    dic = {}
    for i in 0..first.size-1
      dic[first[i]] = 0;
      dic[second[i]] = 0;
    end
    for i in 0..first.size-1
      dic[first[i]] = dic[first[i]] + 1;
      dic[second[i]] = dic[second[i]] + 1;
    end
    ans = 0
    for value in dic.values
      ans = [ans, value].max
    end
    return ans
  end
end
first = ["fishing", "gardening", "swimming", "fishing"]
second = ["hunting", "fishing", "fishing", "biting"]
puts InterestingParty.new.bestInvitation(first,second)
