package com.peronsoft.palmaster.parser;

import com.peronsoft.palmaster.model.Weapon;
import com.peronsoft.palmaster.model.WeaponNames;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

public class WeaponTableReaderTest {

    @Test
    public void testReader(){
        try {
            Weapon someWeapon = new WeaponTableReader().readFile("/home/rodrigo/dev/projects/Palmaster/src/test/resources/weapons/handaxe.csv");
            assertThat(someWeapon).isNotNull();
            assertThat(someWeapon.getWeaponName()).isEqualToIgnoringCase(WeaponNames.HANDAXE);
            assertThat(someWeapon.getWeaponRows().size()).isEqualTo(500);
            assertThat(someWeapon.getAttack("350", "15")).isEqualTo("18EEK");
            assertThat(someWeapon.getAttack("350", "0")).isEqualTo("28EES");
            assertThat(someWeapon.getAttack("350", "19")).isEqualTo("11EEK");
            assertThat(someWeapon.getAttack("500", "15")).isEqualTo("18EEK");
            assertThat(someWeapon.getAttack("500", "0")).isEqualTo("28EES");
            assertThat(someWeapon.getAttack("500", "19")).isEqualTo("11EEK");
            assertThat(someWeapon.getAttack("1", "15")).isEqualTo("F1H");
            assertThat(someWeapon.getAttack("1", "0")).isEqualTo("F1H");
            assertThat(someWeapon.getAttack("1", "19")).isEqualTo("F1H");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
