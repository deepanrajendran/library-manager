package com.manager.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manager.library.resources.Member;
import com.manager.library.services.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(method = RequestMethod.PUT , value = "/addMember")
	public void addMember(@RequestBody Member member)
	{
		memberService.addMember(member);
	}

	@RequestMapping(method = RequestMethod.PUT , value = "/updateMember")
	public void updateMember(@RequestBody Member member)
	{
		memberService.updateMember(member);
	}

	@RequestMapping(method = RequestMethod.GET , value = "/getMember/{id}")
	public Member getMember(@PathVariable int id)
	{
		return memberService.getMember(id);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/getMembers")
	public List<Member> getMembers()
	{
		return memberService.getMemberList();
	}

	@RequestMapping(method = RequestMethod.GET , value = "/deleteMember/{id}")
	public void deleteMember(@PathVariable int id)
	{
		memberService.deleteMember(id);
	}

}
