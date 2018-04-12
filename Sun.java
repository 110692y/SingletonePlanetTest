public final class Sun implements Planet {
    private static Sun sunInstance = null;

    public static synchronized Sun getInstance() {
        if(sunInstance == null)
            sunInstance = new Sun();
        return sunInstance;
    }

    private Sun() {
    }

    @Override
    public String toString() {
        return "New creation is Sun";
    }
}
