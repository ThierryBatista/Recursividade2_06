package view;

import controller.InversorController;

public class Inversor
{
 public static void main(String Args[])
 {
 InversorController Inv = new InversorController();
 int vet[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
 int tamanho = vet.length;
 int i = 0;
 
 int invertido[] = Inv.RecInversor(vet, tamanho, i);

 System.out.print("Vetor invertido: {");
  for( int k : invertido)
   {
   tamanho--;
    if (tamanho > 0)
     {
      System.out.print(k + ", ");
     }
     else
      {
       System.out.print(k + "} ");
      }
   }
 }
}