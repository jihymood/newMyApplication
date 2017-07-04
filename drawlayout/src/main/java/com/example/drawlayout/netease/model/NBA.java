package com.example.drawlayout.netease.model;

import java.util.List;

/**
 * Created by HASEE on 2017/7/4 14:43
 */

public class NBA {


    /**
     * reason : 查询成功
     * result : {"title":"NBA常规赛_腾讯体育","statuslist":{"st0":"未开赛","st1":"直播中","st2":"已结束"},"list":[{"title":"07-03
     * 周一","tr":[{"time":"07/03 01:00","player1":"尼克斯","player2":"活塞","player1logo":"http://p5.qhmsg
     * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logo":"http://p6.qhmsg
     * .com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p5.qhmsg
     * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logobig":"http://p6.qhmsg
     * .com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470120","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6
     * %2596%25AFVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
     * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470120","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4%25BB%25E5
     * %25A1%259E%26ptag%3D360.onebox.schedule
     * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"78-103",
     * "link1text":"视频集锦"},{"time":"07/03 03:00","player1":"魔术","player2":"热火","player1logo":"http://p1.qhmsg
     * .com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p8.qhmsg.com/t011bd398c0da29c27d
     * .png?size=78x78","player1logobig":"http://p1.qhmsg.com/t015a91103bd3713d72.png?size=78x78",
     * "player2logobig":"http://p8.qhmsg.com/t011bd398c0da29c27d.png?size=78x78","player1url":"http://kbs.sports.qq
     * .com/kbsweb/teams.htm?tid=19","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14",
     * "link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470121","m_link1url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB%26ptag
     * %3D360.onebox.schedule.nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436",
     * "link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470121","m_link2url":"http://j.www
     * .haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB%26ptag
     * %3D360.onebox.schedule.nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436",
     * "status":2,"score":"81-68","link1text":"视频集锦"},{"time":"07/03 05:00","player1":"步行者","player2":"黄蜂",
     * "player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p1.qhmsg
     * .com/t011105782c37d4f1c8.png?size=78x78","player1logobig":"http://p1.qhmsg
     * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p1.qhmsg
     * .com/t011105782c37d4f1c8.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470122","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8
     * %2580%2585VS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule
     * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470122","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E9%25BB%2584%25E8
     * %259C%2582%26ptag%3D360.onebox.schedule
     * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"84-77",
     * "link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox
     * .schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},
     * {"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论",
     * "url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"07-04 周二","live":[{"title":"09:00开赛 比赛结束",
     * "player1":"马刺","player2":"爵士","player1info":"胜61负21西部2名","player2info":"胜51负31西部5名",
     * "player1logobig":"http://p9.qhmsg.com/t01865a1ad0b0987285.png?size=78x78","player2logobig":"http://p0.qhmsg
     * .com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","player1location":"(客)","player2location":"(主)
     * ","status":2,"score":"74-87","liveurl":""}],"livelink":[{"text":"视频集锦","url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470075"},{"text":"技术统计","url":"http://nba.stats.qq.com/nbascore/?mid=1470075"}],
     * "tr":[{"time":"07/04 01:00","player1":"尼克斯","player2":"雷霆","player1logo":"http://p5.qhmsg
     * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logo":"http://p8.qhmsg
     * .com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p5.qhmsg
     * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logobig":"http://p8.qhmsg
     * .com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470123","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470123%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6
     * %2596%25AFVS%25E9%259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule
     * .nba&m=7c826b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470123","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470123%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E9%259B%25B7%25E9
     * %259C%2586%26ptag%3D360.onebox.schedule
     * .nba&m=7c826b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"87-99",
     * "link1text":"视频集锦"},{"time":"07/04 03:00","player1":"魔术","player2":"小牛","player1logo":"http://p1.qhmsg
     * .com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p5.qhmsg
     * .com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p1.qhmsg
     * .com/t015a91103bd3713d72.png?size=78x78","player2logobig":"http://p5.qhmsg
     * .com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470124","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470124%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E5
     * %25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule
     * .nba&m=9111de&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470124","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470124%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E5%25B0%258F%25E7%2589%259B%26ptag
     * %3D360.onebox.schedule.nba&m=9111de&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436",
     * "status":2,"score":"76-86","link1text":"视频集锦"},{"time":"07/04 05:00","player1":"步行者","player2":"热火",
     * "player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p8.qhmsg
     * .com/t011bd398c0da29c27d.png?size=78x78","player1logobig":"http://p1.qhmsg
     * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t011bd398c0da29c27d
     * .png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","player2url":"http://kbs
     * .sports.qq.com/kbsweb/teams.htm?tid=14","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470125",
     * "m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470125%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E7%2583%25AD%25E7
     * %2581%25AB%26ptag%3D360.onebox.schedule
     * .nba&m=424b36&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470125","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470125%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E7%2583%25AD%25E7
     * %2581%25AB%26ptag%3D360.onebox.schedule
     * .nba&m=424b36&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"86-83",
     * "link1text":"视频集锦"},{"time":"07/04 07:00","player1":"凯尔特人","player2":"76人","player1logo":"http://p4.qhmsg
     * .com/t019f61e3222cd24332.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01ca447da8c1f1be3f
     * .png?size=78x78","player1logobig":"http://p4.qhmsg.com/t019f61e3222cd24332.png?size=78x78",
     * "player2logobig":"http://p5.qhmsg.com/t01ca447da8c1f1be3f.png?size=78x78","player1url":"http://kbs.sports.qq
     * .com/kbsweb/teams.htm?tid=2","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20",
     * "link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470074","m_link1url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470074%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS76%25E4
     * %25BA%25BA%26ptag%3D360.onebox.schedule
     * .nba&m=cc6cb0&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470074","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470074%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS76%25E4
     * %25BA%25BA%26ptag%3D360.onebox.schedule
     * .nba&m=cc6cb0&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"89-88",
     * "link1text":"视频集锦"},{"time":"07/04 09:00","player1":"马刺","player2":"爵士","player1logo":"http://p9.qhmsg
     * .com/t01865a1ad0b0987285.png?size=78x78","player2logo":"http://p0.qhmsg
     * .com/t01fd6c067295c676d3.png?size=78x78","player1logobig":"http://p9.qhmsg
     * .com/t01865a1ad0b0987285.png?size=78x78","player2logobig":"http://p0.qhmsg
     * .com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470075","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470075%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E7
     * %2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule
     * .nba&m=fd7d8f&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470075","m_link2url":"http://j.www.haosou
     * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
     * .htm%3Fmid%3D100000%3A1470075%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E7%2588%25B5%25E5%25A3%25AB%26ptag
     * %3D360.onebox.schedule.nba&m=fd7d8f&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436",
     * "status":2,"score":"74-87","link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq
     * .com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq
     * .com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq
     * .com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group
     * .htm?mid=69"}]},{"title":"07-05 周三","tr":[{"time":"07/05 01:00","player1":"黄蜂","player2":"雷霆",
     * "player1logo":"http://p1.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logo":"http://p8.qhmsg
     * .com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p1.qhmsg
     * .com/t011105782c37d4f1c8.png?size=78x78","player2logobig":"http://p8.qhmsg
     * .com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470126","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470126%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E9
     * %259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule
     * .nba&m=f01516&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"07/05 03:00",
     * "player1":"步行者","player2":"小牛","player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78",
     * "player2logo":"http://p5.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p1.qhmsg
     * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p5.qhmsg
     * .com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470127","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470127%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8
     * %2580%2585VS%25E5%25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule
     * .nba&m=aac2fe&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"07/05 05:00",
     * "player1":"热火","player2":"活塞","player1logo":"http://p8.qhmsg.com/t011bd398c0da29c27d.png?size=78x78",
     * "player2logo":"http://p6.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p8.qhmsg
     * .com/t011bd398c0da29c27d.png?size=78x78","player2logobig":"http://p6.qhmsg
     * .com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14",
     * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq.com/kbsweb/game
     * .htm?mid=100000:1470128","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
     * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470128%26title%3D%25E7%2583%25AD%25E7%2581%25ABVS%25E6
     * %25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
     * .nba&m=183d3b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
     * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"}],"bottomlink":[{"text":"常规赛赛程",
     * "url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports
     * .qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq
     * .com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group
     * .htm?mid=69"}]}],"teammatch":[{"name":"老鹰","url":"http://nba.stats.qq.com/schedule/index.htm?team=hawks"},
     * {"name":"凯尔特人","url":"http://nba.stats.qq.com/schedule/index.htm?team=celtics"},{"name":"鹈鹕","url":"http://nba
     * .stats.qq.com/schedule/index.htm?team=pelicans"},{"name":"公牛","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=bulls"},{"name":"骑士","url":"http://nba.stats.qq.com/schedule/index.htm?team=cavaliers"},
     * {"name":"小牛","url":"http://nba.stats.qq.com/schedule/index.htm?team=mavericks"},{"name":"掘金","url":"http://nba
     * .stats.qq.com/schedule/index.htm?team=nuggets"},{"name":"活塞","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=pistons"},{"name":"勇士","url":"http://nba.stats.qq.com/schedule/index.htm?team=warriors"},
     * {"name":"火箭","url":"http://nba.stats.qq.com/schedule/index.htm?team=rockets"},{"name":"步行者","url":"http://nba
     * .stats.qq.com/schedule/index.htm?team=pacers"},{"name":"快船","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=clippers"},{"name":"湖人","url":"http://nba.stats.qq.com/schedule/index.htm?team=lakers"},
     * {"name":"热火","url":"http://nba.stats.qq.com/schedule/index.htm?team=heat"},{"name":"雄鹿","url":"http://nba
     * .stats.qq.com/schedule/index.htm?team=bucks"},{"name":"森林狼","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=timberwolves"},{"name":"篮网","url":"http://nba.stats.qq.com/schedule/index.htm?team=nets"},
     * {"name":"尼克斯","url":"http://nba.stats.qq.com/schedule/index.htm?team=knicks"},{"name":"魔术","url":"http://nba
     * .stats.qq.com/schedule/index.htm?team=magic"},{"name":"76人","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=sixers"},{"name":"太阳","url":"http://nba.stats.qq.com/schedule/index.htm?team=suns"},{"name":"开拓者",
     * "url":"http://nba.stats.qq.com/schedule/index.htm?team=blazers"},{"name":"国王","url":"http://nba.stats.qq
     * .com/schedule/index.htm?team=kings"},{"name":"马刺","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=spurs"},{"name":"雷霆","url":"http://nba.stats.qq.com/schedule/index.htm?team=thunder"},{"name":"爵士",
     * "url":"http://nba.stats.qq.com/schedule/index.htm?team=jazz"},{"name":"奇才","url":"http://nba.stats.qq
     * .com/schedule/index.htm?team=wizards"},{"name":"猛龙","url":"http://nba.stats.qq.com/schedule/index
     * .htm?team=raptors"},{"name":"灰熊","url":"http://nba.stats.qq.com/schedule/index.htm?team=grizzlies"},
     * {"name":"黄蜂","url":"http://nba.stats.qq.com/schedule/index.htm?team=hornets"},{"name":"皇家马德里",
     * "url":"http://nba.stats.qq.com/schedule/index.htm?team=real+madrid"},{"name":"NBA发展联盟","url":"http://nba.stats
     * .qq.com/schedule/index.htm?team=NBA+D-League+Select"},{"name":"奥兰多白","url":"http://nba.stats.qq
     * .com/schedule/index.htm?team=White"},{"name":"奥兰多蓝","url":"http://nba.stats.qq.com/schedule/index.htm?team="},
     * {"name":"巴塞罗那","url":"http://nba.stats.qq.com/schedule/index.htm?team=barcelona"},{"name":"SDS",
     * "url":"http://nba.stats.qq.com/schedule/index.htm?team=SDS"},{"name":"SLA","url":"http://nba.stats.qq
     * .com/schedule/index.htm?team=SLA"},{"name":"明星红队","url":"http://nba.stats.qq.com/schedule/index.htm?team="},
     * {"name":"明星蓝队","url":"http://nba.stats.qq.com/schedule/index.htm?team="}]}
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
         * title : NBA常规赛_腾讯体育
         * statuslist : {"st0":"未开赛","st1":"直播中","st2":"已结束"}
         * list : [{"title":"07-03 周一","tr":[{"time":"07/03 01:00","player1":"尼克斯","player2":"活塞",
         * "player1logo":"http://p5.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player2logo":"http://p6.qhmsg
         * .com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p5.qhmsg
         * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logobig":"http://p6.qhmsg
         * .com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470120","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6
         * %2596%25AFVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
         * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470120","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4%25BB
         * %25E5%25A1%259E%26ptag%3D360.onebox.schedule
         * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"78-103",
         * "link1text":"视频集锦"},{"time":"07/03 03:00","player1":"魔术","player2":"热火","player1logo":"http://p1.qhmsg
         * .com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p8.qhmsg.com/t011bd398c0da29c27d
         * .png?size=78x78","player1logobig":"http://p1.qhmsg.com/t015a91103bd3713d72.png?size=78x78",
         * "player2logobig":"http://p8.qhmsg.com/t011bd398c0da29c27d.png?size=78x78","player1url":"http://kbs.sports
         * .qq.com/kbsweb/teams.htm?tid=19","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14",
         * "link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470121","m_link1url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB
         * %26ptag%3D360.onebox.schedule.nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
         * ","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470121","m_link2url":"http://j.www
         * .haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB
         * %26ptag%3D360.onebox.schedule.nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
         * ","status":2,"score":"81-68","link1text":"视频集锦"},{"time":"07/03 05:00","player1":"步行者","player2":"黄蜂",
         * "player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p1.qhmsg
         * .com/t011105782c37d4f1c8.png?size=78x78","player1logobig":"http://p1.qhmsg
         * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p1.qhmsg
         * .com/t011105782c37d4f1c8.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470122","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8
         * %2580%2585VS%25E9%25BB%2584%25E8%259C%2582%26ptag%3D360.onebox.schedule
         * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470122","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E9%25BB%2584
         * %25E8%259C%2582%26ptag%3D360.onebox.schedule
         * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"84-77",
         * "link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq
         * .com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq
         * .com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq
         * .com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group
         * .htm?mid=69"}]},{"title":"07-04 周二","live":[{"title":"09:00开赛 比赛结束","player1":"马刺","player2":"爵士",
         * "player1info":"胜61负21西部2名","player2info":"胜51负31西部5名","player1logobig":"http://p9.qhmsg
         * .com/t01865a1ad0b0987285.png?size=78x78","player2logobig":"http://p0.qhmsg
         * .com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","player1location":"(客)",
         * "player2location":"(主)","status":2,"score":"74-87","liveurl":""}],"livelink":[{"text":"视频集锦",
         * "url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470075"},{"text":"技术统计","url":"http://nba.stats.qq
         * .com/nbascore/?mid=1470075"}],"tr":[{"time":"07/04 01:00","player1":"尼克斯","player2":"雷霆",
         * "player1logo":"http://p5.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player2logo":"http://p8.qhmsg
         * .com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p5.qhmsg
         * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logobig":"http://p8.qhmsg
         * .com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470123","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470123%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6
         * %2596%25AFVS%25E9%259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule
         * .nba&m=7c826b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470123","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470123%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E9%259B%25B7
         * %25E9%259C%2586%26ptag%3D360.onebox.schedule
         * .nba&m=7c826b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"87-99",
         * "link1text":"视频集锦"},{"time":"07/04 03:00","player1":"魔术","player2":"小牛","player1logo":"http://p1.qhmsg
         * .com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p5.qhmsg
         * .com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p1.qhmsg
         * .com/t015a91103bd3713d72.png?size=78x78","player2logobig":"http://p5.qhmsg
         * .com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470124","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470124%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS
         * %25E5%25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule
         * .nba&m=9111de&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470124","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470124%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E5%25B0%258F%25E7%2589%259B
         * %26ptag%3D360.onebox.schedule.nba&m=9111de&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
         * ","status":2,"score":"76-86","link1text":"视频集锦"},{"time":"07/04 05:00","player1":"步行者","player2":"热火",
         * "player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p8.qhmsg
         * .com/t011bd398c0da29c27d.png?size=78x78","player1logobig":"http://p1.qhmsg
         * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t011bd398c0da29c27d
         * .png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","player2url":"http://kbs
         * .sports.qq.com/kbsweb/teams.htm?tid=14","link1url":"http://sports.qq.com/kbsweb/game
         * .htm?mid=100000:1470125","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470125%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8
         * %2580%2585VS%25E7%2583%25AD%25E7%2581%25AB%26ptag%3D360.onebox.schedule
         * .nba&m=424b36&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470125","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470125%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E7%2583%25AD
         * %25E7%2581%25AB%26ptag%3D360.onebox.schedule
         * .nba&m=424b36&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"86-83",
         * "link1text":"视频集锦"},{"time":"07/04 07:00","player1":"凯尔特人","player2":"76人","player1logo":"http://p4.qhmsg
         * .com/t019f61e3222cd24332.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01ca447da8c1f1be3f
         * .png?size=78x78","player1logobig":"http://p4.qhmsg.com/t019f61e3222cd24332.png?size=78x78",
         * "player2logobig":"http://p5.qhmsg.com/t01ca447da8c1f1be3f.png?size=78x78","player1url":"http://kbs.sports
         * .qq.com/kbsweb/teams.htm?tid=2","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20",
         * "link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470074","m_link1url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470074%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS76
         * %25E4%25BA%25BA%26ptag%3D360.onebox.schedule
         * .nba&m=cc6cb0&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470074","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470074%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS76
         * %25E4%25BA%25BA%26ptag%3D360.onebox.schedule
         * .nba&m=cc6cb0&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,"score":"89-88",
         * "link1text":"视频集锦"},{"time":"07/04 09:00","player1":"马刺","player2":"爵士","player1logo":"http://p9.qhmsg
         * .com/t01865a1ad0b0987285.png?size=78x78","player2logo":"http://p0.qhmsg
         * .com/t01fd6c067295c676d3.png?size=78x78","player1logobig":"http://p9.qhmsg
         * .com/t01865a1ad0b0987285.png?size=78x78","player2logobig":"http://p0.qhmsg
         * .com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470075","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470075%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS
         * %25E7%2588%25B5%25E5%25A3%25AB%26ptag%3D360.onebox.schedule
         * .nba&m=fd7d8f&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470075","m_link2url":"http://j.www.haosou
         * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
         * .htm%3Fmid%3D100000%3A1470075%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E7%2588%25B5%25E5%25A3%25AB
         * %26ptag%3D360.onebox.schedule.nba&m=fd7d8f&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
         * ","status":2,"score":"74-87","link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq
         * .com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq
         * .com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq
         * .com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group
         * .htm?mid=69"}]},{"title":"07-05 周三","tr":[{"time":"07/05 01:00","player1":"黄蜂","player2":"雷霆",
         * "player1logo":"http://p1.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logo":"http://p8.qhmsg
         * .com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p1.qhmsg
         * .com/t011105782c37d4f1c8.png?size=78x78","player2logobig":"http://p8.qhmsg
         * .com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470126","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470126%26title%3D%25E9%25BB%2584%25E8%259C%2582VS
         * %25E9%259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule
         * .nba&m=f01516&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"07/05 03:00",
         * "player1":"步行者","player2":"小牛","player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78",
         * "player2logo":"http://p5.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p1.qhmsg
         * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p5.qhmsg
         * .com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470127","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470127%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8
         * %2580%2585VS%25E5%25B0%258F%25E7%2589%259B%26ptag%3D360.onebox.schedule
         * .nba&m=aac2fe&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"07/05 05:00",
         * "player1":"热火","player2":"活塞","player1logo":"http://p8.qhmsg.com/t011bd398c0da29c27d.png?size=78x78",
         * "player2logo":"http://p6.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p8.qhmsg
         * .com/t011bd398c0da29c27d.png?size=78x78","player2logobig":"http://p6.qhmsg
         * .com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14",
         * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq
         * .com/kbsweb/game.htm?mid=100000:1470128","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq
         * .com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1470128%26title%3D%25E7%2583%25AD%25E7%2581%25ABVS
         * %25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
         * .nba&m=183d3b&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
         * "link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"}],"bottomlink":[{"text":"常规赛赛程",
         * "url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名",
         * "url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba
         * .stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group
         * .htm?mid=69"}]}]
         * teammatch : [{"name":"老鹰","url":"http://nba.stats.qq.com/schedule/index.htm?team=hawks"},{"name":"凯尔特人",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=celtics"},{"name":"鹈鹕","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=pelicans"},{"name":"公牛","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=bulls"},{"name":"骑士","url":"http://nba.stats.qq.com/schedule/index.htm?team=cavaliers"},
         * {"name":"小牛","url":"http://nba.stats.qq.com/schedule/index.htm?team=mavericks"},{"name":"掘金",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=nuggets"},{"name":"活塞","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=pistons"},{"name":"勇士","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=warriors"},{"name":"火箭","url":"http://nba.stats.qq.com/schedule/index.htm?team=rockets"},
         * {"name":"步行者","url":"http://nba.stats.qq.com/schedule/index.htm?team=pacers"},{"name":"快船",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=clippers"},{"name":"湖人","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=lakers"},{"name":"热火","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=heat"},{"name":"雄鹿","url":"http://nba.stats.qq.com/schedule/index.htm?team=bucks"},
         * {"name":"森林狼","url":"http://nba.stats.qq.com/schedule/index.htm?team=timberwolves"},{"name":"篮网",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=nets"},{"name":"尼克斯","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=knicks"},{"name":"魔术","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=magic"},{"name":"76人","url":"http://nba.stats.qq.com/schedule/index.htm?team=sixers"},
         * {"name":"太阳","url":"http://nba.stats.qq.com/schedule/index.htm?team=suns"},{"name":"开拓者","url":"http://nba
         * .stats.qq.com/schedule/index.htm?team=blazers"},{"name":"国王","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=kings"},{"name":"马刺","url":"http://nba.stats.qq.com/schedule/index.htm?team=spurs"},
         * {"name":"雷霆","url":"http://nba.stats.qq.com/schedule/index.htm?team=thunder"},{"name":"爵士",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=jazz"},{"name":"奇才","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=wizards"},{"name":"猛龙","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team=raptors"},{"name":"灰熊","url":"http://nba.stats.qq.com/schedule/index.htm?team=grizzlies"},
         * {"name":"黄蜂","url":"http://nba.stats.qq.com/schedule/index.htm?team=hornets"},{"name":"皇家马德里",
         * "url":"http://nba.stats.qq.com/schedule/index.htm?team=real+madrid"},{"name":"NBA发展联盟","url":"http://nba
         * .stats.qq.com/schedule/index.htm?team=NBA+D-League+Select"},{"name":"奥兰多白","url":"http://nba.stats.qq
         * .com/schedule/index.htm?team=White"},{"name":"奥兰多蓝","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team="},{"name":"巴塞罗那","url":"http://nba.stats.qq.com/schedule/index.htm?team=barcelona"},
         * {"name":"SDS","url":"http://nba.stats.qq.com/schedule/index.htm?team=SDS"},{"name":"SLA","url":"http://nba
         * .stats.qq.com/schedule/index.htm?team=SLA"},{"name":"明星红队","url":"http://nba.stats.qq.com/schedule/index
         * .htm?team="},{"name":"明星蓝队","url":"http://nba.stats.qq.com/schedule/index.htm?team="}]
         */

        private String title;
        private StatuslistBean statuslist;
        private List<ListBean> list;
        private List<TeammatchBean> teammatch;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StatuslistBean getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(StatuslistBean statuslist) {
            this.statuslist = statuslist;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TeammatchBean> getTeammatch() {
            return teammatch;
        }

        public void setTeammatch(List<TeammatchBean> teammatch) {
            this.teammatch = teammatch;
        }

        public static class StatuslistBean {
            /**
             * st0 : 未开赛
             * st1 : 直播中
             * st2 : 已结束
             */

            private String st0;
            private String st1;
            private String st2;

            public String getSt0() {
                return st0;
            }

            public void setSt0(String st0) {
                this.st0 = st0;
            }

            public String getSt1() {
                return st1;
            }

            public void setSt1(String st1) {
                this.st1 = st1;
            }

            public String getSt2() {
                return st2;
            }

            public void setSt2(String st2) {
                this.st2 = st2;
            }
        }

        public static class ListBean {
            /**
             * title : 07-03 周一
             * tr : [{"time":"07/03 01:00","player1":"尼克斯","player2":"活塞","player1logo":"http://p5.qhmsg
             * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logo":"http://p6.qhmsg
             * .com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p5.qhmsg
             * .com/t01eb9fe49a7bfa9614.png?size=78x78","player2logobig":"http://p6.qhmsg
             * .com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams
             * .htm?tid=18","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports
             * .qq.com/kbsweb/game.htm?mid=100000:1470120","m_link1url":"http://j.www.haosou
             * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4%25BB
             * %25E5%25A1%259E%26ptag%3D360.onebox.schedule
             * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
             * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470120","m_link2url":"http://j.www.haosou
             * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4%25BB
             * %25E5%25A1%259E%26ptag%3D360.onebox.schedule
             * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,
             * "score":"78-103","link1text":"视频集锦"},{"time":"07/03 03:00","player1":"魔术","player2":"热火",
             * "player1logo":"http://p1.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p8.qhmsg
             * .com/t011bd398c0da29c27d.png?size=78x78","player1logobig":"http://p1.qhmsg
             * .com/t015a91103bd3713d72.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t011bd398c0da29c27d
             * .png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19",
             * "player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14","link1url":"http://sports.qq
             * .com/kbsweb/game.htm?mid=100000:1470121","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports
             * .qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB
             * %26ptag%3D360.onebox.schedule
             * .nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
             * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470121","m_link2url":"http://j.www.haosou
             * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470121%26title%3D%25E9%25AD%2594%25E6%259C%25AFVS%25E7%2583%25AD%25E7%2581%25AB
             * %26ptag%3D360.onebox.schedule
             * .nba&m=c7e1d4&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,
             * "score":"81-68","link1text":"视频集锦"},{"time":"07/03 05:00","player1":"步行者","player2":"黄蜂",
             * "player1logo":"http://p1.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p1.qhmsg
             * .com/t011105782c37d4f1c8.png?size=78x78","player1logobig":"http://p1.qhmsg
             * .com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p1.qhmsg
             * .com/t011105782c37d4f1c8.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams
             * .htm?tid=11","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","link1url":"http://sports
             * .qq.com/kbsweb/game.htm?mid=100000:1470122","m_link1url":"http://j.www.haosou
             * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E9%25BB%2584
             * %25E8%259C%2582%26ptag%3D360.onebox.schedule
             * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","link2text":"技术统计",
             * "link2url":"http://nba.stats.qq.com/nbascore/?mid=1470122","m_link2url":"http://j.www.haosou
             * .com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
             * .htm%3Fmid%3D100000%3A1470122%26title%3D%25E6%25AD%25A5%25E8%25A1%258C%25E8%2580%2585VS%25E9%25BB%2584
             * %25E8%259C%2582%26ptag%3D360.onebox.schedule
             * .nba&m=9f5509&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436","status":2,
             * "score":"84-77","link1text":"视频集锦"}]
             * bottomlink : [{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule
             * .nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},
             * {"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论",
             * "url":"http://sports.qq.com/fans/group.htm?mid=69"}]
             * live : [{"title":"09:00开赛 比赛结束","player1":"马刺","player2":"爵士","player1info":"胜61负21西部2名",
             * "player2info":"胜51负31西部5名","player1logobig":"http://p9.qhmsg.com/t01865a1ad0b0987285.png?size=78x78",
             * "player2logobig":"http://p0.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs
             * .sports.qq.com/kbsweb/teams.htm?tid=24","player2url":"http://kbs.sports.qq.com/kbsweb/teams
             * .htm?tid=26","player1location":"(客)","player2location":"(主)","status":2,"score":"74-87","liveurl":""}]
             * livelink : [{"text":"视频集锦","url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470075"},
             * {"text":"技术统计","url":"http://nba.stats.qq.com/nbascore/?mid=1470075"}]
             */

            private String title;
            private List<TrBean> tr;
            private List<BottomlinkBean> bottomlink;
            private List<LiveBean> live;
            private List<LivelinkBean> livelink;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<TrBean> getTr() {
                return tr;
            }

            public void setTr(List<TrBean> tr) {
                this.tr = tr;
            }

            public List<BottomlinkBean> getBottomlink() {
                return bottomlink;
            }

            public void setBottomlink(List<BottomlinkBean> bottomlink) {
                this.bottomlink = bottomlink;
            }

            public List<LiveBean> getLive() {
                return live;
            }

            public void setLive(List<LiveBean> live) {
                this.live = live;
            }

            public List<LivelinkBean> getLivelink() {
                return livelink;
            }

            public void setLivelink(List<LivelinkBean> livelink) {
                this.livelink = livelink;
            }

            public static class TrBean {
                /**
                 * time : 07/03 01:00
                 * player1 : 尼克斯
                 * player2 : 活塞
                 * player1logo : http://p5.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78
                 * player2logo : http://p6.qhmsg.com/t01a80ea5beeff44608.png?size=78x78
                 * player1logobig : http://p5.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78
                 * player2logobig : http://p6.qhmsg.com/t01a80ea5beeff44608.png?size=78x78
                 * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18
                 * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8
                 * link1url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1470120
                 * m_link1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
                 * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4
                 * %25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
                 * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
                 * link2text : 技术统计
                 * link2url : http://nba.stats.qq.com/nbascore/?mid=1470120
                 * m_link2url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame
                 * .htm%3Fmid%3D100000%3A1470120%26title%3D%25E5%25B0%25BC%25E5%2585%258B%25E6%2596%25AFVS%25E6%25B4
                 * %25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule
                 * .nba&m=7229ad&from=juhe&type=nba_new&juid=JHbe766535b17a533871f188515030b436
                 * status : 2
                 * score : 78-103
                 * link1text : 视频集锦
                 */

                private String time;
                private String player1;
                private String player2;
                private String player1logo;
                private String player2logo;
                private String player1logobig;
                private String player2logobig;
                private String player1url;
                private String player2url;
                private String link1url;
                private String m_link1url;
                private String link2text;
                private String link2url;
                private String m_link2url;
                private int status;
                private String score;
                private String link1text;

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getLink1url() {
                    return link1url;
                }

                public void setLink1url(String link1url) {
                    this.link1url = link1url;
                }

                public String getM_link1url() {
                    return m_link1url;
                }

                public void setM_link1url(String m_link1url) {
                    this.m_link1url = m_link1url;
                }

                public String getLink2text() {
                    return link2text;
                }

                public void setLink2text(String link2text) {
                    this.link2text = link2text;
                }

                public String getLink2url() {
                    return link2url;
                }

                public void setLink2url(String link2url) {
                    this.link2url = link2url;
                }

                public String getM_link2url() {
                    return m_link2url;
                }

                public void setM_link2url(String m_link2url) {
                    this.m_link2url = m_link2url;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getLink1text() {
                    return link1text;
                }

                public void setLink1text(String link1text) {
                    this.link1text = link1text;
                }
            }

            public static class BottomlinkBean {
                /**
                 * text : 常规赛赛程
                 * url : http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba
                 */

                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class LiveBean {
                /**
                 * title : 09:00开赛 比赛结束
                 * player1 : 马刺
                 * player2 : 爵士
                 * player1info : 胜61负21西部2名
                 * player2info : 胜51负31西部5名
                 * player1logobig : http://p9.qhmsg.com/t01865a1ad0b0987285.png?size=78x78
                 * player2logobig : http://p0.qhmsg.com/t01fd6c067295c676d3.png?size=78x78
                 * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24
                 * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26
                 * player1location : (客)
                 * player2location : (主)
                 * status : 2
                 * score : 74-87
                 * liveurl :
                 */

                private String title;
                private String player1;
                private String player2;
                private String player1info;
                private String player2info;
                private String player1logobig;
                private String player2logobig;
                private String player1url;
                private String player2url;
                private String player1location;
                private String player2location;
                private int status;
                private String score;
                private String liveurl;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer1info() {
                    return player1info;
                }

                public void setPlayer1info(String player1info) {
                    this.player1info = player1info;
                }

                public String getPlayer2info() {
                    return player2info;
                }

                public void setPlayer2info(String player2info) {
                    this.player2info = player2info;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getPlayer1location() {
                    return player1location;
                }

                public void setPlayer1location(String player1location) {
                    this.player1location = player1location;
                }

                public String getPlayer2location() {
                    return player2location;
                }

                public void setPlayer2location(String player2location) {
                    this.player2location = player2location;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getLiveurl() {
                    return liveurl;
                }

                public void setLiveurl(String liveurl) {
                    this.liveurl = liveurl;
                }
            }

            public static class LivelinkBean {
                /**
                 * text : 视频集锦
                 * url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1470075
                 */

                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class TeammatchBean {
            /**
             * name : 老鹰
             * url : http://nba.stats.qq.com/schedule/index.htm?team=hawks
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
