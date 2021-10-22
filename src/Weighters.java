public class Weighters
{
    public static void main(String[] args)
    {
        int[] q_array = {10,36,54,89,12};
        int q_array_len = q_array.length;

        for (int i = 0; i < q_array.length; i++)
            for (int j = i+1; j < q_array.length; j++)
                if(q_array[i] > q_array[j])
                {
                    int temp = q_array[i];
                    q_array[i] = q_array[j];
                    q_array[j] = temp;
                }
        int[] weight_array = new int[q_array_len];

        for (int i = 0;i < q_array.length;i++)
        {
            weight_array[i] = 0;
            int sq = (int) Math.sqrt(q_array_len);
            if((sq*sq) == q_array[i])
                weight_array[i] = weight_array[i] + 5;
            if(q_array[i]%4==0 || q_array[i]%6==0)
                weight_array[i] = weight_array[i] + 4;
            if(q_array[i]%2==0)
                weight_array[i] = weight_array[i] + 3;
        }

        for(int i=0; i<q_array_len; i++)
            System.out.print("<"+ q_array[i] +"," +weight_array[i]+">,");
    }
}    