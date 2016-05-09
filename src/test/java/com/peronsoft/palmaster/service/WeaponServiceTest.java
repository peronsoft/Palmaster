package com.peronsoft.palmaster.service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WeaponServiceTest {

    private WeaponService service;

    @Before
    public void setUp(){
        service = new WeaponService();
    }

    @Test
    public void someTest(){
        assertThat(service.getValue("handaxe", "350", "15")).isEqualTo("18EEK");
        assertThat(service.getValue("handaxe", "350", "0")).isEqualTo("28EES");
        assertThat(service.getValue("handaxe", "350", "19")).isEqualTo("11EEK");
        assertThat(service.getValue("handaxe", "500", "15")).isEqualTo("18EEK");
        assertThat(service.getValue("handaxe", "500", "0")).isEqualTo("28EES");
        assertThat(service.getValue("handaxe", "500", "19")).isEqualTo("11EEK");
        assertThat(service.getValue("handaxe", "1", "15")).isEqualTo("F1H");
        assertThat(service.getValue("handaxe", "1", "0")).isEqualTo("F1H");
        assertThat(service.getValue("handaxe", "1", "19")).isEqualTo("F1H");
    }
}
