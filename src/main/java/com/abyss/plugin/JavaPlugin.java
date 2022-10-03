package com.abyss.plugin;

import kraken.plugin.api.Player;
import kraken.plugin.api.Plugin;
import kraken.plugin.api.PluginContext;
import kraken.plugin.api.WidgetItem;

import java.util.Random;

public class JavaPlugin extends Plugin {

    @Override
    public boolean onLoaded(PluginContext pluginContext) {
        pluginContext.setName("Boilerplate Plugin");
        pluginContext.setCategory("Boilerplate Category");
        return super.onLoaded(pluginContext);
    }

    @Override
    public void onEnabled() {
        super.onEnabled();
    }

    @Override
    public void onDisabled() {
        super.onDisabled();
    }

    @Override
    public int onLoop() {
        return super.onLoop();
    }

    @Override
    public int onServerTick(Player self, long tickCount) {
        return super.onServerTick(self, tickCount);
    }

    @Override
    public void onPaint() {
        super.onPaint();
    }

    @Override
    public void onPaintOverlay() {
        super.onPaintOverlay();
    }

    @Override
    public void onActionMenuFired(int type, int param1, int param2, int param3, int param4, boolean isSynthetic) {
        super.onActionMenuFired(type, param1, param2, param3, param4, isSynthetic);
    }

    @Override
    public void onDebugLog(String log) {
        super.onDebugLog(log);
    }

    @Override
    public void onWidgetVisibilityChanged(int id, boolean visible) {
        super.onWidgetVisibilityChanged(id, visible);
    }

    @Override
    public void onLocalPlayerChanged(Player self) {

    }

    @Override
    public void onInventoryItemChanged(WidgetItem prev, WidgetItem next) {
        super.onInventoryItemChanged(prev, next);
    }

    @Override
    public boolean interruptBreak() {
        return super.interruptBreak();
    }

    @Override
    public Random getAccountSpecificRandom() {
        return super.getAccountSpecificRandom();
    }

    @Override
    public Random getSecureRandom() {
        return super.getSecureRandom();
    }
}
