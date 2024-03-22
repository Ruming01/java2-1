# 전유빈 202230232


## 3월 22일 강의
1. JAVA 프로젝트 생성
    
    * 프로젝트 생성 후 코드도 함께 올리기 위해서 경로 수정
    
        git -> java project 2-1 생성 -> 생성된 파일 본래 사용하던 java2-1 폴더로 이동 -> java project 2-1 삭제 -> 커밋 & 푸시
2. JAVA 기본 이해
    * 자바의 특징
        * 객체 지향 언어
        * 플랫폼 독립적
        * 클래스를 통한 캡슐화
        * 멀티 스레드
        * 패키지
        * 가비지 컬렉션
        * 실시간 응용프로그램에 부적합
        * 보안 上
        * 프로그램 작성 난이도 下
    * 자바의 구성 요소
        * JVM
        * JRE
        * JDK
    * 자바 프로그램 실행 과정   
        1. 편집기로 소스 코드 만들고 .java 파일 저장
        2.  javac로 .java 파일 컴파일
        3. 바이트코드로 .class 파일 생성
        4.  javac로 바이트코드 기계어로 변환, JVM을 통해 플랫폼과 장치에 상관없이 실행  
3. 식별자
    
    클래스, 변수, 상수, 메소드 등에 붙이는 이름
4. 데이터 타입
    * boolean
    * char
    * byte
    * short
    * int
    * long
    * float
    * double

    문자열은 기본 타입에 속하지 않고, JDK에서 지원하는 String 클래스를 이용

    최신 버전 JDK는 var 변수를 지원

5. 상수
    
    final 키워드를 사용해 선언

    예시
    ~~~ JAVA
    final double PI = 3.141592;
    ~~~



## 3월 15일 강의
1. 깃허브 리포지토리 생성

2. VS code 커밋
    
    Git Graph 설치, 풀/푸시 확인
3. JAVA 개발 환경 구축

    * OpenJDK 설치 -> 시스템 환경변수 설정 -> eclipse (IDE) 설치

    * 이클립스에 JDK 등록 (보통 자동으로 됨)
4. VS CODE JAVA 구축
~~~ java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!!");
    }
}
~~~
~~~ java
public class test {
    public static void main(String[] args) {
        System.out.println("test Hello");
    }
}
~~~