public class Run {
    public static void main(String[] args) {

        FeliciaFactory autoFactory = new FeliciaFactory();
        ObjectPool<Auto> pool = new ObjectPool<>(autoFactory);
        Auto auto1 = pool.borrowObject();
        Auto auto2 = pool.borrowObject();
        auto2.setName("Fabia");
        Auto auto3 = pool.borrowObject();
        auto3.setName("Kodiaq");
        pool.returnObject(auto2);
        auto2 = null;
        System.out.println(auto1.getName());
        try {
            System.out.println(auto2.getName());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        System.out.println(auto3.getName());

    }
}
