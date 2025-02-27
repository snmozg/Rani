package com.sozge.rani.datas

object HoroscopeRepository {
    val horoscopes = listOf(
        HoroscopeData(
            name = "Koç",
            dateRange = "21 Mart - 20 Nisan",
            description = "Enerjik ve cesur Koç burçları, her zaman yeni maceralara atılmaya hazırdır.",
            general = "Koç burcu, ruhun hayata başlangıcı olarak nitelendirilir." +
                    " Enerji patlaması yaşayan, yerinde duramayan Koçlar," +
                    " tam bir lider ruhludur! Risk almaktan çekinmezler ve kafalarına koyduklarını yapmadan duramazlar." +
                    " Hızlı karar alırlar ama bazen sabırsızlıkları başlarını derde sokabilir." +
                    " Spor yapmayı, yeni maceralara atılmayı severler. Rekabet onlar için hayatın bir parçasıdır." +
                    " \"Ben yaparım!\" mottosuyla hareket ederler. Sakin ve sabırlı bir eş veya ortak ararlar." +
                    "  Koç size çok dolambaçlı ve gizli davranmayacak, kartlarını açık oynayacaktır." +
                    " Yapmacıksız olması sayesinde güçlü dostlar olduğu kadar güçlü düşmanlar da edinebilir.",
            male = "Koç burcu erkekleri atılgan ve hırslıdır...",
            female = "Koç burcu kadınları güçlü ve bağımsızdır..."
        ),
        HoroscopeData(
            name = "Boğa",
            dateRange = "20 Nisan - 20 Mayıs",
            description = "Sabırlı ve güvenilir Boğa burçları, hayatta istikrarı ve konforu önemser.",
            general = "Huzur, konfor ve kalite onların işidir." +
                    " Boğalar, hayatı dolu dolu yaşamak ister; güzel yemekler, hoş kokular, keşifler ve lüks detaylar onların zaafıdır." +
                    " Aynı zamanda inanılmaz kararlıdırlar. Bir işe baş koydular mı, sabırla sonuna kadar giderler. " +
                    "Ancak Boğa’nın  İnatçılığı ve akılsızca direnişi zayıf yönüdür. Kolay kolay yapılanı unutmazlar. " +
                    "Sanata ve doğaya ilgileri yüksektir. Güvenilir bir dosttur ama sabrını zorlarsan boğa gibi saldırabilir! " +
                    "Ona güvenebilirsiniz. Kararlı ve güven vericidir. Sizi yüzüstü bırakmayacaktır. " +
                    "Zevk sahibi olması, barışa ve uyuma önem vermesi en iyi özellikleridir. ",
            male = "Boğa burcu erkekleri sadık ve çalışkandır...",
            female = "Boğa burcu kadınları pratik ve inatçıdır..."
        ),
        HoroscopeData(
            name = "İkizler",
            dateRange = "21 Mayıs - 21 Haziran",
            description = "Zeki ve iletişimci İkizler burçları, bilgiye aç ve sosyal etkileşimlerden keyif alır.",
            general = "Zekâ küpü, çok yönlü, konuşkan ve hiperaktif İkizler." +
                    " Öğrenmek onun için nefes almak gibidir. Durağanlığa dayanamaz, " +
                    "kolay sıkılır. Çabuk düşünür ve çabuk hareket ederler. " +
                    "Hemen her konuda bilgi sahibi olmayı severler. Bir konuda bilgileri az bile olsa," +
                    " bilgiyi ortaya koyuşlarındaki ustalıkları sayesinde çok iyi biliyormuş gibi görünebilirler. " +
                    "Konuşmada ve kelimeleri sıralamada ustalıkları sebebiyle etkileyici konuşmacılardır. " +
                    "Bir gün bambaşka bir fikre sahip olup, ertesi gün tam tersini savunabilirler.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahiptir...",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),

        HoroscopeData(
            name = "Yengeç",
            dateRange = "21 Haziran - 22 Temmuz",
            description = "Duygusal ve şefkatli Yengeç burçları, sevdiklerine karşı koruyucu ve besleyici bir tutum sergiler.",
            general = "Duygusal, sezgisel ve şefkat dolu Yengeçler," +
                    " tam anlamıyla bir anne/baba figürüdür." +
                    " Ailelerine ve sevdiklerine inanılmaz bağlıdırlar. " +
                    "Çocuk gibi yumuşak, duygusal açıdan besleyen ve beslenen bir yapıdadır." +
                    " Yengeç burcu bazen kaprisli ve alıngan olabilir. " +
                    "Dışarı karşı sert bir görünüm sergileseler de hassas ve koruyucu bir doğaları vardır." +
                    " Sevdiklerini çok korur, onlara kalbinde özel bir yer açar. Son derece koruyucudur. " +
                    "Kırıldıklarında kabuklarına çekilirler. Yemek yapmaya, deniz kenarında zaman geçirmeye bayılırlar.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahiptir...",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Aslan",
            dateRange = "22 Temmuz - 23 Ağustos",
            description = "Kendine güvenen ve cömert Aslan burçları, dikkat çekmeyi ve liderlik etmeyi sever.",
            general = "Girdiği her ortamda ışığını saçar! " +
                    "Karizmatik, lider ruhlu ve kendine güvenen Aslanlar, ilgi odağı olmayı severler. " +
                    "Lükse, güzel giyinmeye ve takdir edilmeye bayılırlar. Çoğu zaman cömert ve sıcakkanlıdırlar ama egoları biraz yüksektir." +
                    " Liderlik ve otoriter özellikleri baskın geldiğinde bu tavırları etrafındaki kişiler tarafından kibilirli bulunabilir ." +
                    " Sahne onların doğal alanıdır; sanat, tiyatro, moda tam onlara göredir! " +
                    "Aslanlar ilişkilerinde, kimi zaman gibi gururlu, kimi zaman da neşeyle dolu bir çocuk gibidir. " +
                    "Tam bir hayran duyulacak çekim merkezidir.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahiptir...",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Başak",
            dateRange = "23 Ağustos - 23 Eylül",
            description = "Titiz ve analitik Başak burçları, detaylara önem verir ve mükemmeliyetçi bir yaklaşım sergiler.",
            general = "Detayların ustası, düzenin savunucusu! Başaklar pratik zekâları ve mükemmeliyetçi tavırlarıyla her şeyi ince eleyip sık dokurlar." +
                    " Planlı ve programlı olmayı severler, dağınıklık ve düzensizlik onları rahatsız eder." +
                    " Sağlıklı yaşam, temizlik, analiz gerektiren işler tam onlara göredir. " +
                    "En iyi danışmanlardan biri olabilirler ama eleştirileri bazen fazla kaçabilir.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahiptir...",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Terazi",
            dateRange = "23 Eylül - 22 Ekim",
            description = "Adil ve diplomatik Terazi burçları, uyum ve denge arayışındadır.",
            general = "Dünyanın adalet temsilcisi Terazi Burçları, zariflikleriyle bulundukları ortamda çiçek açtırırlar. " +
                    "Karar vermekte genel olarak zorlanan bir yapıları vardır. " +
                    "Teraziler aşka aşıktırlar ve ilişkilerini mantık yoluyla yaşamaya meyillidirler. " +
                    "Terazilerdeki bu fazla objektiflik kimi zaman soğukluğa ve hesapçı görünmeye neden olabilir.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahipt",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Akrep",
            dateRange = "23 Ekim - 21 Kasım",
            description = "Tutkulu ve kararlı Akrep burçları, derin duyguları ve gizemli bir çekiciliğiyle dikkat çeker.",
            general = "Gizemli, tutkulu ve sezgileri güçlü Akrepler, " +
                    "hayatı siyah ve beyaz olarak görürler. Sadakat konusunda çok hassastırlar ve ihanet asla affetmeyecekleri bir şeydir." +
                    " Kendilerini kolay kolay açmazlar ama gerçekten güvendiklerinde en sağlam dostlardan biri olurlar." +
                    " Araştırmacı ruhları sayesinde dedektif gibi her şeyin iç yüzünü çözebilirler." +
                    " Keskin sezgileri sayesinde karşısındaki kişiyi bir MR cihazı gibi okuyabilir. " +
                    "İkili ilişkilerde baskın, çoğu zaman kıskanç ve kızdırıldığında öfkesini uzun süre tutan bir yönü de vardır. " +
                    "Terazilerdeki bu fazla objektiflik kimi zaman soğukluğa ve hesapçı görünmeye neden olabilir.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahipt",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Yay",
            dateRange = "23 Kasım - 23 Aralık ",
            description = "Özgür ruhlu ve iyimser Yay burçları, keşfetmeye ve öğrenmeye her zaman isteklidir.",
            general = "Özgürlüğüne düşkün, maceraperest ve neşeli Yaylar, " +
                    "Yaşama karşı coşkulu ve idealist kişilerdir. Hayatı bir keşif yolculuğu olarak görürler. " +
                    "Yeni insanlar tanımak, farklı kültürleri deneyimlemek onların en büyük tutkularından biridir. " +
                    "Entelektüeldirler, sürekli öğrenmek isterler. Ancak bazen fazla patavatsız olabilirler. " +
                    "Ama içtenlikleri sayesinde kolay affedilirler! Güçlü bir doğru- yanlış anlayışları vardır." +
                    " Hayatlarında bu doğrulara uygun yaşamaya çalışan adil, ahlaklı ve erdemli kişiler yaylardan çıkar." +
                    " İnançları güçlüdür.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahipt",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Oğlak",
            dateRange = "22 Aralık - 20 Ocak",
            description = "Disiplinli ve sorumluluk sahibi Oğlak burçları, başarıya odaklanır ve hedeflerine ulaşmak için çalışır.",
            general = "Disiplin, sorumluluk ve çalışma denildiğinde akla ilk gelen burç! " +
                    "Oğlaklar hayatlarını adeta bir proje yönetir gibi planlarlar. Ciddidirler ama içten içe çok sadık ve şefkatlidirler." +
                    " Güvenilir ve hedef odaklıdırlar. Para ve kariyer onlar için çok önemlidir ama bazen aşırı işkolik olabilirler." +
                    " Dağları delip geçerler ama sevdiklerine de sonsuz bağlıdırlar. " +
                    "Ancak Oğlak duygularını kolay açabilen bir burç değildir ve müthiş bir güvensizlik ve" +
                    " bu güvensizliği örtmeye çalışan güçlü bir hırs sergileyebilirler." +
                    " Oğlak aynı zamanda dişil bir burçtur ve bu nedenle fazla risk alma eğiliminde değildir." +
                    " Ancak uzun vadede başarı getirebilecek, hesaplı riskler almayı kabul edebilirler.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahipt",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Kova",
            dateRange = "21 Ocak - 19 Şubat",
            description = "Yenilikçi ve bağımsız Kova burçları, özgün fikirleri ve insancıl yaklaşımlarıyla öne çıkar.",
            general = "Tam bir dâhi! Kovalar sıradanlıktan nefret eder, farklı düşünmeyi ve özgün olmayı severler." +
                    " Yenilikçi, teknolojiye meraklı ve ileri görüşlüdürler. Toplumu değiştirme konusunda büyük idealleri vardır. " +
                    "Özgür ruhludurlar ve bireyselliğe çok önem verirler. Ancak bazen fazla mesafeli görünebilirler ama " +
                    "sohbetleri her zaman ilginçtir! Kova’lar hayatınıza yenilik getireceklerdir." +
                    " Ancak onların özgürlüklerini kısıtladığınız ve düşüncelerine saygı duymadığınız anda sizden derhal uzaklaşacaklardır.",
            male = "s",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),
        HoroscopeData(
            name = "Balık",
            dateRange = "18 Şubat - 20 Mart ",
            description = "Hassas ve hayalperest Balık burçları, empati yetenekleri güçlü ve sezgiseldir.",
            general = "Duygusal, hayalperest ve sanatçı ruhlu Balıklar, tam anlamıyla bir romantik!" +
                    " Derin bir empati yetenekleri vardır, başkalarının duygularını anlama konusunda ustadırlar. " +
                    "Sanat, müzik ve mistik konulara ilgileri yüksektir. Rüyalar âleminde yaşamaya bayılırlar. " +
                    "Ancak bazen fazla hayalci olup gerçeklerden kopabilirler. " +
                    "Çok hassas, sezgisel ve sanki öte dünyadan gelen bir havaları olabilir." +
                    " Beraberliklerinde mutlu olabilmeleri için onlar kadar anlayışlı, koruyucu ama daha güçlü partnerlere ihtiyaç duyarlar.",
            male = "İkizler burcu erkekleri esprili ve sosyal bir yapıya sahipt",
            female = "İkizler burcu kadınları zeki ve yaratıcıdır..."
        ),

    )

    fun getHoroscope(name: String): HoroscopeData? {
        return horoscopes.find { it.name == name }
    }
}