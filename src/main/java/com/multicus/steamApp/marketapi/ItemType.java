package com.multicus.steamApp.marketapi;

import java.util.Arrays;
import java.util.Optional;

public enum ItemType {
    PISTOL("Pistol"),
    SMG("SMG"),
    SNIPER_RIFLE("Sniper Rifle"),
    RIFLE("Rifle"),
    SHOTGUN("Shotgun"),
    AGENT("Agent"),
    MACHINEGUN("Machinegun"),
    KNIFE("Knife"),
    CONTAINER("Container"),
    STICKER("Sticker"),
    GLOVES("Gloves"),
    GRAFFITI("Graffiti"),
    MUSIC_KIT("Music Kit"),
    COLLECTIBLE("Collectible"),
    PATCH("Patch"),
    KEY("Key"),
    PASS("Pass"),
    GIFT("Gift"),
    TAG("Tag"),
    TOOL("Tool"),
    UNCATEGORIZED("Uncategorized");

    private final String type;

    ItemType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public static Optional<ItemType> getEnum(String value) {
        return Arrays.stream(values())
                .filter(itemType -> itemType.type.equals(value))
                .findFirst();
    }
}
