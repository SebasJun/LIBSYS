package com.newtongroup.library.Repository;

import com.newtongroup.library.Entity.Admin;
import com.newtongroup.library.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}