class Main {

    public static void main (String[] args) {

        mayinTarlasi mineSweeper=new mayinTarlasi();
        mineSweeper.run();
    }
}

/*
    Oyun Kurallar� :
        * Oyun metin tabanl�d�r.
        * �ift boyutlu diziler �zerinden oynanmal� ve MineSweeper s�n�f� i�erisinde tasarlanmal�.
        * Matris boyutunu yani sat�r ve s�tun say�s�n� kullan�c� belirlemeli.
        * Diziye ait eleman say�s�n�n �eyre�i (elemanSayisi / 4) kadar rastgele may�n yerle�tirilmeli.
        �rne�in dizi 4x3 boyutunda ise eleman say�s� (sat�rSay�s� * s�tunSay�s�) form�l� ile hesaplanmal� ve boyutu 12 olmal�. Bu durumda may�n say�s� 12 / 4 = 3 adet olmal�d�r.
        (ipucu : bu may�nlar�n konumlar�n� tutacak ikinci bir dizi olu�turabilirsiniz.)
        * Kullan�c� matris �zerinden bir nokta se�meli. Nokta se�imi i�in sat�r ve s�tun de�erlerini girmeli.
        * Se�ilen noktan�n dizinin s�n�rlar� i�erisinde olup olmad���n� kontrol edilmeli ve ko�ul sa�lanmazsa tekrar nokta istenmeli.
        * Kullan�c�n�n girdi�i noktada may�n var ise oyunu kaybetmeli.
        * May�n yok ise, ilgili noktaya de�en t�m konumlar�na bak�lmal� (sa��, solu, yukar�s�, a�a��s�, sol �st �apraz, sa� �st �apraz, sa� alt �apraz, sol alt �apraz)
        ve etraf�ndaki may�nlar�n say�s�n�n toplam� ilgili noktaya yaz�lmal�. Noktaya de�en herhangi bir may�n yok ise "0" de�eri atanmal�.
        * Kullan�c� hi� bir may�na basmadan t�m noktalar� se�ebilirse oyunu kazanmal�.

 */