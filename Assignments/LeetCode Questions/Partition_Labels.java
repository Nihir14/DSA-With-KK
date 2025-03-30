import java.util.ArrayList;
import java.util.List;

public class Partition_Labels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
    public static List<Integer> partitionLabels(String s) {
        if(s == null || s.isEmpty()) return null;

        List<Integer> list = new ArrayList<>();
        int[] last = new int[26];

        for(int i=0; i<s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if(i == end){
                list.add(end - start + 1);
                start = end+1;
            }
        }

        return list;
    }
}
