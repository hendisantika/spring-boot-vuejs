package com.hendisantika.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.15
 * To change this template use File | Settings | File Templates.
 */

@Data
@Entity
@NoArgsConstructor
public class City {
    @Id
    private Integer id;
    private String name;

    /*@ManyToOne
    @JoinColumn(name = "countrycode")*/
    //private Country country;
    private String countrycode;

    private String district;
    private Integer population;
}
