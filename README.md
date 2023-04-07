# Shift-OR-Algorithm
SHİFT-OR ALGORİTHM

Shift-Or algoritması, bir metinde belirli bir desenin olup olmadığını saptamak için kullanılan bir algoritmadır. Özellikle DNA veya proteomik dizilerinde arama yapmak için kullanılır.
Algoritmanın çalışma prensibi oldukça basittir. Öncelikle, aranan desen bir bit maskelemesi olarak temsil edilir. Ardından, metnin ilk karakterinden başlayarak bit bit okunur. Her karakter için, önce önceki karakterlerin bit maskesi sola kaydırılır ve son karakterin maskeyle birleştirilmesiyle yeni bir maske oluşturulur. Bu yeni maske, aranan desenin maskeyle AND işlemi yapılmasıyla kontrol edilir. Eğer sonuç sıfır ise, aranan desen metinde bulunmuştur. Aksi takdirde, maske sola kaydırılır ve işlem devam eder.
Özellikle, Shift-Or algoritması, aranan desenin uzunluğu kadar bellek gerektirir ve tek geçişte çalışır, bu da onu diğer algoritmalardan daha hızlı ve bellek dostu yapar.
Shift Or algoritması, bir dizi bit üzerinde arama yapmak için kullanılan bir algoritmadır. Amacı, bir metin içinde belirli bir deseni aramaktır.
Algoritmanın çalışma mantığı oldukça basittir. İlk olarak, aranan desenin bit değerleri bir maskeleme değeri olarak belirlenir ve bu maskeleme değeri kaydırma işlemi ile metin üzerinde hareket ettirilir. Bu işlem sırasında, maskeleme değerinin bitleri ile metin bitleri karşılaştırılır ve eşleşme olup olmadığı kontrol edilir. Eşleşme olduğunda, aranan desenin konumu belirlenmiş olur.
Algoritma bir dizi kaydırma işlemi kullanır ve her bir kaydırma işlemi sonrasında, eşleşme olup olmadığı kontrol edilir. Eşleşme olmadığı sürece kaydırma işlemi devam eder. Eşleşme sağlandığında, desenin konumu belirlenir ve arama işlemi sonlandırılır.
Shift Or algoritması, veri sıkıştırma, veri tabanı aramaları, metin işleme ve biyoinformatikte kullanılan birçok uygulamada kullanılır. Algoritmanın avantajı, basit bir yapıya sahip olması ve hızlı bir şekilde çalışmasıdır.


En iyi durumda, Shift-OR algoritması, aranan desen metnin başında bulunduğunda ve desen sadece bir karakterden oluştuğunda, sadece bir adım gerektirir.
En kötü durumda, algoritmanın çalışması için her karakterde bir kaydırma işlemi yapması gerektiği durumlar olabilir. Bu durumda, Shift-OR algoritmasının zaman karmaşıklığı, metnin uzunluğu ve aranan desenin uzunluğuna bağlı olarak O(mn) olacaktır. Burada m, aranan desenin uzunluğunu ve n, metnin uzunluğunu temsil eder.
Ortalama durumda, Shift-OR algoritması, aranan desenin metindeki konumu ve desenin uzunluğu gibi faktörlere bağlı olarak zaman karmaşıklığı değişebilir. Ancak genellikle O(m+n) zaman karmaşıklığı ile çalışır. Bu nedenle Shift-OR algoritması, özellikle kısa desenlerin bulunması için oldukça verimli bir algoritmadır.
