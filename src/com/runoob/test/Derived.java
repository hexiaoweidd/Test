package com.runoob.test;

class Base {
    public Base() {
        System.out.println("Base--Ĭ�Ϲ��췽��");
    }
    
    public Base(int c){
        System.out.println("Base--�вι��췽��--" + c);
    }
}

public class Derived extends Base {
    public Derived() {
        // super(); //ϵͳ���Զ���ʽ�ȵ��ø�����޲ι��캯�� super(); //�����ǵ�һ�У������ܱ��� 
        System.out.println("Derived--Ĭ�Ϲ��췽��");
    }
    
    public Derived(int c) {
        // super(); //ϵͳ���Զ���ʽ�ȵ��ø�����޲ι��캯�� super(); //�����ǵ�һ�У������ܱ���
        System.out.println("Derived--�вι��췽��" + c);
    }
    
    public Derived(int a, int b) {
        super(a); //������๹�췽����һ����ʽ�����˸��๹�췽����ϵͳ�Ͳ��ٵ����޲ε�super()�ˡ�
        System.out.println("Derived--�вι��췽��--" + b);
    }
    
    public static void main(String[] args) {
        System.out.println("============�����޲�============");
        Derived no = new Derived();
        System.out.println("============�����в�============");
        Derived have = new Derived(33);
        System.out.println("============�����в�============");
        Derived have2 = new Derived(33, 55);
    }
}