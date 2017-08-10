package edu.cmu.lti.nlp.chinese.consts;

import edu.cmu.lti.algorithm.container.SetS;

public class City {
	public static String[] vs = { "北京", "上海", "天津", "重庆", "石家庄", "沧州", "承德", "秦皇岛", "唐山", "保定", "廊坊",
			"邢台", "衡水", "张家口", "邯郸", "任丘", "河间", "泊头 ", "太原", "长治", "大同", "阳泉", "朔州", "临汾", "晋城",
			"忻州", "运城", "晋中", "吕梁  ", "呼和浩特", "包头", "赤峰", "鄂尔多斯", "呼伦贝尔", "巴彦淖尔盟", "临河", "阿拉善盟",
			"阿拉善左旗", "兴安盟", "乌兰浩特", "通辽", "乌海  ", "乌兰察布盟", "集宁", "锡林郭勒盟", "锡林浩特", "沈阳", "大连", "本溪",
			"阜新", "葫芦岛", "盘锦", "铁岭", "丹东", "锦州", "营口", "鞍山", "辽阳", "抚顺", "朝阳", "长春", "白城", "白山",
			"吉林", "辽源", "四平", "通化", "松原", "延边", "延吉", "哈尔滨", "大庆", "大兴安岭", "鹤岗", "黑河", "鸡西", "佳木斯",
			"牡丹江", "七台河", "双鸭山", "齐齐哈尔", "伊春", "绥化", "南京", "苏州", "扬州", "无锡", "南通", "常州", "连云港",
			"徐州", "镇江", "淮安", "宿迁", "泰州", "太仓", "盐城 ", "杭州", "宁波", "温州", "丽水", "奉化", "宁海", "临海",
			"三门", "绍兴", "舟山", "义乌", "北仑", "慈溪", "象山", "余姚", "天台", "温岭", "仙居", "台州  ", "嘉兴", "湖州",
			"衢州", "金华", "合肥", "黄山", "芜湖", "铜陵", "安庆", "滁州", "宣城", "阜阳", "淮北", "蚌埠", "淮南", "马鞍山",
			"宿州", "巢湖", "六安", "亳州", "池州  ", "福州", "厦门", "泉州", "漳州", "龙岩", "三明", "莆田", "南平", "宁德  ",
			"南昌", "九江", "赣州", "景德镇", "萍乡", "新余", "吉安", "宜春", "抚州", "上饶", "鹰潭", "济南", "青岛", "烟台",
			"威海", "潍坊", "德州", "滨州", "东营", "聊城", "菏泽", "济宁", "临沂", "淄博", "泰安", "枣庄", "日照", "莱芜  ",
			"郑州", "安阳", "济源", "鹤壁", "焦作", "开封", "濮阳", "三门峡", "驻马店", "商丘", "新乡", "信阳", "许昌", "周口",
			"南阳", "洛阳", "平顶山", "漯河", "武汉", "十堰", "宜昌", "鄂州", "黄石", "襄樊", "荆州", "荆门", "孝感", "黄冈",
			"咸宁", "随州", "恩施", "仙桃", "天门", "潜江  ", "长沙", "张家界", "株州", "韶山", "衡阳", "郴州", "湘潭", "邵阳",
			"岳阳", "常德", "益阳", "永州", "怀化", "娄底", "吉首  ", "广州", "深圳", "珠海", "东莞", "佛山", "潮州", "番禺",
			"汕头", "湛江", "中山", "惠州", "河源", "揭阳", "梅州", "肇庆", "韶关", "汕尾", "江门", "阳江", "茂名", "清远",
			"云浮  ", "南宁", "柳州", "北海", "百色", "梧州", "贺州", "玉林", "河池", "桂林", "钦州", "防城港", "贵港", "来宾",
			"崇左  ", "海口", "三亚", "五指山", "琼海", "儋州", "文昌", "万宁", "东方  ", "成都", "内江", "峨眉山", "绵阳",
			"宜宾", "泸州", "攀枝花", "自贡", "资阳", "崇州", "西昌", "都江堰", "德阳", "南充", "广元", "遂宁", "乐山", "广安",
			"达州", "巴中", "雅安", "眉山", "阿坝", "马尔康", "甘孜", "康定  ", "贵阳", "六盘水", "遵义", "安顺", "铜仁", "毕节",
			"兴义", "凯里", "都匀  ", "昆明", "西双版纳", "大理", "曲靖", "玉溪", "保山", "昭通", "思茅", "临沧", "丽江", "文山",
			"个旧", "楚雄", "德宏", "潞西", "怒江", "泸水六库镇", "迪庆", "香格里拉  ", "拉萨", "那曲", "昌都", "山南", "日喀则",
			"阿里", "噶尔", "林芝  ", "西安", "宝鸡", "延安", "铜川", "咸阳", "渭南", "汉中", "榆林", "安康", "商洛  ", "兰州",
			"白银", "天水", "嘉峪关", "武威", "张掖", "平凉", "酒泉", "庆阳", "定西", "陇南", "成县", "临夏", "甘南", "西宁",
			"海东", "平安", "海北", "海晏", "黄南", "同仁", "果洛", "玛沁", "海西", "德令哈", "玉树  ", "银川", "石嘴山", "吴忠",
			"固原", "中卫  ", "乌鲁木齐", "克拉玛依", "石河子", "图木舒克", "吐鲁番", "哈密", "和田", "喀什", "昌吉", "阿图什",
			"库尔勒", "博乐", "伊宁", "阿拉尔", "阿克苏", "五家渠  ", "香港", "澳门", "高雄", "花莲", "台北", "台中", "台南",
			"高雄  ", "苗栗", "豐原 ", "彰化", "南投", "基隆", "斗六 ", "新竹", "太保", "朴子 ", "新營", "嘉義", "鳳山 ",
			"屏東", "宜蘭 ", "板橋", "花蓮", "桃園", "台東", "竹北", "馬公", "福岡", "名古屋", "沖繩", "大阪", "釜山", "漢城",
			"札幌", "東京", "碧港", "亞庇", "曼谷", "孟買", "汶來", "加爾各答", "宿霧", "吉大港", "可倫坡", "清邁", "達卡",
			"新得里", "帝利", "巴里島", "河內", "普吉島", "諾魯", "怡保", "雅加達", "喀布爾", "古晉", "喀拉蚩", "加得滿都", "吉隆坡",
			"馬德拉斯", "棉蘭", "馬尼拉", "檳城", "巨港", "金邊", "仰光", "詩鄔", "西貢", "新加坡", "塞班", "泗水", "東加大埔",
			"永珍", "阿姆斯特丹", "雅典", "巴塞隆納", "貝爾格來得", "柏林", "波昂", "布魯塞爾", "布達佩斯", "布加勒斯", "科隆", "哥本哈根",
			"都伯林", "杜塞道夫", "愛丁堡", "法蘭克福", "直布羅陀", "格拉斯哥", "日內瓦", "漢堡", "赫爾辛基", "伊斯坦堡", "里斯本", "倫敦",
			"馬德里", "曼徹斯特", "米蘭", "幕尼黑", "尼斯", "奧斯陸", "巴黎", "布拉格", "羅馬", "汕隆", "索非亞", "斯德哥爾摩",
			"斯圖加特", "維也納", "華沙", "蘇黎世", "阿波寇爾喀", "安克拉治", "亞特蘭大", "波士頓", "水牛城", "芝加哥", "克里夫蘭",
			"辛辛那提", "丹佛", "達拉斯", "底特律", "關島", "夏威夷", "休斯頓", "印第安那", "拉斯維加斯", "洛杉磯", "小岩石城", "邁阿密",
			"堪薩斯城", "米爾瓦基", "明尼亞玻利", "新奧爾良", "巴爾的摩", "紐約", "奧克拉荷馬城", "奧蘭多", "波特蘭", "費城", "鳳凰城",
			"匹茲堡", "聖安東尼", "西雅圖", "舊金山", "聖荷西", "鹽湖城", "聖路易", "吐桑", "華盛頓", "愛德頓", "哈立法克斯", "溫尼伯",
			"蒙特婁", "渥太華", "干達", "溫哥華", "卡加立", "多倫多", "奧克蘭", "布里斯本", "坎培拉", "基督城", "凱恩斯", "達爾文",
			"何巴特", "墨爾本", "南地", "努美亞", "伯斯", "摩勒斯比港", "巴哥巴哥", "大溪地", "蘇瓦", "雪梨", "威靈頓", "阿巴具",
			"阿必尚", "阿克拉", "阿迪斯阿魯巴", "亞丁", "阿爾吉爾", "安曼", "安卡拉", "巴林", "貝魯特", "班基", "巴格達", "巴馬科",
			"布蘭太", "布拉薩", "開羅", "卡薩馬達卡", "科那克里", "科多努", "開普敦", "大馬士革", "達來撤蘭", "達蘭", "達卡", "杜哈",
			"杜拜", "恩特比", "坎帕拉", "愛丁堡", "金夏沙", "自由城", "拉米堡", "伊斯坦堡", "吉達", "約翰尼斯堡", "卡吐穆", "科威特",
			"盧安達", "洛梅", "里郎威", "拉哥斯", "拉斯馬巴斯", "魯倫素馬凱斯", "露沙卡", "自由府", "馬斯開特", "摩加迪修", "馬爾他",
			"蒙羅維亞", "模里西斯", "馬基魯", "馬基尼", "奈洛彼", "恩將納", "尼阿美", "瓦加杜古", "利雅德", "索斯伯里", "德黑蘭",
			"地黎波斯", "台拉維夫", "塔那那次棉", "突尼斯", "溫黎克", "亞恩德", "亞加普科", "亞松森", "橋鎮", "哈瓦納", "巴西利亞",
			"布宜諾艾利斯", "開雪", "加拉加斯", "喬治", "瓜地馬拉", "京士頓", "基多", "拉巴斯", "瑪瑙斯", "蒙特哥灣", "墨西哥", "馬拿瓜",
			"蒙地維多", "太子港", "巴拉馬利波", "西班牙港", "巴拿馬", "雷雪夫", "里約熱內盧", "聖薩爾瓦多", "聖地牙哥", "聖保羅", "利馬",
			"聖多明哥", "聖約瑟", "聖湖安", "德古斯加巴", "波哥大" };
	public static SetS m = new SetS();
	static {m.load(vs);	}		
}