package com.runoob.test;

public class Chinese extends Person { 
    Chinese() { 
       super(); // ���ø��๹�췽����1�� 
       prt("���ࡤ���ø��ࡱ�޲������췽������ "+"A chinese coder."); 
    } 
    
    Chinese(String name) { 
       super(name);// ���ø��������ͬ�βεĹ��췽����2�� 
       prt("���ࡤ���ø��ࡱ��һ�������Ĺ��췽������ "+"his name is " + name); 
    } 
    
    Chinese(String name, int age) { 
       this(name);// ���þ�����ͬ�βεĹ��췽����3�� 
       prt("���ࣺ�������������ͬ�βεĹ��췽����his age is " + age); 
    } 
    
    public static void main(String[] args) { 
       Chinese cn = new Chinese(); 
       cn = new Chinese("codersai"); 
       cn = new Chinese("codersai", 18); 
    } 
}
