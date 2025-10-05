/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */

static ArrayList<SVpoly> ds =new ArrayList<>();
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        int cn;
        do{
        System.out.println("DANH SACH CHUC NANG ");
        System.out.println("1: Nhap danh sach nhan vien ");
        System.out.println("2: Xuat danh sach nhan vien ");
        System.out.println("3: Tim nhan vien theo ma ");
        System.out.println("4: Xoa nhan vien theo ma ");
        System.out.println("5: Cap nhat thong tin nhan vien ");
        System.out.println("6: Tim nhan vien theo luong ");
        System.out.print("lua chon CN: ");
        cn=sc.nextInt();
        switch(cn){
            case 1:nhap();break;
            case 2:xuat();break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default:
                System.out.println("chon sai ");
                break;    
            }
        }while (cn<8);
    }
    //goi phuong thuc nhap
    public static void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n= ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("nhap pt thu "+i+": ");
            SVpoly sv=new SVpoly();//khởi tạo đối tương sv 
            sv.nhap();
            ds.add(sv);
        }
    }
    //goi PT XUAT
    public static void xuat(){
        for(int i=0;i<ds.size();i++){
            System.out.println("xuat pt thu "+i+": ");
            System.out.println("ho ten: "+ds.get(i).getTen());
            System.out.println("diem: "+ds.get(i).getDiem());
        }
    }
    //goi pt xuat diem
    //goi pt tímv
    public static void main(String[] args) {
       menu();
    }
}