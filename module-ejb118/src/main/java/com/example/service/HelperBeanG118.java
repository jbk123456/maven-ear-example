package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG118 {

    @EJB
    private HelperBeanF118 helperBeanF118;

    public String identify() {
        return "HelperBeanG118";
    }
}
