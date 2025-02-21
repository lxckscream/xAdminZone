package ru.screamoov.xadminzone;

import org.bukkit.plugin.java.JavaPlugin;
import ru.screamoov.xadminzone.handlers.PlayersHandler;
import ru.screamoov.xadminzone.managers.AdminZoneManager;

public final class XAdminZone extends JavaPlugin {
    /*
        Смотри на глаза, потом запоминай действия (Мои действия)
        Украду тебя, потому что ты моё бедствие (Моё бедствие)
        Моя жизнь пиздец, ведь я всегда хожу по лезвию (Хожу по лезвию)
        Не хочу отношения, ведь мне не нужны последствия (Не нужны)
        Смотри на глаза, потом запоминай действия (Мои действия)
        Украду тебя, потому что ты моё бедствие (Моё бедствие)
        Моя жизнь пиздец, ведь я всегда хожу по лезвию (Хожу по лезвию)
        Не хочу отношения, ведь мне не нужны последствия (Не нужны)
     */

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
        adminZoneManager.players.forEach(xPlayer -> {
            adminZoneManager.выселитьНахуй(xPlayer.player);
        });
    }
}
