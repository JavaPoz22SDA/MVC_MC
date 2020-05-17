public enum Nourishment {

    HUNGRY("hungry"), SATURATED("saturated");
    ;

    private String title;

    Nourishment(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nourishment{" +
                "title='" + title + '\'' +
                '}';
    }
}
