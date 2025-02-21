package ru.screamoov.xadminzone.customplayer;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class XPlayer {
    public Player player;
    public Location oldLocation;

    public XPlayer(Player player, Location oldLocation) {
        this.player = player;
        this.oldLocation = oldLocation;
    }
}
