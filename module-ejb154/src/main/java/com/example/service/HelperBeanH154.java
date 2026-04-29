package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH154 {

    @EJB
    private HelperBeanG154 helperBeanG154;

    public String identify() {
        return "HelperBeanH154";
    }
}
