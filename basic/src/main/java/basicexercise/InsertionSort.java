package basicexercise;

import java.util.ArrayList;

public class InsertionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i=1; i<n; ++i)
        {
            int key = arr.get(i);
            int j = i-1;

            while (j>=0 && arr.get(j) > key)
            {
                arr.set(j+1,arr.get(j));
                j = j-1;
            }
            arr.set(j+1,key);
        }
        return  arr;
    }
}
