package com.runoob.test;

class Person { 
    public static void prt(String s) { 
       System.out.println(s); 
    } 
   
    Person() { 
       prt("���ࡤ�޲������췽���� "+"A Person."); 
    }//���췽��(1) 
    
    Person(String name) { 
       prt("���ࡤ��һ�������Ĺ��췽���� "+"A person's name is " + name); 
    }//���췽��(2) 
} 
    
