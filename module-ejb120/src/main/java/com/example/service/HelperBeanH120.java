package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH120 {

    @EJB
    private HelperBeanG120 helperBeanG120;

    public String identify() {
        return "HelperBeanH120";
    }
}
