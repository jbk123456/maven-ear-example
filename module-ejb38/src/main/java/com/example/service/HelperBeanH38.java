package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH38 {

    @EJB
    private HelperBeanG38 helperBeanG38;

    public String identify() {
        return "HelperBeanH38";
    }
}
