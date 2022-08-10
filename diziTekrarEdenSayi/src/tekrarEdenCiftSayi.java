public class tekrarEdenCiftSayi {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={4,7,4,4,2,9,10,2,1,3,4,8,3,9,1};
        int[] dublicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i< list.length;i++){

            for (int j=0;j< list.length;j++){
                if ((i!=j)&&(list[i]==list[j])){
                    if (!isFind(dublicate,list[i])){
                        dublicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }

        System.out.println("\nRepeat even number:");
        for (int value:dublicate){
            if ((value!=0)&&(value%2==0)){
                System.out.println(value);
            }
        }

        System.out.println("\nRepeat odd number:");
        for (int value:dublicate){
            if ((value!=0)&&(value%2!=0)){
                System.out.println(value);
            }
        }
    }
}
