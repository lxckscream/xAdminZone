package ru.screamoov.xadminzone.managers;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import ru.screamoov.xadminzone.XAdminZone;
import ru.screamoov.xadminzone.customplayer.XPlayer;
import ru.screamoov.xadminzone.utils.LocationParser;

import java.util.ArrayList;
import java.util.List;

public class AdminZoneManager {
    public List<XPlayer> players  =new ArrayList<>();
    public Location location;
    public final XAdminZone xAdminZone;

    public AdminZoneManager(XAdminZone xAdminZone) {
        this.xAdminZone = xAdminZone;
        this.location = new LocationParser(this.xAdminZone.getConfig().getString("admin-zone-location")).output;
    }

    public XPlayer getPlayer(Player player) {
        for (XPlayer xPlayer:players){
            if (xPlayer.player.equals(player)) return xPlayer;
        }
        return null;
    }

    public void выселитьНахуй(Player player) {
        XPlayer xPlayer = getPlayer(player);
        if (xPlayer!= null) {
            player.teleport(xPlayer.oldLocation);
            players.remove(xPlayer);
        }
    }
}
