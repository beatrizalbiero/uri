def led(stri):
  d = [6,2,5,5,4,5,6,3,7,6]
  sum = 0
  for letter in stri:
      sum = sum + d[int(letter)]
  return sum
n = int(input())
for i in range(0,n):
    print (led(input()), 'leds')
