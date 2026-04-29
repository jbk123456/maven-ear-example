package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK168 {

    @EJB
    private HelperBeanJ168 helperBeanJ168;

    public String identify() {
        return "HelperBeanK168";
    }
}
