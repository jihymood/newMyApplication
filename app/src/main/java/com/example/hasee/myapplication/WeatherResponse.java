package com.example.hasee.myapplication;

import java.util.List;

/**
 * Created by HASEE on 2017/4/11.
 */

public class WeatherResponse {

    /**
     * success : 1
     * result : [{"weaid":"1","days":"2017-04-11","week":"星期二","cityno":"beijing","citynm":"北京","cityid":"101010100",
     * "temperature":"22℃/7℃","humidity":"0%/0%","weather":"晴","weather_icon":"http://api
     * .k780.com:88/upload/weather/d/0.gif","weather_icon1":"http://api.k780.com:88/upload/weather/n/0.gif",
     * "wind":"北风转无持续风向","winp":"3-4级转微风","temp_high":"22","temp_low":"7","humi_high":"0","humi_low":"0",
     * "weatid":"1","weatid1":"1","windid":"126","winpid":"129"},{"weaid":"1","days":"2017-04-12","week":"星期三",
     * "cityno":"beijing","citynm":"北京","cityid":"101010100","temperature":"25℃/9℃","humidity":"0%/0%",
     * "weather":"晴转多云","weather_icon":"http://api.k780.com:88/upload/weather/d/0.gif","weather_icon1":"http://api
     * .k780.com:88/upload/weather/n/1.gif","wind":"南风转北风","winp":"微风","temp_high":"25","temp_low":"9",
     * "humi_high":"0","humi_low":"0","weatid":"1","weatid1":"2","windid":"29","winpid":"125"},{"weaid":"1",
     * "days":"2017-04-13","week":"星期四","cityno":"beijing","citynm":"北京","cityid":"101010100","temperature":"18℃/9℃",
     * "humidity":"0%/0%","weather":"阴转多云","weather_icon":"http://api.k780.com:88/upload/weather/d/2.gif",
     * "weather_icon1":"http://api.k780.com:88/upload/weather/n/1.gif","wind":"南风转北风","winp":"微风","temp_high":"18",
     * "temp_low":"9","humi_high":"0","humi_low":"0","weatid":"3","weatid1":"2","windid":"29","winpid":"125"},
     * {"weaid":"1","days":"2017-04-14","week":"星期五","cityno":"beijing","citynm":"北京","cityid":"101010100",
     * "temperature":"26℃/12℃","humidity":"0%/0%","weather":"晴","weather_icon":"http://api
     * .k780.com:88/upload/weather/d/0.gif","weather_icon1":"http://api.k780.com:88/upload/weather/n/0.gif",
     * "wind":"南风转北风","winp":"微风","temp_high":"26","temp_low":"12","humi_high":"0","humi_low":"0","weatid":"1",
     * "weatid1":"1","windid":"29","winpid":"125"},{"weaid":"1","days":"2017-04-15","week":"星期六","cityno":"beijing",
     * "citynm":"北京","cityid":"101010100","temperature":"27℃/14℃","humidity":"0%/0%","weather":"晴转多云",
     * "weather_icon":"http://api.k780.com:88/upload/weather/d/0.gif","weather_icon1":"http://api
     * .k780.com:88/upload/weather/n/1.gif","wind":"南风转北风","winp":"微风","temp_high":"27","temp_low":"14",
     * "humi_high":"0","humi_low":"0","weatid":"1","weatid1":"2","windid":"29","winpid":"125"},{"weaid":"1",
     * "days":"2017-04-16","week":"星期日","cityno":"beijing","citynm":"北京","cityid":"101010100",
     * "temperature":"26℃/12℃","humidity":"0%/0%","weather":"多云转阴","weather_icon":"http://api
     * .k780.com:88/upload/weather/d/1.gif","weather_icon1":"http://api.k780.com:88/upload/weather/n/2.gif",
     * "wind":"南风转东风","winp":"微风","temp_high":"26","temp_low":"12","humi_high":"0","humi_low":"0","weatid":"2",
     * "weatid1":"3","windid":"33","winpid":"125"}]
     */

    private String success;
    private List<ResultBean> result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * weaid : 1
         * days : 2017-04-11
         * week : 星期二
         * cityno : beijing
         * citynm : 北京
         * cityid : 101010100
         * temperature : 22℃/7℃
         * humidity : 0%/0%
         * weather : 晴
         * weather_icon : http://api.k780.com:88/upload/weather/d/0.gif
         * weather_icon1 : http://api.k780.com:88/upload/weather/n/0.gif
         * wind : 北风转无持续风向
         * winp : 3-4级转微风
         * temp_high : 22
         * temp_low : 7
         * humi_high : 0
         * humi_low : 0
         * weatid : 1
         * weatid1 : 1
         * windid : 126
         * winpid : 129
         */

        private String weaid;
        private String days;
        private String week;
        private String cityno;
        private String citynm;
        private String cityid;
        private String temperature;
        private String humidity;
        private String weather;
        private String weather_icon;
        private String weather_icon1;
        private String wind;
        private String winp;
        private String temp_high;
        private String temp_low;
        private String humi_high;
        private String humi_low;
        private String weatid;
        private String weatid1;
        private String windid;
        private String winpid;

        public String getWeaid() {
            return weaid;
        }

        public void setWeaid(String weaid) {
            this.weaid = weaid;
        }

        public String getDays() {
            return days;
        }

        public void setDays(String days) {
            this.days = days;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getCityno() {
            return cityno;
        }

        public void setCityno(String cityno) {
            this.cityno = cityno;
        }

        public String getCitynm() {
            return citynm;
        }

        public void setCitynm(String citynm) {
            this.citynm = citynm;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeather_icon() {
            return weather_icon;
        }

        public void setWeather_icon(String weather_icon) {
            this.weather_icon = weather_icon;
        }

        public String getWeather_icon1() {
            return weather_icon1;
        }

        public void setWeather_icon1(String weather_icon1) {
            this.weather_icon1 = weather_icon1;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public String getWinp() {
            return winp;
        }

        public void setWinp(String winp) {
            this.winp = winp;
        }

        public String getTemp_high() {
            return temp_high;
        }

        public void setTemp_high(String temp_high) {
            this.temp_high = temp_high;
        }

        public String getTemp_low() {
            return temp_low;
        }

        public void setTemp_low(String temp_low) {
            this.temp_low = temp_low;
        }

        public String getHumi_high() {
            return humi_high;
        }

        public void setHumi_high(String humi_high) {
            this.humi_high = humi_high;
        }

        public String getHumi_low() {
            return humi_low;
        }

        public void setHumi_low(String humi_low) {
            this.humi_low = humi_low;
        }

        public String getWeatid() {
            return weatid;
        }

        public void setWeatid(String weatid) {
            this.weatid = weatid;
        }

        public String getWeatid1() {
            return weatid1;
        }

        public void setWeatid1(String weatid1) {
            this.weatid1 = weatid1;
        }

        public String getWindid() {
            return windid;
        }

        public void setWindid(String windid) {
            this.windid = windid;
        }

        public String getWinpid() {
            return winpid;
        }

        public void setWinpid(String winpid) {
            this.winpid = winpid;
        }
    }
}