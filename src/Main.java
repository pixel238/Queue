public class Main {
    public static void main(String[] args) {
        Queue<Integer> object = new Queue<Integer>(5);
        for(int iterator = 0;iterator<5;iterator++) {
            try {
                object.add(iterator);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        /*try {
            object.remove();
            object.add(10);
        }catch (Exception e) {
            System.out.println(e);
        }*/
        System.out.println("Capacity is "+object.capacity());
        for(int iterator = 0;iterator<5;iterator++) {
            try {
                System.out.println(object.remove());
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Capacity is "+object.capacity());
    }
}