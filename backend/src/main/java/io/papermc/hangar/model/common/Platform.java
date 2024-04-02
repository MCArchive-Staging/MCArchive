package io.papermc.hangar.model.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import org.jdbi.v3.core.enums.EnumByOrdinal;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@EnumByOrdinal
@Schema(description = "Server platform", example = "PAPER")
public enum Platform {

    // NOTE: The order here should always be the order they are displayed whenever there is a list somewhere on the frontend
    FORGE("Forge", Category.MOD, "https://files.minecraftforge.net", true),
    FABRIC("Fabric", Category.MOD, "https://fabricmc.net", true),
    NEOFORGE("NeoForge", Category.MOD "https://neoforged.net", true),
    MODLOADER("Risugami's ModLoader", Category.MOD, "https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/1272333-risugamis-mods-updated", true),
    QUILT("Quilt", Category.MOD, "https://quiltmc.org", true),
    LITELOADER("LiteLoader", Category.MOD, "https://www.liteloader.com", true),
    RIFT("Rift", Category.MOD, "https://www.curseforge.com/minecraft/mc-mods/rift", true);
    //PAPER("Paper", Category.SERVER, "https://papermc.io/downloads", true),
    //WATERFALL("Waterfall", Category.PROXY, "https://papermc.io/downloads#Waterfall", true),
    //VELOCITY("Velocity", Category.PROXY, "https://www.velocitypowered.com/downloads", true);

    private static final Platform[] VALUES = values();

    private final String name;
    private final Category category;
    private final boolean isVisible;
    private final String url;

    Platform(final String name, final Category category, final String url, final boolean isVisible) {
        this.name = name;
        this.category = category;
        this.url = url;
        this.isVisible = isVisible;
    }

    public String getName() {
        return this.name;
    }

    @JsonValue
    public String getEnumName() {
        return this.name();
    }

    public Category getCategory() {
        return this.category;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public String getUrl() {
        return this.url;
    }

    public static Platform[] getValues() {
        return VALUES;
    }

    public enum Category {
        MOD("Minecraft Mods", "Mod");

        private final String name;
        private final String tagName;
        private Set<Platform> platforms;

        Category(final String name, final String tagName) {
            this.name = name;
            this.tagName = tagName;
        }

        public String getName() {
            return this.name;
        }

        @JsonValue
        public String getTagName() {
            return this.tagName;
        }

        public Set<Platform> getPlatforms() {
            if (this.platforms != null) {
                this.platforms = Arrays.stream(VALUES).filter(p -> p.category == this).collect(Collectors.toSet());
            }
            return this.platforms;
        }
    }
}
