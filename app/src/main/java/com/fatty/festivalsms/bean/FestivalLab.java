package com.fatty.festivalsms.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17255 on 2016/6/2.
 */
public class FestivalLab {

    public static FestivalLab mInstance;

    private List<Festival> mFestivals = new ArrayList<Festival>();
    private List<Msg> mMessages = new ArrayList<Msg>();

    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "元旦"));
        mFestivals.add(new Festival(4, "春节"));
        mFestivals.add(new Festival(5, "端午节"));
        mFestivals.add(new Festival(6, "七夕"));
        mFestivals.add(new Festival(7, "圣诞节"));
        mFestivals.add(new Festival(8, "儿童节"));

        mMessages.add(new Msg(1, 1, "真挚的友情如同美酒，浓浓如醇、芳香似溢，秋色的美景带给美的享受，美的流连忘返。朋友，在这幸福的时光里，让快乐和美好永远陪伴着你！国庆快乐"));
        mMessages.add(new Msg(2, 1, "我爱北京天安门，天安门上太阳升听着孩子们稚气的歌声，看着路边绚烂的花朵，忽然，年轻时的豪情充满了心房，想到了曾分享同一梦想的老朋友。盼望同你同享一杯浊酒，聊聊当年的我们！"));
        mMessages.add(new Msg(3, 1, "抬起头，看短信，牵挂就在这问候间！给你我特别的祝福，愿它每分每秒都带给你健康、好运和幸福，希望这是你度过的最美好的国庆节！"));
        mMessages.add(new Msg(4, 1, "祝福伟大的祖国更加强盛，祝福祖国的人民天天向上!祝福你我口袋日见膨胀，祝福我们的爱人健康漂亮!祝你家庭幸福十全十美，工作十拿九稳，老板对你十分满意，爱情路途一帆风顺，朋友对你一如既往，总之祝你十一快乐!"));
        mMessages.add(new Msg(5, 1, "哎呀，国庆假期刚开始，一天不见就想你，白天想你晚上梦你，站着想你躺着想你，满满脑子全是你，你说，我得多么喜欢你。见不到你，我魂不守舍，我肚子空空，见到了你，我两眼冒光，我精神抖擞。哎呀，我的烤鸡翅!"));
        mMessages.add(new Msg(6, 1, "装一袋阳光两把海风，自制了几斤祝福，托人到美国买了些快乐，法国买了两瓶浪漫，从心灵的深处切下几许关怀，作为礼物送给你，祝国庆快乐！"));
        mMessages.add(new Msg(7, 1, "十一假期，旅馆爆满，航线拥挤，为什么度假比上班还要累?而且还很贵!我现在是在家一族，估计你也是，来找我吧!国庆快乐!"));

        mMessages.add(new Msg(1, 2, "中秋佳节月儿圆，圆出全家聚一堂；桂花散香飘祥瑞，嫦娥送福美万年；愿你福圆满家园；花好月圆人团圆；事业顺利步步高，阖家幸福永平安。祝你中秋节快乐！"));
        mMessages.add(new Msg(2, 2, "清风送去了我的祝福，明月带来了我的问候，流星记载了往日的故事，玉兔留下了永恒的吉祥。祝你中秋佳节快乐，月圆人圆事事圆满！"));
        mMessages.add(new Msg(3, 2, "八月中秋月儿圆，对着嫦娥表思念，心中的人啊你可看见，嫦娥也在默默祝愿，愿你生活比蜜甜！"));
        mMessages.add(new Msg(4, 2, "今年中秋节不送礼，发条短信祝福你，健康快乐唱伴你，好运和你不分离，还有让我告诉你，财神已经跟随你，钞票珠宝都给你，幸福人生属于你！中秋假日快乐！"));
        mMessages.add(new Msg(5, 2, "月儿圆圆挂天边，荷叶圆圆水中间。梦想圆圆都实现，成功圆圆舞翩跹。快乐圆圆永不变，祝福圆圆情无限：中秋花好月又圆，幸福与你两团圆。"));
        mMessages.add(new Msg(6, 2, "又是一年落叶黄，一层秋雨一层凉。整日工作挺辛苦，天凉别忘加衣裳。保重身体多餐饭，珍惜友情常想想。信短情长言未尽，唯愿朋友多安康。中秋快乐，合家团圆！"));
        mMessages.add(new Msg(7, 2, "以真诚为半径，用尊重为圆心，送您一个中秋圆圆的祝福！祝愿：爱您的人更爱您，您爱的人更懂您！好事圆圆！好梦连连！祝中秋快乐，月圆人更圆！"));
        mMessages.add(new Msg(8, 2, "让最圆的明月陪伴你和我，让明月传达我的心愿与祝福。祝你中秋佳节快乐，月圆人圆事事圆满！"));
        mMessages.add(new Msg(9, 2, "草儿箐箐，花儿幽幽，月儿圆圆，梦儿绵绵，心儿甜甜——此刻情飞千里——明月寄相思——中秋节"));
        mMessages.add(new Msg(10, 2, "明月本无价，高山皆有情。人虽不至，心向往之。衷心祝愿您和家人团圆美满，幸福安康！"));
        mMessages.add(new Msg(11, 2, "相隔十万八千里，却沐浴在同一片月光下，迎接同一个节日，中秋，让月光送去我的祝福：团圆，快乐每一天！"));
        mMessages.add(new Msg(12, 2, "月饼圆圆的、甜甜的在这最美好的时刻祝您和您的家人合家欢乐、幸福美满！"));
        mMessages.add(new Msg(13, 2, "想我吗？还记得我吗？好久没有见面了。你心里是不是已经有了别人？如果是，我会很伤心的。不管你同不同意，我都决定明天带着快乐、好运和成功来看你，你一定要热烈迎接我。记住了，我叫钟秋洁。提前祝你中秋节快乐。\n"));
        mMessages.add(new Msg(14, 2, "中秋临近了，我准备了一件特别的礼物，在中秋那天送给特别的你。礼物是什么呢？抬头看天空，就会看到那轮写满我的关怀和牵挂的月亮哦！如果你正与家人团聚，那我祝你阖家幸福美满；如果你感到孤单，请记住：至少还有我在念着你。朋友，中秋一定要过的快乐！"));
        mMessages.add(new Msg(15, 2, "你是月饼我是馅，缠缠绵绵总见面；你是风筝我是线，追追逐逐把你牵；你是明月我是泉，圆圆满满一万年！"));
        mMessages.add(new Msg(16, 2, "想念你的微笑，回味你的味道，脱掉你的外套，露出你的美妙，控制我的心跳，压抑我的狂燥，想想我的需要，还是把你干掉……啊！月饼！中秋快乐！"));
        mMessages.add(new Msg(17, 2, "八月十五中秋节，动物森林也疯狂；狮子吼来百鸟叫，狗熊大象瞎胡闹，一起来把节日闹；只有小猪静悄悄，打开手机看短信：猪你中秋节快乐！"));
        mMessages.add(new Msg(18, 2, "月亮是诗，星空是画，愿所有的幸福伴随你，问候是春，关心是夏，愿所有的朋友真心待你，温柔是秋，浪漫是冬，愿所有快乐跟随你。祝你中秋节快乐月是中秋分外明，我把问候遥相寄；皓月当空洒清辉，中秋良宵念挚心；祝愿佳节多好运，月圆人圆事事圆！\n"));
        mMessages.add(new Msg(19, 2, "中秋快乐！如果有什么值得庆祝的话，那一定是团圆；如果有什么值得庆幸的话，那就是平安。"));
        mMessages.add(new Msg(20, 2, "水盼团圆汇聚成海，石盼团圆高耸成山，月盼团圆辉映人间。水说海枯心不变，石说山崩情依恋，月说寄情我承担，我说中秋盼团圆！预祝中秋快乐！"));
        mMessages.add(new Msg(21, 2, "中秋节至，为你送上一轮多功能圆月，助你把烦恼穿“月”,让心情喜“月”,和幸福一起吟风弄“月”!祝君阖家安康！"));

        mMessages.add(new Msg(1, 3, "愁烦随着缓缓时光，慢慢溜走，悲伤随着辞岁迎新，彻底消失；快乐伴着璀璨烟花，彻底绽放；好运伴着美酒，绵绵无期；问候随着短信，温馨送到；祝福伴着真挚，甜你心间。亲爱的朋友，祝你元旦快乐，福星高照！"));
        mMessages.add(new Msg(2, 3, "短信一条，写上思念几行；情深意切，祝福送到身旁；快乐幸福，那些温馨过往；元旦来到，新年再创辉煌！元旦到，愿你友谊之树常青，幸福之花常开，吉祥如意常在，金银财宝满怀。元旦快乐！"));
        mMessages.add(new Msg(3, 3, "今年过年不送礼，要送就送圆蛋礼。团圆美满又喜庆，吉祥如意健康礼。团团圆圆幸福溢，和和美美家人丽。阳光灿烂光明路，大刀阔斧千万里。祝你元旦好身体，健康才是硬道理！"));
        mMessages.add(new Msg(4, 3, "一月一日是元旦，元旦开辟新一年，一点一滴万象更新新气象；一分一秒顺风顺水运气好；一说一笑团团圆圆不离散，一前一后快乐幸福都来到，一板一眼认真走好每一步，一字一句问候朋友元旦快乐，笑口常开，祝福传递，好运相伴！"));
        mMessages.add(new Msg(5, 3, "转眼元旦到了，愿好运对你点头哈腰，快乐对你眉开眼笑；美好对你格外宠幸，吉祥对你另眼相待；平安对你趋之若鹜，健康对你关爱有加；幸福对你情有独钟，朋友则祝你元旦快乐，福寿安康！"));
        mMessages.add(new Msg(6, 3, "把过去留给美好，把现在留给幸福，把前程留给坦途，把永远留给健康，把愉快留给心情，把好运留给事业，把希望留给美满，把和睦留给家庭，把喜悦留给节日，把祝福送给你，祝元旦快乐！"));
        mMessages.add(new Msg(7, 3, "新年伊始到元旦，送一年的艳阳天，幸福花朵开身边，平安大道马加鞭，摘下几颗幸运星，快活林里转一转，种植几盆吉祥草，聚宝盆里收金钱，青云直上心灿烂，健康如意总团圆，好事临门比蜜甜，吉祥快乐一整年！"));
        mMessages.add(new Msg(8, 3, "俺这个人比较厚道，做事比较低调，元旦将到，怕到时挤不上祝福你的快车道，挤不进祝福你的人潮，所以预祝元旦好！"));
        mMessages.add(new Msg(9, 3, "滚。。。滚。。。滚。。。元旦快到了，我要把幸福快乐做成圆圈，让它滚向你，越滚越大……嘿嘿，有我这个朋友知足吧，也祝咱们在新的一年里友谊长存!"));
        mMessages.add(new Msg(10, 3, "新的一年即将来到，愿你继续实现幸福指标，让快乐贯穿年初年末，让幸福贯彻年头年尾，让好运伴随日起日落，让健康守护春夏秋冬，让爱情甜蜜朝朝暮暮，而我作为你最忠实的朋友，将全心全意负责祝福你每分每秒，祝你来年都快快乐乐、顺顺当当！"));
        mMessages.add(new Msg(11, 3, "元旦节送你一条围巾§:::§:::§:::§:::§:::§:::§:::§:::§:::§愿它阻挡寒冷，温暖围绕着你，让你的世界充满幸福温馨！希望你：（^O^）开怀地笑；（-_-）甜蜜地睡；（+_+）天真地发呆；（^_^）时时有个好心情!"));
        mMessages.add(new Msg(12, 3, "元旦佳节来临，也没什么好送。但凡被本人视为知己者皆可收到短信一条，你可千万别看它小，祝福可不少呀。祝你在新的一年，事业高升，生活美满，钱包鼓又胀，平安伴一生。--本短信经过查证收到的不仅是本人的知己和朋友，还都是帅哥和美女呢。"));
        mMessages.add(new Msg(13, 3, "年复一年，真情不变，隔水隔山，思念不断；或近或远，阴晴冷暖，相依相伴，离合聚散；成败得失，如云如烟，功名利禄，似魔似仙；春夏秋冬，循环流转，苦辣酸甜，悲喜人间；岁月平淡，世事简单，快乐常在，凡心安然。元旦到，愿友平安，福寿绵延！"));
        mMessages.add(new Msg(14, 3, "幸福是个“元”，永远不会断；烦恼统统完“旦”，罚它靠边站。这个元旦，给你“元”滋“元”味的祝愿：愿你好运“元元”而来，快乐“元元”不断！"));
        mMessages.add(new Msg(15, 3, "拿着喜庆的帖子，骑上快乐的车子，踏上美好的路子，进入祥和的圈子，听到开心的段子，闻到鲜美的饺子，走进欢笑的院子，看到幸福的样子，送上祝福的金子，并对你说：愿你平安健康一辈子，元旦快乐！"));
        mMessages.add(new Msg(16, 3, "是否可以让我留在你的收件箱里？我只会静静坐着，答应你我会乖乖的……直到元旦来临，然后做第一个给你送祝福的人！朋友，元旦快乐，祝福你在新的一年里，快快乐乐，顺顺利利，健健康康！"));

        mMessages.add(new Msg(1, 4, "万水千山，隔不断我在jiā节对你的思念。无论你在天涯海角，我也要送给你新春的衷心祝福！新年快乐！"));
        mMessages.add(new Msg(2, 4, "新的1年开始，祝好事接2连3，心情4季如春，生活5颜6色，7彩缤纷，偶尔8点小财，烦恼抛到9霄云外!请接受我10心10意的祝福。"));
        mMessages.add(new Msg(3, 4, "我想你，想你的365，我念你，念你的365，新年快乐！在新的365天里，我给你送上365个祝福！"));
        mMessages.add(new Msg(4, 4, "祝你一帆风顺，二龙腾飞，三羊开泰，四季平安，五福临门，六六大顺，七星高照，八方来财，九九同心，十全十美，百事亨通，千事吉祥，万事如意!"));
        mMessages.add(new Msg(5, 4, "新春到来喜事多，合家团圆幸福多;心情愉快朋友多，身体健康快乐多;一切顺利福气多，新年吉祥生意多;祝您好事多!多!多!"));
        mMessages.add(new Msg(6, 4, "祝：领导偏袒你，警察让着你，法院向着你，官运伴着你，媳妇由着你，吃喝随便你，财运罩着你，中奖只有你!"));
        mMessages.add(new Msg(7, 4, "面对春节，面对身边匆匆而过的人们，想起你，心中有一种感动：爱，便是这种无法言说的缘吧。祝福你新春快乐!"));
        mMessages.add(new Msg(8, 4, "剪一对窗花，挂一双灯笼，贴一幅对联，吃一碗饺子，合家团圆!发一条短信，送一个祝福，道一句问候，报一下平安，祝新春快乐满满!"));
        mMessages.add(new Msg(9, 4, "生活可以平淡，犹如蓝天碧水;生活也可以是诗，在一路奔腾中高歌;只要我们牵着手，每个日子都是幸福!亲爱的，新春快乐!"));
        mMessages.add(new Msg(10, 4, "年末清仓!我特意留了最好的给你：把幸福留给你，把吉祥留给你，把欢乐留给你，把健康留给你，这样你就会永远幸福吉祥，快乐健康!"));

        mMessages.add(new Msg(1, 5, "青青粽叶勾思念，淡淡粽香醉人心，又到一年佳节时，在外游子倍思亲，保重身体工作忙，和气生财事业顺，有空回家望一望，祝你万事顺利，端午快乐！"));
        mMessages.add(new Msg(2, 5, "五色新丝缠角粽，绿杨带雨垂垂重，棕叶包着朋友情，友善关爱粽是情；门边插上艾叶香，平安健康永一生。祝端午节快乐！"));
        mMessages.add(new Msg(3, 5, "一把糯米、两颗红枣、三片粽叶、四根丝线、缠成五圈是端午；一个节日、两人祝福、三羊开泰、四季平安、聚成五福过端午！节日快乐！"));
        mMessages.add(new Msg(4, 5, "为避免抢购热潮，提前为你预定了粽子一包，请登录“我爱吃粽子网”领取。密码是我手机号，登录名记好：我是吃货。呵呵，端午小长假来临，逗你一乐！"));
        mMessages.add(new Msg(5, 5, "端午过节别忘记，朋友正在想着你；虽说过节不收礼，你想给点也愿意；十块八块不嫌弃，十万八万更满意；你要实在没的送，短信一条也可以！端午节快乐。"));
        mMessages.add(new Msg(6, 5, "如火如荼五月艳阳天，又是一年粽子飘香时。粽叶片片把真情包裹，糯米粒粒把幸福粘连，红枣颗颗把甜蜜点缀，红线条条把吉祥系牢。端午时节愿你快乐绵绵。拿起香甜的粽子，诱人的香气令人垂涎欲滴；竖起长长的艾叶，芳香的气息寄托美好的祝愿；划起快乐的龙舟，激昂的鼓声诉说无尽的思念。端午节到了，愿你快乐平安！"));
        mMessages.add(new Msg(7, 5, "拿起香甜的粽子，诱人的香气令人垂涎欲滴；竖起长长的艾叶，芳香的气息寄托美好的祝愿；划起快乐的龙舟，激昂的鼓声诉说无尽的思念。端午节到了，愿你快乐平安！"));
        mMessages.add(new Msg(8, 5, "有时会忙，有时会忘；有时我累，有时我懒！但怎样我也会记得想你，想你这个好朋友！记住：你微笑时我的世界也微笑，祝端午节快乐！"));
        mMessages.add(new Msg(9, 5, "在端午节来临之际，送上一份心想事成的粽子。当您打开它时，烦恼统统删除，好远紧随左右，升官发财不在话下，就连那房价也跌个不停，祝您端午节快乐！"));
        mMessages.add(new Msg(10, 5, "米与米相粘，快乐伴温馨；叶与叶相叠，钞票叠不绝；线与线缠绕，好运跑不了；粽与粽相结，祝福不停息。端午节，我给你祝愿，祝你总如愿，快乐在人间！"));
        mMessages.add(new Msg(11, 5, "苇叶片片展清香，节到端午倍思量！莺歌燕舞五月天，短信请来福运降！祝愿：日子有如红枣红，红红火火乐融融；财运就像粒粒米，包包扎扎全归你。"));

        mMessages.add(new Msg(1, 6, "七夕送七喜；生活有喜好事连，事业有喜贺升迁，爱情有喜添浪漫，财运有喜赚大钱，旅程有喜报平安，健康有喜福寿添，心情有喜乐！七“喜”快乐！"));
        mMessages.add(new Msg(2, 6, "七夕日，道七喜：一喜我想你，二喜还是想你，三喜我只在乎你，四喜很爱很爱你，五喜今夜一起数星星，六喜并肩相偎到天明，七喜从今往后我们再也不分离！"));
        mMessages.add(new Msg(3, 6, "七夕注意七个“息”：一要按时来作息，二要烦恼来休息，三要忧愁来隐息，四要爱情有生息，五要幸福不止息，六要财源不停息，七要时刻有讯息，友谊永存常联系。祝你快乐在七夕！"));
        mMessages.add(new Msg(4, 6, "七是奇数，代表孤单；双七是偶数，代表脱单。每一个奇数，都在等待另一个奇数，来组成一个偶数。所以七夕是脱单的好日子，愿你找到属于你的另一半！"));
        mMessages.add(new Msg(5, 6, "天上有牛郎织女，地上有浓浓情意，柴米油盐是简单的幸福，锅碗瓢盆是快乐的篇章；而爱，是一辈子的事情，愿你七夕快乐，美满幸福！"));
        mMessages.add(new Msg(6, 6, "七夕到了，喜鹊叫了，牛郎织女笑了，我问七夕礼物送你啥好，你嫣然一笑，柔声说道：“发短信吧，一万条不嫌多，一条不嫌少，有个心意就好！”"));
        mMessages.add(new Msg(7, 6, "一簇篝火，燃烧一段记忆；一片叶子，飘零一份心情；一只涩果，品味青春的甜蜜；一份情感，美丽一辈的人生；七夕节来临，告诉你这就是我对你伟大的爱情！"));
        mMessages.add(new Msg(8, 6, "酸酸甜甜是爱情的滋味，苦苦涩涩是痛苦的回味，清清凉凉是秋风的抚慰，缠缠绵绵是想你的心扉。七夕佳节来报备，相约携手你作陪，幸福蔓延心儿飞。"));
        mMessages.add(new Msg(9, 6, "凡人与神仙，结成千古奇缘；天上与人间，谱写爱情经典；牛郎与织女，赢得世人赞叹。可是，亲爱的！我不愿做牛郎织女，只想与你天天相伴！祝七夕快乐。"));
        mMessages.add(new Msg(10, 6, "仰望银河在思念，静数繁星许心愿。默默祝福在祈盼，梦中相依情意绵。天上七夕鹊桥会，人间知已盼相见。温馨诚挚待相知，遥祝知已心相牵。祝七夕快乐！"));

        mMessages.add(new Msg(1, 7, "赵本~山寨，张艺~谋财，孙红~雷人，小沈~阳光，陈可~辛苦！这个圣诞朕准你踏遍山寨，随手谋财，永不雷人 ，处处阳光，不再辛苦"));
        mMessages.add(new Msg(2, 7, "深暗的天空飘落缤纷的雪，寒冷忘却遥望月光的思念，青翠的松柏身裹银色的衣，微风摇摆吹落点点思念，让平静的夜带去我深深的祝福：圣诞平安、快乐！"));
        mMessages.add(new Msg(3, 7, "如果一个红衣老头跳进你的窗户把你装进袋子里请勿担心，因为是我告诉他我要的圣诞礼物是像你这样的朋友！"));
        mMessages.add(new Msg(4, 7, "为答谢多年来关心支持特在圣诞前大酬宾！凡在我心中有一定地位的人都将获得由我提供的价值人民币一毛的圣诞短信一条"));
        mMessages.add(new Msg(5, 7, "在缤纷的圣诞树上挂满最真挚的思念，在奔跑的鹿车中载满最美好的心意，在悠扬的钟声中注满最悦耳的祝福，把最温馨的关怀送进你心里：圣诞快乐！"));
        mMessages.add(new Msg(6, 7, "寒冬街头不在冷，有你陪伴暖心窝；人来人往多欢喜，静待午夜钟声起；圣诞佳节将来临，我想与你共分享；快乐好运属于你，财运福运跟着你。祝圣诞如意！"));
        mMessages.add(new Msg(7, 7, "把我的诚心，化作一朵祥云，飘在你的天空，把我的关心，化作一阵清风，飘在你的心中，把我的祝福，化作无限热情，伴你圣诞愉快，把我的短信，化作手机铃声，收到一定要感动嗷！"));
        mMessages.add(new Msg(8, 7, "世界如此忙碌，用心的人就会幸福；想你的脸，心里就温暖；想你的嘴，笑容跟着灿烂！随着圣诞节的到来，关心你的人要跟你说声：圣诞快乐！"));
        mMessages.add(new Msg(9, 7, "圣诞节将至，为了地球环境与资源，请自觉减少购买传统纸制贺卡，你可在大面值人民币上填上贺词，寄给我。感谢你对环保事业的支持！祝你幸福快乐！"));
        mMessages.add(new Msg(10, 7, "一声声笑声，一声声祝福，是圣诞节给你带来的；一份心意，一份真情，是圣诞节送你的；一个寒冷的圣诞节，一条温暖的短信，是在祝你圣诞节，笑口常开，一生笑到天荒地老！"));

        mMessages.add(new Msg(1, 8, "别动，抢劫！这是抢劫！懂吗?快拿出你的忧愁，交出你的伤心，掏出你的烦恼，摘下你的哀伤，喏！换上这个，我送来的快乐！预祝六一儿童节快乐哦"));
        mMessages.add(new Msg(2, 8, "人长大后，路会长长，山会长高。人长大了，就要远行，长大路上有风有雨有沟有壑，唯独没有童年的摇车和快乐，现在只能闭上眼睛想想童年。六一好快乐！"));
        mMessages.add(new Msg(3, 8, "童心是帆，祝福是船；快乐的风，吹着童心的帆，载着对你这长不大的朋友的祝福，漂向美丽的海湾，轻轻地问候你：六一节快乐！^0^"));
        mMessages.add(new Msg(4, 8, "儿童属于你，儿童属于我，儿童属于他，儿童属于我们大家。六一儿童节来啦，祝福你，祝福我，祝福他，祝福我们大家！"));
        mMessages.add(new Msg(5, 8, "儿童的生活，是快乐的生活；儿童的世界，是童话的世界，儿童的烦恼，是幸福的烦恼。 祝小朋友们节日快乐，好好学习，天天长个儿"));
        mMessages.add(new Msg(6, 8, "祝我们这些表面风光，内心彷徨；容颜未老，心已沧桑；成就难有，前途迷茫；比骡子还累，比蚂蚁还忙的同仁们儿童节快乐！"));
        mMessages.add(new Msg(7, 8, "正当芍药盛开，燕子飞来；正当玫瑰含笑，樱桃熟了，一年中最好的时节！芍药不及你美，樱桃不及你红，小弟小妹，儿童节快乐！"));
        mMessages.add(new Msg(8, 8, "一闪一闪亮晶晶~听~~多么稚嫩的嗓音看~~多么天真的笑容一声声真诚的祝福一句句无私的赞美漫天的星星也在说儿童节日快乐"));
        mMessages.add(new Msg(9, 8, "穿穿开裆裤你真有风度；背背小书包乐趣真不少；带带红领巾幻想在你心；只见你穿着开裆裤背着小书包带着红领巾满街跑，我问你干啥，你说庆祝六一啊！"));
        mMessages.add(new Msg(10, 8, "笑一笑十年少，一声笑吓跑烦恼，二声笑忧愁绕道，三声笑快乐来扰，四声笑幸福报到，不要再笑了，比儿童小的节日祝福我没找到，只能祝你儿童节快乐了！"));
        mMessages.add(new Msg(11, 8, "今天你最大，你说什么都算话；想吃啥就吃啥，想喝啥就喝啥；风儿为你轻轻吹，雨儿为你轻轻洒；所有的人都这么宠着你，今天是你的节日，祝你节日快乐！"));
    }

    public Msg getMessageById(int Id) {
        for (Msg msg : mMessages) {
            if (msg.getId() == Id) {
                return msg;
            }
        }
        return null;
    }

    public List<Msg> getMessageByFestivalId(int fesId) {
        List<Msg> msgs = new ArrayList<Msg>();
        for (Msg msg : mMessages) {
            if (msg.getFestivalId() == fesId) {
                msgs.add(msg);
            }
        }
        return msgs;
    }

    public List<Festival> getFestivals() {
        return new ArrayList<Festival>(mFestivals);
    }

    public Festival getFestivalById(int fesId) {
        for (Festival festival : mFestivals) {
            if (festival.getId() == fesId) {
                return festival;
            }
        }
        return null;
    }

    public static FestivalLab getInstance() {
        if (mInstance == null) {
            synchronized (FestivalLab.class) {
                if (mInstance == null) {
                    mInstance = new FestivalLab();
                }
            }
        }
        return mInstance;
    }
}
