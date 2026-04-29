package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG150 {

    @EJB
    private HelperBeanF150 helperBeanF150;

    public String identify() {
        return "HelperBeanG150";
    }
}
