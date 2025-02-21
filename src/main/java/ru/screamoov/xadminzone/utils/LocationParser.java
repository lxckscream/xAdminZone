package ru.screamoov.xadminzone.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class LocationParser {
    public String input;
    public Location output;

    public LocationParser(String input) {
        this.input = input;

        String[] splittedString = input.split(";");
        World world = Bukkit.getWorld(splittedString[0]);
        int x = Integer.parseInt(splittedString[1]);
        int y = Integer.parseInt(splittedString[2]);
        int z = Integer.parseInt(splittedString[3]);

        this.output = new Location(
                world, x, y, z
        );
    }
}
