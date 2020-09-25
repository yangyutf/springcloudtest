package com.cloud.common.entity;

public class RestfulResult {
   public String getData1() {
      return data1;
   }

   @Override
   public String toString() {
      return "RestfulResult{" +
              "data1='" + data1 + '\'' +
              '}';
   }

   public void setData1(String data1) {
      this.data1 = data1;
   }

   public String data1;

}
