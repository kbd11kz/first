package com.company;

public class task2 {
    private static int min(int a, int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
    private static int min3 (int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    private static int min4 (int a, int b, int c, int d){
        if(a<b && a<c && a<d){
            return a;
        }
        else if(b<a && b<c && b<d){
            return b;
        }
        else if(c<a && c<b && c<d){
            return c;
        }
        else{
            return d;
        }
    }
    private static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    private static void  out_text_1(String text){
        for(int i=0;i<3;i++){
            System.out.println(text);
        }
    }
    private static void  out_text_2(String text){
        for(int i=0;i<3;i++){
            System.out.print(text+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println(min(4, 3));
        System.out.println(max(4, 3));
        System.out.println(min3(4, 2, 3));
        System.out.println(min4(4, 2, 3,5));
        out_text_1("Sat");
        out_text_2("Sat");
    }

}
