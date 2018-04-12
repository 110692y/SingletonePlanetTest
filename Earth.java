public final class  Earth implements Planet{
    private static Earth earthInstance = null;

    public static synchronized Earth getInstance() {
        if (earthInstance == null)
            earthInstance = new Earth();
        return earthInstance;
    }

    private Earth() {
    }

    @Override
    public String toString() {
        return "New creation is Earth";
    }
}
