n = int(input())
natural_number = list(map(int, input().split()))
odd, even = [], []
for x in natural_number:
    if x % 2 == 0:
        even.append(x)
    elif x % 2 == 1:
        odd.append(x)
if len(odd) < len(even):
    print(natural_number.index(odd[0])+1)
else:
    print(natural_number.index(even[0])+1)
