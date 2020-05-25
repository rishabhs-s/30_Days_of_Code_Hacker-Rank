n=int(input())
d = {}
for i in range(n):
    data=input().split()
    d[data[0]] = data[1]
while True:
    try:
        name=input()
        if name in d:
            print(name, "=", d[name], sep="")
        else:
            print("Not found")   
    except: break
