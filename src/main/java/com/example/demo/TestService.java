package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 비즈니스 로직을 담당하는 서비스 계층
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll(); // findAll은 JpaRepository가 기본 제공하는 메서드이다.
    }
}
