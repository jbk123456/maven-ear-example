package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH83 {

    @EJB
    private HelperBeanG83 helperBeanG83;

    public String identify() {
        return "HelperBeanH83";
    }
}
