package com.bhargav.java.interview.citi;

import java.util.*;

public class TollGate {
    public static void main(String[] args){
        List<Toll> list = new ArrayList<>();
        list.add(new Toll(1, "XY", "In", "car"));
        list.add(new Toll(1, "XY", "Out", "car"));
        list.add(new Toll(2, "YY", "In", "car"));
        list.add(new Toll(3, "YX", "In", "car"));
        list.add(new Toll(4, "XX", "Out", "car"));
        list.add(new Toll(2, "YY", "Road", "car"));
        list.add(new Toll(3, "YX", "Out", "car"));
        list.add(new Toll(4, "XX", "In", "car"));
        list.add(new Toll(2, "YY", "Out", "car"));
        list.add(new Toll(1, "XY", "In", "car"));
        list.add(new Toll(3, "YX", "In", "car"));
        list.add(new Toll(1, "XY", "Out", "car"));
        list.add(new Toll(3, "YX", "Out", "car"));

        Map<String, Integer> map = new TreeMap<>();
        for(int i=0; i<list.size(); i++){
            Toll t = list.get(i);
            String number = t.getVechicle();
            String state = t.getStaus();
            for(int j=1; j<list.size() && state.equalsIgnoreCase("In"); j++){
                Toll next = list.get(j);
                if(number.equalsIgnoreCase(next.getVechicle()) && next.getStaus().equalsIgnoreCase("out")){
                    map.put(number, map.getOrDefault(number,0)+1);
                    break;
                }
            }
        }
    System.out.println(map);
    }
}

class Toll {

  private Integer tollNo;
  private String vechicle;
  private String staus;
  private String typeOfVechicle;

  public Toll(Integer tollNo, String vechicle, String staus, String typeOfVechicle) {
    this.tollNo = tollNo;
    this.vechicle = vechicle;
    this.staus = staus;
    this.typeOfVechicle = typeOfVechicle;
  }

  public Integer getTollNo() {
    return tollNo;
  }

  public String getVechicle() {
    return vechicle;
  }

  public String getStaus() {
    return staus;
  }

  public String getTypeOfVechicle() {
    return typeOfVechicle;
  }

  public void setTollNo(Integer tollNo) {
    this.tollNo = tollNo;
  }

  public void setVechicle(String vechicle) {
    this.vechicle = vechicle;
  }

  public void setStaus(String staus) {
    this.staus = staus;
  }

  public void setTypeOfVechicle(String typeOfVechicle) {
    this.typeOfVechicle = typeOfVechicle;
  }
}
