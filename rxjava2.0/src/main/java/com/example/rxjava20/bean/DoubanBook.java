package com.example.rxjava20.bean;

import java.util.List;

/**
 * Created by HASEE on 2017/4/27 16:17
 */

public class DoubanBook {

    private List<TrailersBean> trailers;

    public List<TrailersBean> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersBean> trailers) {
        this.trailers = trailers;
    }

    public class TrailersBean {
        /**
         * id : 65451
         * movieName : 《加勒比海盗5》中国版预告
         * coverImg : http://img5.mtime.cn/mg/2017/02/06/160949.30565247.jpg
         * movieId : 151657
         * url : http://vfx.mtime.cn/Video/2017/04/26/mp4/170426180717935708.mp4
         * hightUrl : http://vfx.mtime.cn/Video/2017/04/26/mp4/170426180717935708.mp4
         * videoTitle : 加勒比海盗5 中国定档预告片
         * videoLength : 132
         * rating : -1
         * type : ["动作","冒险","喜剧","奇幻"]
         * summary : 杰克船长对决亡灵大军
         */

        private int id;
        private String movieName;
        private String coverImg;
        private int movieId;
        private String url;
        private String hightUrl;
        private String videoTitle;
        private int videoLength;

        //json串里有int型、有double型，不管使用gsonformat或者是网页上自动生成实体类，
        // 都会自动写成int型，这也就直接导致解析的时候报错JsonSyntaxException NumberFormatException
        private double rating;
        private String summary;
        private List<String> type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getCoverImg() {
            return coverImg;
        }

        public void setCoverImg(String coverImg) {
            this.coverImg = coverImg;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHightUrl() {
            return hightUrl;
        }

        public void setHightUrl(String hightUrl) {
            this.hightUrl = hightUrl;
        }

        public String getVideoTitle() {
            return videoTitle;
        }

        public void setVideoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
        }

        public int getVideoLength() {
            return videoLength;
        }

        public void setVideoLength(int videoLength) {
            this.videoLength = videoLength;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<String> getType() {
            return type;
        }

        public void setType(List<String> type) {
            this.type = type;
        }
    }
}
