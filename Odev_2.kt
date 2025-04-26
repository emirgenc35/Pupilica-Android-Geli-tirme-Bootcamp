package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Odev 2 ilk sayfa
    //1. Parametre olarak girilen dereceyi Fahrenheit'a dönüştürdükten sonra geri döndüren bir method yazınız.
    // F = C * 1.8 + 32
    println(donustur(45.0)) //113 Fahrenheit

    //2. Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir method yazınız.
    // Çevre = (a+b) *2
    println("Cevre : " + cevreHesapla(4,5)) //18

    //3. Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metodu yazınız.
    println("Faktoriyel : " + faktoriyelHesapla(5))

    //4.Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız.
    harfSayiHesapla("Merhaba Android Dunyasi")

    //Odev 2 ikinci sayfa
    //1. Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren metod yazınız.
    //iç açılar toplamı = (kenar sayısı - 2) * 180
    println("Ic acilar toplami : " + icAciHesapla(4))

    //2. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
    // 1 günde 8 saat çalışabilir. Çalışma ücreti 10 tl. mesai saati ücreti 20tl. 160saat üzeri mesai sayılır.
    println("Maas : ${maasHesapla(230)}")

    //3. Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
    //50 GB = 100 TL, Kota aşımından sonra her 1GB, 4tldir
    println("Ucret : ${faturaUcretHesapla(200)}")
}
fun donustur(derece: Double): Double {
    return derece * 1.8 + 32.0
}
fun cevreHesapla(a:Int,b:Int):Int{
    return (a + b) * 2
}
fun faktoriyelHesapla(sayi:Int):Int{
    if(sayi <= 1){
        return 1
    }
    return  sayi * faktoriyelHesapla(sayi - 1)
}
fun harfSayiHesapla(kelime: String){
    var i = 0
    var sayac = 0
    for (i  in 0..kelime.length -1){
        if(kelime[i] == 'a' || kelime[i] == 'A'){
         sayac++
        }
    }
    println(sayac)
}
fun icAciHesapla(kenarSayisi:Int):Int{
    return (kenarSayisi - 2) * 180
}
fun maasHesapla(gunSayisi:Int):Int{
    return gunSayisi * 8 * 10 + (gunSayisi - 160) * 20
}
fun faturaUcretHesapla(kotaMiktar:Int):Int{
 return 100 + (kotaMiktar - 50) * 4
}