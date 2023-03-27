package seminars.tasks;

//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//        вывести максимальное количество подряд идущих 1.
public class Task3_Counting_1_in_a_row_in_array {
    public static int getMaxOneCount(int[] arg) {
        int maxCount = 0;
        int count = 0;
        for (int item : arg) {
            if (item == 1) count++;
            else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;

            }
        }
        return maxCount;
    }
}