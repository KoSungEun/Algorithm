class Cryptography
  def encrypt(numbers)
    let = 1
    numbers.sort!
    numbers[0] += 1
    for number in numbers
      let *= number
    end
    return let
  end
end

numbers = [1000,999,998,997,996,995]
puts Cryptography.new.encrypt(numbers)
