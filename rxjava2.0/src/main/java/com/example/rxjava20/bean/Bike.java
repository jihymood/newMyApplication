package com.example.rxjava20.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HASEE on 2017/4/28 11:10
 */

public class Bike {

    /**
     * success : 1
     * result : {"100000":{"cityid":"242","townid":"1","id":"100000","oid":"1357","pname":"中山路赐福山庄",
     * "lat":"22.529894","lng":"113.399972","capacity":"30","canget":"8","canstop":"22","address":"火炬区沿中山路北侧布置"},
     * "100512":{"cityid":"242","townid":"5","id":"100512","oid":"1218","pname":"诺丁山","lat":"22.349082",
     * "lng":"113.461859","capacity":"20","canget":"10","canstop":"10","address":"振华路南，雅居乐诺丁山门口"}}
     */

    private String success;
    private ResultBean result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * 100000 : {"cityid":"242","townid":"1","id":"100000","oid":"1357","pname":"中山路赐福山庄","lat":"22.529894",
         * "lng":"113.399972","capacity":"30","canget":"8","canstop":"22","address":"火炬区沿中山路北侧布置"}
         * 100512 : {"cityid":"242","townid":"5","id":"100512","oid":"1218","pname":"诺丁山","lat":"22.349082",
         * "lng":"113.461859","capacity":"20","canget":"10","canstop":"10","address":"振华路南，雅居乐诺丁山门口"}
         */

        @SerializedName("100000")
        private _$100000Bean _$100000;
        @SerializedName("100512")
        private _$100512Bean _$100512;

        public _$100000Bean get_$100000() {
            return _$100000;
        }

        public void set_$100000(_$100000Bean _$100000) {
            this._$100000 = _$100000;
        }

        public _$100512Bean get_$100512() {
            return _$100512;
        }

        public void set_$100512(_$100512Bean _$100512) {
            this._$100512 = _$100512;
        }

        public static class _$100000Bean {
            /**
             * cityid : 242
             * townid : 1
             * id : 100000
             * oid : 1357
             * pname : 中山路赐福山庄
             * lat : 22.529894
             * lng : 113.399972
             * capacity : 30
             * canget : 8
             * canstop : 22
             * address : 火炬区沿中山路北侧布置
             */

            private String cityid;
            private String townid;
            private String id;
            private String oid;
            private String pname;
            private String lat;
            private String lng;
            private String capacity;
            private String canget;
            private String canstop;
            private String address;

            public String getCityid() {
                return cityid;
            }

            public void setCityid(String cityid) {
                this.cityid = cityid;
            }

            public String getTownid() {
                return townid;
            }

            public void setTownid(String townid) {
                this.townid = townid;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOid() {
                return oid;
            }

            public void setOid(String oid) {
                this.oid = oid;
            }

            public String getPname() {
                return pname;
            }

            public void setPname(String pname) {
                this.pname = pname;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }

            public String getCapacity() {
                return capacity;
            }

            public void setCapacity(String capacity) {
                this.capacity = capacity;
            }

            public String getCanget() {
                return canget;
            }

            public void setCanget(String canget) {
                this.canget = canget;
            }

            public String getCanstop() {
                return canstop;
            }

            public void setCanstop(String canstop) {
                this.canstop = canstop;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }

        public static class _$100512Bean {
            /**
             * cityid : 242
             * townid : 5
             * id : 100512
             * oid : 1218
             * pname : 诺丁山
             * lat : 22.349082
             * lng : 113.461859
             * capacity : 20
             * canget : 10
             * canstop : 10
             * address : 振华路南，雅居乐诺丁山门口
             */

            private String cityid;
            private String townid;
            private String id;
            private String oid;
            private String pname;
            private String lat;
            private String lng;
            private String capacity;
            private String canget;
            private String canstop;
            private String address;

            public String getCityid() {
                return cityid;
            }

            public void setCityid(String cityid) {
                this.cityid = cityid;
            }

            public String getTownid() {
                return townid;
            }

            public void setTownid(String townid) {
                this.townid = townid;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOid() {
                return oid;
            }

            public void setOid(String oid) {
                this.oid = oid;
            }

            public String getPname() {
                return pname;
            }

            public void setPname(String pname) {
                this.pname = pname;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLng() {
                return lng;
            }

            public void setLng(String lng) {
                this.lng = lng;
            }

            public String getCapacity() {
                return capacity;
            }

            public void setCapacity(String capacity) {
                this.capacity = capacity;
            }

            public String getCanget() {
                return canget;
            }

            public void setCanget(String canget) {
                this.canget = canget;
            }

            public String getCanstop() {
                return canstop;
            }

            public void setCanstop(String canstop) {
                this.canstop = canstop;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }
    }
}
