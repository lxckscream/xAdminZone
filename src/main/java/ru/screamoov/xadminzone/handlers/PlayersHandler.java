package ru.screamoov.xadminzone.handlers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.screamoov.xadminzone.XAdminZone;

public class PlayersHandler implements Listener {
    public XAdminZone xAdminZone;

    public PlayersHandler(XAdminZone xAdminZone) {
        this.xAdminZone=  xAdminZone;
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {

    }
}
