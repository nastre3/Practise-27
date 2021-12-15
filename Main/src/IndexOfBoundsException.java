public class IndexOfBoundsException {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 5, 3};
        int s = 0, i;
        for (i = 0; i < array.length; i++); //array.length-1
        {
            s += array[i];

        }
        System.out.println(s);
    }
}
