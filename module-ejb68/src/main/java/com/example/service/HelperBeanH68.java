package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH68 {

    @EJB
    private HelperBeanG68 helperBeanG68;

    public String identify() {
        return "HelperBeanH68";
    }
}
