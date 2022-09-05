public enum DenNedeli {
    DUISHOMBY ("--техникалык сабак болот окууйм.--"),
    SHEISHEMBI("--практикалык сабак болот окууйм--."),
    SHARSHEMBI("--англис тил сабагы окууйм.--"),
    BEISHEMBI("--практика окууйм.--"),
    JUMA("--жума марек окууйм.--"),
    ISHEMBI("--демалыш калочуларга окуу.--"),
    JEKSHEMBI("------эс алам.!------");
    private final String name;
    DenNedeli(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
