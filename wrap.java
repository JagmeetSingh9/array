public class wrap {
    public static void main(String[] args) {
        int a=10;
        Integer obj=Integer.valueOf(a);
        Integer obj1=Integer.valueOf("500");
        System.out.println(obj+obj1);
        Integer i1=new Integer(300);
        int i2=i1.intValue();
      //  int i3=Integer.toOctalString(44);

    //    System.out.println(i2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Float.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Float.MIN_VALUE);    }
}
