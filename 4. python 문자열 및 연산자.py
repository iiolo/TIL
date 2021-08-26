# 문자열 생성, 길이
# - str(‘’)로 생성 가능
# - ‘ ’, “ ”로 생성 가능
# - 문자열의 길이 알아보는 법 : print(len(문자열을 넣은 변수이름))
# - 예제
str1 ="I am boy"
str2='NiceMan'
str3=''
str4 = str('ace')
print(len(str1), len(str2, len(str3))

# escape 문자
# - \을 사용해서 “”안에 “”을 또 작성 할 수 있다.
# - \t 네칸정도 비워짐
# 3.raw string : 경로 표시할 때 많이 사용
# - r’ ’ 이나 r “ “로 사용
# - ‘ ‘ 안에서 escape 문자 적용되지 않음
# - 작성한 그대로 출력됨
# - 예제
  escape_str1 ="Do you have a \"big collection""
  print(escape_str1)
  escape_str2 = "tab\ttab\ttab"
  print(escape_str2)

#raw string
raw_s1=r'C:\programs\test\bin'
print(raw_s1)
raw_s2=r"C:\programs\test\bin"
print(raw_s2)

# 멀티라인(multi)
# - 엔터를 치더라도 \ 기호를 써서 이다음줄에도 내용이 이어진다는 것을 알려주면 에러가 나지 않고 엔터와 띄어쓰기가 출력된다.
#예제
multi = 
"""
문자열 

멀티라인 

테스트
"""
  print(multi)

# 문자열 연산
  str_o1 = '*'
  str_o2 ='abc'
  str_o3 = "def"
  str_o4="Niceman" #한번 할당하면 수정 불가능, 순회가 가능

print (str_o1 *100)#반복으로 나타남
print (str_o2 + str_o3)
print(str_o1+3)#형이 다름error 나옴 
print('a' in str_o4)#a라는 문자가 str_o4에 포함되어 있냐 출력값은 True
print('f' in str_o4) #False
print('z' not in str_o4)#True

# 문자열 형 변환
  print(str(77)+'a')
  print(str(10.4))

# 문자열 함수
# 참고 : https://www.w3schools.com/python/python_ref_string.asp
# - islower() : 변수가 모두 소문자로 이루어져 있는지 확인
# - endswith(‘e’) : 변수의 끝문자가 e로 끝나는지 확인
# - capitalize(): 변수의 첫글자를 대문자로 바꿔줌
# - replace(‘기존 문자‘, ‘기존 문자를 바꿀 문자 ‘): 기존 문자를 바꿀 문자로 바꿔줌
# - list(reversed(변수))) : list화 해서 변수를 거꾸로 배열함 ex) orange -> e, g, n, a, r, o
# - 예제
  c = 'niceman'
  d = 'orange'
  print(c.islower())#a변수가 다 소문자인가? True
  print(d.endswith('e'))#b변수는 끝글자가 e로 끝나니
  print(c.capitalize) # a 변수의 첫글자만 대문자로 바꿔줌, 웹상 등 표시할 때 좋음
  print(c.replace('nice', 'good'))#nice를 good으로 바꿔줌
  print(list(reversed(d)))#e, g, n, a, r, o

  
# 문자열 슬라이싱
# - 문자 첫 글자를 0으로 index로 인식
# - 중요한 문법
# - 예제
  a = 'niceman'
  b = 'orange'

  print(a[0:3])#nic
  prin(a[0:4])#nice
  prin(a[:4])#nice
  print(a[0:len(a)])#niceman
  print(a[:])#niceman
  print(a[0:len(a)-1])#nicema

  print(b[0:4:2])#oa
  print(b[1:-2])#ran 역순으로 표시할 수도 있음
  print(b{::-1})#egnaro 

