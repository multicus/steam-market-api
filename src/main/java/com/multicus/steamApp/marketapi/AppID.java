package com.multicus.steamApp.marketapi;

import java.util.Arrays;
import java.util.Optional;

/**
 * Enum containing the Steam's App ID of games currently supported by this API
 */
public enum AppID {
    COUNTER_STRIKE_GLOBAL_OFFENSIVE(730),
    RUST(252490);

    private final int id;

    AppID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public static Optional<AppID> getEnum(int value) {
        return Arrays.stream(values())
                .filter(appID -> appID.id == value)
                .findFirst();
    }
}
