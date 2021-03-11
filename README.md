# Web_Programming


## 21/02/22

LifeCycleServlet.java

- My First Dynamic Web Page

![image](https://user-images.githubusercontent.com/44190559/108717716-ef7a1e00-7560-11eb-9eb6-b81a36674d87.png)
![image](https://user-images.githubusercontent.com/44190559/108717745-f9038600-7560-11eb-9e5d-695757a7617d.png)


## 21/02/25

ParameterServlet.java

- 요청 시 입력받은 parameter를 읽어들여 출력함.

![image](https://user-images.githubusercontent.com/44190559/109128617-0011da80-7793-11eb-9107-983acffc6f7d.png)

## 21/02/28

sum10.jsp

- jsp 쓰는 이유 : html 안에 java로 돌아가는 프로그램 넣기 위해서! 

![image](https://user-images.githubusercontent.com/44190559/109409894-be26a580-79d9-11eb-8cfa-5aa938a93188.png)

## 21/03/02

exam2.jsp, exam4.jsp

- jsp page에서는 Declaration, Scriptlet, Expression의 3가지 script 요소를 제공
- Declaration <%! %> : 전역변수 선언 및 메소드 선언에 사용
- Scriptlet <% %> : 프로그래밍 코드 기술에 사용
- Expression <%= %> : 화면에 출력할 내용 기술에 사용

- jsp page에서 사용할 수 있는 주석은 HTML, Java, JSP 3가지 종류
- HTML 주석 : < !-- 주석 -->
- JSP 주석 : <%-- 주석 --%>
- Java 주석 : //, /**/

![image](https://user-images.githubusercontent.com/44190559/109608687-95371980-7b6d-11eb-8dfe-1bdaf69c72dd.png)

## 21/03/09

el01.jsp

- EL(Expression Language)는 값을 표현하는 데 사용되는 스크립트 언어로, JSP의 기본 문법을 보완하는 역할.

EL의 기능
- JSP의 Scope에 맞는 속성 사용
- 집합 객체에 대한 접근 방법 제공
- 수치, 관계, 논리 연산자 제공
- 자바 클래스의 기본 메소드 호출 기능 제공
- 표현 언어만의 기본 객체 제공

- 문법 : ${expr}
- ex) 요청 URI: ${pageContext.request.requestURI} 

![image](https://user-images.githubusercontent.com/44190559/110432249-3552ec80-80f2-11eb-81b3-d0f187fdb4a2.png)
