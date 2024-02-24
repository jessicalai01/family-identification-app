package family.identity.app;

public class AppObject {
    private final String favDishes;

    AppObject(String favDishes) {
        this.favDishes = favDishes;
    }
    public static AppObject valueOf(String favDishes) {
        return new AppObject(favDishes);
    }
}
