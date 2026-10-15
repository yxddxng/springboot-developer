package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List; // 자바 기본 제공 컬렉션

// import문에 Member, TestService를 넣지 않아도 같은 패키지(com.example.demo)에 있는 클래스는 바로 사용할 수 있다

@RestController
public class TestController {
   @Autowired //이 annotation을 사용함으로써, new TestService()를 안했는데도 바로 사용할 수 있는 것이다.
    TestService testService;

   @GetMapping("/test") // HTTP GET 방식으로 /test 주소에 요청이 오면 바로 아래 메서드를 실행하라는 매핑이다
    public List<Member> getAllMembers() {
       List<Member> members = testService.getAllMembers();
       return members;
   }
}
