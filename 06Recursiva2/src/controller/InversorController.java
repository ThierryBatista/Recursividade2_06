package controller;

public class InversorController
{
public InversorController()
 {
 super();
 }
 
 public int[] RecInversor(int[]vet,int tamanho,int i)
 {
//ao utilizar as variáveis tamanho e i como referencia as posições do vetor, é possível localizar e trocar as posições dos primeiros e ultimos
//a função se encerra quando tamanho == i ou tamanho < i, pois todas as posições já terão sido trocadas	 
 if (tamanho == i ||tamanho < i )
  {
  return vet;
  }
  else
   {
   int aux = vet[tamanho - 1];
   vet[tamanho - 1] = vet[i];
   vet[i] = aux;
   }
  return RecInversor(vet, tamanho - 1, i + 1);
 }
}
	