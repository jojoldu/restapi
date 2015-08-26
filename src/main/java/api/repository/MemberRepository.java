package api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import api.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	List<Member> findAll();
	
	Member findByName(String id);
	
}
