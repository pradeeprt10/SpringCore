package com.spring.constructor;

import java.util.List;

public class ClassConA {
private int x;
private ClassConB ref;
private List<Integer> list1;
  ClassConA(int x,ClassConB ref,List<Integer> list1){
	  this.x=x;
	  this.ref = ref;
	  this.list1 =list1;
  }
  
  public String toString() {
	  
	  return this.x +"  :  " + this.ref.getName()+" List Values: "+ this.list1;
  }

}
