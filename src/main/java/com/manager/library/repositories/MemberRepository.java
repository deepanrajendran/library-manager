package com.manager.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.manager.library.resources.Member;

public interface MemberRepository extends CrudRepository<Member, Integer> {

}
