class CrazyBot
  @@grid = Array.new(100){Array.new(100,false)}
  @@vx = [1,-1,0,0]
  @@vy = [0,0,1,-1]
  @@prob = []
  def getProbability(n,east,west,south,north)
     @@prob[0] = east / 100.0
     @@prob[1] = west / 100.0
     @@prob[2] = south / 100.0
     @@prob[3] = north / 100.0
     
     return dfs(50,50,n)
  end
  def dfs(x, y, n)
    return 0 if @@grid[x][y]
    return 1 if n == 0
    @@grid[x][y] = true
    ret = 0
    for i in 0...4
      ret += dfs(x-@@vx[i],y-@@vy[i],n-1) * @@prob[i]
    end
    @@grid[x][y] = false
    return ret
  end
end
n = 2
east = 25
west = 25
south = 25
north = 25
puts CrazyBot.new.getProbability(n,east,west,south,north)
