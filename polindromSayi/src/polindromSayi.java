public class polindromSayi {
    /*
    Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */
    static boolean isPolindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            //System.out.println("-------------------");
            //System.out.println("Number:"+temp);

            lastNumber=temp%10;
            //System.out.println("Last step is:"+lastNumber);

            reverseNumber=(reverseNumber*10)+lastNumber;
            //System.out.println("New number:"+reverseNumber);

            temp/=10;
            //System.out.println("New temp:"+temp);
        }
        if (number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
       System.out.println(isPolindrom(548));

    }
}



