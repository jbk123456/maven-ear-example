package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK39 {

    @EJB
    private HelperBeanJ39 helperBeanJ39;

    public String identify() {
        return "HelperBeanK39";
    }
}
