print 구문의 이해
1. 중요한 이유
- 가장 기본적인 output(출력) 함수 -> 잘 알아놔야 올바르게 개발하고 있는 지 의도하는 바에 따라 정확하게 출력되는 지 확인 가능
- print 함수(print())를 python에서 능수능란하게 사용해야 웹 크롤링 등을 할 때 정확하게 출력이 확인 가능하다.

2. 기본 출력
- print(‘ ’)
- 문자열 출력시 ‘’와 “”를 사용할 수 있다
- ()안에 아무것도 입력하지 않은 체 print()만 쓰면 줄바꿈 됨
-예제
print('Hello Python!')
print('''Hello Python!''')
print("Hello Python!")
print("""Hello Python!""")
-> 네개의 코드 다 Hello Python으로 동일하게 출력 됨

3. separator 옵션 사용
- sep=’ ’은 sep값으로 작은 따옴표에 있는 것들을 하나로 이어서 출력
- 예제
print ('T', 'E','S', 'T', sep='')
->TEST로 출력됨
print('2019','02','19',sep='-')
->2019-02-19로 출력됨
print('niceman','google.com',sep='@')
->niceman@google.com으로 출력됨

4. end 옵션 사용
- 끝부분에 end 값을 입력
- end=’’ end 값을 아무것도 입력 안할 시끝을 공백으로 처리하겠다는 뜻 그래서 다음 문장과 붙여줘서 나옴
- 예제(end 값을 띄어쓰기 한번으로 입력)
print('Welcome To', end=' ')
print('the black paradise', end=' ')
print('piano notes')
print('testtest')
->출력값은
Welcome To the black paradise piano notes
testtest

5. format 옵션 사용
-중요함
- [], {}, () 순으로 사용
- 기본
print('{} and {}'.format('You', 'Me'))
->You and Me
- mapping: 서로 할당한다는 것
print("{0} and {1}".format('You', 'Me'))
->You and Me
print("{a} and {b}".format(a='You', b='Me'))
->You and Me
- format 함수 안쓰고 싶을시(%s : 문자, %d : 정수, %f : 실수)
print("%s's favorite number is %d" %('Yoon', 9))
-> 들어갈 공간에 %s : 문자, %d : 정수, %f : 실수 셋 등을 입력 후 입력값을 뒤에 %() 안에 입력한다.
-> 출력값은 Yoon's favorite number is 9

6. 예제
print("Test1: %d, Price: %4.2f" % (776,6534.123))
-%5d -> 5자리 숫자의 정수
-%4.2f -> 정수부분은 네자리, 소수자리는 2자리의 실수

print("Test1: {0:5d}, Price: {1:4.2f}" .format (776,6534.123))
{}로 묶을 시 % 안붙여도 됨

print("Test1:{a:5d}, Price:{b:4.2f}".format(a=776, b=6534.123))

-> 위 세코드 출력 값은 Test1: 776, Price: 6534.12

7. Escape 코드
\n	개행(줄바꿈)
\t	탭(spacebar 4번)
\\	문자
\’	문자
\”	문자
\r	캐리지 리턴
\f	폼피드
\a	벨 소리
\b	백 스페이스
\000	널 문자
- 쌍이 맞아야 함
- 예제
print("'you'")
->'you'

print('\'you\'')
->’you’

print('"you"')
-> "you"

print("""you""")
-> you

print('\\you\\')
-> \you\

print('\\you\\\n\n')
print('test')
-> \you\




print('\t\t\ttest')
->                        test

파이썬의 구성요소
1. 인코딩(입력, 출력)
- UTF-8을 입력 출력 기본 인코딩으로 가짐
print(sys.stdin.encoding)
print(sys.stdout.encoding)
위 코드로 확인 가능

2. 변수
- myName = ‘goodboy’ -> 오른쪽에 있는 문자열을 왼쪽에 할당해라
- 값을 선언해서 할당할 때 사용
- 변수와 값 모두 한글로 선언 가능
- 내용을 담는 그릇


3. 조건문
- 조건에 맞는 경우 실행
- ~할 때 ~를 실행해라
if myName == 'goodboy':
  print('ok')

4. 반복문
- 내용 반복
- 1부터 9까지 구구단 출력
for i in range(1,10):
  for j in range(1,10):
    print('%d * %d = ' %(i,j), i*j)

5. 함수, 클래스, 인스턴스(객체)
- 함수 : 만들고 실행도 같이 해줘야 한다. 영문과 한글로 선언 가능
def greeting():
  print('Hello')

greeting()
-> 출력값 Hello
- 클래스
class Cookie:
  pass
-  인스턴스(객체) : 어떤 변수를 선언하고 만들어놓은 클래스를 함수 실행하는 듯 생성 하는 것
cookie = Cookie()

6. 정보 출력
print(id(cookie))
print(dir(cookie))

tips
- import this 입력 시 파이썬의 장점과 사용방법 출력
- 주석 후 띄어쓰기 해주는 것이 가독성에 좋음
- 들여쓰기(indent)도 문법이기 때문에 하지 않으면 error 발생
