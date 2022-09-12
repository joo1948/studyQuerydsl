package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>,MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {
    //클라이언트가 Querydsl에 의존해야한다.
    //QuerydslPredicateExecutor는 하나의 테이블에서만 사용이 가능하기 때문에 실무에서는 한계가 있다 . == 조인이 안됨.
    //Pageable, Sort등 모두 지원해주긴 함.

    List<Member> findByUsername(String username);

}
