package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG56 {

    @EJB
    private HelperBeanF56 helperBeanF56;

    public String identify() {
        return "HelperBeanG56";
    }
}
