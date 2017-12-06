package com.hendisantika.springbootvuejs.repository;

import com.hendisantika.springbootvuejs.entity.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.18
 * To change this template use File | Settings | File Templates.
 */
public interface CountryRepository extends JpaRepository<Country, String> {
    public Page<Country> findByNameContainingOrderByCode(String name, Pageable pageable);
}
