package com.example.rxjava20.bean;

import java.util.List;

/**
 * Created by HASEE on 2017/5/2 09:17
 */

public class News {

    /**
     * status : ok
     * paramz : {"feeds":[{"id":298916,"oid":288229,"category":"article","data":{"subject":"杨振宁携39岁夫人回家乡合肥",
     * "summary":"这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。",
     * "cover":"/Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG","pic":"","format":"txt",
     * "changed":"2015-09-19 14:03:46"}},{"id":298885,"oid":288204,"category":"article",
     * "data":{"subject":"原呼格案调查组长妻子被控制","summary":"因为涉及冯志明涉嫌职务犯罪案件，其妻子被办案机关采取司法强制措施。",
     * "cover":"/Attachs/Article/288204/96b4a0d5c9784b5eac826ab31de97f27_padmini.JPG","pic":"","format":"txt",
     * "changed":"2015-09-19 11:46:31"}}],"PageIndex":1,"PageSize":20,"TotalCount":40678,"TotalPage":2034}
     */

    private String status;
    private ParamzBean paramz;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ParamzBean getParamz() {
        return paramz;
    }

    public void setParamz(ParamzBean paramz) {
        this.paramz = paramz;
    }

    public static class ParamzBean {
        /**
         * feeds : [{"id":298916,"oid":288229,"category":"article","data":{"subject":"杨振宁携39岁夫人回家乡合肥",
         * "summary":"这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。",
         * "cover":"/Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG","pic":"","format":"txt",
         * "changed":"2015-09-19 14:03:46"}},{"id":298885,"oid":288204,"category":"article",
         * "data":{"subject":"原呼格案调查组长妻子被控制","summary":"因为涉及冯志明涉嫌职务犯罪案件，其妻子被办案机关采取司法强制措施。",
         * "cover":"/Attachs/Article/288204/96b4a0d5c9784b5eac826ab31de97f27_padmini.JPG","pic":"","format":"txt",
         * "changed":"2015-09-19 11:46:31"}}]
         * PageIndex : 1
         * PageSize : 20
         * TotalCount : 40678
         * TotalPage : 2034
         */

        private int PageIndex;
        private int PageSize;
        private int TotalCount;
        private int TotalPage;
        private List<FeedsBean> feeds;

        public int getPageIndex() {
            return PageIndex;
        }

        public void setPageIndex(int PageIndex) {
            this.PageIndex = PageIndex;
        }

        public int getPageSize() {
            return PageSize;
        }

        public void setPageSize(int PageSize) {
            this.PageSize = PageSize;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(int TotalCount) {
            this.TotalCount = TotalCount;
        }

        public int getTotalPage() {
            return TotalPage;
        }

        public void setTotalPage(int TotalPage) {
            this.TotalPage = TotalPage;
        }

        public List<FeedsBean> getFeeds() {
            return feeds;
        }

        public void setFeeds(List<FeedsBean> feeds) {
            this.feeds = feeds;
        }

        public static class FeedsBean {
            /**
             * id : 298916
             * oid : 288229
             * category : article
             * data : {"subject":"杨振宁携39岁夫人回家乡合肥","summary":"这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。",
             * "cover":"/Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG","pic":"",
             * "format":"txt","changed":"2015-09-19 14:03:46"}
             */

            private int id;
            private int oid;
            private String category;
            private DataBean data;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getOid() {
                return oid;
            }

            public void setOid(int oid) {
                this.oid = oid;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * subject : 杨振宁携39岁夫人回家乡合肥
                 * summary : 这位93岁的老人一下子扎进近代物理系的实验室里，跟老师学生畅聊学术问题。
                 * cover : /Attachs/Article/288229/9ddacfb194074a58be9cf2c9555b1ee3_padmini.JPG
                 * pic :
                 * format : txt
                 * changed : 2015-09-19 14:03:46
                 */

                private String subject;
                private String summary;
                private String cover;
                private String pic;
                private String format;
                private String changed;

                public String getSubject() {
                    return subject;
                }

                public void setSubject(String subject) {
                    this.subject = subject;
                }

                public String getSummary() {
                    return summary;
                }

                public void setSummary(String summary) {
                    this.summary = summary;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public String getChanged() {
                    return changed;
                }

                public void setChanged(String changed) {
                    this.changed = changed;
                }
            }
        }
    }
}
