package ru.screamoov.xadminzone.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.awt.*;

public class JoinZoneEvent extends Event {
    public static final HandlerList handlers = new HandlerList();

    public final Player player;
    public final Location oldLocation;

    public JoinZoneEvent(Player player, Location oldLocation){
        this.player = player;
        this.oldLocation=oldLocation;
    }


    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
