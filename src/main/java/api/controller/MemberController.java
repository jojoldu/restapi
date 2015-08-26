package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.domain.Member;
import api.repository.MemberRepository;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@RequestMapping("/")
	public List<Member> findAll(){
		return memberRepository.findAll();
	}
	
	@RequestMapping("{idx}")
	public Member find(@PathVariable int idx){
		return memberRepository.findOne(idx);
	}
	
}
