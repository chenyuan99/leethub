class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int n=arr[i].length();
            map.put(arr[i].charAt(n-1)-'0',arr[i].substring(0,n-1));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(map.get(i+1)).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}