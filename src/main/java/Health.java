public enum Health {

    HEALTHY("healthy"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Health{" +
                "title='" + title + '\'' +
                '}';
    }
}
