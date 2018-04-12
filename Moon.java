public final class Moon implements Planet {
    private static Moon moonInstance = null;

    public static synchronized Moon getInstance() {
        if (moonInstance == null)
            moonInstance = new Moon();
        return moonInstance;
    }

    private Moon() {
    }

    @Override
    public String toString() {
        return "New creation is Moon";
    }
}
