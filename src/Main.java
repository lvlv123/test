public class Main {

    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;
        String c = "1";
        Integer d = 200;
        Integer e = 200;
        Integer f = 2;
        long g = 3L;
        Long h = 3L;
        Integer i = 3;
        int j = 3;

        System.out.println(b.equals(a)); // true  同下，不过jdk1.5后，int自动装箱转换为Integer，Object类型就是Integer了
        System.out.println(b.equals(c)); // false 看Integer的equals方法的源码，只要Object不是Integer，就返回false
        System.out.println(d == e); // false Integer只缓存-128~127，超出这个范围就会新创建对象
        // System.out.println(h == i); 报错
        System.out.println(g == j); // true 虽然类型不同但是可以直接进行数值比较
        System.out.println(g == i); // true j自动拆箱后和上面例子一样
        System.out.println(h == (b + f)); // true
        System.out.println(h.equals(b + f)); // false 同第二个
    }

//Integer的equals方法的源码
//    public boolean equals(Object obj) {
//        if (obj instanceof Integer) {
//            return value == ((Integer) obj).intValue();
//        }
//        return false;
//    }
}
