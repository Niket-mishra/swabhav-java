public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge (20);
        obj.setName ("Niket");

        System.out.println(obj.getAge()+" : "+obj.getName());

        Human obj2 = new Human();
        obj2.setAge (21);
        obj2.setName ("Aniket");

        System.out.println(obj2.getAge()+" : "+obj2.getName());
    }
}