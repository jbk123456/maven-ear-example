package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI154 {

    @EJB
    private HelperBeanH154 helperBeanH154;

    public String identify() {
        return "HelperBeanI154";
    }
}
