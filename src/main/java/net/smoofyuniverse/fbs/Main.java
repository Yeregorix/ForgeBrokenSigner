package net.smoofyuniverse.fbs;

import org.spongepowered.configurate.objectmapping.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        System.out.println("MRE start.");
        ObjectMapper.factory();
        System.out.println("MRE end. (no error)");
    }
}
