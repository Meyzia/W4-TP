/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasdua;

class KelasSatu
{
    {
        System.out.println(11);
    }
    
    static
    {
        System.out.println(2);
    }
    
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    
    public KelasSatu()
    {
        System.out.println(4);
    }
}

class KelasDua
{
    {
        System.out.println(5);
    }
    
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu(); 
        KelasSatu dua = new KelasSatu(10);
    }
}
