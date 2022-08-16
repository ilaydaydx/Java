class Main {

    public static void main (String[] args) {

        mayinTarlasi mineSweeper=new mayinTarlasi();
        mineSweeper.run();
    }
}

/*
    Oyun Kurallarý :
        * Oyun metin tabanlýdýr.
        * Çift boyutlu diziler üzerinden oynanmalý ve MineSweeper sýnýfý içerisinde tasarlanmalý.
        * Matris boyutunu yani satýr ve sütun sayýsýný kullanýcý belirlemeli.
        * Diziye ait eleman sayýsýnýn çeyreði (elemanSayisi / 4) kadar rastgele mayýn yerleþtirilmeli.
        Örneðin dizi 4x3 boyutunda ise eleman sayýsý (satýrSayýsý * sütunSayýsý) formülü ile hesaplanmalý ve boyutu 12 olmalý. Bu durumda mayýn sayýsý 12 / 4 = 3 adet olmalýdýr.
        (ipucu : bu mayýnlarýn konumlarýný tutacak ikinci bir dizi oluþturabilirsiniz.)
        * Kullanýcý matris üzerinden bir nokta seçmeli. Nokta seçimi için satýr ve sütun deðerlerini girmeli.
        * Seçilen noktanýn dizinin sýnýrlarý içerisinde olup olmadýðýný kontrol edilmeli ve koþul saðlanmazsa tekrar nokta istenmeli.
        * Kullanýcýnýn girdiði noktada mayýn var ise oyunu kaybetmeli.
        * Mayýn yok ise, ilgili noktaya deðen tüm konumlarýna bakýlmalý (saðý, solu, yukarýsý, aþaðýsý, sol üst çapraz, sað üst çapraz, sað alt çapraz, sol alt çapraz)
        ve etrafýndaki mayýnlarýn sayýsýnýn toplamý ilgili noktaya yazýlmalý. Noktaya deðen herhangi bir mayýn yok ise "0" deðeri atanmalý.
        * Kullanýcý hiç bir mayýna basmadan tüm noktalarý seçebilirse oyunu kazanmalý.

 */