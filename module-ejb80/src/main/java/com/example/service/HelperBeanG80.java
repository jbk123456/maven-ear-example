package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG80 {

    @EJB
    private HelperBeanF80 helperBeanF80;

    public String identify() {
        return "HelperBeanG80";
    }
}
