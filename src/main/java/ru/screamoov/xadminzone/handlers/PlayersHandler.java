package ru.screamoov.xadminzone.handlers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.screamoov.xadminzone.XAdminZone;
import ru.screamoov.xadminzone.customplayer.XPlayer;

public class PlayersHandler implements Listener {
    public XAdminZone xAdminZone;

    public PlayersHandler(XAdminZone xAdminZone) {
        this.xAdminZone=  xAdminZone;
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        XPlayer xPlayer = xAdminZone.adminZoneManager.getPlayer(event.getPlayer());
        if (xPlayer!=null) {
            event.getPlayer().teleport(xPlayer.oldLocation);
            xAdminZone.adminZoneManager.players.remove(xPlayer);
        }
    }
}
