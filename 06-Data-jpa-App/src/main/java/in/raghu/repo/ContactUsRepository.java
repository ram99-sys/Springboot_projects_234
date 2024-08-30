package in.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.raghu.entity.ContactUsEntity;


@Repository
public interface ContactUsRepository extends JpaRepository<ContactUsEntity, Integer>{

}
