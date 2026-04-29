package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG169 {

    @EJB
    private HelperBeanF169 helperBeanF169;

    public String identify() {
        return "HelperBeanG169";
    }
}
