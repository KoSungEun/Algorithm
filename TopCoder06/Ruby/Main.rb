class FriendScore
  def highestScore(friends)
    ans = 0
    n = friends[0].length
    for i in 0...n
      cnt = 0
      for j in 0...n
        next if i == j
        if friends[i][j] == 'Y'
          cnt+=1
        else
          for k in 0...n
            if friends[j][k] == 'Y' && friends[k][i] == 'Y'
              cnt+=1
              break
            end
          end
        end
      end
      ans = [ans,cnt].max
    end
    return ans
  end
end

friends = ["NYNNN","YNYNN","NYNYN","NNYNY","NNNYN"]
puts FriendScore.new.highestScore(friends)
