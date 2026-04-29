package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG71 {

    @EJB
    private HelperBeanF71 helperBeanF71;

    public String identify() {
        return "HelperBeanG71";
    }
}
