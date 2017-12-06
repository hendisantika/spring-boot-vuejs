package com.hendisantika.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.16
 * To change this template use File | Settings | File Templates.
 */

@Data
@Entity
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    private String continent;
    private String region;

    @OneToOne()
    @JoinColumn(name = "capital" )
    private City capital;
}
