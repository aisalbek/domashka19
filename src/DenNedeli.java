public enum DenNedeli {
    DUISHOMBY ("- DUISHOMBY-техникалык сабак болот окууйм.--"),
    SHEISHEMBI("-SHEISHEMBI-практикалык сабак болот окууйм--."),
    SHARSHEMBI("-SHARSHEMBI-англис тил сабагы окууйм.--"),
    BEISHEMBI("-BEISHEMBI-практика окууйм.--"),
    JUMA("-JUMA-жума марек окууйм.--"),
    ISHEMBI("-ISHEMBI-демалыш калочуларга окуу.--"),
    JEKSHEMBI("----JEKSHEMBI--эс алам.!------");
    private final String name;
    DenNedeli(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
