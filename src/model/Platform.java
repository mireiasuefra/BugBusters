package model;

public enum Platform {

	WII("Wii"), NES("NES"), GB("GB"), DS("DS"), X360("X360"), PS3("PS3"), PS2("PS2"), SNES("SNES"), GBA("SNES"),
	_3DS("3DS"), PS4("PS4"), N64("N65"), PS5("PS5"), PC("PC"), _2600("2600"), PSP("PSP"), XONE("XOne"),
	GC("GC"), WIIU("WiiU"), GEN("GEN"), PS("PS");

	private final String plataforma;

	private Platform(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public static Platform fromString(String text) {
        for (Platform p : Platform.values()) {
            if (p.plataforma.equalsIgnoreCase(text)) {
                return p;
            }
        }
        return null;
    }
}