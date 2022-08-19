#section04-4
# 파이썬 데이터 타입(자료형)
# 딕셔너리, 집합 자료형

# 딕셔너리(dictionary) : 순서x, 중복x, 수정o, 삭제o

# Key, value (json과 비슷) ex)MongoDB

# 선언
a={'name':'Kim', 'Phone':'010-7777-7777', 'birth':870214}
b={0:'Hello Python', l:'Hello Coding'}
c={'arr':[1,2,3,4,5]}#리스트도 삽입 가능

print(type(a))#dict

# 출력
print(a('name'))#Kim
print(a('name1'))#key error: name1이라는 key 존재x
print(a.get('name'))# key name에 해당하는 value인 Kim 출력
print(a.get('address'))# key error가 나지않고 None이라 뜸 그래서 조회할때 안전하게 코딩하기 위해선 get 함수 씀 
print(c['arr'][1:3])#[2,3]

# 딕셔너리 추가
a['address']='Seoul'
print(a)# {'name':'Kim', 'Phone':'010-7777-7777', 'birth':870214, 'address'='Seoul}

a['rank']=[1,3,4]#리스트 추가
a['rank2']=(1,2,3,)#튜플 추가
print(a)# {'name':'Kim', 'Phone':'010-7777-7777', 'birth':870214, 'address':'Seoul, 'rank':[1,3,4], 'rank2':(1,2,3)}

# keys, values, items
print(a.keys())#key만 리스트 형태로 가져옴 dict_keys(['name','Phone','birth','address','rank','rank2'])
print(list(a.keys()))# ['name','Phone','birth','address','rank','rank2']

temp=list(a.keys())#key 리스트로 형변환 시켜서 temp로 선언
print(temp[1:3])# temp 리스트의 1부터 3이하 데이터 출력

print(a.values())
print(list(a.values()))#['Kim','010-7777-7777', 870214,'Seoul',[1,3,4],(1,2,3)]

print(a.items())#dict_items([('name':'Kim'), ('Phone':'010-7777-7777'), ('birth':870214), ('address':'Seoul), ('rank':[1,3,4]), ('rank2':(1,2,3))])
print(list(a.items()))# 리스트 안에 튜플이 들어간 형태로 반환 [('name':'Kim'), ('Phone':'010-7777-7777'), ('birth':870214), ('address':'Seoul), ('rank':[1,3,4]), ('rank2':(1,2,3))]
print(1 in b)#True or False 두개 값 중 하나 반환 이것의 경우 True
print('name2' in a)#True

# 집합(sets) (순서x, 중복x)
a=set()
b=set([1,2,3,4])
c=set([1,4,5,6,6])

print(type(a)) #<class 'set'>
print(c)#중복 허용하지 않아서 {1,4,5,6} 

t=tuple(b)
print(t)
l=list(b)
print(l)

s1=set([1,2,3,4,5,6])
s2=set([4,5,6,7,8,9])

# 교집합 출력
print(s1.intersection(s2))#{4,5,6}
print(s1 & s2)#{4,5,6}

# 합집합 출력
print(s1|s2)# 중복 원소 삭제 후 합 {1,2,3,4,5,6,7,8,9}
print(s1.union(s2))# 중복 원소 삭제 후 합 {1,2,3,4,5,6,7,8,9}

#차집합 출력
print(s1-s2)#{1,2,3}
print(s1.difference(s2))#{1,2,3}

# 추가
s3=set([7,8,10,15])
s3.add(18)#{7,8,10,15,18}
s3.add(18)#이미 있어서 변화 없음 {7,8,10,15,18}

# 제거
s3.remove(15)
print(s3)#{7,8,10,18}

print(type(s3))#<class 'set'>
