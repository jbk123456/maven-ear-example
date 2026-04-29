package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG139 {

    @EJB
    private HelperBeanF139 helperBeanF139;

    public String identify() {
        return "HelperBeanG139";
    }
}
