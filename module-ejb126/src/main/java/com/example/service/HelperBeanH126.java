package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH126 {

    @EJB
    private HelperBeanG126 helperBeanG126;

    public String identify() {
        return "HelperBeanH126";
    }
}
