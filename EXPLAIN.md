# 스프링 부트 4 개발자 되기 + AI 자바편

## 00장 | 개발 환경 구축하기

#### 윈도우에 인텔리제이 설치하기
01 단계 : https://www.jetbrains.com/ko-kr/idea/download 에 접속해 인텔리제이 커뮤니티 버전 다운로드 </br>
02 단계 : 다운로드한 파일을 더블클릭해 실행 후 나오는 화면에서는 설치 옵션에서 'PATH에 "bin" 폴더 추가' 체크하고 나머지는 기본값으로 두고 설치 </br>

#### 프로젝트 생성하기
01단계 : https://start.spring.io/ 에 접속해 프로젝트 생성 </br>
02단계 : 프로젝트 생성 시, 아래와 같이 설정 </br>
  * Project : Gradle Project </br>
  * Language : Java </br>
  * Spring Boot : 4.1.1 </br>
  * Java : 21 </br>
  * Dependencies : Lombok, Spring Boot DevTools, Spring Configuration Processor, Spring Data JPA, H2 Database


Build System의 Gradle과 Maven의 차이 : 빌드 과정에서 필요한 것들을 관리하고 자동화하는 도구를 '빌드관리도구'라고 한다.
  * Maven에 비해 가독성이 좋고 설정이 간단하다
  * 자바, 코틀린, 그루비 등 다양한 언어를 지원하며, 원하는 대로 빌드 스크립트를 작성할 수 있다
  * 빌드와 테스트 속도가 Maven에 비해 더 빠르다

#### 스프링 부트 4 프로젝트 시작하기 
01단계 : build.gradle 파일을 찾아 더블클릭 후 의존성 추가 </br> 
02단계 : [Gradle]을 클릭하여 빌드 실행 
03단계 : src/main/java/com/example/demo/DemoApplication.java 파일을 찾아 더블클릭 후 실행 </br>
04단계 : 브라우저를 열고 http://localhost:8080/ 접속 </br>

* index.html 파일이 아직 없을 경우, 오류페이지가 표시된다. `There was an unexpected error (type=Not Found, status=404).` 라는 오류가 발생한다. 이는 404 오류 페이지는 요청은 잘 수행되었으나 요청에 해당하는 페이지가 없어서 나오는 것이다.

#### 포스트맨 설치하기 
01단계 : https://www.postman.com/downloads/ 에 접속해 포스트맨 다운로드 </br>
02단계 : 다운로드한 파일을 더블클릭해 실행 후 나오는 화면에서 [Open Lightweight APPI Client] 클릭하면 포스트맨 화면 열린다 </br>
03단계 : 포스트맨 화면 오른쪽에 있는 [Create a request] 클릭 후 사용 </br>

#### 단축키 모음
| 설명 | 단축키 |
| --- | --- |
| 복사하기 | Ctrl + C |
| 붙여넣기 | Ctrl + V |
| 잘라내기 | Ctrl + X |
| 주석토글 | Ctrl + / |
| 전체선택 | Ctrl + A |
| 현재 파일에서 찾기 | Ctrl + F |
| 전체 파일에서 찾기 | Ctrl + Shift + F |
| 현재 파일에서 바꾸기 | Ctrl + R |
| 전체 파일에서 바꾸기 | Ctrl + Shift + R |
| 줄 복사 | Ctrl + D |
| 실행 | Shift + F10 |
| 디버그 보드로 실행 | Shift + F9 |
| 리팩터링 | Ctrl + Alt + Shift + T |
| 테스트 생성/이동 | Ctrl + Shift + T |
| 사용하지 않는 임포트문 제거 | Ctrl + Alt + O |
| 통합검색 (파일, 클래스, 심볼) | Ctrl + N |
| 강조 표시된 오류 및 경고에 따른 빠른 수정이나 코드 개선 | Alt + Enter |
|최근에 연 파일 리스트 | Ctrl + E |
|프로젝트 전체에서 코드 요소가 사용된 모든 위치 표시 | Ctrl + Alt + F7 |

## 01장 | 자바 백엔드 개발자가 알아두면 좋은 지식 
### 1.1 서버와 클라이언트 
#### 클라이언트
> 클라이언트(client)는 서버로 요청하는 프로그램을 모두 일컫어 말한다 
* 예시) 웹브라우저 
#### 서버 
> 서버(Server)는 클라이언트의 요청을 받아 처리하는 주체이다 
* 예시) 스프링 부트 

### 1.2 데이터 베이스 
#### 데이터베이스 
> 데이터베이스(database)는 여러 사람이 데이터를 한 군데에 모아놓고 여러 사람이 사용할 목적으로 관리하는 데이터 저장소이다
* DBMS 예시) MySQL, Oracle, PostgreSQL, MariaDB, SQLite, H2 Database 등
#### RDB
> RDB(Relational Database)는 관계형 데이터베이스 라는 뜻으로, 데이터를 행과 열로 이루어진 테이블로 관리하며, 기본키를 사용해 각 행을 식별한다 
* RDBMS 예시) 오라클, MySQL, PostgreSQL 등
#### SQL 
> SQL(Structured Query Language)은 쿼리, 즉 데이터 검색을 하는 언어이다. 
#### NoSQL
>NoSQL(Not Only SQL)은 관계형 데이터 베이스가 아닌 SQL을 의미했지만, 현재는 SQL뿐만 아닌 여러 기능들도 부가적으로 지원한다는 의미로 사용된다
* NoSQL 예시) MongoDB, Redis, Cassandra 등

### 1.3 아이피와 포트 
> 아이피(IP)는 인터넷에서 컴퓨터 또는 기기들이 서로를 식별하고 통신하기 위한 주소이다. </br>
> 포트(Port)는 그 서버에서 운용되고 있는 서비스를 구분하기 위한 번호이다 
* 쉽게 말해 아이피가 백화점이라면 포트는 각자 다른 물건을 살 수 있는 매장이다

### 1.4 라이브러리와 프레임워크
#### 라이브러리 
> 라이브러리(Library)는 애플리케이션 개발에 필요한 기능인 클래스, 함수 등을 모아놓은 코드의 모음을 말한다. 
* 장점
    * 개발자가 직접 구현하지 않아도 되므로 개발 속도가 빨라진다
    * 이미 검증된 코드이므로 안정성이 높다
    * 코드 재사용성이 높다

#### 프레임워크
> 프레임워크(Framework)는 소프트웨어 개발을 수월하게 하기 위한 소프트웨어 개발 환경이다

=> 프레임워크는 어플리케이션을 개발할 때 전체적인 구조를 잡기 위해 사용하는 것이고,
라이브러리는 개발을 하는 과정에서 필요한 기능을 구현하기 위해서 사용하는 것이다

### 1.5 백엔드 개발자의 업무 
1. 과제할당 : 사업부, 마케팅, 개발팀 등에서 개발 과제를 할당
2. 과제분석 : 예를 들어 어떤 소셜 서비스에서 '친구 초대 이벤트를 만들어주세요'라는 과제가 주어졌을 때, '친구'는 무엇인지 '초대'는 무엇을 의미하는 지 등을 정의해야한다. 또한 제공할 성능과 사용할 기술을 검토하고, 문제가 있다면 해결 방법도 면밀하게 분석하고 정리해야 한다.  
3. 개발 : 기능 개발 & 버그 수정 
4. 테스트 : 로직상에 문제는 없는지, 성능 한계는 어느정도인지, 만든 코드가 읽기 편한지, 내가 만든 클래스, 메서드, 함수를 다른 사람이 간편하게 사용할 수 있는지를 검토하며 테스트한다 
5. QA : 애플리케이션의 품질을 높이기 위해 QA를 신청한다 
6. 배포와 유지보수 
    * 배포 방법
        * 롤링 배포 : 특정 개수의 서버들을 돌아가며 배포
        * 블루 그린 배포 : 똑같은 서버 인스턴스를 띄우고 로드밸런서 설정을 바꾸어 배포
        * 카나리 배포 : 전체 서버의 특정 비율만큼 배포해보고 문제없는 경우 점점 배포를 늘려나가는 방법
    * CI/CD : Continuous Integration / Continuous Delivery(또는 Deployment) 의 약자로, 지속적인 통합과 지속적인 배포를 의미한다. CI/CD를 통해 개발자는 코드를 작성하고, 테스트하고, 배포하는 과정을 자동화할 수 있다.

## 02장 | 스프링 부트 4 시작하기 
### 2.1 스프링과 스프링 부트 
#### 스프링의 등장 
> 스프링(Spring)은 엔터프라이즈 애플리케이션을 쉽게 개발할 수 있도록 도와주는 프레임워크이다.
* 엔터프라이즈 애플리케이션은 대규모의 복잡한 데이터를 관리하는 애플리케이션을 말한다 
* 스프링 부트의 주요 특징 
    * 톰캣, 제티, 언더토우 같은 웹 애플리케이션 서버(Web Application Server, WAS)가 내장되어 있어서 따로 설치를 하지 않아도 독립적으로 실행할 수 있다. 
    * 빌드 구성을 단순화하는 스프링 부트 스타터를 제공한다 
    * XML 설정을 하지 않고 자바 코드로 모두 작성할 수 있다 
    * JAR를 이용해서 자바 옵션만으로도 배포가 가능하다 
    * 애플리케이션의 모니터링 및 관리 도구인 스프링 액추에이터(spring actuator)를 제공한다


### 2.2 스프링 콘셉트 공부하기 
#### 제어의 역전과 의존성 주입 
> 제어의 역전(Inversion of Control, IoC)은 다른 객체를 직접 생성하거나 제어하는 것이 아니라 외부에서 관리하는 객체를 가져와서 사용하는 것을 말합니다. 
* 쉽게 말해, 객체관리의 주도권이 개발자에서 Spring으로 넘어간 것이다 
> 의존성 주입(Dependency Injection, DI)는 제어의 역전을 구현하기 위해 사용하는 방법으로, 어떤 클래스가 다른 클래스에 의존한다는 뜻이다 
* 쉽게 말해, 외부에서 객체를 주입받아 사용하는 것이다 

#### 빈과 스프링 컨테이너 
> 스프링 컨테이너(Spring Container)는 빈을 생성하고 관리한다. 
* Spring은 애플리케이션이 시작될 때 @Component, @Service, @Repository, @Controller 같은 애노테이션이 붙은 객체(빈)로 만들어서 스프링 컨테이너에 보관해둔다
* 개발자가 @Autowired 같은 애너테이션을 사용해 빈을 주입받을 수 있게 DI를 지원하기도 한다 
    * @Autowired : Spring Framework에서 의존성 주입을 자동으로 해주는 애노테이션
> 빈은 스프링 컨테이너가 생성하고 관리하는 객체이다. 

#### 관점 지향 프로그래밍 
> 관점 지향 프로그래밍(Aspect Oriented Programming, AOP)는 프로그래밍에 대한 관심을 핵심 관점, 부가 관점으로 나누어서 관심 기준으로 모듈화하는 것을 의미한다
* 부가 관점 코드를 핵심 관점 코드에서 분리할 수 있게 해준다.
* 프로그래머는 핵심 관점 코드에만 집중할 수 있게 될 뿐만 아니라 프로그램의 변경과 확장에도 유연하게 대응 가능

#### 이식 가능한 서비스 추상화 
> 이식 가능한 서비스 추상화(Portable Service Abstraction, PSA)는 스프링에서 제공하는 다양한 기술들을 추상화해 개발자가 쉽게 사용하는 인터페이스 
* 쉽게 말해, 어느 기술을 사용하던 일관된 방식으로 처리하도록 하는 것 

=> 스프링 프레임워크는 IoC/DI를 통해 객체 간의 의존 관계를 설정하고, AOP를 통해 핵심 관점과 부가 로직을 분리해 개발하며, PSA를 통해 추상화된 다양한 서비스들을 일관된 방식으로 사용하도록 한다 

### 2.3 스프링 부트 4 둘러보기 
스프링 부트는 스프링을 더 빠르고 쉽게 사용하기 위한 도구로서 스타터와 자동 구성을 제공한다 
#### 스프링 부트 스타터 살펴보기 
> 스프링 부트 스타터는 의존성이 모여 있는 그룹이다. 
* 스타터는 Spring-boot-starter-{작업유형}이라는 명명규칙이 있다. 

| 스타터 | 설명 |
| -- | -- |
| spring-boot-starter-web | Spring MVC를 사용해서 RESTful 웹 서비스를 개발할 때 필요한 의존성 모음 |
| Spring-boot-starter-test | 스프링 애플리케이션을 테스트하기 위해 필요한 의존성 모음 |
| Spring-boot-starter-validation | 유효성 검사를 위해 필요한 의존성 모음 |
| Spring-boot-starter-actuator | 모니터링을 위해 애플리케이션에서 제공하는 다양한 정보를 제공하기 쉽게 하는 의존성 모음 |
| Spring-boot-starter-data-jpa | ORM을 사용하기 위한 인터페이스의 모음인 JPA를 더 쉽게 사용하기 위한 의존성 모음 | 

#### 자동구성 
자동 설정은 META-INF에 있는 spring.factories 파일에 담겨 있다. 
* Main 클래스만 실행했지만, 마법처럼 톰캣이 자동으로 실행되고 다양한 기능을 사용할 수 있는 이유는 @SpringBootApplication 내부의 @EnableAutoConfiguration이 동작하기 때문이다. 
* 이 과정에서 스프링 부트는 META-INF/spring.factories 파일을 읽어 자동 설정 후보 목록을 로딩하고, 각 AutoConfiguration 클래스를 참조하게 된다. 

### 2.4 스프링 부트 4 코드 이해하기 
#### @SpringBootApplication 이해하기 
> @SpringBootApplication 애너테이션을 추가하면 스프링 부트 사용에 필요한 기본 설정을 해준다. 
* @SpringBootApplication
  * @SpringBootConfiguration : 스프링 부트 관련 설정 
  * @ComponentScan : 사용자가 등록한 빈을 읽고 등록 
    * @Component라는 애너테이션을 가진 클래스들을 찾아 빈으로 등록하는 역할이다
  * @EnableAutoConfiguration : 자동 설정으로 등록되는 빈을 읽고 등록 
* @SpringBootApplication은 프로젝트를 생성할 때 Spring Initializer이 자동으로 넣어주는 starter-에 딸려오는 클래스이다

#### 애너테이션
> 애너테이션(Annotation)은 자바 소스 코드에 추가하는 표식이다. 보통 @ 기호를 앞에 붙여서 사용한다. 애너테이션은 다양한 목적으로 사용하지만, 메타데이터의 비중이 가장 크다 

| 애너테이션명 | 설명 |
| -- | -- |
| @Configuration | 설정 파일 등록 |
| @Repository | ORM 매핑 | 
| @Controller, @RestController | 라우터 |
| @Service | 비즈니스 로직 | 

* 라우터란 HTTP 요청과 메서드를 연결하는 장치를 말한다. 라우터 역할을 하는 애너테이션이 있어야 클라이언트의 요청에 맞는 메서드를 실행할 수 있다. 
* @Component 애너테이션이 있는 클래스는 빈으로 등록되며, @Controller, @RestController, @Configuration, @Repository, @Service 모두 @Component 애너테이션을 가지고 있다. 때에 따라 알맞은 애너테이션을 선택해야 한다.

## 03장 | 스프링 부트 4 구조 이해하기 
### 3.1 스프링 부트 4 구조 살펴보기 
스프링 부트는 각 계층이 양 옆의 계층과 통신하는 구조를 따른다. 계층이라는 것은 각자의 역할과 책임이 있는 
어떤 소프트웨의 구성 요소를 의미한다. 각 계층은 서로 소통할 수는 있지만 다른 계층에 직접 간섭하거나 영향을 미치지 않는다. </br>
스프링 부트에는 프레젠테이션, 비즈니스, 퍼시스턴스 계층이 있다. 이 계층이 서로 통신하며 프로그램을 구성한다. </br>

#### 계층 설명 
* 프레제네이션 계층 (Controller): HTTP 요청을 받고 이 요청을 비즈니스 계층으로 전송하는 역할을 한다. 
* 비즈니스 계층 (Service) : 모든 비즈니스 로직을 처리한다. 비즈니스 로직이란 서비스를 만들기 위한 로직을 말한다.
* 퍼시스턴스 계층 (Repository) : 모든 데이터베이스 관련 로직을 처리한다. 이 과정에서 데이터베이스에 접근하는 DAO 객체를 사용할 수도 있다.
    * DAO(Data Access Object) : 데이터베이스 계층과 상호작용하기 위한 객체로 DB에 저장하고, 조회하고, 삭제하는 (CRUD) 코드를 한 곳에 모아둔 클래스이다. 

=> 계층은 개념의 영역이고 Controller, Service, Repository는 실제 구현을 위한 영역이다 

#### 스프링 부트 프로젝트 디렉터리 구성하며 살펴보기 
* main : 실제 코드를 작성하는 공간이다. 프로젝트 실행에 필요한 소스코드나 리소스 파일은 모두 이 폴더 안에 들어있다. 
* test : 프로젝트의 소스 코드를 테스트할 목적의 코드나 리소스 파일이 들어있다 
* build.gradle : 빌드를 설정하는 파일이다. 의존성이나 플러그인 설정 등과 같이 빌드에 필요한 설정을 할 때 사용 
* settings.gradle : 빌드할 프로젝트의 정보를 설정하는 파일이다 

#### main 디렉터리 구성하기 


```

├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.demo/
│   │   │       ├── DemoApplication.java     # 메인 클래스 (@SpringBootApplication)
│   │   │       ├── Member.java              # 엔티티 (@Entity)
│   │   │       ├── MemberRepository.java    # 퍼시스턴스 계층 (@Repository)
│   │   │       ├── TestController.java      # 프레젠테이션 계층 (@RestController)
│   │   │       └── TestService.java         # 서비스 계층 (@Service)
│   │   └── resources/
│   │       ├── static/                      # 정적 파일 (CSS, JS, 이미지)
│   │       ├── templates/                   # 화면 템플릿 (HTML)
│   │       ├── application.yml              # 애플리케이션 설정
│   │       └── data.sql                     # 실행 시 자동 실행되는 초기 데이터 SQL

```
* application.yml : 스프링 부트 서버가 실행되며 자동으로 로딩되는 파일이다. 데이터베이스의 설정 정보, 로깅 설정 정보 등이 들어갈 수도 있고, 직접 설정을 정의할 때 사용하기도 한다.
* 최근 스프링 부트 프로젝트에서는 application.properties 대신 application.yml 형식을 많이 사용한다. 
YMAL 형식은 계층 구조를 들여쓰기로 표현할 수 있어 설정값이 많아질수록 가독성이 뛰어나고, 중첩된 설정을 구조적으로 관리하기에 용이하다 

### 3.2 스프링 부트 4 프로젝트 발전시키기 
#### build.gradle에 의존성 추가하기 
| 키워드 | 역할 |
| -- | -- |
| implementation | 프로젝트 코드가 컴파일 시점과 런타임에 모두 해당 라이브러리를 필요로 할 때 사용 |
| runtimeOnly | 런타임에만 필요한 의존성을 지정, 컴파일 시에는 필요하지 않지만, 애플리케이션을 실행할 때 필요한 라이브러리 설정 |
| compileOnly | 컴파일 시에만 필요, 런타임에는 포함되지 않아야 하는 의존성 지정 | 
| annotationProcessor | 컴파일 시에 애너테이션을 처리할 때 사용하는 도구의 의존성 지정 |
| test ~ | 위와 같은데 테스트 코드에만 적용 | 
* H2 데이터베이스 : 로컬 환경과 테스트 환경에서 사용할 인메모리 데이터베이스 
* 롬복 : 반복 메서드 작성 작업을 줄여주는 라이브러리 
* JPA : 스프링 데이터 

#### 프레젠테이션, 서비스, 퍼시스턴스 계층 만들기 
* 프레젠테이션 계층(TestController.java)
    * `@RestController`
      * `@Controller` 포함 : 이 클래스가 웹 요청을 처리하는 컨트롤러라고 표시 
      * `@ResponseBody` 포함 : 메서드가 반환하는 값을 HTML 화면이 아니라 데이터(JSON) 그대로 응답 본문에 담아 보내라 </br>
      => 그냥 controller만 쓰면 반환값을 '화면파일 이름'으로 해석해서 템플리(HTML)을 찾으려고 한다 
      
    * `@Autowired TestService testService` : TestService 클래스에 @Service가 붙어 빈에 등록되어 있을 것이다. 이것을 @Autowired를 이용해, spring 컨테이너에서 TestService 타입의 빈을 찾아 이 필드에 자동으로 넣어준다.
      *  자바 기본 문법
         ```
         public static void main([args]){}
          
         [접근제어자] [기타제어자] 반환타입 메서드이름([매개변수들]) [throws 예외] {
         // 실행할 코드
         [return 값;]
         }
          ```
         
* 비즈니스 계층 (TestService.java)
    * `@Autowired MemberRepository memberRepository;` : MemberRepository (퍼시스턴스계층)과 계층 연결
    * `import org.springframework.stereotype.Service;` : stereotype은 Spring에서 역할을 나타내는 표준 애노테이션을 모아둔 곳으로 @Component, @Service, @Repository등이 있다. 
    * `findAlll()` : JpaRepository의 기본 메서드 중 하나로 선언하지 않아도 된다 

* 퍼시스턴트 계층 (Member)
         
    