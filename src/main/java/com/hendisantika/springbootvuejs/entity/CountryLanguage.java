package com.hendisantika.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.17
 * To change this template use File | Settings | File Templates.
 */

@Data
@Entity
@NoArgsConstructor
public class CountryLanguage implements Serializable{
    @Id
    @ManyToOne
    private Country country;

    @Id
    private String language;

    private Boolean isofficial;
    private Double percentage;
}
