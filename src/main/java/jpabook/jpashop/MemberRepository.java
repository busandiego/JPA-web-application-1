package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

     @PersistenceContext
    private EntityManager em;

     public Long save(Member member) {
         em.persist(member);
         return member.getId();
     }
     // 커맨더와 쿼리를 분리해라
    // save한 후에 리턴 값을 안 만든다. 단순하게 id만 조회해서 리턴하게 만듬

    public Member find(Long id) {
         return em.find(Member.class , id);
    }

}

