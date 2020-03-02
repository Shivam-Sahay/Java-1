public class Main2 {
    public static void main(String[] args)
    {
        String str ="abc bcd def ghi abc ghi ijk mno ijk";
        String[] words= str.split(" ");
        int count=0;
        String str2 = "";
        for(int i=0;i<words.length;i++) {
            count = 1;
            for (int j = 0,k=0; j < words.length; j++) {
                if (words[i].equals(words[j])  && i != j)
                {
                    count++;
                    str2=words[i];
                    words[i]="";
                }
            }
            if(count>1) {
                System.out.println(str2 + " occurs " + count + " times");
            }
        }

    }
}
