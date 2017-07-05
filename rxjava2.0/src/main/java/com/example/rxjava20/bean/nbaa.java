package com.example.rxjava20.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HASEE on 2017/7/4 12:57
 */

public class nbaa {


    /**
     * reason : success
     * result : {"30":{"id":30,"tagid":3019,"statsid":1610612766,"stats_abbr":"CHA","name":"黄蜂","eng_name":"Hornets",
     * "full_name":"夏洛特黄蜂","eng_full_name":"Charlotte Hornets","city":"Charlotte","bbr":"CHA2","logo":"CHA2.png",
     * "home":"时代华纳有线球馆","homepage_link":"http://www.nba.com/bobcats/",
     * "intro":"夏洛特黄蜂队是NBA现有30支球队之一，2004年NBA扩军时组建，原名山猫队，于2014夏更名为黄蜂，属于东部联盟东南赛区。","conference":"E",
     * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"史蒂夫-克利福德","found_year":1988,
     * "players":"1054,3025,3562,3639,3649,4842,4916,150010,150085,150154,683,150437,150477","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/hornets","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/CHA2.png","stadiumsInfo":[{"id":2,"name":"时代华纳有线球馆","eng_name":"Time Warner Cable
     * Arena","city":"Charlotte","state":"NC","capacity":19077}]},"8":{"id":8,"tagid":2985,"statsid":1610612737,
     * "stats_abbr":"ATL","name":"老鹰","eng_name":"Hawks","full_name":"亚特兰大老鹰","eng_full_name":"Atlanta Hawks",
     * "city":"Atlanta","bbr":"ATL","logo":"ATL.png","home":"菲利普斯球馆","homepage_link":"http://www.nba.com/hawks/",
     * "intro":"亚特兰大老鹰是NBA现有30支球队之一，1949年NBA成立时从NBL合并而来，拥有10位名人堂球员。","conference":"E","eng_division":"Southeast",
     * "cn_division":"东南赛区","stoped":0,"chief_coach":"迈克-布登霍尔泽","found_year":1949,"players":"4863,4776,4814,150188,
     * 150203,150353,1347,3663,150626,150484,150500","stadiums":null,"team_link":"https://nba.hupu.com/teams/hawks",
     * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/ATL.png","stadiumsInfo":[{"id":18,"name":"飞利浦球馆",
     * "eng_name":"Philips Arena","city":"Atlanta","state":"GA","capacity":18047}]},"1":{"id":1,"tagid":3020,
     * "statsid":1610612738,"stats_abbr":"BOS","name":"凯尔特人","eng_name":"Celtics","full_name":"波士顿凯尔特人",
     * "eng_full_name":"Boston Celtics","city":"Boston","bbr":"BOS","logo":"e59350a5bc97aa5c.png","home":"TD 花园",
     * "homepage_link":"http://www.nba.com/celtics/",
     * "intro":"波士顿凯尔特人队是NBA现有30支球队之一，NBA的前身、BAA创始球队之一，1947年进入NBA，凯尔特人和尼克斯是仅有的两支参加了1946年首届BAA联赛且至今没有迁移过城市的NBA球队。",
     * "conference":"E","eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"布拉德-史蒂文斯",
     * "found_year":1946,"players":"1239,3467,3613,3671,4779,4925,150005,150007,150166,150180,150433,150469,150550,
     * 150551,150194","stadiums":null,"team_link":"https://nba.hupu.com/teams/celtics","logo_link":"http://gdc
     * .hupucdn.com/gdc/nba/team/logo/e59350a5bc97aa5c.png","stadiumsInfo":[{"id":15,"name":"TD花园","eng_name":"TD
     * Garden","city":"Boston","state":"MA","capacity":18624}]},"14":{"id":14,"tagid":3021,"statsid":1610612740,
     * "stats_abbr":"NOP","name":"鹈鹕","eng_name":"Pelicans","full_name":"新奥尔良鹈鹕","eng_full_name":"New Orleans
     * Pelicans","city":"New Pelicans","bbr":"NOP","logo":"NOH.png","home":"冰沙王中心","homepage_link":"http://www.nba
     * .com/pelicans/","intro":"新奥尔良鹈鹕队是NBA现有30支球队之一，1989年进入NBA，鹈鹕队前身为黄蜂队，从2013-14赛季开始正式更名。","conference":"W",
     * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"阿尔文-金特里","found_year":1987,
     * "players":"3060,3068,3453,3474,3475,3608,3638,4800,150123,150149,150191,150473","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/pelicans","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/NOH
     * .png","stadiumsInfo":[{"id":16,"name":"冰沙王中心","eng_name":"Smoothie King Center","city":"New Orleans",
     * "state":"LA","capacity":16867}]},"9":{"id":9,"tagid":2978,"statsid":1610612741,"stats_abbr":"CHI","name":"公牛",
     * "eng_name":"Bulls","full_name":"芝加哥公牛","eng_full_name":"Chicago Bulls","city":"Chicago","bbr":"CHI",
     * "logo":"CHI.png","home":"联合中心","homepage_link":"http://www.nba.com/bulls/",
     * "intro":"芝加哥公牛队于1966-67赛季加入NBA联盟，历史上有两个成功时段，分别是90年代乔丹率领下的公牛王朝和球队建队之初的连续季后赛之旅。","conference":"E",
     * "eng_division":"Central","cn_division":"中部赛区","stoped":0,"chief_coach":"弗雷德-霍伊博格","found_year":1966,
     * "players":"50,3036,4970,4801,150052,150040,150009,150065,150174,150210,4911,150168,150439","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/bulls","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/CHI.png",
     * "stadiumsInfo":[{"id":6,"name":"联合中心","eng_name":"United Center","city":"Chicago","state":"IL",
     * "capacity":20917}]},"10":{"id":10,"tagid":3023,"statsid":1610612739,"stats_abbr":"CLE","name":"骑士",
     * "eng_name":"Cavaliers","full_name":"克利夫兰骑士","eng_full_name":"Cleveland Cavaliers","city":"Cleveland",
     * "bbr":"CLE","logo":"CLE.png","home":"速贷体育馆","homepage_link":"http://www.nba.com/cavaliers/",
     * "intro":"克利夫兰骑士队是NBA现有30支球队之一，1970年进入NBA，骑士队是东部联盟中部赛区的球队。","conference":"E","eng_division":"Central",
     * "cn_division":"中部赛区","stoped":0,"chief_coach":"泰伦-卢","found_year":1970,"players":"67,650,488,1029,3004,3554,
     * 3557,3570,4922,150224","stadiums":null,"team_link":"https://nba.hupu.com/teams/cavaliers",
     * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/CLE.png","stadiumsInfo":[{"id":5,"name":"速贷中心",
     * "eng_name":"Quicken Loans Arena","city":"Cleveland","state":"OH","capacity":20562}]},"16":{"id":16,
     * "tagid":3024,"statsid":1610612742,"stats_abbr":"DAL","name":"小牛","eng_name":"Mavericks","full_name":"达拉斯小牛",
     * "eng_full_name":"Dallas Mavericks","city":"Dallas","bbr":"DAL","logo":"DAL.png","home":"美国航空中心",
     * "homepage_link":"http://www.nba.com/mavericks/","intro":"达斯小牛队在1980-81赛季加盟了NBA。球队不断取得进步，终于在2011年拿到了梦寐以求的总冠军。",
     * "conference":"W","eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"里克-卡莱尔",
     * "found_year":1980,"players":"940,480,1318,3408,3644,4818,4798,4967,150082,150204,150222,150356,150380,150436",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/mavericks","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/DAL.png","stadiumsInfo":[{"id":1,"name":"美国航空中心","eng_name":"American Airlines Center",
     * "city":"Dallas","state":"TX","capacity":21146}]},"17":{"id":17,"tagid":3025,"statsid":1610612743,
     * "stats_abbr":"DEN","name":"掘金","eng_name":"Nuggets","full_name":"丹佛掘金","eng_full_name":"Denver Nuggets",
     * "city":"Denver","bbr":"DEN","logo":"DEN.png","home":"百事中心","homepage_link":"http://www.nba.com/nuggets/",
     * "intro":"丹佛掘金队是NBA现有30支球队之一，1977年进入NBA，掘金队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
     * "cn_division":"西北赛区","stoped":0,"chief_coach":"迈克尔-马龙","found_year":1967,"players":"16,686,1424,3024,3575,
     * 3677,4810,4942,4943,150019,150167,150192,150189,150059,150493,150549,150214","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/nuggets","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/DEN
     * .png","stadiumsInfo":[{"id":7,"name":"百事中心","eng_name":"Pepsi Center","city":"Denver","state":"CO",
     * "capacity":19155}]},"11":{"id":11,"tagid":821,"statsid":1610612765,"stats_abbr":"DET","name":"活塞",
     * "eng_name":"Pistons","full_name":"底特律活塞","eng_full_name":"Detroit Pistons","city":"Detroit","bbr":"DET",
     * "logo":"DET.png","home":"奥本山宫殿球馆","homepage_link":"http://www.nba.com/pistons/",
     * "intro":"作为NBA资历最老的球队之一，底特律活塞队在经历了长达41年的漫长奋斗之后才登上NBA总冠军的宝座。","conference":"E","eng_division":"Central",
     * "cn_division":"中部赛区","stoped":0,"chief_coach":"斯坦-范甘迪","found_year":1948,"players":"3516,3567,3572,3577,3592,
     * 3646,4790,4806,150021,150071,150171,150215,150505","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/pistons","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/DET.png","stadiumsInfo":[{"id":27,
     * "name":"奥本山宫殿","eng_name":"The Palace of Auburn Hills","city":"Detroit","state":"MI","capacity":21231}]},
     * "28":{"id":28,"tagid":2982,"statsid":1610612744,"stats_abbr":"GSW,GOS","name":"勇士","eng_name":"Warriors",
     * "full_name":"金州勇士","eng_full_name":"Golden State Warriors","city":"Golden State","bbr":"GSW","logo":"GSW.png",
     * "home":"甲骨文球馆","homepage_link":"http://www.nba.com/warriors/",
     * "intro":"金州勇士队是NBA现有30支球队之一，1947年进入NBA，勇士队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
     * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"史蒂夫-科尔","found_year":1946,"players":"3564,3672,4987,150023,
     * 150183,150225,150492","stadiums":null,"team_link":"https://nba.hupu.com/teams/warriors",
     * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/GSW.png","stadiumsInfo":[{"id":20,"name":"甲骨文球馆",
     * "eng_name":"ORACLE Arena","city":"Oakland","state":"CA","capacity":19596}]},"18":{"id":18,"tagid":811,
     * "statsid":1610612745,"stats_abbr":"HOU","name":"火箭","eng_name":"Rockets","full_name":"休斯顿火箭",
     * "eng_full_name":"Houston Rockets","city":"Houston","bbr":"HOU","logo":"HOU.png","home":"丰田中心",
     * "homepage_link":"http://www.nba.com/rockets/",
     * "intro":"休斯顿火箭队是一支有着高大中锋传统的球队，从早期的摩西-马龙、拉尔夫-桑普森到哈基姆-奥拉朱旺，以及2002年来自中国的状元秀姚明。","conference":"W",
     * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"迈克-德安东尼","found_year":1967,
     * "players":"558,3015,3046,150399,3306,4908,150227,150368,150401,150470,1037,4807,150233,150405,150365",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/rockets","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/HOU.png","stadiumsInfo":[{"id":29,"name":"丰田中心","eng_name":"Toyota Center",
     * "city":"Houston","state":"TX","capacity":18055}]},"12":{"id":12,"tagid":3026,"statsid":1610612754,
     * "stats_abbr":"IND","name":"步行者","eng_name":"Pacers","full_name":"印第安纳步行者","eng_full_name":"Indiana Pacers",
     * "city":"Indiana","bbr":"IND","logo":"IND.png","home":"银行家人寿球馆","homepage_link":"http://www.nba.com/pacers/",
     * "intro":"印第安纳步行者队于1967年组建于印第安纳波利斯，加盟当时的ABA。ABA时期的步行者堪称辉煌，曾经在1969-1973年间四年三夺总冠军。","conference":"E",
     * "eng_division":"Central","cn_division":"中部赛区","stoped":0,"chief_coach":"内特-麦克米兰","found_year":1976,
     * "players":"827,1111,1237,3458,3465,3488,4912,150026,150012,150027,150220,150499,150503,150467",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/pacers","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/IND.png","stadiumsInfo":[{"id":21,"name":"银行家人寿球馆","eng_name":"Bankers Life
     * Fieldhouse","city":"Indianapolis","state":"IN","capacity":18165}]},"29":{"id":29,"tagid":2984,
     * "statsid":1610612746,"stats_abbr":"LAC","name":"快船","eng_name":"Clippers","full_name":"洛杉矶快船",
     * "eng_full_name":"Los Angeles Clippers","city":"Los Angeles","bbr":"LAC","logo":"LAC.png","home":"斯台普斯中心",
     * "homepage_link":"http://www.nba.com/clippers/","intro":"洛杉矶快船队是NBA现有30支球队之一，属于西部联盟太平洋赛区，1971年进入NBA。",
     * "conference":"W","eng_division":"Pacific","cn_division":"太平洋赛区","stoped":0,"chief_coach":"道格-里弗斯",
     * "found_year":1970,"players":"572,3014,3452,3647,150182,150179,150482,3393,1128,3606,150024,150025,150402",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/clippers","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/LAC.png","stadiumsInfo":[{"id":503,"name":"斯台普斯中心","eng_name":"Staples Center",
     * "city":"Los Angeles","state":"CA","capacity":19060}]},"24":{"id":24,"tagid":846,"statsid":1610612747,
     * "stats_abbr":"LAL","name":"湖人","eng_name":"Lakers","full_name":"洛杉矶湖人","eng_full_name":"Los Angeles Lakers",
     * "city":"Los Angeles","bbr":"LAL","logo":"b718254a88cc2e70.png","home":"斯台普斯中心","homepage_link":"http://www.nba
     * .com/lakers/","intro":"洛杉矶湖人队是NBA现有30支球队之一，1949年进入NBA，湖人队是西部联盟太平洋赛区的球队。","conference":"W",
     * "eng_division":"Pacific","cn_division":"太平洋赛区","stoped":0,"chief_coach":"卢克-沃顿","found_year":1947,
     * "players":"545,1355,4932,4933,150030,150164,150201,150427,150429,3013,150471,150488,150489","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/lakers","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/b718254a88cc2e70.png","stadiumsInfo":[{"id":3,"name":"斯台普斯中心","eng_name":"STAPLES
     * Center","city":"Los Angeles","state":"CA","capacity":18997}]},"2":{"id":2,"tagid":2698,"statsid":1610612748,
     * "stats_abbr":"MIA","name":"热火","eng_name":"Heat","full_name":"迈阿密热火","eng_full_name":"Miami Heat",
     * "city":"Miami","bbr":"MIA","logo":"MIA.png","home":"美国航空球馆","homepage_link":"http://www.nba.com/heat/",
     * "intro":"迈阿密热火队是NBA现有30支球队之一，1988-89赛季同奥兰多魔术队、明尼苏达森林狼队和夏洛特黄蜂队一起加入NBA的。","conference":"E",
     * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"埃里克-斯波尔斯特拉","found_year":1988,
     * "players":"419,1214,3074,3331,5010,4878,4978,150032,150033,150352,150509","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/heat","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/MIA.png",
     * "stadiumsInfo":[{"id":25,"name":"美国航空球馆","eng_name":"AmericanAirlines Arena","city":"Miami","state":"FL",
     * "capacity":19600}]},"13":{"id":13,"tagid":3030,"statsid":1610612749,"stats_abbr":"MIL","name":"雄鹿",
     * "eng_name":"Bucks","full_name":"密尔沃基雄鹿","eng_full_name":"Milwaukee Bucks","city":"Milwaukee","bbr":"MIL",
     * "logo":"MIL.png","home":"布拉德利中心","homepage_link":"http://www.nba.com/bucks/",
     * "intro":"密尔沃基雄鹿队在1968-69赛季第一次进入NBA，在职业体育界历史上，雄鹿从建队到赢得冠军奖杯的速度是最快的。","conference":"E","eng_division":"Central",
     * "cn_division":"中部赛区","stoped":0,"chief_coach":"杰森-基德","found_year":1968,"players":"1343,3455,3651,3676,3699,
     * 4802,4784,4789,4914,150036,150231,150206,150400,150466","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/bucks","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/MIL.png","stadiumsInfo":[{"id":13,
     * "name":"BMO哈里斯-布拉德利中心","eng_name":"BMO Harris Bradley Center","city":"Milwaukee","state":"WI",
     * "capacity":18717}]},"20":{"id":20,"tagid":2990,"statsid":1610612750,"stats_abbr":"MIN","name":"森林狼",
     * "eng_name":"Timberwolves","full_name":"明尼苏达森林狼","eng_full_name":"Minnesota Timberwolves","city":"Minnesota",
     * "bbr":"MIN","logo":"MIN.png","home":"标靶中心","homepage_link":"http://www.nba.com/timberwolves/",
     * "intro":"明尼苏达森林狼队是NBA现有30支球队之一，1990年进入NBA，森林狼队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
     * "cn_division":"西北赛区","stoped":0,"chief_coach":"汤姆-锡伯杜","found_year":1989,"players":"3459,150066,4812,4813,
     * 4956,150037,150038,3583,150478","stadiums":null,"team_link":"https://nba.hupu.com/teams/timberwolves",
     * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/MIN.png","stadiumsInfo":[{"id":23,"name":"标靶中心",
     * "eng_name":"Target Center","city":"Minneapolis","state":"MN","capacity":19356}]},"182":{"id":182,"tagid":3022,
     * "statsid":1610612751,"stats_abbr":"BKN","name":"篮网","eng_name":"Nets","full_name":"布鲁克林篮网",
     * "eng_full_name":"Brooklyn Nets","city":"Brooklyn","bbr":"BKN","logo":"BKN.png","home":"巴克莱中心",
     * "homepage_link":"http://nba.hupu.com/teams/nets",
     * "intro":"布鲁克林篮网是NBA现有30支球队之一，1968-1976年曾加入过ABA联盟，1977年进入NBA至今，东部联盟大西洋赛区的球队。","conference":"E",
     * "eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"肯尼-阿特金森","found_year":1967,
     * "players":"3471,3513,3656,3674,3682,4824,4960,4957,4955,5045,150014,150190,150223,150441,3509,150029,150552",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/nets","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/BKN.png","stadiumsInfo":[{"id":504,"name":"巴克莱中心","eng_name":"Barclays Center",
     * "city":"Brooklyn","state":"NY","capacity":17732}]},"4":{"id":4,"tagid":2700,"statsid":1610612752,
     * "stats_abbr":"NYK","name":"尼克斯","eng_name":"Knicks","full_name":"纽约尼克斯","eng_full_name":"New York Knicks",
     * "city":"New York","bbr":"NYK","logo":"NYK.png","home":"麦迪逊广场花园","homepage_link":"http://www.nba.com/knicks/",
     * "intro":"纽约尼克斯队是从最初的BAA联盟开始就没有搬迁过城市的两支球队之一(另外一支是波士顿凯尔特人队)。尼克斯在联盟的三个不同时代有过辉煌的表现，每个时代都相差二十年左右。",
     * "conference":"E","eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"杰夫-霍纳塞克",
     * "found_year":1946,"players":"252,1222,3052,3619,3686,150039,150041,150346,150339,150363,150364,150438,150547,
     * 150553","stadiums":null,"team_link":"https://nba.hupu.com/teams/knicks","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/NYK.png","stadiumsInfo":[{"id":12,"name":"麦迪逊广场花园","eng_name":"Madison Square Garden",
     * "city":"New York","state":"NY","capacity":19812}]},"5":{"id":5,"tagid":3033,"statsid":1610612753,
     * "stats_abbr":"ORL","name":"魔术","eng_name":"Magic","full_name":"奥兰多魔术","eng_full_name":"Orlando Magic",
     * "city":"Orlando","bbr":"ORL","logo":"ORL.png","home":"安利球馆","homepage_link":"http://www.nba.com/magic/",
     * "intro":"奥兰多魔术队在1989-1990赛季之前借联盟扩军之机进入NBA，在处子赛季就成为了联盟中进攻火力最强大的队伍之一。","conference":"E",
     * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"弗兰克-沃格尔","found_year":1989,
     * "players":"1464,3021,3560,3569,3645,3657,4944,4945,4968,150042,150185,150366,150415,150435,150474",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/magic","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/ORL.png","stadiumsInfo":[{"id":11,"name":"安利中心","eng_name":"Amway Center",
     * "city":"Orlando","state":"FL","capacity":18846}]},"6":{"id":6,"tagid":2992,"statsid":1610612755,
     * "stats_abbr":"PHI,PHL","name":"76人","eng_name":"76ers","full_name":"费城76人","eng_full_name":"Philadelphia
     * 76ers","city":"Philadelphia","bbr":"PHI","logo":"PHI.png","home":"富国银行中心","homepage_link":"http://www.nba
     * .com/sixers/","intro":"作为联盟历史最悠久的球队之一，费城76人队史上涌现过无数各具特色的一线巨星，其中名人堂成员就有9位之多。","conference":"E",
     * "eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"布雷特-布朗","found_year":1949,
     * "players":"3011,4851,4958,4939,4959,150045,150017,150046,150142,150163,150178,150371,150426,150546,150479,
     * 150494,150548,150512","stadiums":null,"team_link":"https://nba.hupu.com/teams/76ers","logo_link":"http://gdc
     * .hupucdn.com/gdc/nba/team/logo/PHI.png","stadiumsInfo":[{"id":8,"name":"富国银行中心","eng_name":"The Center",
     * "city":"Philadelphia","state":"PA","capacity":20478}]},"26":{"id":26,"tagid":3027,"statsid":1610612756,
     * "stats_abbr":"PHX,PHO","name":"太阳","eng_name":"Suns","full_name":"菲尼克斯太阳","eng_full_name":"Phoenix Suns",
     * "city":"Phoenix","bbr":"PHO","logo":"PHX.png","home":"托金斯迪克度假酒店球馆","homepage_link":"http://www.nba.com/suns/",
     * "intro":"菲尼克斯太阳队是NBA现有30支球队之一，1969年进入NBA，太阳队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
     * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"厄尔-沃特森","found_year":1968,"players":"326,183,1395,3466,3552,
     * 3561,4823,4934,150044,150160,150165,150177,150186,150409,150432,150545,150502","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/suns","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/PHX.png",
     * "stadiumsInfo":[{"id":19,"name":"托金斯迪克度假酒店球馆","eng_name":"Talking Stick Resort Arena","city":"Phoenix",
     * "state":"AZ","capacity":18055}]},"25":{"id":25,"tagid":3008,"statsid":1610612757,"stats_abbr":"POR",
     * "name":"开拓者","eng_name":"Blazers","full_name":"波特兰开拓者","eng_full_name":"Portland Trail Blazers",
     * "city":"Portland","bbr":"POR","logo":"POR.png","home":"摩达中心","homepage_link":"http://www.nba.com/blazers/",
     * "intro":"波特兰开拓者队是NBA现有30支球队之一，1971年进入NBA，开拓者队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
     * "cn_division":"西北赛区","stoped":0,"chief_coach":"特里-斯托茨","found_year":1977,"players":"3450,3456,3461,3643,3648,
     * 3652,4844,4845,4965,4941,4910,150050,150213,150461,150490","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/blazers","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/POR.png","stadiumsInfo":[{"id":4,
     * "name":"摩达中心","eng_name":"Moda Center","city":"Portland","state":"OR","capacity":19441}]},"23":{"id":23,
     * "tagid":3034,"statsid":1610612758,"stats_abbr":"SAC","name":"国王","eng_name":"Kings","full_name":"萨克拉门托国王",
     * "eng_full_name":"Sacramento Kings","city":"Sacramento","bbr":"SAC","logo":"SAC.png","home":"黄金一号中心",
     * "homepage_link":"http://www.nba.com/kings/","intro":"萨克拉门托国王队是NBA现有30支球队之一，1949年进入NBA，国王队是西部联盟太平洋赛区的球队。",
     * "conference":"W","eng_division":"Pacific","cn_division":"太平洋赛区","stoped":0,"chief_coach":"戴夫-乔尔格",
     * "found_year":1951,"players":"3078,3440,4990,150054,150169,150232,150226,150172,150434,150511,150468,150504",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/kings","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/SAC.png","stadiumsInfo":[{"id":10,"name":"黄金一号中心","eng_name":"Golden1 Center",
     * "city":"Sacramento","state":"CA","capacity":17500}]},"21":{"id":21,"tagid":2994,"statsid":1610612759,
     * "stats_abbr":"SAS,SAN","name":"马刺","eng_name":"Spurs","full_name":"圣安东尼奥马刺","eng_full_name":"San Antonio
     * Spurs","city":"San Antonio","bbr":"SAS","logo":"SAS.png","home":"AT&T 中心","homepage_link":"http://www.nba
     * .com/spurs/","intro":"圣安东尼奥马刺是NBA现有30支球队之一，成立于1967年并加入ABA，1976年从ABA合并进入NBA，马刺队是西部联盟西南分区的球队。 ",
     * "conference":"W","eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"格雷格-波波维奇",
     * "found_year":1976,"players":"700,1209,3356,3568,3596,4917,150073,150181,150385,150480,150496","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/spurs","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/SAS.png",
     * "stadiumsInfo":[{"id":17,"name":"AT&T中心","eng_name":"AT&T Center","city":"San Antonio","state":"TX",
     * "capacity":18500}]},"27":{"id":27,"tagid":2987,"statsid":1610612760,"stats_abbr":"OKC","name":"雷霆",
     * "eng_name":"Thunder","full_name":"俄克拉荷马城雷霆","eng_full_name":"Oklahoma City Thunder","city":"Oklahoma City",
     * "bbr":"OKC","logo":"OKC.png","home":"切萨皮克能源球馆","homepage_link":"http://www.nba.com/thunder/",
     * "intro":"俄克拉荷马城雷霆队是NBA现有30支球队之一，1968年进入NBA，前身是西雅图超音速队，雷霆队是西部联盟西北赛区的球队。","conference":"W",
     * "eng_division":"Northwest","cn_division":"西北赛区","stoped":0,"chief_coach":"比利-多诺万","found_year":1979,
     * "players":"3016,3556,3587,4819,4829,4830,4692,4927,4930,4961,4931,150175,150506","stadiums":null,
     * "team_link":"https://nba.hupu.com/teams/thunder","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/OKC
     * .png","stadiumsInfo":[{"id":9,"name":"切萨皮克能源球馆","eng_name":"Chesapeake Energy Arena","city":"Oklahoma City",
     * "state":"OK","capacity":18203}]},"22":{"id":22,"tagid":2997,"statsid":1610612762,"stats_abbr":"UTA,UTH",
     * "name":"爵士","eng_name":"Jazz","full_name":"犹他爵士","eng_full_name":"Utah Jazz","city":"Utah","bbr":"UTA",
     * "logo":"UTA.png","home":"威英特智能家居球馆","homepage_link":"http://www.nba.com/jazz/",
     * "intro":"犹他爵士队是NBA现有30支球队之一，1975年进入NBA，爵士队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
     * "cn_division":"西北赛区","stoped":0,"chief_coach":"奎因-斯奈德","found_year":1974,"players":"188,312,3451,3565,4834,
     * 150063,4938,4940,4998,150228,150510,150491,150481,3345","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/jazz","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/UTA.png","stadiumsInfo":[{"id":14,
     * "name":"威英特智能家居球馆","eng_name":"Vivint Smart Home Arena","city":"Salt Lake City","state":"UT",
     * "capacity":19911}]},"7":{"id":7,"tagid":3036,"statsid":1610612764,"stats_abbr":"WAS","name":"奇才",
     * "eng_name":"Wizards","full_name":"华盛顿奇才","eng_full_name":"Washington Wizards","city":"Washington","bbr":"WAS",
     * "logo":"WAS.png","home":"威瑞森中心","homepage_link":"http://www.nba.com/wizards/",
     * "intro":"华盛顿奇才队成立于1961年，东部联盟东南分区的球队，曾经使用过芝加哥包装工人队、华盛顿子弹队等队名。 ","conference":"E","eng_division":"Southeast",
     * "cn_division":"东南赛区","stoped":0,"chief_coach":"斯科特-布鲁克斯","found_year":1961,"players":"1446,1447,1342,3449,
     * 3566,4972,3640,150359,4838,150057,150015,150387,150389,5026","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/wizards","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/WAS.png","stadiumsInfo":[{"id":22,
     * "name":"威瑞森中心","eng_name":"Verizon Center","city":"Washington D.C.","state":"Washington D.C.",
     * "capacity":20356}]},"15":{"id":15,"tagid":3035,"statsid":1610612761,"stats_abbr":"TOR","name":"猛龙",
     * "eng_name":"Raptors","full_name":"多伦多猛龙","eng_full_name":"Toronto Raptors","city":"Toronto","bbr":"TOR",
     * "logo":"TOR.png","home":"加拿大航空中心","homepage_link":"http://www.nba.com/raptors/",
     * "intro":"多伦多猛龙建队于1995年，他和当时的温哥华灰熊一起加入联盟，作为NBA加拿大扩军计划中的重要内容。","conference":"E","eng_division":"Atlantic",
     * "cn_division":"大西洋赛区","stoped":0,"chief_coach":"德韦恩-凯西","found_year":1995,"players":"3314,3387,3558,3582,4976,
     * 4947,150061,150062,150170,150219,150388,150508","stadiums":null,"team_link":"https://nba.hupu
     * .com/teams/raptors","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/TOR.png","stadiumsInfo":[{"id":26,
     * "name":"加拿大航空中心","eng_name":"Air Canada Centre","city":"Toronto","state":"ON","capacity":19800}]},
     * "19":{"id":19,"tagid":3029,"statsid":1610612763,"stats_abbr":"MEM","name":"灰熊","eng_name":"Grizzlies",
     * "full_name":"孟菲斯灰熊","eng_full_name":"Memphis Grizzlies","city":"Memphis","bbr":"MEM","logo":"MEN.png",
     * "home":"联邦快递球馆","homepage_link":"http://www.nba.com/grizzlies/",
     * "intro":"孟菲斯灰熊队是NBA现有30支球队之一，1996年进入NBA，在2010-11赛季季后赛中击败马刺上演黑八传奇。","conference":"W",
     * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"大卫-菲兹代尔","found_year":1995,
     * "players":"1411,1238,1384,3584,4804,4869,4884,150034,150035,150187,150173,150367,150507,150497",
     * "stadiums":null,"team_link":"https://nba.hupu.com/teams/grizzlies","logo_link":"http://gdc.hupucdn
     * .com/gdc/nba/team/logo/MEN.png","stadiumsInfo":[{"id":28,"name":"联邦快递球馆","eng_name":"FedExForum",
     * "city":"Memphis","state":"TN","capacity":18119}]}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * 30 : {"id":30,"tagid":3019,"statsid":1610612766,"stats_abbr":"CHA","name":"黄蜂","eng_name":"Hornets",
         * "full_name":"夏洛特黄蜂","eng_full_name":"Charlotte Hornets","city":"Charlotte","bbr":"CHA2","logo":"CHA2.png",
         * "home":"时代华纳有线球馆","homepage_link":"http://www.nba.com/bobcats/",
         * "intro":"夏洛特黄蜂队是NBA现有30支球队之一，2004年NBA扩军时组建，原名山猫队，于2014夏更名为黄蜂，属于东部联盟东南赛区。","conference":"E",
         * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"史蒂夫-克利福德","found_year":1988,
         * "players":"1054,3025,3562,3639,3649,4842,4916,150010,150085,150154,683,150437,150477","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/hornets","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/CHA2.png","stadiumsInfo":[{"id":2,"name":"时代华纳有线球馆","eng_name":"Time Warner Cable
         * Arena","city":"Charlotte","state":"NC","capacity":19077}]}
         * 8 : {"id":8,"tagid":2985,"statsid":1610612737,"stats_abbr":"ATL","name":"老鹰","eng_name":"Hawks",
         * "full_name":"亚特兰大老鹰","eng_full_name":"Atlanta Hawks","city":"Atlanta","bbr":"ATL","logo":"ATL.png",
         * "home":"菲利普斯球馆","homepage_link":"http://www.nba.com/hawks/",
         * "intro":"亚特兰大老鹰是NBA现有30支球队之一，1949年NBA成立时从NBL合并而来，拥有10位名人堂球员。","conference":"E","eng_division":"Southeast",
         * "cn_division":"东南赛区","stoped":0,"chief_coach":"迈克-布登霍尔泽","found_year":1949,"players":"4863,4776,4814,
         * 150188,150203,150353,1347,3663,150626,150484,150500","stadiums":null,"team_link":"https://nba.hupu
         * .com/teams/hawks","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/ATL.png","stadiumsInfo":[{"id":18,
         * "name":"飞利浦球馆","eng_name":"Philips Arena","city":"Atlanta","state":"GA","capacity":18047}]}
         * 1 : {"id":1,"tagid":3020,"statsid":1610612738,"stats_abbr":"BOS","name":"凯尔特人","eng_name":"Celtics",
         * "full_name":"波士顿凯尔特人","eng_full_name":"Boston Celtics","city":"Boston","bbr":"BOS",
         * "logo":"e59350a5bc97aa5c.png","home":"TD 花园","homepage_link":"http://www.nba.com/celtics/",
         * "intro":"波士顿凯尔特人队是NBA现有30支球队之一，NBA的前身、BAA创始球队之一，1947年进入NBA，凯尔特人和尼克斯是仅有的两支参加了1946年首届BAA联赛且至今没有迁移过城市的NBA
         * 球队。","conference":"E","eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"布拉德-史蒂文斯",
         * "found_year":1946,"players":"1239,3467,3613,3671,4779,4925,150005,150007,150166,150180,150433,150469,
         * 150550,150551,150194","stadiums":null,"team_link":"https://nba.hupu.com/teams/celtics",
         * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/e59350a5bc97aa5c.png","stadiumsInfo":[{"id":15,
         * "name":"TD花园","eng_name":"TD Garden","city":"Boston","state":"MA","capacity":18624}]}
         * 14 : {"id":14,"tagid":3021,"statsid":1610612740,"stats_abbr":"NOP","name":"鹈鹕","eng_name":"Pelicans",
         * "full_name":"新奥尔良鹈鹕","eng_full_name":"New Orleans Pelicans","city":"New Pelicans","bbr":"NOP","logo":"NOH
         * .png","home":"冰沙王中心","homepage_link":"http://www.nba.com/pelicans/",
         * "intro":"新奥尔良鹈鹕队是NBA现有30支球队之一，1989年进入NBA，鹈鹕队前身为黄蜂队，从2013-14赛季开始正式更名。","conference":"W",
         * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"阿尔文-金特里","found_year":1987,
         * "players":"3060,3068,3453,3474,3475,3608,3638,4800,150123,150149,150191,150473","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/pelicans","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/NOH.png","stadiumsInfo":[{"id":16,"name":"冰沙王中心","eng_name":"Smoothie King Center",
         * "city":"New Orleans","state":"LA","capacity":16867}]}
         * 9 : {"id":9,"tagid":2978,"statsid":1610612741,"stats_abbr":"CHI","name":"公牛","eng_name":"Bulls",
         * "full_name":"芝加哥公牛","eng_full_name":"Chicago Bulls","city":"Chicago","bbr":"CHI","logo":"CHI.png",
         * "home":"联合中心","homepage_link":"http://www.nba.com/bulls/",
         * "intro":"芝加哥公牛队于1966-67赛季加入NBA联盟，历史上有两个成功时段，分别是90年代乔丹率领下的公牛王朝和球队建队之初的连续季后赛之旅。","conference":"E",
         * "eng_division":"Central","cn_division":"中部赛区","stoped":0,"chief_coach":"弗雷德-霍伊博格","found_year":1966,
         * "players":"50,3036,4970,4801,150052,150040,150009,150065,150174,150210,4911,150168,150439",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/bulls","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/CHI.png","stadiumsInfo":[{"id":6,"name":"联合中心","eng_name":"United Center",
         * "city":"Chicago","state":"IL","capacity":20917}]}
         * 10 : {"id":10,"tagid":3023,"statsid":1610612739,"stats_abbr":"CLE","name":"骑士","eng_name":"Cavaliers",
         * "full_name":"克利夫兰骑士","eng_full_name":"Cleveland Cavaliers","city":"Cleveland","bbr":"CLE","logo":"CLE
         * .png","home":"速贷体育馆","homepage_link":"http://www.nba.com/cavaliers/",
         * "intro":"克利夫兰骑士队是NBA现有30支球队之一，1970年进入NBA，骑士队是东部联盟中部赛区的球队。","conference":"E","eng_division":"Central",
         * "cn_division":"中部赛区","stoped":0,"chief_coach":"泰伦-卢","found_year":1970,"players":"67,650,488,1029,3004,
         * 3554,3557,3570,4922,150224","stadiums":null,"team_link":"https://nba.hupu.com/teams/cavaliers",
         * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/CLE.png","stadiumsInfo":[{"id":5,"name":"速贷中心",
         * "eng_name":"Quicken Loans Arena","city":"Cleveland","state":"OH","capacity":20562}]}
         * 16 : {"id":16,"tagid":3024,"statsid":1610612742,"stats_abbr":"DAL","name":"小牛","eng_name":"Mavericks",
         * "full_name":"达拉斯小牛","eng_full_name":"Dallas Mavericks","city":"Dallas","bbr":"DAL","logo":"DAL.png",
         * "home":"美国航空中心","homepage_link":"http://www.nba.com/mavericks/",
         * "intro":"达斯小牛队在1980-81赛季加盟了NBA。球队不断取得进步，终于在2011年拿到了梦寐以求的总冠军。","conference":"W","eng_division":"Southwest",
         * "cn_division":"西南赛区","stoped":0,"chief_coach":"里克-卡莱尔","found_year":1980,"players":"940,480,1318,3408,
         * 3644,4818,4798,4967,150082,150204,150222,150356,150380,150436","stadiums":null,"team_link":"https://nba
         * .hupu.com/teams/mavericks","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/DAL.png",
         * "stadiumsInfo":[{"id":1,"name":"美国航空中心","eng_name":"American Airlines Center","city":"Dallas",
         * "state":"TX","capacity":21146}]}
         * 17 : {"id":17,"tagid":3025,"statsid":1610612743,"stats_abbr":"DEN","name":"掘金","eng_name":"Nuggets",
         * "full_name":"丹佛掘金","eng_full_name":"Denver Nuggets","city":"Denver","bbr":"DEN","logo":"DEN.png",
         * "home":"百事中心","homepage_link":"http://www.nba.com/nuggets/",
         * "intro":"丹佛掘金队是NBA现有30支球队之一，1977年进入NBA，掘金队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
         * "cn_division":"西北赛区","stoped":0,"chief_coach":"迈克尔-马龙","found_year":1967,"players":"16,686,1424,3024,3575,
         * 3677,4810,4942,4943,150019,150167,150192,150189,150059,150493,150549,150214","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/nuggets","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/DEN
         * .png","stadiumsInfo":[{"id":7,"name":"百事中心","eng_name":"Pepsi Center","city":"Denver","state":"CO",
         * "capacity":19155}]}
         * 11 : {"id":11,"tagid":821,"statsid":1610612765,"stats_abbr":"DET","name":"活塞","eng_name":"Pistons",
         * "full_name":"底特律活塞","eng_full_name":"Detroit Pistons","city":"Detroit","bbr":"DET","logo":"DET.png",
         * "home":"奥本山宫殿球馆","homepage_link":"http://www.nba.com/pistons/",
         * "intro":"作为NBA资历最老的球队之一，底特律活塞队在经历了长达41年的漫长奋斗之后才登上NBA总冠军的宝座。","conference":"E","eng_division":"Central",
         * "cn_division":"中部赛区","stoped":0,"chief_coach":"斯坦-范甘迪","found_year":1948,"players":"3516,3567,3572,3577,
         * 3592,3646,4790,4806,150021,150071,150171,150215,150505","stadiums":null,"team_link":"https://nba.hupu
         * .com/teams/pistons","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/DET.png",
         * "stadiumsInfo":[{"id":27,"name":"奥本山宫殿","eng_name":"The Palace of Auburn Hills","city":"Detroit",
         * "state":"MI","capacity":21231}]}
         * 28 : {"id":28,"tagid":2982,"statsid":1610612744,"stats_abbr":"GSW,GOS","name":"勇士","eng_name":"Warriors",
         * "full_name":"金州勇士","eng_full_name":"Golden State Warriors","city":"Golden State","bbr":"GSW","logo":"GSW
         * .png","home":"甲骨文球馆","homepage_link":"http://www.nba.com/warriors/",
         * "intro":"金州勇士队是NBA现有30支球队之一，1947年进入NBA，勇士队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
         * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"史蒂夫-科尔","found_year":1946,"players":"3564,3672,4987,
         * 150023,150183,150225,150492","stadiums":null,"team_link":"https://nba.hupu.com/teams/warriors",
         * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/GSW.png","stadiumsInfo":[{"id":20,"name":"甲骨文球馆",
         * "eng_name":"ORACLE Arena","city":"Oakland","state":"CA","capacity":19596}]}
         * 18 : {"id":18,"tagid":811,"statsid":1610612745,"stats_abbr":"HOU","name":"火箭","eng_name":"Rockets",
         * "full_name":"休斯顿火箭","eng_full_name":"Houston Rockets","city":"Houston","bbr":"HOU","logo":"HOU.png",
         * "home":"丰田中心","homepage_link":"http://www.nba.com/rockets/",
         * "intro":"休斯顿火箭队是一支有着高大中锋传统的球队，从早期的摩西-马龙、拉尔夫-桑普森到哈基姆-奥拉朱旺，以及2002年来自中国的状元秀姚明。","conference":"W",
         * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"迈克-德安东尼","found_year":1967,
         * "players":"558,3015,3046,150399,3306,4908,150227,150368,150401,150470,1037,4807,150233,150405,150365",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/rockets","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/HOU.png","stadiumsInfo":[{"id":29,"name":"丰田中心","eng_name":"Toyota Center",
         * "city":"Houston","state":"TX","capacity":18055}]}
         * 12 : {"id":12,"tagid":3026,"statsid":1610612754,"stats_abbr":"IND","name":"步行者","eng_name":"Pacers",
         * "full_name":"印第安纳步行者","eng_full_name":"Indiana Pacers","city":"Indiana","bbr":"IND","logo":"IND.png",
         * "home":"银行家人寿球馆","homepage_link":"http://www.nba.com/pacers/",
         * "intro":"印第安纳步行者队于1967年组建于印第安纳波利斯，加盟当时的ABA。ABA时期的步行者堪称辉煌，曾经在1969-1973年间四年三夺总冠军。","conference":"E",
         * "eng_division":"Central","cn_division":"中部赛区","stoped":0,"chief_coach":"内特-麦克米兰","found_year":1976,
         * "players":"827,1111,1237,3458,3465,3488,4912,150026,150012,150027,150220,150499,150503,150467",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/pacers","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/IND.png","stadiumsInfo":[{"id":21,"name":"银行家人寿球馆","eng_name":"Bankers Life
         * Fieldhouse","city":"Indianapolis","state":"IN","capacity":18165}]}
         * 29 : {"id":29,"tagid":2984,"statsid":1610612746,"stats_abbr":"LAC","name":"快船","eng_name":"Clippers",
         * "full_name":"洛杉矶快船","eng_full_name":"Los Angeles Clippers","city":"Los Angeles","bbr":"LAC","logo":"LAC
         * .png","home":"斯台普斯中心","homepage_link":"http://www.nba.com/clippers/",
         * "intro":"洛杉矶快船队是NBA现有30支球队之一，属于西部联盟太平洋赛区，1971年进入NBA。","conference":"W","eng_division":"Pacific",
         * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"道格-里弗斯","found_year":1970,"players":"572,3014,3452,3647,
         * 150182,150179,150482,3393,1128,3606,150024,150025,150402","stadiums":null,"team_link":"https://nba.hupu
         * .com/teams/clippers","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/LAC.png",
         * "stadiumsInfo":[{"id":503,"name":"斯台普斯中心","eng_name":"Staples Center","city":"Los Angeles","state":"CA",
         * "capacity":19060}]}
         * 24 : {"id":24,"tagid":846,"statsid":1610612747,"stats_abbr":"LAL","name":"湖人","eng_name":"Lakers",
         * "full_name":"洛杉矶湖人","eng_full_name":"Los Angeles Lakers","city":"Los Angeles","bbr":"LAL",
         * "logo":"b718254a88cc2e70.png","home":"斯台普斯中心","homepage_link":"http://www.nba.com/lakers/",
         * "intro":"洛杉矶湖人队是NBA现有30支球队之一，1949年进入NBA，湖人队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
         * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"卢克-沃顿","found_year":1947,"players":"545,1355,4932,4933,
         * 150030,150164,150201,150427,150429,3013,150471,150488,150489","stadiums":null,"team_link":"https://nba
         * .hupu.com/teams/lakers","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/b718254a88cc2e70.png",
         * "stadiumsInfo":[{"id":3,"name":"斯台普斯中心","eng_name":"STAPLES Center","city":"Los Angeles","state":"CA",
         * "capacity":18997}]}
         * 2 : {"id":2,"tagid":2698,"statsid":1610612748,"stats_abbr":"MIA","name":"热火","eng_name":"Heat",
         * "full_name":"迈阿密热火","eng_full_name":"Miami Heat","city":"Miami","bbr":"MIA","logo":"MIA.png",
         * "home":"美国航空球馆","homepage_link":"http://www.nba.com/heat/",
         * "intro":"迈阿密热火队是NBA现有30支球队之一，1988-89赛季同奥兰多魔术队、明尼苏达森林狼队和夏洛特黄蜂队一起加入NBA的。","conference":"E",
         * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"埃里克-斯波尔斯特拉","found_year":1988,
         * "players":"419,1214,3074,3331,5010,4878,4978,150032,150033,150352,150509","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/heat","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/MIA
         * .png","stadiumsInfo":[{"id":25,"name":"美国航空球馆","eng_name":"AmericanAirlines Arena","city":"Miami",
         * "state":"FL","capacity":19600}]}
         * 13 : {"id":13,"tagid":3030,"statsid":1610612749,"stats_abbr":"MIL","name":"雄鹿","eng_name":"Bucks",
         * "full_name":"密尔沃基雄鹿","eng_full_name":"Milwaukee Bucks","city":"Milwaukee","bbr":"MIL","logo":"MIL.png",
         * "home":"布拉德利中心","homepage_link":"http://www.nba.com/bucks/",
         * "intro":"密尔沃基雄鹿队在1968-69赛季第一次进入NBA，在职业体育界历史上，雄鹿从建队到赢得冠军奖杯的速度是最快的。","conference":"E",
         * "eng_division":"Central","cn_division":"中部赛区","stoped":0,"chief_coach":"杰森-基德","found_year":1968,
         * "players":"1343,3455,3651,3676,3699,4802,4784,4789,4914,150036,150231,150206,150400,150466",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/bucks","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/MIL.png","stadiumsInfo":[{"id":13,"name":"BMO哈里斯-布拉德利中心","eng_name":"BMO Harris
         * Bradley Center","city":"Milwaukee","state":"WI","capacity":18717}]}
         * 20 : {"id":20,"tagid":2990,"statsid":1610612750,"stats_abbr":"MIN","name":"森林狼","eng_name":"Timberwolves",
         * "full_name":"明尼苏达森林狼","eng_full_name":"Minnesota Timberwolves","city":"Minnesota","bbr":"MIN","logo":"MIN
         * .png","home":"标靶中心","homepage_link":"http://www.nba.com/timberwolves/",
         * "intro":"明尼苏达森林狼队是NBA现有30支球队之一，1990年进入NBA，森林狼队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
         * "cn_division":"西北赛区","stoped":0,"chief_coach":"汤姆-锡伯杜","found_year":1989,"players":"3459,150066,4812,4813,
         * 4956,150037,150038,3583,150478","stadiums":null,"team_link":"https://nba.hupu.com/teams/timberwolves",
         * "logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/MIN.png","stadiumsInfo":[{"id":23,"name":"标靶中心",
         * "eng_name":"Target Center","city":"Minneapolis","state":"MN","capacity":19356}]}
         * 182 : {"id":182,"tagid":3022,"statsid":1610612751,"stats_abbr":"BKN","name":"篮网","eng_name":"Nets",
         * "full_name":"布鲁克林篮网","eng_full_name":"Brooklyn Nets","city":"Brooklyn","bbr":"BKN","logo":"BKN.png",
         * "home":"巴克莱中心","homepage_link":"http://nba.hupu.com/teams/nets",
         * "intro":"布鲁克林篮网是NBA现有30支球队之一，1968-1976年曾加入过ABA联盟，1977年进入NBA至今，东部联盟大西洋赛区的球队。","conference":"E",
         * "eng_division":"Atlantic","cn_division":"大西洋赛区","stoped":0,"chief_coach":"肯尼-阿特金森","found_year":1967,
         * "players":"3471,3513,3656,3674,3682,4824,4960,4957,4955,5045,150014,150190,150223,150441,3509,150029,
         * 150552","stadiums":null,"team_link":"https://nba.hupu.com/teams/nets","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/BKN.png","stadiumsInfo":[{"id":504,"name":"巴克莱中心","eng_name":"Barclays Center",
         * "city":"Brooklyn","state":"NY","capacity":17732}]}
         * 4 : {"id":4,"tagid":2700,"statsid":1610612752,"stats_abbr":"NYK","name":"尼克斯","eng_name":"Knicks",
         * "full_name":"纽约尼克斯","eng_full_name":"New York Knicks","city":"New York","bbr":"NYK","logo":"NYK.png",
         * "home":"麦迪逊广场花园","homepage_link":"http://www.nba.com/knicks/","intro":"纽约尼克斯队是从最初的BAA联盟开始就没有搬迁过城市的两支球队之一
         * (另外一支是波士顿凯尔特人队)。尼克斯在联盟的三个不同时代有过辉煌的表现，每个时代都相差二十年左右。","conference":"E","eng_division":"Atlantic",
         * "cn_division":"大西洋赛区","stoped":0,"chief_coach":"杰夫-霍纳塞克","found_year":1946,"players":"252,1222,3052,3619,
         * 3686,150039,150041,150346,150339,150363,150364,150438,150547,150553","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/knicks","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/NYK
         * .png","stadiumsInfo":[{"id":12,"name":"麦迪逊广场花园","eng_name":"Madison Square Garden","city":"New York",
         * "state":"NY","capacity":19812}]}
         * 5 : {"id":5,"tagid":3033,"statsid":1610612753,"stats_abbr":"ORL","name":"魔术","eng_name":"Magic",
         * "full_name":"奥兰多魔术","eng_full_name":"Orlando Magic","city":"Orlando","bbr":"ORL","logo":"ORL.png",
         * "home":"安利球馆","homepage_link":"http://www.nba.com/magic/",
         * "intro":"奥兰多魔术队在1989-1990赛季之前借联盟扩军之机进入NBA，在处子赛季就成为了联盟中进攻火力最强大的队伍之一。","conference":"E",
         * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"弗兰克-沃格尔","found_year":1989,
         * "players":"1464,3021,3560,3569,3645,3657,4944,4945,4968,150042,150185,150366,150415,150435,150474",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/magic","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/ORL.png","stadiumsInfo":[{"id":11,"name":"安利中心","eng_name":"Amway Center",
         * "city":"Orlando","state":"FL","capacity":18846}]}
         * 6 : {"id":6,"tagid":2992,"statsid":1610612755,"stats_abbr":"PHI,PHL","name":"76人","eng_name":"76ers",
         * "full_name":"费城76人","eng_full_name":"Philadelphia 76ers","city":"Philadelphia","bbr":"PHI","logo":"PHI
         * .png","home":"富国银行中心","homepage_link":"http://www.nba.com/sixers/",
         * "intro":"作为联盟历史最悠久的球队之一，费城76人队史上涌现过无数各具特色的一线巨星，其中名人堂成员就有9位之多。","conference":"E","eng_division":"Atlantic",
         * "cn_division":"大西洋赛区","stoped":0,"chief_coach":"布雷特-布朗","found_year":1949,"players":"3011,4851,4958,4939,
         * 4959,150045,150017,150046,150142,150163,150178,150371,150426,150546,150479,150494,150548,150512",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/76ers","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/PHI.png","stadiumsInfo":[{"id":8,"name":"富国银行中心","eng_name":"The Center",
         * "city":"Philadelphia","state":"PA","capacity":20478}]}
         * 26 : {"id":26,"tagid":3027,"statsid":1610612756,"stats_abbr":"PHX,PHO","name":"太阳","eng_name":"Suns",
         * "full_name":"菲尼克斯太阳","eng_full_name":"Phoenix Suns","city":"Phoenix","bbr":"PHO","logo":"PHX.png",
         * "home":"托金斯迪克度假酒店球馆","homepage_link":"http://www.nba.com/suns/",
         * "intro":"菲尼克斯太阳队是NBA现有30支球队之一，1969年进入NBA，太阳队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
         * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"厄尔-沃特森","found_year":1968,"players":"326,183,1395,3466,
         * 3552,3561,4823,4934,150044,150160,150165,150177,150186,150409,150432,150545,150502","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/suns","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/PHX
         * .png","stadiumsInfo":[{"id":19,"name":"托金斯迪克度假酒店球馆","eng_name":"Talking Stick Resort Arena",
         * "city":"Phoenix","state":"AZ","capacity":18055}]}
         * 25 : {"id":25,"tagid":3008,"statsid":1610612757,"stats_abbr":"POR","name":"开拓者","eng_name":"Blazers",
         * "full_name":"波特兰开拓者","eng_full_name":"Portland Trail Blazers","city":"Portland","bbr":"POR","logo":"POR
         * .png","home":"摩达中心","homepage_link":"http://www.nba.com/blazers/",
         * "intro":"波特兰开拓者队是NBA现有30支球队之一，1971年进入NBA，开拓者队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
         * "cn_division":"西北赛区","stoped":0,"chief_coach":"特里-斯托茨","found_year":1977,"players":"3450,3456,3461,3643,
         * 3648,3652,4844,4845,4965,4941,4910,150050,150213,150461,150490","stadiums":null,"team_link":"https://nba
         * .hupu.com/teams/blazers","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/POR.png",
         * "stadiumsInfo":[{"id":4,"name":"摩达中心","eng_name":"Moda Center","city":"Portland","state":"OR",
         * "capacity":19441}]}
         * 23 : {"id":23,"tagid":3034,"statsid":1610612758,"stats_abbr":"SAC","name":"国王","eng_name":"Kings",
         * "full_name":"萨克拉门托国王","eng_full_name":"Sacramento Kings","city":"Sacramento","bbr":"SAC","logo":"SAC.png",
         * "home":"黄金一号中心","homepage_link":"http://www.nba.com/kings/",
         * "intro":"萨克拉门托国王队是NBA现有30支球队之一，1949年进入NBA，国王队是西部联盟太平洋赛区的球队。","conference":"W","eng_division":"Pacific",
         * "cn_division":"太平洋赛区","stoped":0,"chief_coach":"戴夫-乔尔格","found_year":1951,"players":"3078,3440,4990,
         * 150054,150169,150232,150226,150172,150434,150511,150468,150504","stadiums":null,"team_link":"https://nba
         * .hupu.com/teams/kings","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/SAC.png",
         * "stadiumsInfo":[{"id":10,"name":"黄金一号中心","eng_name":"Golden1 Center","city":"Sacramento","state":"CA",
         * "capacity":17500}]}
         * 21 : {"id":21,"tagid":2994,"statsid":1610612759,"stats_abbr":"SAS,SAN","name":"马刺","eng_name":"Spurs",
         * "full_name":"圣安东尼奥马刺","eng_full_name":"San Antonio Spurs","city":"San Antonio","bbr":"SAS","logo":"SAS
         * .png","home":"AT&T 中心","homepage_link":"http://www.nba.com/spurs/",
         * "intro":"圣安东尼奥马刺是NBA现有30支球队之一，成立于1967年并加入ABA，1976年从ABA合并进入NBA，马刺队是西部联盟西南分区的球队。 ","conference":"W",
         * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"格雷格-波波维奇","found_year":1976,
         * "players":"700,1209,3356,3568,3596,4917,150073,150181,150385,150480,150496","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/spurs","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/SAS
         * .png","stadiumsInfo":[{"id":17,"name":"AT&T中心","eng_name":"AT&T Center","city":"San Antonio","state":"TX",
         * "capacity":18500}]}
         * 27 : {"id":27,"tagid":2987,"statsid":1610612760,"stats_abbr":"OKC","name":"雷霆","eng_name":"Thunder",
         * "full_name":"俄克拉荷马城雷霆","eng_full_name":"Oklahoma City Thunder","city":"Oklahoma City","bbr":"OKC",
         * "logo":"OKC.png","home":"切萨皮克能源球馆","homepage_link":"http://www.nba.com/thunder/",
         * "intro":"俄克拉荷马城雷霆队是NBA现有30支球队之一，1968年进入NBA，前身是西雅图超音速队，雷霆队是西部联盟西北赛区的球队。","conference":"W",
         * "eng_division":"Northwest","cn_division":"西北赛区","stoped":0,"chief_coach":"比利-多诺万","found_year":1979,
         * "players":"3016,3556,3587,4819,4829,4830,4692,4927,4930,4961,4931,150175,150506","stadiums":null,
         * "team_link":"https://nba.hupu.com/teams/thunder","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/OKC
         * .png","stadiumsInfo":[{"id":9,"name":"切萨皮克能源球馆","eng_name":"Chesapeake Energy Arena","city":"Oklahoma
         * City","state":"OK","capacity":18203}]}
         * 22 : {"id":22,"tagid":2997,"statsid":1610612762,"stats_abbr":"UTA,UTH","name":"爵士","eng_name":"Jazz",
         * "full_name":"犹他爵士","eng_full_name":"Utah Jazz","city":"Utah","bbr":"UTA","logo":"UTA.png",
         * "home":"威英特智能家居球馆","homepage_link":"http://www.nba.com/jazz/",
         * "intro":"犹他爵士队是NBA现有30支球队之一，1975年进入NBA，爵士队是西部联盟西北赛区的球队。","conference":"W","eng_division":"Northwest",
         * "cn_division":"西北赛区","stoped":0,"chief_coach":"奎因-斯奈德","found_year":1974,"players":"188,312,3451,3565,
         * 4834,150063,4938,4940,4998,150228,150510,150491,150481,3345","stadiums":null,"team_link":"https://nba.hupu
         * .com/teams/jazz","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/UTA.png","stadiumsInfo":[{"id":14,
         * "name":"威英特智能家居球馆","eng_name":"Vivint Smart Home Arena","city":"Salt Lake City","state":"UT",
         * "capacity":19911}]}
         * 7 : {"id":7,"tagid":3036,"statsid":1610612764,"stats_abbr":"WAS","name":"奇才","eng_name":"Wizards",
         * "full_name":"华盛顿奇才","eng_full_name":"Washington Wizards","city":"Washington","bbr":"WAS","logo":"WAS.png",
         * "home":"威瑞森中心","homepage_link":"http://www.nba.com/wizards/",
         * "intro":"华盛顿奇才队成立于1961年，东部联盟东南分区的球队，曾经使用过芝加哥包装工人队、华盛顿子弹队等队名。 ","conference":"E",
         * "eng_division":"Southeast","cn_division":"东南赛区","stoped":0,"chief_coach":"斯科特-布鲁克斯","found_year":1961,
         * "players":"1446,1447,1342,3449,3566,4972,3640,150359,4838,150057,150015,150387,150389,5026",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/wizards","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/WAS.png","stadiumsInfo":[{"id":22,"name":"威瑞森中心","eng_name":"Verizon Center",
         * "city":"Washington D.C.","state":"Washington D.C.","capacity":20356}]}
         * 15 : {"id":15,"tagid":3035,"statsid":1610612761,"stats_abbr":"TOR","name":"猛龙","eng_name":"Raptors",
         * "full_name":"多伦多猛龙","eng_full_name":"Toronto Raptors","city":"Toronto","bbr":"TOR","logo":"TOR.png",
         * "home":"加拿大航空中心","homepage_link":"http://www.nba.com/raptors/",
         * "intro":"多伦多猛龙建队于1995年，他和当时的温哥华灰熊一起加入联盟，作为NBA加拿大扩军计划中的重要内容。","conference":"E","eng_division":"Atlantic",
         * "cn_division":"大西洋赛区","stoped":0,"chief_coach":"德韦恩-凯西","found_year":1995,"players":"3314,3387,3558,3582,
         * 4976,4947,150061,150062,150170,150219,150388,150508","stadiums":null,"team_link":"https://nba.hupu
         * .com/teams/raptors","logo_link":"http://gdc.hupucdn.com/gdc/nba/team/logo/TOR.png",
         * "stadiumsInfo":[{"id":26,"name":"加拿大航空中心","eng_name":"Air Canada Centre","city":"Toronto","state":"ON",
         * "capacity":19800}]}
         * 19 : {"id":19,"tagid":3029,"statsid":1610612763,"stats_abbr":"MEM","name":"灰熊","eng_name":"Grizzlies",
         * "full_name":"孟菲斯灰熊","eng_full_name":"Memphis Grizzlies","city":"Memphis","bbr":"MEM","logo":"MEN.png",
         * "home":"联邦快递球馆","homepage_link":"http://www.nba.com/grizzlies/",
         * "intro":"孟菲斯灰熊队是NBA现有30支球队之一，1996年进入NBA，在2010-11赛季季后赛中击败马刺上演黑八传奇。","conference":"W",
         * "eng_division":"Southwest","cn_division":"西南赛区","stoped":0,"chief_coach":"大卫-菲兹代尔","found_year":1995,
         * "players":"1411,1238,1384,3584,4804,4869,4884,150034,150035,150187,150173,150367,150507,150497",
         * "stadiums":null,"team_link":"https://nba.hupu.com/teams/grizzlies","logo_link":"http://gdc.hupucdn
         * .com/gdc/nba/team/logo/MEN.png","stadiumsInfo":[{"id":28,"name":"联邦快递球馆","eng_name":"FedExForum",
         * "city":"Memphis","state":"TN","capacity":18119}]}
         */

        @SerializedName("30")
        private _$30Bean _$30;
        @SerializedName("8")
        private _$8Bean _$8;
        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("14")
        private _$14Bean _$14;
        @SerializedName("9")
        private _$9Bean _$9;
        @SerializedName("10")
        private _$10Bean _$10;
        @SerializedName("16")
        private _$16Bean _$16;
        @SerializedName("17")
        private _$17Bean _$17;
        @SerializedName("11")
        private _$11Bean _$11;
        @SerializedName("28")
        private _$28Bean _$28;
        @SerializedName("18")
        private _$18Bean _$18;
        @SerializedName("12")
        private _$12Bean _$12;
        @SerializedName("29")
        private _$29Bean _$29;
        @SerializedName("24")
        private _$24Bean _$24;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("13")
        private _$13Bean _$13;
        @SerializedName("20")
        private _$20Bean _$20;
        @SerializedName("182")
        private _$182Bean _$182;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("26")
        private _$26Bean _$26;
        @SerializedName("25")
        private _$25Bean _$25;
        @SerializedName("23")
        private _$23Bean _$23;
        @SerializedName("21")
        private _$21Bean _$21;
        @SerializedName("27")
        private _$27Bean _$27;
        @SerializedName("22")
        private _$22Bean _$22;
        @SerializedName("7")
        private _$7Bean _$7;
        @SerializedName("15")
        private _$15Bean _$15;
        @SerializedName("19")
        private _$19Bean _$19;

        public _$30Bean get_$30() {
            return _$30;
        }

        public void set_$30(_$30Bean _$30) {
            this._$30 = _$30;
        }

        public _$8Bean get_$8() {
            return _$8;
        }

        public void set_$8(_$8Bean _$8) {
            this._$8 = _$8;
        }

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public _$14Bean get_$14() {
            return _$14;
        }

        public void set_$14(_$14Bean _$14) {
            this._$14 = _$14;
        }

        public _$9Bean get_$9() {
            return _$9;
        }

        public void set_$9(_$9Bean _$9) {
            this._$9 = _$9;
        }

        public _$10Bean get_$10() {
            return _$10;
        }

        public void set_$10(_$10Bean _$10) {
            this._$10 = _$10;
        }

        public _$16Bean get_$16() {
            return _$16;
        }

        public void set_$16(_$16Bean _$16) {
            this._$16 = _$16;
        }

        public _$17Bean get_$17() {
            return _$17;
        }

        public void set_$17(_$17Bean _$17) {
            this._$17 = _$17;
        }

        public _$11Bean get_$11() {
            return _$11;
        }

        public void set_$11(_$11Bean _$11) {
            this._$11 = _$11;
        }

        public _$28Bean get_$28() {
            return _$28;
        }

        public void set_$28(_$28Bean _$28) {
            this._$28 = _$28;
        }

        public _$18Bean get_$18() {
            return _$18;
        }

        public void set_$18(_$18Bean _$18) {
            this._$18 = _$18;
        }

        public _$12Bean get_$12() {
            return _$12;
        }

        public void set_$12(_$12Bean _$12) {
            this._$12 = _$12;
        }

        public _$29Bean get_$29() {
            return _$29;
        }

        public void set_$29(_$29Bean _$29) {
            this._$29 = _$29;
        }

        public _$24Bean get_$24() {
            return _$24;
        }

        public void set_$24(_$24Bean _$24) {
            this._$24 = _$24;
        }

        public _$2Bean get_$2() {
            return _$2;
        }

        public void set_$2(_$2Bean _$2) {
            this._$2 = _$2;
        }

        public _$13Bean get_$13() {
            return _$13;
        }

        public void set_$13(_$13Bean _$13) {
            this._$13 = _$13;
        }

        public _$20Bean get_$20() {
            return _$20;
        }

        public void set_$20(_$20Bean _$20) {
            this._$20 = _$20;
        }

        public _$182Bean get_$182() {
            return _$182;
        }

        public void set_$182(_$182Bean _$182) {
            this._$182 = _$182;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public _$6Bean get_$6() {
            return _$6;
        }

        public void set_$6(_$6Bean _$6) {
            this._$6 = _$6;
        }

        public _$26Bean get_$26() {
            return _$26;
        }

        public void set_$26(_$26Bean _$26) {
            this._$26 = _$26;
        }

        public _$25Bean get_$25() {
            return _$25;
        }

        public void set_$25(_$25Bean _$25) {
            this._$25 = _$25;
        }

        public _$23Bean get_$23() {
            return _$23;
        }

        public void set_$23(_$23Bean _$23) {
            this._$23 = _$23;
        }

        public _$21Bean get_$21() {
            return _$21;
        }

        public void set_$21(_$21Bean _$21) {
            this._$21 = _$21;
        }

        public _$27Bean get_$27() {
            return _$27;
        }

        public void set_$27(_$27Bean _$27) {
            this._$27 = _$27;
        }

        public _$22Bean get_$22() {
            return _$22;
        }

        public void set_$22(_$22Bean _$22) {
            this._$22 = _$22;
        }

        public _$7Bean get_$7() {
            return _$7;
        }

        public void set_$7(_$7Bean _$7) {
            this._$7 = _$7;
        }

        public _$15Bean get_$15() {
            return _$15;
        }

        public void set_$15(_$15Bean _$15) {
            this._$15 = _$15;
        }

        public _$19Bean get_$19() {
            return _$19;
        }

        public void set_$19(_$19Bean _$19) {
            this._$19 = _$19;
        }

        public static class _$30Bean {
            /**
             * id : 30
             * tagid : 3019
             * statsid : 1610612766
             * stats_abbr : CHA
             * name : 黄蜂
             * eng_name : Hornets
             * full_name : 夏洛特黄蜂
             * eng_full_name : Charlotte Hornets
             * city : Charlotte
             * bbr : CHA2
             * logo : CHA2.png
             * home : 时代华纳有线球馆
             * homepage_link : http://www.nba.com/bobcats/
             * intro : 夏洛特黄蜂队是NBA现有30支球队之一，2004年NBA扩军时组建，原名山猫队，于2014夏更名为黄蜂，属于东部联盟东南赛区。
             * conference : E
             * eng_division : Southeast
             * cn_division : 东南赛区
             * stoped : 0
             * chief_coach : 史蒂夫-克利福德
             * found_year : 1988
             * players : 1054,3025,3562,3639,3649,4842,4916,150010,150085,150154,683,150437,150477
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/hornets
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/CHA2.png
             * stadiumsInfo : [{"id":2,"name":"时代华纳有线球馆","eng_name":"Time Warner Cable Arena","city":"Charlotte",
             * "state":"NC","capacity":19077}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBean> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBean> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBean> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBean {
                /**
                 * id : 2
                 * name : 时代华纳有线球馆
                 * eng_name : Time Warner Cable Arena
                 * city : Charlotte
                 * state : NC
                 * capacity : 19077
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$8Bean {
            /**
             * id : 8
             * tagid : 2985
             * statsid : 1610612737
             * stats_abbr : ATL
             * name : 老鹰
             * eng_name : Hawks
             * full_name : 亚特兰大老鹰
             * eng_full_name : Atlanta Hawks
             * city : Atlanta
             * bbr : ATL
             * logo : ATL.png
             * home : 菲利普斯球馆
             * homepage_link : http://www.nba.com/hawks/
             * intro : 亚特兰大老鹰是NBA现有30支球队之一，1949年NBA成立时从NBL合并而来，拥有10位名人堂球员。
             * conference : E
             * eng_division : Southeast
             * cn_division : 东南赛区
             * stoped : 0
             * chief_coach : 迈克-布登霍尔泽
             * found_year : 1949
             * players : 4863,4776,4814,150188,150203,150353,1347,3663,150626,150484,150500
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/hawks
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/ATL.png
             * stadiumsInfo : [{"id":18,"name":"飞利浦球馆","eng_name":"Philips Arena","city":"Atlanta","state":"GA",
             * "capacity":18047}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanX {
                /**
                 * id : 18
                 * name : 飞利浦球馆
                 * eng_name : Philips Arena
                 * city : Atlanta
                 * state : GA
                 * capacity : 18047
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$1Bean {
            /**
             * id : 1
             * tagid : 3020
             * statsid : 1610612738
             * stats_abbr : BOS
             * name : 凯尔特人
             * eng_name : Celtics
             * full_name : 波士顿凯尔特人
             * eng_full_name : Boston Celtics
             * city : Boston
             * bbr : BOS
             * logo : e59350a5bc97aa5c.png
             * home : TD 花园
             * homepage_link : http://www.nba.com/celtics/
             * intro : 波士顿凯尔特人队是NBA现有30支球队之一，NBA的前身、BAA创始球队之一，1947年进入NBA，凯尔特人和尼克斯是仅有的两支参加了1946年首届BAA联赛且至今没有迁移过城市的NBA球队。
             * conference : E
             * eng_division : Atlantic
             * cn_division : 大西洋赛区
             * stoped : 0
             * chief_coach : 布拉德-史蒂文斯
             * found_year : 1946
             * players : 1239,3467,3613,3671,4779,4925,150005,150007,150166,150180,150433,150469,150550,150551,150194
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/celtics
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/e59350a5bc97aa5c.png
             * stadiumsInfo : [{"id":15,"name":"TD花园","eng_name":"TD Garden","city":"Boston","state":"MA",
             * "capacity":18624}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXX {
                /**
                 * id : 15
                 * name : TD花园
                 * eng_name : TD Garden
                 * city : Boston
                 * state : MA
                 * capacity : 18624
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$14Bean {
            /**
             * id : 14
             * tagid : 3021
             * statsid : 1610612740
             * stats_abbr : NOP
             * name : 鹈鹕
             * eng_name : Pelicans
             * full_name : 新奥尔良鹈鹕
             * eng_full_name : New Orleans Pelicans
             * city : New Pelicans
             * bbr : NOP
             * logo : NOH.png
             * home : 冰沙王中心
             * homepage_link : http://www.nba.com/pelicans/
             * intro : 新奥尔良鹈鹕队是NBA现有30支球队之一，1989年进入NBA，鹈鹕队前身为黄蜂队，从2013-14赛季开始正式更名。
             * conference : W
             * eng_division : Southwest
             * cn_division : 西南赛区
             * stoped : 0
             * chief_coach : 阿尔文-金特里
             * found_year : 1987
             * players : 3060,3068,3453,3474,3475,3608,3638,4800,150123,150149,150191,150473
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/pelicans
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/NOH.png
             * stadiumsInfo : [{"id":16,"name":"冰沙王中心","eng_name":"Smoothie King Center","city":"New Orleans",
             * "state":"LA","capacity":16867}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXX {
                /**
                 * id : 16
                 * name : 冰沙王中心
                 * eng_name : Smoothie King Center
                 * city : New Orleans
                 * state : LA
                 * capacity : 16867
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$9Bean {
            /**
             * id : 9
             * tagid : 2978
             * statsid : 1610612741
             * stats_abbr : CHI
             * name : 公牛
             * eng_name : Bulls
             * full_name : 芝加哥公牛
             * eng_full_name : Chicago Bulls
             * city : Chicago
             * bbr : CHI
             * logo : CHI.png
             * home : 联合中心
             * homepage_link : http://www.nba.com/bulls/
             * intro : 芝加哥公牛队于1966-67赛季加入NBA联盟，历史上有两个成功时段，分别是90年代乔丹率领下的公牛王朝和球队建队之初的连续季后赛之旅。
             * conference : E
             * eng_division : Central
             * cn_division : 中部赛区
             * stoped : 0
             * chief_coach : 弗雷德-霍伊博格
             * found_year : 1966
             * players : 50,3036,4970,4801,150052,150040,150009,150065,150174,150210,4911,150168,150439
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/bulls
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/CHI.png
             * stadiumsInfo : [{"id":6,"name":"联合中心","eng_name":"United Center","city":"Chicago","state":"IL",
             * "capacity":20917}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXX {
                /**
                 * id : 6
                 * name : 联合中心
                 * eng_name : United Center
                 * city : Chicago
                 * state : IL
                 * capacity : 20917
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$10Bean {
            /**
             * id : 10
             * tagid : 3023
             * statsid : 1610612739
             * stats_abbr : CLE
             * name : 骑士
             * eng_name : Cavaliers
             * full_name : 克利夫兰骑士
             * eng_full_name : Cleveland Cavaliers
             * city : Cleveland
             * bbr : CLE
             * logo : CLE.png
             * home : 速贷体育馆
             * homepage_link : http://www.nba.com/cavaliers/
             * intro : 克利夫兰骑士队是NBA现有30支球队之一，1970年进入NBA，骑士队是东部联盟中部赛区的球队。
             * conference : E
             * eng_division : Central
             * cn_division : 中部赛区
             * stoped : 0
             * chief_coach : 泰伦-卢
             * found_year : 1970
             * players : 67,650,488,1029,3004,3554,3557,3570,4922,150224
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/cavaliers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/CLE.png
             * stadiumsInfo : [{"id":5,"name":"速贷中心","eng_name":"Quicken Loans Arena","city":"Cleveland",
             * "state":"OH","capacity":20562}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXX {
                /**
                 * id : 5
                 * name : 速贷中心
                 * eng_name : Quicken Loans Arena
                 * city : Cleveland
                 * state : OH
                 * capacity : 20562
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$16Bean {
            /**
             * id : 16
             * tagid : 3024
             * statsid : 1610612742
             * stats_abbr : DAL
             * name : 小牛
             * eng_name : Mavericks
             * full_name : 达拉斯小牛
             * eng_full_name : Dallas Mavericks
             * city : Dallas
             * bbr : DAL
             * logo : DAL.png
             * home : 美国航空中心
             * homepage_link : http://www.nba.com/mavericks/
             * intro : 达斯小牛队在1980-81赛季加盟了NBA。球队不断取得进步，终于在2011年拿到了梦寐以求的总冠军。
             * conference : W
             * eng_division : Southwest
             * cn_division : 西南赛区
             * stoped : 0
             * chief_coach : 里克-卡莱尔
             * found_year : 1980
             * players : 940,480,1318,3408,3644,4818,4798,4967,150082,150204,150222,150356,150380,150436
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/mavericks
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/DAL.png
             * stadiumsInfo : [{"id":1,"name":"美国航空中心","eng_name":"American Airlines Center","city":"Dallas",
             * "state":"TX","capacity":21146}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXX {
                /**
                 * id : 1
                 * name : 美国航空中心
                 * eng_name : American Airlines Center
                 * city : Dallas
                 * state : TX
                 * capacity : 21146
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$17Bean {
            /**
             * id : 17
             * tagid : 3025
             * statsid : 1610612743
             * stats_abbr : DEN
             * name : 掘金
             * eng_name : Nuggets
             * full_name : 丹佛掘金
             * eng_full_name : Denver Nuggets
             * city : Denver
             * bbr : DEN
             * logo : DEN.png
             * home : 百事中心
             * homepage_link : http://www.nba.com/nuggets/
             * intro : 丹佛掘金队是NBA现有30支球队之一，1977年进入NBA，掘金队是西部联盟西北赛区的球队。
             * conference : W
             * eng_division : Northwest
             * cn_division : 西北赛区
             * stoped : 0
             * chief_coach : 迈克尔-马龙
             * found_year : 1967
             * players : 16,686,1424,3024,3575,3677,4810,4942,4943,150019,150167,150192,150189,150059,150493,150549,
             * 150214
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/nuggets
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/DEN.png
             * stadiumsInfo : [{"id":7,"name":"百事中心","eng_name":"Pepsi Center","city":"Denver","state":"CO",
             * "capacity":19155}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXX {
                /**
                 * id : 7
                 * name : 百事中心
                 * eng_name : Pepsi Center
                 * city : Denver
                 * state : CO
                 * capacity : 19155
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$11Bean {
            /**
             * id : 11
             * tagid : 821
             * statsid : 1610612765
             * stats_abbr : DET
             * name : 活塞
             * eng_name : Pistons
             * full_name : 底特律活塞
             * eng_full_name : Detroit Pistons
             * city : Detroit
             * bbr : DET
             * logo : DET.png
             * home : 奥本山宫殿球馆
             * homepage_link : http://www.nba.com/pistons/
             * intro : 作为NBA资历最老的球队之一，底特律活塞队在经历了长达41年的漫长奋斗之后才登上NBA总冠军的宝座。
             * conference : E
             * eng_division : Central
             * cn_division : 中部赛区
             * stoped : 0
             * chief_coach : 斯坦-范甘迪
             * found_year : 1948
             * players : 3516,3567,3572,3577,3592,3646,4790,4806,150021,150071,150171,150215,150505
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/pistons
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/DET.png
             * stadiumsInfo : [{"id":27,"name":"奥本山宫殿","eng_name":"The Palace of Auburn Hills","city":"Detroit",
             * "state":"MI","capacity":21231}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXX {
                /**
                 * id : 27
                 * name : 奥本山宫殿
                 * eng_name : The Palace of Auburn Hills
                 * city : Detroit
                 * state : MI
                 * capacity : 21231
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$28Bean {
            /**
             * id : 28
             * tagid : 2982
             * statsid : 1610612744
             * stats_abbr : GSW,GOS
             * name : 勇士
             * eng_name : Warriors
             * full_name : 金州勇士
             * eng_full_name : Golden State Warriors
             * city : Golden State
             * bbr : GSW
             * logo : GSW.png
             * home : 甲骨文球馆
             * homepage_link : http://www.nba.com/warriors/
             * intro : 金州勇士队是NBA现有30支球队之一，1947年进入NBA，勇士队是西部联盟太平洋赛区的球队。
             * conference : W
             * eng_division : Pacific
             * cn_division : 太平洋赛区
             * stoped : 0
             * chief_coach : 史蒂夫-科尔
             * found_year : 1946
             * players : 3564,3672,4987,150023,150183,150225,150492
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/warriors
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/GSW.png
             * stadiumsInfo : [{"id":20,"name":"甲骨文球馆","eng_name":"ORACLE Arena","city":"Oakland","state":"CA",
             * "capacity":19596}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXX {
                /**
                 * id : 20
                 * name : 甲骨文球馆
                 * eng_name : ORACLE Arena
                 * city : Oakland
                 * state : CA
                 * capacity : 19596
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$18Bean {
            /**
             * id : 18
             * tagid : 811
             * statsid : 1610612745
             * stats_abbr : HOU
             * name : 火箭
             * eng_name : Rockets
             * full_name : 休斯顿火箭
             * eng_full_name : Houston Rockets
             * city : Houston
             * bbr : HOU
             * logo : HOU.png
             * home : 丰田中心
             * homepage_link : http://www.nba.com/rockets/
             * intro : 休斯顿火箭队是一支有着高大中锋传统的球队，从早期的摩西-马龙、拉尔夫-桑普森到哈基姆-奥拉朱旺，以及2002年来自中国的状元秀姚明。
             * conference : W
             * eng_division : Southwest
             * cn_division : 西南赛区
             * stoped : 0
             * chief_coach : 迈克-德安东尼
             * found_year : 1967
             * players : 558,3015,3046,150399,3306,4908,150227,150368,150401,150470,1037,4807,150233,150405,150365
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/rockets
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/HOU.png
             * stadiumsInfo : [{"id":29,"name":"丰田中心","eng_name":"Toyota Center","city":"Houston","state":"TX",
             * "capacity":18055}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXX {
                /**
                 * id : 29
                 * name : 丰田中心
                 * eng_name : Toyota Center
                 * city : Houston
                 * state : TX
                 * capacity : 18055
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$12Bean {
            /**
             * id : 12
             * tagid : 3026
             * statsid : 1610612754
             * stats_abbr : IND
             * name : 步行者
             * eng_name : Pacers
             * full_name : 印第安纳步行者
             * eng_full_name : Indiana Pacers
             * city : Indiana
             * bbr : IND
             * logo : IND.png
             * home : 银行家人寿球馆
             * homepage_link : http://www.nba.com/pacers/
             * intro : 印第安纳步行者队于1967年组建于印第安纳波利斯，加盟当时的ABA。ABA时期的步行者堪称辉煌，曾经在1969-1973年间四年三夺总冠军。
             * conference : E
             * eng_division : Central
             * cn_division : 中部赛区
             * stoped : 0
             * chief_coach : 内特-麦克米兰
             * found_year : 1976
             * players : 827,1111,1237,3458,3465,3488,4912,150026,150012,150027,150220,150499,150503,150467
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/pacers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/IND.png
             * stadiumsInfo : [{"id":21,"name":"银行家人寿球馆","eng_name":"Bankers Life Fieldhouse","city":"Indianapolis",
             * "state":"IN","capacity":18165}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXX {
                /**
                 * id : 21
                 * name : 银行家人寿球馆
                 * eng_name : Bankers Life Fieldhouse
                 * city : Indianapolis
                 * state : IN
                 * capacity : 18165
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$29Bean {
            /**
             * id : 29
             * tagid : 2984
             * statsid : 1610612746
             * stats_abbr : LAC
             * name : 快船
             * eng_name : Clippers
             * full_name : 洛杉矶快船
             * eng_full_name : Los Angeles Clippers
             * city : Los Angeles
             * bbr : LAC
             * logo : LAC.png
             * home : 斯台普斯中心
             * homepage_link : http://www.nba.com/clippers/
             * intro : 洛杉矶快船队是NBA现有30支球队之一，属于西部联盟太平洋赛区，1971年进入NBA。
             * conference : W
             * eng_division : Pacific
             * cn_division : 太平洋赛区
             * stoped : 0
             * chief_coach : 道格-里弗斯
             * found_year : 1970
             * players : 572,3014,3452,3647,150182,150179,150482,3393,1128,3606,150024,150025,150402
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/clippers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/LAC.png
             * stadiumsInfo : [{"id":503,"name":"斯台普斯中心","eng_name":"Staples Center","city":"Los Angeles",
             * "state":"CA","capacity":19060}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXX {
                /**
                 * id : 503
                 * name : 斯台普斯中心
                 * eng_name : Staples Center
                 * city : Los Angeles
                 * state : CA
                 * capacity : 19060
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$24Bean {
            /**
             * id : 24
             * tagid : 846
             * statsid : 1610612747
             * stats_abbr : LAL
             * name : 湖人
             * eng_name : Lakers
             * full_name : 洛杉矶湖人
             * eng_full_name : Los Angeles Lakers
             * city : Los Angeles
             * bbr : LAL
             * logo : b718254a88cc2e70.png
             * home : 斯台普斯中心
             * homepage_link : http://www.nba.com/lakers/
             * intro : 洛杉矶湖人队是NBA现有30支球队之一，1949年进入NBA，湖人队是西部联盟太平洋赛区的球队。
             * conference : W
             * eng_division : Pacific
             * cn_division : 太平洋赛区
             * stoped : 0
             * chief_coach : 卢克-沃顿
             * found_year : 1947
             * players : 545,1355,4932,4933,150030,150164,150201,150427,150429,3013,150471,150488,150489
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/lakers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/b718254a88cc2e70.png
             * stadiumsInfo : [{"id":3,"name":"斯台普斯中心","eng_name":"STAPLES Center","city":"Los Angeles","state":"CA",
             * "capacity":18997}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXX {
                /**
                 * id : 3
                 * name : 斯台普斯中心
                 * eng_name : STAPLES Center
                 * city : Los Angeles
                 * state : CA
                 * capacity : 18997
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$2Bean {
            /**
             * id : 2
             * tagid : 2698
             * statsid : 1610612748
             * stats_abbr : MIA
             * name : 热火
             * eng_name : Heat
             * full_name : 迈阿密热火
             * eng_full_name : Miami Heat
             * city : Miami
             * bbr : MIA
             * logo : MIA.png
             * home : 美国航空球馆
             * homepage_link : http://www.nba.com/heat/
             * intro : 迈阿密热火队是NBA现有30支球队之一，1988-89赛季同奥兰多魔术队、明尼苏达森林狼队和夏洛特黄蜂队一起加入NBA的。
             * conference : E
             * eng_division : Southeast
             * cn_division : 东南赛区
             * stoped : 0
             * chief_coach : 埃里克-斯波尔斯特拉
             * found_year : 1988
             * players : 419,1214,3074,3331,5010,4878,4978,150032,150033,150352,150509
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/heat
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/MIA.png
             * stadiumsInfo : [{"id":25,"name":"美国航空球馆","eng_name":"AmericanAirlines Arena","city":"Miami",
             * "state":"FL","capacity":19600}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXX {
                /**
                 * id : 25
                 * name : 美国航空球馆
                 * eng_name : AmericanAirlines Arena
                 * city : Miami
                 * state : FL
                 * capacity : 19600
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$13Bean {
            /**
             * id : 13
             * tagid : 3030
             * statsid : 1610612749
             * stats_abbr : MIL
             * name : 雄鹿
             * eng_name : Bucks
             * full_name : 密尔沃基雄鹿
             * eng_full_name : Milwaukee Bucks
             * city : Milwaukee
             * bbr : MIL
             * logo : MIL.png
             * home : 布拉德利中心
             * homepage_link : http://www.nba.com/bucks/
             * intro : 密尔沃基雄鹿队在1968-69赛季第一次进入NBA，在职业体育界历史上，雄鹿从建队到赢得冠军奖杯的速度是最快的。
             * conference : E
             * eng_division : Central
             * cn_division : 中部赛区
             * stoped : 0
             * chief_coach : 杰森-基德
             * found_year : 1968
             * players : 1343,3455,3651,3676,3699,4802,4784,4789,4914,150036,150231,150206,150400,150466
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/bucks
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/MIL.png
             * stadiumsInfo : [{"id":13,"name":"BMO哈里斯-布拉德利中心","eng_name":"BMO Harris Bradley Center",
             * "city":"Milwaukee","state":"WI","capacity":18717}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXX {
                /**
                 * id : 13
                 * name : BMO哈里斯-布拉德利中心
                 * eng_name : BMO Harris Bradley Center
                 * city : Milwaukee
                 * state : WI
                 * capacity : 18717
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$20Bean {
            /**
             * id : 20
             * tagid : 2990
             * statsid : 1610612750
             * stats_abbr : MIN
             * name : 森林狼
             * eng_name : Timberwolves
             * full_name : 明尼苏达森林狼
             * eng_full_name : Minnesota Timberwolves
             * city : Minnesota
             * bbr : MIN
             * logo : MIN.png
             * home : 标靶中心
             * homepage_link : http://www.nba.com/timberwolves/
             * intro : 明尼苏达森林狼队是NBA现有30支球队之一，1990年进入NBA，森林狼队是西部联盟西北赛区的球队。
             * conference : W
             * eng_division : Northwest
             * cn_division : 西北赛区
             * stoped : 0
             * chief_coach : 汤姆-锡伯杜
             * found_year : 1989
             * players : 3459,150066,4812,4813,4956,150037,150038,3583,150478
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/timberwolves
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/MIN.png
             * stadiumsInfo : [{"id":23,"name":"标靶中心","eng_name":"Target Center","city":"Minneapolis","state":"MN",
             * "capacity":19356}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXX {
                /**
                 * id : 23
                 * name : 标靶中心
                 * eng_name : Target Center
                 * city : Minneapolis
                 * state : MN
                 * capacity : 19356
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$182Bean {
            /**
             * id : 182
             * tagid : 3022
             * statsid : 1610612751
             * stats_abbr : BKN
             * name : 篮网
             * eng_name : Nets
             * full_name : 布鲁克林篮网
             * eng_full_name : Brooklyn Nets
             * city : Brooklyn
             * bbr : BKN
             * logo : BKN.png
             * home : 巴克莱中心
             * homepage_link : http://nba.hupu.com/teams/nets
             * intro : 布鲁克林篮网是NBA现有30支球队之一，1968-1976年曾加入过ABA联盟，1977年进入NBA至今，东部联盟大西洋赛区的球队。
             * conference : E
             * eng_division : Atlantic
             * cn_division : 大西洋赛区
             * stoped : 0
             * chief_coach : 肯尼-阿特金森
             * found_year : 1967
             * players : 3471,3513,3656,3674,3682,4824,4960,4957,4955,5045,150014,150190,150223,150441,3509,150029,
             * 150552
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/nets
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/BKN.png
             * stadiumsInfo : [{"id":504,"name":"巴克莱中心","eng_name":"Barclays Center","city":"Brooklyn","state":"NY",
             * "capacity":17732}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXX {
                /**
                 * id : 504
                 * name : 巴克莱中心
                 * eng_name : Barclays Center
                 * city : Brooklyn
                 * state : NY
                 * capacity : 17732
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$4Bean {
            /**
             * id : 4
             * tagid : 2700
             * statsid : 1610612752
             * stats_abbr : NYK
             * name : 尼克斯
             * eng_name : Knicks
             * full_name : 纽约尼克斯
             * eng_full_name : New York Knicks
             * city : New York
             * bbr : NYK
             * logo : NYK.png
             * home : 麦迪逊广场花园
             * homepage_link : http://www.nba.com/knicks/
             * intro : 纽约尼克斯队是从最初的BAA联盟开始就没有搬迁过城市的两支球队之一(另外一支是波士顿凯尔特人队)。尼克斯在联盟的三个不同时代有过辉煌的表现，每个时代都相差二十年左右。
             * conference : E
             * eng_division : Atlantic
             * cn_division : 大西洋赛区
             * stoped : 0
             * chief_coach : 杰夫-霍纳塞克
             * found_year : 1946
             * players : 252,1222,3052,3619,3686,150039,150041,150346,150339,150363,150364,150438,150547,150553
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/knicks
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/NYK.png
             * stadiumsInfo : [{"id":12,"name":"麦迪逊广场花园","eng_name":"Madison Square Garden","city":"New York",
             * "state":"NY","capacity":19812}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 12
                 * name : 麦迪逊广场花园
                 * eng_name : Madison Square Garden
                 * city : New York
                 * state : NY
                 * capacity : 19812
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$5Bean {
            /**
             * id : 5
             * tagid : 3033
             * statsid : 1610612753
             * stats_abbr : ORL
             * name : 魔术
             * eng_name : Magic
             * full_name : 奥兰多魔术
             * eng_full_name : Orlando Magic
             * city : Orlando
             * bbr : ORL
             * logo : ORL.png
             * home : 安利球馆
             * homepage_link : http://www.nba.com/magic/
             * intro : 奥兰多魔术队在1989-1990赛季之前借联盟扩军之机进入NBA，在处子赛季就成为了联盟中进攻火力最强大的队伍之一。
             * conference : E
             * eng_division : Southeast
             * cn_division : 东南赛区
             * stoped : 0
             * chief_coach : 弗兰克-沃格尔
             * found_year : 1989
             * players : 1464,3021,3560,3569,3645,3657,4944,4945,4968,150042,150185,150366,150415,150435,150474
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/magic
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/ORL.png
             * stadiumsInfo : [{"id":11,"name":"安利中心","eng_name":"Amway Center","city":"Orlando","state":"FL","capacity":18846}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 11
                 * name : 安利中心
                 * eng_name : Amway Center
                 * city : Orlando
                 * state : FL
                 * capacity : 18846
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$6Bean {
            /**
             * id : 6
             * tagid : 2992
             * statsid : 1610612755
             * stats_abbr : PHI,PHL
             * name : 76人
             * eng_name : 76ers
             * full_name : 费城76人
             * eng_full_name : Philadelphia 76ers
             * city : Philadelphia
             * bbr : PHI
             * logo : PHI.png
             * home : 富国银行中心
             * homepage_link : http://www.nba.com/sixers/
             * intro : 作为联盟历史最悠久的球队之一，费城76人队史上涌现过无数各具特色的一线巨星，其中名人堂成员就有9位之多。
             * conference : E
             * eng_division : Atlantic
             * cn_division : 大西洋赛区
             * stoped : 0
             * chief_coach : 布雷特-布朗
             * found_year : 1949
             * players : 3011,4851,4958,4939,4959,150045,150017,150046,150142,150163,150178,150371,150426,150546,150479,150494,150548,150512
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/76ers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/PHI.png
             * stadiumsInfo : [{"id":8,"name":"富国银行中心","eng_name":"The Center","city":"Philadelphia","state":"PA","capacity":20478}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 8
                 * name : 富国银行中心
                 * eng_name : The Center
                 * city : Philadelphia
                 * state : PA
                 * capacity : 20478
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$26Bean {
            /**
             * id : 26
             * tagid : 3027
             * statsid : 1610612756
             * stats_abbr : PHX,PHO
             * name : 太阳
             * eng_name : Suns
             * full_name : 菲尼克斯太阳
             * eng_full_name : Phoenix Suns
             * city : Phoenix
             * bbr : PHO
             * logo : PHX.png
             * home : 托金斯迪克度假酒店球馆
             * homepage_link : http://www.nba.com/suns/
             * intro : 菲尼克斯太阳队是NBA现有30支球队之一，1969年进入NBA，太阳队是西部联盟太平洋赛区的球队。
             * conference : W
             * eng_division : Pacific
             * cn_division : 太平洋赛区
             * stoped : 0
             * chief_coach : 厄尔-沃特森
             * found_year : 1968
             * players : 326,183,1395,3466,3552,3561,4823,4934,150044,150160,150165,150177,150186,150409,150432,150545,150502
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/suns
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/PHX.png
             * stadiumsInfo : [{"id":19,"name":"托金斯迪克度假酒店球馆","eng_name":"Talking Stick Resort Arena","city":"Phoenix","state":"AZ","capacity":18055}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 19
                 * name : 托金斯迪克度假酒店球馆
                 * eng_name : Talking Stick Resort Arena
                 * city : Phoenix
                 * state : AZ
                 * capacity : 18055
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$25Bean {
            /**
             * id : 25
             * tagid : 3008
             * statsid : 1610612757
             * stats_abbr : POR
             * name : 开拓者
             * eng_name : Blazers
             * full_name : 波特兰开拓者
             * eng_full_name : Portland Trail Blazers
             * city : Portland
             * bbr : POR
             * logo : POR.png
             * home : 摩达中心
             * homepage_link : http://www.nba.com/blazers/
             * intro : 波特兰开拓者队是NBA现有30支球队之一，1971年进入NBA，开拓者队是西部联盟西北赛区的球队。
             * conference : W
             * eng_division : Northwest
             * cn_division : 西北赛区
             * stoped : 0
             * chief_coach : 特里-斯托茨
             * found_year : 1977
             * players : 3450,3456,3461,3643,3648,3652,4844,4845,4965,4941,4910,150050,150213,150461,150490
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/blazers
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/POR.png
             * stadiumsInfo : [{"id":4,"name":"摩达中心","eng_name":"Moda Center","city":"Portland","state":"OR","capacity":19441}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 4
                 * name : 摩达中心
                 * eng_name : Moda Center
                 * city : Portland
                 * state : OR
                 * capacity : 19441
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$23Bean {
            /**
             * id : 23
             * tagid : 3034
             * statsid : 1610612758
             * stats_abbr : SAC
             * name : 国王
             * eng_name : Kings
             * full_name : 萨克拉门托国王
             * eng_full_name : Sacramento Kings
             * city : Sacramento
             * bbr : SAC
             * logo : SAC.png
             * home : 黄金一号中心
             * homepage_link : http://www.nba.com/kings/
             * intro : 萨克拉门托国王队是NBA现有30支球队之一，1949年进入NBA，国王队是西部联盟太平洋赛区的球队。
             * conference : W
             * eng_division : Pacific
             * cn_division : 太平洋赛区
             * stoped : 0
             * chief_coach : 戴夫-乔尔格
             * found_year : 1951
             * players : 3078,3440,4990,150054,150169,150232,150226,150172,150434,150511,150468,150504
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/kings
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/SAC.png
             * stadiumsInfo : [{"id":10,"name":"黄金一号中心","eng_name":"Golden1 Center","city":"Sacramento","state":"CA","capacity":17500}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 10
                 * name : 黄金一号中心
                 * eng_name : Golden1 Center
                 * city : Sacramento
                 * state : CA
                 * capacity : 17500
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$21Bean {
            /**
             * id : 21
             * tagid : 2994
             * statsid : 1610612759
             * stats_abbr : SAS,SAN
             * name : 马刺
             * eng_name : Spurs
             * full_name : 圣安东尼奥马刺
             * eng_full_name : San Antonio Spurs
             * city : San Antonio
             * bbr : SAS
             * logo : SAS.png
             * home : AT&T 中心
             * homepage_link : http://www.nba.com/spurs/
             * intro : 圣安东尼奥马刺是NBA现有30支球队之一，成立于1967年并加入ABA，1976年从ABA合并进入NBA，马刺队是西部联盟西南分区的球队。
             * conference : W
             * eng_division : Southwest
             * cn_division : 西南赛区
             * stoped : 0
             * chief_coach : 格雷格-波波维奇
             * found_year : 1976
             * players : 700,1209,3356,3568,3596,4917,150073,150181,150385,150480,150496
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/spurs
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/SAS.png
             * stadiumsInfo : [{"id":17,"name":"AT&T中心","eng_name":"AT&T Center","city":"San Antonio","state":"TX","capacity":18500}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 17
                 * name : AT&T中心
                 * eng_name : AT&T Center
                 * city : San Antonio
                 * state : TX
                 * capacity : 18500
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$27Bean {
            /**
             * id : 27
             * tagid : 2987
             * statsid : 1610612760
             * stats_abbr : OKC
             * name : 雷霆
             * eng_name : Thunder
             * full_name : 俄克拉荷马城雷霆
             * eng_full_name : Oklahoma City Thunder
             * city : Oklahoma City
             * bbr : OKC
             * logo : OKC.png
             * home : 切萨皮克能源球馆
             * homepage_link : http://www.nba.com/thunder/
             * intro : 俄克拉荷马城雷霆队是NBA现有30支球队之一，1968年进入NBA，前身是西雅图超音速队，雷霆队是西部联盟西北赛区的球队。
             * conference : W
             * eng_division : Northwest
             * cn_division : 西北赛区
             * stoped : 0
             * chief_coach : 比利-多诺万
             * found_year : 1979
             * players : 3016,3556,3587,4819,4829,4830,4692,4927,4930,4961,4931,150175,150506
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/thunder
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/OKC.png
             * stadiumsInfo : [{"id":9,"name":"切萨皮克能源球馆","eng_name":"Chesapeake Energy Arena","city":"Oklahoma City","state":"OK","capacity":18203}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 9
                 * name : 切萨皮克能源球馆
                 * eng_name : Chesapeake Energy Arena
                 * city : Oklahoma City
                 * state : OK
                 * capacity : 18203
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$22Bean {
            /**
             * id : 22
             * tagid : 2997
             * statsid : 1610612762
             * stats_abbr : UTA,UTH
             * name : 爵士
             * eng_name : Jazz
             * full_name : 犹他爵士
             * eng_full_name : Utah Jazz
             * city : Utah
             * bbr : UTA
             * logo : UTA.png
             * home : 威英特智能家居球馆
             * homepage_link : http://www.nba.com/jazz/
             * intro : 犹他爵士队是NBA现有30支球队之一，1975年进入NBA，爵士队是西部联盟西北赛区的球队。
             * conference : W
             * eng_division : Northwest
             * cn_division : 西北赛区
             * stoped : 0
             * chief_coach : 奎因-斯奈德
             * found_year : 1974
             * players : 188,312,3451,3565,4834,150063,4938,4940,4998,150228,150510,150491,150481,3345
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/jazz
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/UTA.png
             * stadiumsInfo : [{"id":14,"name":"威英特智能家居球馆","eng_name":"Vivint Smart Home Arena","city":"Salt Lake City","state":"UT","capacity":19911}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 14
                 * name : 威英特智能家居球馆
                 * eng_name : Vivint Smart Home Arena
                 * city : Salt Lake City
                 * state : UT
                 * capacity : 19911
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$7Bean {
            /**
             * id : 7
             * tagid : 3036
             * statsid : 1610612764
             * stats_abbr : WAS
             * name : 奇才
             * eng_name : Wizards
             * full_name : 华盛顿奇才
             * eng_full_name : Washington Wizards
             * city : Washington
             * bbr : WAS
             * logo : WAS.png
             * home : 威瑞森中心
             * homepage_link : http://www.nba.com/wizards/
             * intro : 华盛顿奇才队成立于1961年，东部联盟东南分区的球队，曾经使用过芝加哥包装工人队、华盛顿子弹队等队名。
             * conference : E
             * eng_division : Southeast
             * cn_division : 东南赛区
             * stoped : 0
             * chief_coach : 斯科特-布鲁克斯
             * found_year : 1961
             * players : 1446,1447,1342,3449,3566,4972,3640,150359,4838,150057,150015,150387,150389,5026
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/wizards
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/WAS.png
             * stadiumsInfo : [{"id":22,"name":"威瑞森中心","eng_name":"Verizon Center","city":"Washington D.C.","state":"Washington D.C.","capacity":20356}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 22
                 * name : 威瑞森中心
                 * eng_name : Verizon Center
                 * city : Washington D.C.
                 * state : Washington D.C.
                 * capacity : 20356
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$15Bean {
            /**
             * id : 15
             * tagid : 3035
             * statsid : 1610612761
             * stats_abbr : TOR
             * name : 猛龙
             * eng_name : Raptors
             * full_name : 多伦多猛龙
             * eng_full_name : Toronto Raptors
             * city : Toronto
             * bbr : TOR
             * logo : TOR.png
             * home : 加拿大航空中心
             * homepage_link : http://www.nba.com/raptors/
             * intro : 多伦多猛龙建队于1995年，他和当时的温哥华灰熊一起加入联盟，作为NBA加拿大扩军计划中的重要内容。
             * conference : E
             * eng_division : Atlantic
             * cn_division : 大西洋赛区
             * stoped : 0
             * chief_coach : 德韦恩-凯西
             * found_year : 1995
             * players : 3314,3387,3558,3582,4976,4947,150061,150062,150170,150219,150388,150508
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/raptors
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/TOR.png
             * stadiumsInfo : [{"id":26,"name":"加拿大航空中心","eng_name":"Air Canada Centre","city":"Toronto","state":"ON","capacity":19800}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 26
                 * name : 加拿大航空中心
                 * eng_name : Air Canada Centre
                 * city : Toronto
                 * state : ON
                 * capacity : 19800
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }

        public static class _$19Bean {
            /**
             * id : 19
             * tagid : 3029
             * statsid : 1610612763
             * stats_abbr : MEM
             * name : 灰熊
             * eng_name : Grizzlies
             * full_name : 孟菲斯灰熊
             * eng_full_name : Memphis Grizzlies
             * city : Memphis
             * bbr : MEM
             * logo : MEN.png
             * home : 联邦快递球馆
             * homepage_link : http://www.nba.com/grizzlies/
             * intro : 孟菲斯灰熊队是NBA现有30支球队之一，1996年进入NBA，在2010-11赛季季后赛中击败马刺上演黑八传奇。
             * conference : W
             * eng_division : Southwest
             * cn_division : 西南赛区
             * stoped : 0
             * chief_coach : 大卫-菲兹代尔
             * found_year : 1995
             * players : 1411,1238,1384,3584,4804,4869,4884,150034,150035,150187,150173,150367,150507,150497
             * stadiums : null
             * team_link : https://nba.hupu.com/teams/grizzlies
             * logo_link : http://gdc.hupucdn.com/gdc/nba/team/logo/MEN.png
             * stadiumsInfo : [{"id":28,"name":"联邦快递球馆","eng_name":"FedExForum","city":"Memphis","state":"TN","capacity":18119}]
             */

            private int id;
            private int tagid;
            private int statsid;
            private String stats_abbr;
            private String name;
            private String eng_name;
            private String full_name;
            private String eng_full_name;
            private String city;
            private String bbr;
            private String logo;
            private String home;
            private String homepage_link;
            private String intro;
            private String conference;
            private String eng_division;
            private String cn_division;
            private int stoped;
            private String chief_coach;
            private int found_year;
            private String players;
            private Object stadiums;
            private String team_link;
            private String logo_link;
            private List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTagid() {
                return tagid;
            }

            public void setTagid(int tagid) {
                this.tagid = tagid;
            }

            public int getStatsid() {
                return statsid;
            }

            public void setStatsid(int statsid) {
                this.statsid = statsid;
            }

            public String getStats_abbr() {
                return stats_abbr;
            }

            public void setStats_abbr(String stats_abbr) {
                this.stats_abbr = stats_abbr;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEng_name() {
                return eng_name;
            }

            public void setEng_name(String eng_name) {
                this.eng_name = eng_name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public String getEng_full_name() {
                return eng_full_name;
            }

            public void setEng_full_name(String eng_full_name) {
                this.eng_full_name = eng_full_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBbr() {
                return bbr;
            }

            public void setBbr(String bbr) {
                this.bbr = bbr;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getHomepage_link() {
                return homepage_link;
            }

            public void setHomepage_link(String homepage_link) {
                this.homepage_link = homepage_link;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getConference() {
                return conference;
            }

            public void setConference(String conference) {
                this.conference = conference;
            }

            public String getEng_division() {
                return eng_division;
            }

            public void setEng_division(String eng_division) {
                this.eng_division = eng_division;
            }

            public String getCn_division() {
                return cn_division;
            }

            public void setCn_division(String cn_division) {
                this.cn_division = cn_division;
            }

            public int getStoped() {
                return stoped;
            }

            public void setStoped(int stoped) {
                this.stoped = stoped;
            }

            public String getChief_coach() {
                return chief_coach;
            }

            public void setChief_coach(String chief_coach) {
                this.chief_coach = chief_coach;
            }

            public int getFound_year() {
                return found_year;
            }

            public void setFound_year(int found_year) {
                this.found_year = found_year;
            }

            public String getPlayers() {
                return players;
            }

            public void setPlayers(String players) {
                this.players = players;
            }

            public Object getStadiums() {
                return stadiums;
            }

            public void setStadiums(Object stadiums) {
                this.stadiums = stadiums;
            }

            public String getTeam_link() {
                return team_link;
            }

            public void setTeam_link(String team_link) {
                this.team_link = team_link;
            }

            public String getLogo_link() {
                return logo_link;
            }

            public void setLogo_link(String logo_link) {
                this.logo_link = logo_link;
            }

            public List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX> getStadiumsInfo() {
                return stadiumsInfo;
            }

            public void setStadiumsInfo(List<StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX> stadiumsInfo) {
                this.stadiumsInfo = stadiumsInfo;
            }

            public static class StadiumsInfoBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                /**
                 * id : 28
                 * name : 联邦快递球馆
                 * eng_name : FedExForum
                 * city : Memphis
                 * state : TN
                 * capacity : 18119
                 */

                private int id;
                private String name;
                private String eng_name;
                private String city;
                private String state;
                private int capacity;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEng_name() {
                    return eng_name;
                }

                public void setEng_name(String eng_name) {
                    this.eng_name = eng_name;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public int getCapacity() {
                    return capacity;
                }

                public void setCapacity(int capacity) {
                    this.capacity = capacity;
                }
            }
        }
    }
}
