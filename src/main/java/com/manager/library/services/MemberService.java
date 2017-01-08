package com.manager.library.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.library.repositories.MemberRepository;
import com.manager.library.resources.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void addMember(Member member) {
		memberRepository.save(member);
	}
	
	public void updateMember(Member member)
	{
		memberRepository.save(member);
	}
	
	public void deleteMember(int id)
	{
		memberRepository.delete(id);
	}
	
	public List<Member> getMemberList()
	{
		List<Member> members = new ArrayList<Member>();
		for(Member member : memberRepository.findAll())
			members.add(member);
		return members;
	}

	public Member getMember(int id)
	{
		return memberRepository.findOne(id);
	}
}
