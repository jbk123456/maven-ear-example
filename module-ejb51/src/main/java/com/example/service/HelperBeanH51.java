package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH51 {

    @EJB
    private HelperBeanG51 helperBeanG51;

    public String identify() {
        return "HelperBeanH51";
    }
}
