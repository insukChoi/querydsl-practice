package study.querydslpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydslpractice.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    List<Member> findByUsername(String username);
}
