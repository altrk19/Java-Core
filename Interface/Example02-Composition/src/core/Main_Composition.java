package core;

public class Main_Composition {
    public static void main(String[] args) {
        Office office1 = new Office(new HR());
        office1.test();

        Office office2 = new Office(new Engineer());
        office2.test();
    }
}
