package com.ecloud.systems.mustafa.Repository;

import com.ecloud.systems.mustafa.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
