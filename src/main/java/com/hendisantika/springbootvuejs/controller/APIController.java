package com.hendisantika.springbootvuejs.controller;

import com.hendisantika.springbootvuejs.entity.Country;
import com.hendisantika.springbootvuejs.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.48
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    CountryRepository countryRepo;

    @GetMapping("/countries")
    public Page<Country> getCountries(Pageable pageable,
                                      @RequestParam(name="search", required=false, defaultValue="") String search){
        return countryRepo.findByNameContainingOrderByCode(search, pageable);
    }
}
