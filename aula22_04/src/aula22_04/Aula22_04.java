
package aula22_04;

import javax.swing.JOptionPane;


public class Aula22_04 {

    public static void main(String[] args) {
//       int [] valor = new int[5];
//                      //0 1 2 3 4 5
//       int [] valor2 = {1,2,3,4,5,6};
//       double [] valor3 = {1,2.89,3.67,4.56,5,6};
//       String [] resp ={"a" , "b", "c", "d"};
//       char [] resp2= {'a', 'b','c'};
//       
//       valor[0] = 10;
//       valor[1] = 10;
//       valor[2] = 10;
//       valor[3] = 10;
//       valor[4] = 10;
//       String mostra= "";
//               
//       for(int c = 0; c <= 4 ; c++){
//           String x = JOptionPane.showInputDialog(null, "Digite o valor " + (c+1));
//           valor[c] = Integer.parseInt(x);
//           mostra = mostra + valor[c] + " | ";
//       }
//       
//       
//         JOptionPane.showMessageDialog(null, mostra); 

////////////////////////// exercicio 01 vetor ///////////////////////////////
// int [] valor = new int[10];
// 
// int [] valor1 = new int[10];
// 
// int [] resp1 = new int[10];
// 
// 
// 
// String mostra = "";
// 
// for(int c = 0; c <10;c++){
//     valor[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 1 na posição"+c+":"));
//     
//     
//  
// }
//     for(int c = 0; c <10;c++){
//     valor1[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 2 na posição"+c+":"));
//    mostra = "vetor resultado:\n";
//
//}
//     for(int i = 0;i<10;i++){
//    resp1[i]= valor[i] * valor1[i];
//    mostra +="Posição"+i+" : "+resp1[i]+"\n";
//     
//     
//   
//       
//        }
//     JOptionPane.showMessageDialog(null, mostra);

//////////////////// Exercicio 02 ////////////////////////////////////////////

int [] vetor = new int [20];
int contpares = 0;
String mostra = "";
 for(int i = 0; i <10;i++){
    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor 2 na posição"+i+":"));
        mostra = "valores do vetor: \n";
}
 for(int i = 0;i<20;i++){
    mostra += vetor[i] + "";
    if(vetor[i] % 2 == 0){
        contpares++;
    }
    
    mostra+= "\n\nQuantidade de numeros pares" + contpares;
}
 JOptionPane.showMessageDialog(null, mostra);
}
    
}
