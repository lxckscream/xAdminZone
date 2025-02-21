package ru.screamoov.xadminzone;

import org.bukkit.plugin.java.JavaPlugin;
import ru.screamoov.xadminzone.handlers.PlayersHandler;
import ru.screamoov.xadminzone.managers.AdminZoneManager;

public final class XAdminZone extends JavaPlugin {
    public PlayersHandler playersHandler;
    public AdminZoneManager adminZoneManager;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        adminZoneManager = new AdminZoneManager(this);
        playersHandler = new PlayersHandler(this);

    }

    @Override
    public void onDisable() {
        adminZoneManager.players.forEach(player -> {
            adminZoneManager.выселитьНахуй
        });
    }
}
