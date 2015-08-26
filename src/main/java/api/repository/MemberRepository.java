package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	Member findByName(String name);
}
