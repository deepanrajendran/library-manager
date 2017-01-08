package com.manager.library;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.library.repositories.MemberRepository;
import com.manager.library.resources.Member;

import lombok.extern.slf4j.Slf4j;

@Service
public class DataLoader {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public DataLoader(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@PostConstruct
	private void initDatabase()
	{
		Member member = new Member();
		member.setMemberName("Admin User");
		member.setEmailId("admin@gmail.com");
		member.setMemberType('A');
		member.setMemberAddress("Gandhiji Nagar");
		memberRepository.save(member);
	}
	
	

}
