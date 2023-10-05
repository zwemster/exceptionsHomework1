package task2;

public class Program {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        /**
         * Throwable является родительским классом исключений, поэтому необходимо
         * распологать его ниже дочерних классов.
         */
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    /**
     * Метод printSum() не производит никаких действий с файлами, поэтому
     * " throws FileNotFoundException " является лишним.
     * @param a
     * @param b
     */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
