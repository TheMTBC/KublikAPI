package com.github.laefye.kublik.api;

import com.github.laefye.kublik.api.sql.WrappedStatement;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.PreparedStatement;

public abstract class KublikPlugin extends JavaPlugin {
    public static KublikPlugin getInstance() {
        return getInstance(Bukkit.getPluginManager());
    }

    public static KublikPlugin getInstance(PluginManager manager) {
        return (KublikPlugin) manager.getPlugin("Kublik");
    }

    public abstract Text getText();

    public abstract WrappedStatement create(PreparedStatement sql);
}
