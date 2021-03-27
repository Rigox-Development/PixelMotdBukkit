package dev.mruniverse.pixelmotdbukkit.core.nms;

import dev.mruniverse.pixelmotdbukkit.core.PixelMotdBukkit;

public interface NMS {
    void initMotdEvent(PixelMotdBukkit plugin);
    void generateMotd();
    void showMotd();
    void setWhitelistStatus(boolean whitelistStatus);
    boolean getWhitelistStatus();
}
