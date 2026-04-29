package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG25 {

    @EJB
    private HelperBeanF25 helperBeanF25;

    public String identify() {
        return "HelperBeanG25";
    }
}
