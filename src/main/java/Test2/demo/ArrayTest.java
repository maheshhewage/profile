package Test2.demo;


import java.util.ArrayList;
import java.util.HashMap;


public class ArrayTest {

            public void commonValues(){
                int[] Array1={2, 4, 5, 3, 5, 6, 6, 9, 16, 34, 13, 11, 4, 7, 20, 40, 30};
                int[] Array2 = {16, 23, 11, 8, 4, 21, 34, 14, 15, 3, 11, 20, 22, 30};
                int target=50;

                HashMap<Integer, Integer> d = new HashMap<Integer,Integer>();
                ArrayList<Integer> CommonSet = new ArrayList<>();
                ArrayList<ArrayList<Integer>> Output = new ArrayList();

                for(int i=0;i< Array1.length;i++){

                    d.put(Array1[i], d.get(Array1[i] + 1));
                    if(d.containsKey(Array1[i]) {
                        int  f1=0;
                        int f2 = 1;
                        int j;
                        for(j=0;j<Array2.length;j++{

                            if (Array1[i]==Array2[j]) {
                                f1=1;
                            }
                            if(Array2[i]==Array2[j]){
                                f2=1;
                            }
                            }
                        if(f1==1 && f2==1){
               System.out.println(ArrayList([Array1[i],Array2[i]]));

            }

            for(int i=0;i<Array2.length;i++){
            }
                        if(d.containsKey(Array2[i]){
                            CommonSet.add(Array2[i]);

            })

                    }



                }
            }
}


