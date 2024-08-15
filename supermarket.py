def max_bags_sold(n,m,cust,bags):
    cust.sort(reverse=True)
    bags.sort(reverse=True)
    s=0
    i=0
    for d in cust:
        while i<m and bags[i][1]>d[1]:
            i=i+1
        
           
        if i<m and bags[i][0]>=d[0]:
            s=s+1
            i=i+1
            
    return s

n,m= map(int, input().split())
customers=[tuple(map(int, input().split())) for _ in range(n)]
bags = [tuple(map(int, input().split())) for _ in range(m)]

max_sold =max_bags_sold(n,m,customers, bags) 
print(max_sold,end="")