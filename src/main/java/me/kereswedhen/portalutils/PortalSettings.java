package me.kereswedhen.portalutils;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortalSettings {
    private static final AtomicBoolean NETHER_ENABLED = new AtomicBoolean(true);
    private static final AtomicBoolean END_ENABLED = new AtomicBoolean(true);

    private PortalSettings() {
    }

    public static boolean isNetherEnabled() {
        return NETHER_ENABLED.get();
    }

    public static void setNetherEnabled(boolean enabled) {
        NETHER_ENABLED.set(enabled);
    }

    public static boolean isEndEnabled() {
        return END_ENABLED.get();
    }

    public static void setEndEnabled(boolean enabled) {
        END_ENABLED.set(enabled);
    }
}
