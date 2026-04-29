package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG126 {

    @EJB
    private HelperBeanF126 helperBeanF126;

    public String identify() {
        return "HelperBeanG126";
    }
}
