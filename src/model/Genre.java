package model;

public enum Genre {
	DEPORTE("Sports"), PLATFORM("Platform"), RACING("Racing"), ROLE_PLAYING("Role-Playing"), PUZZLE("Puzzle"),
	MISC("Misc"), ACTION("Action"), SHOOTER("Shooter"), FIGHTING("Fighting"), SIMULATION("Simulation");
	
	private final String genero;

    private Genre(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

}