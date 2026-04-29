package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH130 {

    @EJB
    private HelperBeanG130 helperBeanG130;

    public String identify() {
        return "HelperBeanH130";
    }
}
